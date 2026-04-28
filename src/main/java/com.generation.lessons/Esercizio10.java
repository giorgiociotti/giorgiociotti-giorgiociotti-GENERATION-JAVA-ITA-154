package com.generation.lessons;

import java.util.Scanner;

public class Esercizio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Sei residente di Milano o Monza? (si/no): ");
        String residente = scanner.next();
        
        System.out.print("Quanti anni hai? ");
        int eta = scanner.nextInt();
        
        System.out.print("Sei iscritto alla pro loco? (si/no): ");
        String proLoco = scanner.next();
        
        System.out.print("Sei donatore di sangue? (si/no): ");
        String donatore = scanner.next();
        
        boolean isJuniorOrSenior = eta < 12 || eta > 65;
        double prezzo = 10;
        
        switch (residente.toLowerCase()) {
            case "si":
                prezzo = 5;
                break;
            default:
                switch (isJuniorOrSenior ? "si" : "no") {
                    case "si":
                        prezzo = 6;
                        break;
                    default:
                        switch (proLoco.toLowerCase()) {
                            case "si": prezzo -= 1; break;
                        }
                        switch (donatore.toLowerCase()) {
                            case "si": prezzo -= 1; break;
                        }
                        break;
                }
                break;
        }
        
        System.out.println("Il prezzo d'ingresso è: " + prezzo + " euro");
        scanner.close();
    }
}