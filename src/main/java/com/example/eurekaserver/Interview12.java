package com.example.eurekaserver;

public class Interview12 {
    public static void main(String[] args) {

        String str = "www.google.com";
        String  []a= str.split("[.]");
        for(String s: a){
            System.out.println(s);
        }
    }
    }

















 /*   static boolean isEven(int n){
        boolean isEven =true;
        for(int i=1;i<=n;i++) {
            isEven = !isEven;
        }
        return isEven;
    }

    public static void main(String[] args) {
        int n=10;
        if(isEven(n))
            System.out.println("EvenNumber");
        else
            System.out.println("odd");
    }
*/