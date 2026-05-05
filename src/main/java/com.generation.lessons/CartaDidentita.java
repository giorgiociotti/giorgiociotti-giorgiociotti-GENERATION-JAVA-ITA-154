package com.generation.lessons;

import java.util.Scanner;
public class CartaDidentita {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int numeroCarteIdentita = 2;
    
    for (int i = 1; i <= numeroCarteIdentita; i++) {
        
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Inserisci il tuo cognome: ");
        String cognome = scanner.nextLine();
        
        System.out.print("Inserisci la tua città di residenza: ");
        String citta = scanner.nextLine();
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println();
        stampaIdentita(nome, cognome, citta, eta);
        System.out.println();
    }
    
    scanner.close();
}

public static void stampaIdentita(String nome, String cognome, String citta, int eta) {
    System.out.println("Nome: " + nome + ",");
    System.out.println("Cognome: " + cognome + ",");
    System.out.println("Città: " + citta + ",");
    System.out.println("Età: " + eta + ";");
}
}