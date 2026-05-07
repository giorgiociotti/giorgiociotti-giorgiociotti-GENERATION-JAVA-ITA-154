package com.generation.lessons;

import java.util.Scanner;

public class MediaArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Quanti numeri vuoi inserire? ");
        int dimensione = scanner.nextInt();
        
        int[] numeri = new int[dimensione];
        int somma = 0;
        
        for (int i = 0; i < dimensione; i++) {
            System.out.print("Inserisci il numero in posizione " + i + ": ");
            numeri[i] = scanner.nextInt();
            somma += numeri[i];
        }
        
        
        double media = (double) somma / dimensione;
        
        System.out.println("Somma totale: " + somma);
        System.out.println("La media degli elementi è: " + media);
        
        scanner.close();
    }
}