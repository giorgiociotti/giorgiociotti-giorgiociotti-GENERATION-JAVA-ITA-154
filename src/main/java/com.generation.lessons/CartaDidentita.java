package com.generation.lessons;

import java.util.Scanner;

public class CartaDidentita {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Inserisci la tua cognome: ");
        String cognome = scanner.nextLine();
        
        System.out.print("Inserisci la tua città di residenza: ");
        String citta = scanner.nextLine();
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        System.out.println("\n");
        
        CartaDidentita.stampaIdentita(nome, cognome, citta, eta);
        
        scanner.close();
    }
    public static void stampaIdentita(String nome, String cognome, String citta, int eta) {
        System.out.println("Nome: " + nome);
        System.out.println("cognome: " + cognome);
        System.out.println("Città di residenza: " + citta);
        System.out.println("Età: " + eta);
    }
}