package com.generation.lessons;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int sum = 0;
        String anotherOne;

        do {
            System.out.print("Inserisci un numero: ");
            num = scanner.nextInt();

            sum += num;

            System.out.println("Totale parziale: " + sum);

            System.out.print("Vuoi inserire un altro numero? (si/no): ");
            anotherOne = scanner.next();

        } while (anotherOne.equalsIgnoreCase("si"));

        System.out.println("Somma totale: " + sum);

        scanner.close();
    }
}