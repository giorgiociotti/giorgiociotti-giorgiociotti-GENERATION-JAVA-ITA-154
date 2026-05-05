package com.generation.lessons;

import java.util.Scanner;

public class StringaAlContrario {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci una stringa: ");
        String input = scanner.nextLine();
        
        String output = inverti(input);
        
        System.out.println("Stringa originale: " + input);
        System.out.println("Stringa al contrario: " + output);
        
        scanner.close();
    }
    
    public static String inverti(String stringa) {
        String risultato = "";
        for (int i = stringa.length() - 1; i >= 0; i--) {
            risultato += stringa.charAt(i);
        }
        return risultato;
    }
}