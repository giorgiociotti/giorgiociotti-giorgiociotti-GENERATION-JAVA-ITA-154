package com.generation.lessons;

import java.util.Scanner;

public class Distributore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean sceltaValida = false;

        do {
            System.out.println("=== DISTRIBUTORE AUTOMATICO ===");
            System.out.println("1 - Caffè       0.60€");
            System.out.println("2 - Tè          0.50€");
            System.out.println("3 - Acqua       0.30€");
            System.out.println("4 - Succo       0.80€");
            System.out.print("Scegli una bevanda (1-4): ");

            String input = scanner.nextLine();


            if (!input.matches("\\d+")) {
                System.out.println("Errore: inserisci un numero, non testo.");
                continue;
            }

            int scelta = Integer.parseInt(input);

            switch (scelta) {
                case 1:
                    System.out.println("Hai scelto: Caffè - Prezzo: 0.60€");
                    sceltaValida = true;
                    break;
                case 2:
                    System.out.println("Hai scelto: Tè - Prezzo: 0.50€");
                    sceltaValida = true;
                    break;
                case 3:
                    System.out.println("Hai scelto: Acqua - Prezzo: 0.30€");
                    sceltaValida = true;
                    break;
                case 4:
                    System.out.println("Hai scelto: Succo - Prezzo: 0.80€");
                    sceltaValida = true;
                    break;
                default:
                    System.out.println("Scelta non valida, riprova.");
            }

        } while (!sceltaValida);

        scanner.close();
    }
}