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
        
        scanner.close();
        
        boolean fasciaNormale = (ora >= 9 && ora < 18);
        boolean fasciaSerale  = (ora >= 21 && ora <= 23);
        
        double prezzoBase = (eta > 65 || eta < 12) ? 5 : 10;
        double maggiorazione = fasciaSerale ? 2 : 0;
        
        String output = (!fasciaNormale && !fasciaSerale)
                                ? "Errore: il Palazzo Mediceo è aperto dalle 9:00 alle 18:00 e dalle 21:00 alle 23:00."
                                : "| Nome:        " + nome + "\n" +
                                  "| Data:        " + data + "\n" +
                                  "| Ora:         " + ora + ":00\n" +
                                  "| Prezzo:      " + (prezzoBase + maggiorazione) + " euro" +
                                  (fasciaSerale ? " (maggiorazione serale +2€)" : "");
        
        System.out.println(output);
    }
}