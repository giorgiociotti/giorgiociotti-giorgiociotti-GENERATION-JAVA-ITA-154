package com.generation.lessons;

import java.util.Scanner;

public class Bollette {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quante bollette devi pagare? ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        double totale = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nBolletta " + (i + 1) + ":");
            System.out.print("  Causale : ");
            String causale = scanner.nextLine();
            System.out.print("  Importo : ");
            double importo = scanner.nextDouble();
            scanner.nextLine();
            
            System.out.printf("%-25s  %8.2f €%n", causale, importo);
            totale += importo;
        }
        
        System.out.printf("%-25s  %8.2f €%n", "TOTALE", totale);
        
        scanner.close();
    }
}