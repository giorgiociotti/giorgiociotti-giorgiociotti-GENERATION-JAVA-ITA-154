package com.generation.lessons;

import java.util.Scanner;

public class CartaDidentita {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prima carta d'identità
        System.out.print("Inserisci il tuo nome: ");
        String nome1 = scanner.nextLine();
        
        System.out.print("Inserisci il tuo cognome: ");
        String cognome1 = scanner.nextLine();
        
        System.out.print("Inserisci la tua città di residenza: ");
        String citta1 = scanner.nextLine();
        
        System.out.print("Inserisci la tua età: ");
        int eta1 = scanner.nextInt();
        scanner.nextLine(); // consuma il newline residuo
        
        System.out.println();
        stampaIdentita(nome1, cognome1, citta1, eta1);
        System.out.println();
        
        // Seconda carta d'identità
        System.out.print("Inserisci il tuo nome: ");
        String nome2 = scanner.nextLine();
        
        System.out.print("Inserisci il tuo cognome: ");
        String cognome2 = scanner.nextLine();
        
        System.out.print("Inserisci la tua città di residenza: ");
        String citta2 = scanner.nextLine();
        
        System.out.print("Inserisci la tua età: ");
        int eta2 = scanner.nextInt();
        
        System.out.println();
        stampaIdentita(nome2, cognome2, citta2, eta2);
        
        scanner.close();
    }
    
    public static void stampaIdentita(String nome, String cognome, String citta, int eta) {
        System.out.println("Nome: " + nome + ",");
        System.out.println("Cognome: " + cognome + ",");
        System.out.println("Città: " + citta + ",");
        System.out.println("Età: " + eta + ";");
    }
}