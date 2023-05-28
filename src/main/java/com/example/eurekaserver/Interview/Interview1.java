package com.example.eurekaserver.Interview;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;



public class Interview1 {

    public static void main(String[] args) {

        /*String s1 = "CloudTech";
        String s2 = "TechCloud";

        if (s1.length() != s2.length()) {
            System.out.println("No Match Found");
        } else {
            s1 = s1 + s1;
            if (s1.indexOf(s2) != -1) {
                System.out.println("s2 is rotation s1");
            } else {
                System.out.println("It is not rotation");
            }
        }*/
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Orignal String : ");
        String orignalString = sc.nextLine();
        sc.close();

        String words[] = orignalString.split(" ");
        String reverseString = "";

        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String reverseWord = "";
            for (int j = w.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + w.charAt(j);
            }
            reverseString = reverseString + reverseWord + " ";
        }
        System.out.println("Reversed String :" + reverseString);*/

        /*String s1="Sahil Shaikh Sahil";
        List<String> l1= Arrays.asList(s1.split(" "));

        *//*Map<String, Long> collect = s1.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Objects::toString, Collectors.counting()));
               collect.forEach((k,v)-> System.out.println(k+" "+v));*//*

        Map<String, Long> collect = l1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,v)-> System.out.println("Key :"+k+" - "+"value :"+v));*/


       /* Map<Integer, List<String>> map=l1.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(map);*/
        String s1="aabcdd";

        Map<String, Long> collect = s1.chars().mapToObj(i -> (char) i).collect(Collectors.groupingBy(Objects::toString, Collectors.counting()));
        collect.forEach((k,v)-> System.out.println("Key :"+k+"  "+"Value :"+v));


    }
}
