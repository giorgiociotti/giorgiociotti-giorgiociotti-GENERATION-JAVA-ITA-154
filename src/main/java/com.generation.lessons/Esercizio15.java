package com.generation.lessons;

import java.util.Scanner;

public class Esercizio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.next();
        
        System.out.print("Inserisci la data (gg/mm/aaaa): ");
        String data = scanner.next();
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        System.out.print("Inserisci l'orario di visita (es. 10 per le 10:00): ");
        int ora = scanner.nextInt();
        
        scanner.close();
        
        boolean fasciaNormale = (ora >= 9 && ora < 18);
        boolean fasciaSerale  = (ora >= 21 && ora <= 23);
        
        if (!fasciaNormale && !fasciaSerale) {
            System.out.println("Errore: il Palazzo Mediceo è aperto dalle 9:00 alle 18:00 e dalle 21:00 alle 23:00.");
        } else {
            double prezzo = (eta > 65 || eta < 12) ? 5 : 10;
            if (fasciaSerale) prezzo += 2;
            
            System.out.println(" Nome:   " + nome);
            System.out.println(" Data:   " + data);
            System.out.println(" Ora:    " + ora + ":00");
            System.out.println(" Prezzo: " + prezzo + " euro" + (fasciaSerale ? " (+2€ serale)" : ""));
            
        }
    }
}