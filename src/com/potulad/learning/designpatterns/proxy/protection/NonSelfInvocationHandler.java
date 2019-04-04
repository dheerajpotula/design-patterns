package com.potulad.learning.designpatterns.proxy.protection;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Invocation Handler for a person who is trying to read someone else's profile. They can't edit anything but can set
 * the hot or not ratings for that person. .
 */
@AllArgsConstructor
public class NonSelfInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equalsIgnoreCase("setName") || method.getName().equalsIgnoreCase("setGender")) {
                throw new IllegalAccessException("You can't edit someone else's profile!");
            } else if (method.getName().equalsIgnoreCase("setHotOrNotRating")) {
                return method.invoke(personBean, args);
            } else {
                throw new IllegalStateException("Not sure what to do with this method " + method.getName());
            }
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }

        return null;
    }
}
