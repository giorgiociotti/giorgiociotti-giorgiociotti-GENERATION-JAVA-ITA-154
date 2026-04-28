package com.generation.lessons;

import java.util.Scanner;

public class Esercizio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        System.out.print("Inserisci la tua statura (cm): ");
        int statura = scanner.nextInt();
        
        String messaggio = (eta > 13 && statura >= 120)? "Ingresso consentito": "Ingresso vietato";
        
        System.out.println(messaggio);
        
        scanner.close();
    }
}