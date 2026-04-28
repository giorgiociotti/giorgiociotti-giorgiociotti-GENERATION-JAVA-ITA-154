package com.generation.lessons;

import java.util.Scanner;

public class PalazzoMediceo {
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
        
        if (ora < 9 || ora >= 18) {
            System.out.println("Errore: il Palazzo Mediceo è aperto dalle 9:00 alle 18:00.");
        } else {
            double prezzo = (eta > 65 || eta < 12) ? 5 : 10;
            
         
            System.out.println("| Nome:   " + nome);
            System.out.println("| Data:   " + data);
            System.out.println("| Ora:    " + ora + ":00");
            System.out.println("| Prezzo: " + prezzo + " euro");
        }
        
        scanner.close();
    }
}