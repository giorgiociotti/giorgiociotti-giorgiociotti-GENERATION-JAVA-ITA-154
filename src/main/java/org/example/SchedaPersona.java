package org.example;

import java.util.Scanner;

public class SchedaPersona {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Inserisci il cognome: ");
        String cognome = scanner.nextLine();
        
        System.out.print("Inserisci l'età: ");
        int eta = Integer.parseInt(scanner.nextLine());
        
        System.out.print("Inserisci l'altezza in metri (es. 1.78): ");
        double altezza = Double.parseDouble(scanner.nextLine());
        
        scanner.close();
        
        char iniziale = nome.charAt(0);
        boolean maggiorenne = eta >= 18;
        
        String messaggio1 = "Nome: " + nome;
        String messaggio2 = "Cognome: " + cognome;
        String messaggio3 = "Età: " + eta;
        String messaggio4 = "Altezza: " + String.format("%.2f", altezza);
        String messaggio5 = "Iniziale: " + iniziale;
        String messaggio6 = "Maggiorenne: " + maggiorenne;
        
        System.out.println("\n--- Scheda Persona ---");
        System.out.println(messaggio1);
        System.out.println(messaggio2);
        System.out.println(messaggio3);
        System.out.println(messaggio4);
        System.out.println(messaggio5);
        System.out.println(messaggio6);
    }
}