package com.potulad.learning.designpatterns.proxy.protection;

import lombok.AllArgsConstructor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Invocation Handler for a person who is trying to edit his/her own profile. They can edit everything except setting
 * their own hot or not ratings.
 */
@AllArgsConstructor
public class SelfInvocationHandler implements InvocationHandler {

    PersonBean personBean;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if(method.getName().startsWith("get")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equalsIgnoreCase("setName") || method.getName().equalsIgnoreCase("setGender")) {
                return method.invoke(personBean, args);
            } else if (method.getName().equalsIgnoreCase("setHotOrNotRating")) {
                throw new IllegalAccessException("You can't set your own hot or not rating!");
            } else {
                throw new IllegalStateException("Not sure what to do with this method " + method.getName());
            }
        } catch (InvocationTargetException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
