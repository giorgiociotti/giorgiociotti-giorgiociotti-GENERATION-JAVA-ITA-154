package com.generation.lessons;

public class PersonConIstanze {
    public static void main(String[] args) {
        
        Person p1 = new Person("mario", "rossi", "10/01/1990", "M");
        Person p2 = new Person("franco", "bianchi", "01/01/2000", "M");
        
        System.out.println(p1);
        System.out.println(p2);
    }
}