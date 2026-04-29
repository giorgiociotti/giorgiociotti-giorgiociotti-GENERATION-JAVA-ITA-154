package com.generation.lessons;

import java.util.Scanner;

public class Login {



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int tentativiRimanenti = 0;
        String nome = "admin";
        String password = "1234";
        int maxTentativi = 3;


        System.out.println("Login");

        do {
            tentativiRimanenti++;
            System.out.println("\nTentativo " + tentativiRimanenti + " di " + maxTentativi);

            System.out.print("Inserire Username: ");
            String username = scanner.nextLine();

            System.out.print("Inserire Password: ");
            String passwordInserita = scanner.nextLine();

            boolean credenziali = username.equals(nome) && passwordInserita.equals(password);

            switch (credenziali ? "ok" : "errore") {

                case "ok":
                    System.out.println("\nAccesso eseguito correttamente. Benvenuto, " + username + "!");
                    scanner.close();
                    return;

                case "errore":
                    int rimasti = maxTentativi - tentativiRimanenti;
                    if (rimasti > 0) {
                        System.out.println("Credenziali errate. Tentativi rimasti: " + rimasti);
                    }
                    break;
            }

        } while (tentativiRimanenti < maxTentativi);

        System.out.println("superato il limite di " + maxTentativi + " tentativi. \n\"PROGRAMMA TERMINATO\"");
        scanner.close();
    }
}