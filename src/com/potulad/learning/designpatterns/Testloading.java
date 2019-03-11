package com.potulad.learning.designpatterns;

import com.potulad.learning.designpatterns.util.SpringContext;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Testloading {
    private final String x;

    public static void main(String args[]) {
        System.out.println("Hello World!");
        SpringContext springContext = new SpringContext();
        Testloading tes = springContext.getBean("testLoading");
        System.out.println(tes.x);
    }
}
