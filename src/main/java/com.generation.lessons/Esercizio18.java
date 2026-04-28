package com.generation.lessons;

import java.util.Scanner;

public class Esercizio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la destinazione: ");
        String destinazione = scanner.next();
        
        System.out.print("Inserisci il costo del biglietto di andata (€): ");
        double costoAndata = scanner.nextDouble();
        
        System.out.print("Inserisci il costo del biglietto di ritorno (€): ");
        double costoRitorno = scanner.nextDouble();
        
        System.out.print("Inserisci il costo per notte dell'albergo (€): ");
        double costoNotte = scanner.nextDouble();
        
        System.out.print("Inserisci il numero di notti: ");
        int notti = scanner.nextInt();
        
        scanner.close();
        
        if (costoAndata <= 0 || costoRitorno <= 0 || costoNotte <= 0 || notti <= 0) {
            System.out.println("Errore: tutti i costi e il numero di notti devono essere positivi.");
            return;
        }
        
        double costoViaggio      = costoAndata + costoRitorno;
        double costoPernottamento = costoNotte * notti;
        double costoTotale       = costoViaggio + costoPernottamento;
        
        
        System.out.printf("| Destinazione:       %-18s |%n", destinazione);
        System.out.printf("| Biglietto andata:   %-15.2f € |%n", costoAndata);
        System.out.printf("| Biglietto ritorno:  %-15.2f € |%n", costoRitorno);
        System.out.printf("| Costo viaggio:      %-15.2f € |%n", costoViaggio);
        System.out.printf("| Costo per notte:    %-15.2f € |%n", costoNotte);
        System.out.printf("| Numero notti:       %-18d |%n", notti);
        System.out.printf("| Costo albergo:      %-15.2f € |%n", costoPernottamento);
        System.out.printf("| TOTALE VACANZA:     %-15.2f € |%n", costoTotale);
    }
}