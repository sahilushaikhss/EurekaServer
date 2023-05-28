package com.java9;

import org.bouncycastle.crypto.prng.RandomGenerator;

import javax.xml.bind.SchemaOutputResolver;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public  class Java9Impli implements NewJava9{



    public static void main(String[] args) {

        NewJava9 op=(a,b)->{return (a+b);};
        System.out.println(op.m1(10,20));

        Java9Impli jp= new Java9Impli();
        jp.m2();


        List<Integer> collect = Stream.
                iterate(1, (i) -> i <= 10000, (i) -> i*10).
                filter(p -> p % 2 != 0).
                collect(Collectors.toList());
        collect.forEach(System.out::println);
    }


    @Override
    public int m1(int a, int b) {
        return 0;
    }

    @Override
    public void m2() {
        NewJava9.super.m2();
        System.out.println("Child Class Overriden");
    }
}
