package com.generation.lessons;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main_Studenti_CSV {
    
    public static void main(String[] args) throws FileNotFoundException {
        
        String path = "src/main/resources/studenti_test.csv";
        
        final int MAX_STUDENTI = 50;
        StudenteCSV[] studenti = new StudenteCSV[MAX_STUDENTI];
        
        int contatore = 0;
        int numeroRiga = 0;
        
        Scanner scanner = new Scanner(new File(path));
        {
            
            while (scanner.hasNextLine()) {
                String riga = scanner.nextLine();
                numeroRiga++;
                
                if (riga.trim().isEmpty()) {
                    continue;
                }
                
                String[] campi = riga.split(";");
                
                if (campi.length != 4) {
                    System.out.println("ERRORE riga " + numeroRiga +
                                               ": numero di campi non valido (trovati " + campi.length +
                                               ", attesi 4) → \"" + riga + "\"");
                    continue;
                }
                
                String nome = campi[0].trim();
                String cognome = campi[1].trim();
                String etaStr = campi[2].trim();
                String corso = campi[3].trim();
                
                // Controllo 2: l'età deve essere un numero intero valido
                int eta = 0;
                
                // Controllo 3: array pieno
                if (contatore >= MAX_STUDENTI) {
                    System.out.println("ERRORE: array pieno, impossibile aggiungere altri studenti.");
                    break;
                }
                
                // Crea l'oggetto e lo salva nell'array
                studenti[contatore] = new StudenteCSV(nome, cognome, eta, corso);
                contatore++;
            }
            
        }
        
        System.out.println("\n===== STUDENTI CARICATI: " + contatore + " =====");
        for (int i = 0; i < contatore; i++) {
            System.out.println(studenti[i]);
        }
    }
}
