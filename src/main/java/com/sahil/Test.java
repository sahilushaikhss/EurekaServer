package com.sahil;





import lombok.Data;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

@Data
class Employee{

    private String name;
    private double salary;
    private int age;

    private String city;
    private List<String> contactList;

    public Employee(String name, double salary, int age, String city, List<String> contactList) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.city = city;
        this.contactList = contactList;
    }
}

public class Test {

    public static void main(String args[]) {
        Employee rahul = new Employee("Rahul", 15000.00,31, "Mumbai", Arrays.asList("9221243912", "846429236823"));
        Employee vivek = new Employee("Vivek", 18000.00, 32,"Pune", Arrays.asList("822323912", "84634976823"));
        Employee vaibhav = new Employee("Vaibhav", 13000.00,40, "Mumbai", Arrays.asList("7434343912", "347989436823"));
        Employee vaibhav1 = new Employee("Vaibhav1", 21000,40, "Mumbai", Arrays.asList("7434343912", "347989436823"));
        Employee sunil = new Employee("Sunil", 25000.00, 33,"Pune", Arrays.asList("9346443912", "78849236823"));
        Employee sunil1 = new Employee("Ask", 35000, 33,"Pune", Arrays.asList("9346443912", "78849236823"));

      //  Employee rahul = new Employee("Rahul", 15000.00,31, "Mumbai", Arrays.asList("9221243912", "846429236823"));




        /*List<Employee> emplList = new ArrayList<>();
        emplList.add(rahul);
        emplList.add(vivek);
        emplList.add(vaibhav);
        emplList.add(sunil);*/
        List<Employee> emplList = Arrays.asList(rahul, vivek, vaibhav, sunil,sunil1,vaibhav1);
        Map<String, Double> mapObject = emplList.stream().distinct().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
        mapObject.forEach((k,v)-> System.out.println(k+" "+v));


        /*Map<Employee, Long> collect = emplList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        collect.forEach((k,v)-> System.out.println("key"+k+"  "+"value"+v));*/

       // Map<String, Double> collect = emplList.stream().distinct().collect(Collectors.toMap(Employee::getName, Employee::getSalary));
       // collect.forEach((k,v)-> System.out.println("Name:"+k+"  "+"Salary:"+v));

        System.out.println("***********************************************************************************");
        System.out.println();
        List<Employee> empSal= emplList.stream().filter(f -> f.getAge() > 30 && f.getAge() <= 40).sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).collect(Collectors.toList());
        empSal.forEach(System.out::println);
                //collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary).reversed()));

        System.out.println("***********************************************************************************"+empSal);
                //sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(2).findFirst();
        //collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
       // Optional<Employee> collect = empSal.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        //empSal.forEach(System.out::println);

        //System.out.println(collect);

        /*emplList.stream().filter(f->{
            Double aDouble = f.getAge() >= 30 || f.getAge() >= 40 ? f.getSalary() : null;
            return aDouble;
        });*/
        //emplList.stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).skip(1).limit(1).forEach(System.out::println);

        /*List<List<String>> employeeContacts = emplList.stream().map(f->f.getContactList()).collect(Collectors.toList());
        employeeContacts.forEach(System.out::println);*/
        // emplList.stream().filter(i->i.getSalary()>13000).map(j->j.getSalary()+5000).forEach(System.out::println);


        /*Map<String, List<Employee>> collect = emplList.stream().collect(Collectors.groupingBy(Employee::getCity));
        collect.forEach((k,v)-> System.out.println(k+"  "+v));*/

       // collect.forEach((k,v)-> System.out.println(k+"  "+v));
       // System.out.println(collect);

        /*String s="Cloud is Cloud Hello is Cloud Hello";

        List<String> str=Arrays.asList(s.split(" "));

        Map<String, Long> collect = str.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        collect.forEach((k,v)->System.out.println("k: "+ k +", v: "+v));

        List<Integer> l1= Arrays.asList(10,20,30);
        List<Integer> l2= Arrays.asList(40,50,60);
        List<Integer> l3= Arrays.asList(70,80,90);

        List<List<Integer>> op=Arrays.asList(l1,l2,l3);

        List<Integer> Kill= op.stream().flatMap(i -> i.stream()).collect(Collectors.toList());
        System.out.println(Kill);*/

        //  List<Double> collect = emplList.stream().filter(f -> f.getSalary() > 13000).map(m -> m.getSalary()+500).collect(Collectors.toList());

        //  System.out.println(collect);
        //   collect.forEach(System.out::println);

      /*  List<Employee> collect1 = emplList.stream().map(m->{
            if(m.getSalary()>13000){
               m.setSalary(m.getSalary()+777);
            }
            return m;
        }).collect(Collectors.toList());
        collect1.forEach(System.out::println);*/



       /* Map<Integer,String> map= new HashMap<>();
        map.put(3,"MNO");
        map.put(4,"XYZ");
        map.put(1,"ABC");
        map.put(2,"DEF");

        LinkedHashMap<String, Integer> collect = map.entrySet().stream().sorted((e1, e2) -> {
            return e1.getKey() - e2.getKey();
        }).collect(Collectors.toMap(Map.Entry::getValue, Map.Entry::getKey, (e1, e2) -> e1, LinkedHashMap::new));
        collect.forEach((k,v)-> System.out.println("Key-: "+ k+"  "+"Value-: "+v));*/


        /*String s = "My name is nitin i am form malayalam";
        String[] str = s.split(" ");
        for (String words : str) {
            if (isPalandrome(words)) {
                System.out.println(words + "  is Palandrome");
            }
        }
    }
    public static boolean isPalandrome(String s){
        int i1=0;
        int i2= s.length() -1;
        while(i2>i1){
            if(s.charAt(i1)!=s.charAt(i2))
                return false;
            i1++;
            i2--;
        }
       return true;
    */
   List<Integer> l1= Arrays.asList(10,20,30,40,50,50,10);
   //l1.forEach(System.out::println);

        System.out.println(l1.stream().reduce((m,n)->m<n?m:n));
        System.out.println(l1.stream().max(Comparator.comparingInt(Integer::intValue)));


   /*Set<Integer> s= new HashSet<>();
   *//*     for (Integer li:l1) {
            if(!s.add(li)){
                System.out.println(li);
            }
        }*/
        /*Integer collect1 = l1.stream().filter(f -> !s.add(f)).collect(Collectors.summing(Integer::intValue));
        System.out.println(collect1);*/
        System.out.println(l1.stream().collect(Collectors.summarizingInt(Integer::intValue)));



    }
}



