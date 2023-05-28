package com.java9;

import java.util.Random;
import java.util.function.Predicate;

@FunctionalInterface
public interface NewJava9 {
     int m1(int a,int b);

    default void m2(){
        System.out.println(m4(100,200));
        System.out.println("Default Method");
    }
    static void m3(){
        System.out.println("Static Method");
    }

    private static int m4(int a,int b){
        return a+b;
    }



}
