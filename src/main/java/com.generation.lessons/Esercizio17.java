package com.generation.lessons;

import java.util.Scanner;

public class Esercizio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci la tua statura (es. 1.75): ");
        double statura = scanner.nextDouble();
        
        System.out.print("Inserisci il tuo peso (kg): ");
        double peso = scanner.nextDouble();
        
        System.out.print("Inserisci il tuo genere (M/F): ");
        String genere = scanner.next();
        
        scanner.close();
        
        if (statura <= 0 || peso <= 0) {
            System.out.println("Errore: statura e peso devono essere valori positivi.");
            return;
        }
        
        double bmi = peso / (statura * statura);
        
        if (bmi < 5) {
            System.out.println("Errore: BMI non valido (" + String.format("%.2f", bmi) + "). Controllare i dati inseriti.");
            return;
        }
        
        
        double calorie = genere.equalsIgnoreCase("M")? 66 + (13.7 * peso) + (5 * statura * 100): 655 + (9.6 * peso) + (1.8 * statura * 100);
        
        System.out.printf("| Statura:  %-24s |%n", statura + " m");
        System.out.printf("| Peso:     %-24s |%n", peso + " kg");
        System.out.printf("| BMI:      %-24s |%n", String.format("%.2f", bmi));
        System.out.printf("| Calorie:  %-24s |%n", String.format("%.0f", calorie) + " kcal/giorno");
        
        
        if (bmi > 28) {
            System.out.println("⚠ Attenzione: BMI elevato! Consultare un medico.");
        }
    }
}