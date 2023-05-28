package com.sahil;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
public class Test1 {
    public static void main(String[] args) {
        String str="Hello World Hello Java";

        List<String> l1=Arrays.asList(str.split(" "));
        Map<String, Long> collect = l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((k,v)->System.out.println(k+"   "+v));

        List<Integer> l2=Arrays.asList(10,20,30,40,40,40);
        List<Integer> l3=Arrays.asList(10,20,50,40,10,10);





        List<Integer> collect1 = l2.stream().filter(l3::contains).distinct().collect(Collectors.toList());
        System.out.println(collect1);
        collect1.forEach(System.out::println);
         //l2.stream().filter(i->l3.stream().filter(j->i==j).distinct()

        System.out.println("Enter Number to print:");

        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Random r= new Random();
        r.ints(10,99).limit(i).forEach(System.out::println);


    }
}
