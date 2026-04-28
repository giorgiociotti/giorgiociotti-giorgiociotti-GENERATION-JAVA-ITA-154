package com.generation.lessons;

import java.util.Scanner;

public class Esercizio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.next();
        
        System.out.print("Inserisci la data (gg/mm/aaaa): ");
        String data = scanner.next();
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        double prezzo;
        
        switch (String.valueOf(eta > 65 || eta < 12)) {
            case "true":
                prezzo = 5;
                break;
            default:
                prezzo = 10;
                break;
        }
        
        
        System.out.println(" Nome:   " + nome);
        System.out.println(" Data:   " + data);
        System.out.println(" Prezzo: €" + prezzo);

        
        scanner.close();
    }
}