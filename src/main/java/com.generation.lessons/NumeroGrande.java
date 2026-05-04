package com.generation.lessons;

import java.util.Scanner;

public class NumeroGrande {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int massimo = 0;
        double somma = 0;
        boolean continua = true;
        
        System.out.println("Inserisci numeri interi:");
        
        while (continua) {
            
            System.out.print("Numero: ");
            int numero = scanner.nextInt();
            
            if (count == 0 || numero > massimo)
                massimo = numero;
            
            somma += numero;
            count++;
            
            System.out.print("Vuoi continuare? (si/no): ");
            String risposta = scanner.next().toLowerCase();
            
            if (risposta.equals("no"))
                continua = false;
        }
        
        if (count == 0) {
            System.out.println("Nessun numero inserito.");
        } else {
            System.out.println("Numero più grande: " + massimo);
            System.out.println("Media: " + somma / count);
        }
        
        scanner.close();
    }
}