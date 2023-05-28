package com.sahil;

import org.bouncycastle.jcajce.provider.symmetric.ChaCha;

import java.util.*;
import java.util.stream.Collectors;

public class SortedHashMap {
    public static void main(String[] args) {
        Map<Integer,String> m1= new HashMap<>();
        m1.put(1,"B");
        m1.put(5,"A");
        m1.put(3,"C");
        m1.put(110,")");
        m1.put(95,"(");

        //m1.forEach((k,v)-> System.out.println(k+" "+v));

        TreeMap<Integer,String> tm= new TreeMap<>(m1);
        System.out.println("_______________________________________________" +
                "_____________________________________________________--");

       // tm.forEach((k,v)-> System.out.println(k+" "+v));

        String s="www.google.com";

        String[] split = s.split("[.]");
         /*for (String s1:split){
             System.out.println(s1);
         }*/


    m1.entrySet().stream().collect(Collectors.toList()).forEach(System.out::println);


        //m1.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(System.out::println);
      }
}
