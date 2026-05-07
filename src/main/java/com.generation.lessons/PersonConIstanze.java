package com.generation.lessons;

public class PersonConIstanze {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.nome="mario";
        p1.cognome="rossi";
        p1.giornoDiCompleanno="10/01/1990";
        
        Person p2 =new Person();
        p2.nome="franco";
        p2.cognome="franco";
        p2.giornoDiCompleanno="01/01/2000";
        
        System.out.println("benvenuti" + p1.nome + "e" + p2.nome);
        
    }
    
}
