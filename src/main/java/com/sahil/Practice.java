package com.sahil;


import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

class Practice {
    public static void main(String args[]) {
        //int []ar ={10,1,2,3,5,6};
        /*int sum=0;
       for(int i=0;i< ar.length;i++){
           sum+=ar[i];
       }
        System.out.println("Sum of Given Array:"+sum);
       int min=ar[0];
       int max=ar[0];

       for(int i=0; i<ar.length;i++){
           if(ar[i]<min){
               min=ar[i];
           }
           if(ar[i]>max){
               max=ar[i];
           }
       }
        System.out.println("min:"+min);
        System.out.println("max:"+max);*/

        /*for(int i=0; i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

       /* int sum = Arrays.stream(ar).sum();
        System.out.println(sum);*/

        /*List<Integer> i= Arrays.asList(10,20,30,40,50,60,10,20,30);
        //Set<Integer> s= new LinkedHashSet<>();
        for (Integer i1:i) {
            i.set(0,15);
        }
        System.out.println(i);
*/

        /*Iterator itr= i.iterator();
        while(itr.hasNext()){
                System.out.println(itr.next());

        }*/

        /*String s="I love India";
        String s1="India is my Country";

        String [] t=s.split(" ");
        String [] t1=s1.split(" ");

        System.out.println(t[2]+" "+t1[0]);*/

        /*Map<Integer,String> mp= new HashMap<>();

        mp.put(1,"sahil");
        mp.put(2,"Usman");
        mp.put(3,"shaikh");
        mp.put(4,null);*/

      /*  for (Map.Entry<Integer,String> map:mp.entrySet()) {
            if(map.getKey()==4) {
                map.setValue("ss");
            }
            System.out.println("key :"+map.getKey()+" --- "+"value :"+map.getValue());
        }*/
/*
        Function<Integer,Integer> f= n->n*n;
         System.out.println(f.apply(5));
    List<Integer> l = Arrays.asList(10, 20);
    List<Integer> l1 = Arrays.asList(30, 40);
    List<Integer> l3 = Arrays.asList(50, 60);
    List<List<Integer>> lists = Arrays.asList(l, l, l3);
        System.out.println(lists);

        List<Integer> collect = lists.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
        System.out.println(collect);*/


        List<Integer> lis= Arrays.asList(2,4,4,5,5,6,6);
        Set<List<Integer>> set= new HashSet<>();
        Set<Integer> Duplicates = lis.stream().filter(i -> !set.add(lis)).collect(Collectors.toSet());
        System.out.println(Duplicates);

        //  Function<Integer,Integer> f=n->n*n;
        // System.out.println(f.apply(5));

        Duplicates.stream().limit(2).forEach(System.out::println);

        //   Duplicates.stream().skip(2).forEach(System.out::println);



        /*String s="welcome to codedecode and codedecode welcome you";

        List<String> strings= Arrays.asList(s.split(" "));

        Map<String, Long> countingOfString = strings.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countingOfString);

        Function<String,Integer> f1= p->p.length();
        System.out.println(f1.apply(s));

        List<Integer> list= Arrays.asList(10,20,30,10,20,50,60,50);

        Map<Integer,Long> duplicates  =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(duplicates);*/


        /*String s="Hello how are u and Hello how are u";

        List<String> ls=Arrays.asList(s.split(" "));
        Map<String, Long> c = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(c);
*/

    }


}

