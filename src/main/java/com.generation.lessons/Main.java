package com.generation.lessons;

public class Main {
    public static void main(String[] args) {
        House casa = new House();
        casa.address = "Via Verdi 100, Cassano";
        casa.area = 100;
        casa.spm = 1000;
        
        System.out.println(casa.toString());
    }
}