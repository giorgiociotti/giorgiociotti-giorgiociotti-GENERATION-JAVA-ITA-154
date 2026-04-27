package com.generation.lessons;

import java.util.Scanner;

public class Abbonamento {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        System.out.print("Inserisci il reddito familiare annuo (€): ");
        double reddito = scanner.nextDouble();
        
        System.out.println((eta < 13 || reddito < 20000)? "Abbonamento richiesto 15 euro al mese": "Abbonamento richiesto 50 euro al mese");
        
        scanner.close();
    }
}