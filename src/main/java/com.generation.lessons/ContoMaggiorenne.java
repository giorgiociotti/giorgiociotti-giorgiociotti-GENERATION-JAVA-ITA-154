package com.generation.lessons;
import java.util.Scanner;

public class ContoMaggiorenne {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        
        System.out.println(eta >= 18 ? "Ingresso consentito" : "Ingresso vietato");
        
        scanner.close();
    }
}