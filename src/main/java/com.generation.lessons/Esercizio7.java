package com.generation.lessons;

import java.util.Scanner;

public class Esercizio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        String messaggio = (eta >= 18)? "Ingresso consentito": "Ingresso vietato";
        
        System.out.println(messaggio);
        
        scanner.close();
    }
}