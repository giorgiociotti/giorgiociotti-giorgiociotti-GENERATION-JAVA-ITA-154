package com.generation.lessons;

import java.util.Scanner;

public class Esercizio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        System.out.print("Inserisci il tuo genere (M/F): ");
        String genere = scanner.next();
        
        String messaggio = (eta < 18) ? "Ingresso vietato": (genere.equalsIgnoreCase("M")) ? "Costo biglietto 18 euro": "Costo biglietto 10 euro";
        
        System.out.println(messaggio);
        
        scanner.close();
    }
}