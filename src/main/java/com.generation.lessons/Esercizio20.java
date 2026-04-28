package com.generation.lessons;

import java.util.Scanner;

public class Esercizio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la partenza: ");
        String partenza = scanner.next();
        
        System.out.print("Inserisci la destinazione: ");
        String destinazione = scanner.next();
        
        System.out.print("Inserisci la distanza in km: ");
        double distanza = scanner.nextDouble();
        
        System.out.println("Tipologia treno: 1) Regionale  2) Intercity  3) Freccia");
        System.out.print("Scegli (1/2/3): ");
        int tipologia = scanner.nextInt();
        
        scanner.close();
        
        if (distanza <= 0) {
            System.out.println("Errore: la distanza deve essere positiva.");
            return;
        }
        
        String tipoTreno;
        double costo;
        
        switch (tipologia) {
            case 1:
                tipoTreno = "Regionale";
                costo = distanza * 0.30;
                break;
            case 2:
                tipoTreno = "Intercity";
                costo = distanza * 0.45;
                break;
            case 3:
                tipoTreno = "Freccia";
                costo = distanza * 0.55;
                costo = costo < 19 ? 19 : costo; // minimo 19€
                break;
            default:
                System.out.println("Errore: tipologia non valida.");
                return;
        }
        
        
        System.out.printf("| Partenza:     %-24s |%n", partenza);
        System.out.printf("| Destinazione: %-24s |%n", destinazione);
        System.out.printf("| Distanza:     %-22.1f km |%n", distanza);
        System.out.printf("| Tipologia:    %-24s |%n", tipoTreno);
        System.out.printf("| PREZZO:       %-22.2f € |%n", costo);
    }
}