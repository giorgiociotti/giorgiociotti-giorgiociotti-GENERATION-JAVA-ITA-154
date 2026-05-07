package com.generation.lessons;

public class Person {
    String nome;
    String cognome;
    String giornoDiCompleanno;
    String genere;
    
    public Person(String n, String c, String gdb, String g) {
        nome = n;
        cognome = c;
        giornoDiCompleanno = gdb;
        genere = g;  // parametro g → proprietà genere
    }
    
    @Override
    public String toString() {
        return "Nome: " + nome +
                       ", Cognome: " + cognome +
                       ", Compleanno: " + giornoDiCompleanno +
                       ", Genere: " + genere;
    }
}