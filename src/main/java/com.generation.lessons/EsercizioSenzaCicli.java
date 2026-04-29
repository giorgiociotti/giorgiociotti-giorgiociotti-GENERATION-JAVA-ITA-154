package com.generation.lessons;

import java.util.Scanner;

public class EsercizioSenzaCicli {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String nome = "admin";
        String password = "1234";
        int maxTentativi = 3;

        System.out.println("Login");

        // Tentativo 1
        System.out.println("\nTentativo 1 di " + maxTentativi);
        System.out.print("Inserire Username: ");
        String username1 = scanner.nextLine();
        System.out.print("Inserire Password: ");
        String password1 = scanner.nextLine();

        if (username1.equals(nome) && password1.equals(password)) {
            System.out.println("\nAccesso eseguito correttamente. Benvenuto, " + username1 + "!");
        } else {
            System.out.println("Credenziali errate. Tentativi rimasti: 2");

            // Tentativo 2
            System.out.println("\nTentativo 2 di " + maxTentativi);
            System.out.print("Inserire Username: ");
            String username2 = scanner.nextLine();
            System.out.print("Inserire Password: ");
            String password2 = scanner.nextLine();

            if (username2.equals(nome) && password2.equals(password)) {
                System.out.println("\nAccesso eseguito correttamente. Benvenuto, " + username2 + "!");
            } else {
                System.out.println("Credenziali errate. Tentativi rimasti: 1");

                // Tentativo 3
                System.out.println("\nTentativo 3 di " + maxTentativi);
                System.out.print("Inserire Username: ");
                String username3 = scanner.nextLine();
                System.out.print("Inserire Password: ");
                String password3 = scanner.nextLine();

                if (username3.equals(nome) && password3.equals(password)) {
                    System.out.println("\nAccesso eseguito correttamente. Benvenuto, " + username3 + "!");
                } else {
                    System.out.println("\nSuperato il limite di " + maxTentativi + " tentativi.\nPROGRAMMA TERMINATO");
                }
            }
        }

        scanner.close();
    }
}