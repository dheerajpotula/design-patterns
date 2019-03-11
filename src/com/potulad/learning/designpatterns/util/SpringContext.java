package com.potulad.learning.designpatterns.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Utility class to find the beans from the application context.
 */
public final class SpringContext {

    private static final ApplicationContext context
            = new ClassPathXmlApplicationContext("file:configuration/spring-configuration/workspace.xml");
    /**
     * Get the bean for the corresponding bean name.
     */
    public static <T> T getBean(String beanName) throws BeansException {
        return (T) context.getBean(beanName);

    }

}
