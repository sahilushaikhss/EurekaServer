package com.example.eurekaserver.Interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class P1{
    public void m1(){
        System.out.println("P1");
    }
}

public class Test extends P1{
    public void m2(){
        System.out.println("Test");
    }
    public static void main(String[] args) {

        Test t= new Test();
        t.m1();
        P1 t1= new Test();
        //t1.m2();
         /*Test t2= new P1();
         t2.m1();*/
       // Test t2= new P1();
        //t2.m1();




        List<Integer> l1= Arrays.asList(1,2,4,5,3,6,7,9,8);
        List<Integer> l2= Arrays.asList(10,20,40,50,30,60,70,90,80);
        List<Integer> l3= Arrays.asList(11,22,44,55,33,66,77,99,88);

        List<List<Integer>> finalList= Arrays.asList(l1,l2,l3);

        List<Integer> collect = finalList.stream().flatMap(i -> i.stream().sorted()).collect(Collectors.toList());
        System.out.println(collect);


        //l1.stream().filter(i -> i % 2 == 0).forEach(System.out::println);
       // l1.stream().filter(s->s%2!=0).distinct().forEach(System.out::println);
       // List<Integer> collect = l1.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       //collect.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
       // System.out.println(collect);
       /* Integer integer = l1.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);*/

        /*Integer integer = l1.stream().
                distinct().
                sorted(Comparator.reverseOrder()).
                skip(1).
                findFirst().
                get();
        System.out.println(integer);*/
    }
}


























/*int [] arr={10,25,15,20,15,10,65,48,50,50};

       //int secondLarge= Arrays.stream(arr).distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        List<Integer> list= Arrays.stream(arr).boxed().collect(Collectors.toList());
        Integer integer = list.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();

        System.out.println(integer);*/
