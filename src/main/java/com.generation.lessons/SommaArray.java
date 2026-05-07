package com.generation.lessons;

public class SommaArray {
    public static void main(String[] args) {
        int[] numeri = {10, 20, 30, 40, 50};
        int somma = 0;
        
        for (int i = 0; i < numeri.length; i++) {
            somma += numeri[i];
        }
        
        System.out.println("La somma di tutti gli elementi è: " + somma);
    }
}