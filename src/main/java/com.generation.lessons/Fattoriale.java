package com.generation.lessons;

import java.util.Scanner;

public class Fattoriale {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci un numero: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Inserire un numero >= 0");
            scanner.close();
            return;
        }
        
        fact(n);
        scanner.close();
    }
    
    public static void fact(int n) {
        int res = 1;
        
        for (int i = n; i > 1; i--)
            res *= i;
        System.out.println(n + " = " + res);
    }
}