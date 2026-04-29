package com.generation.lessons;

import java.util.Scanner;

public class Netflix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Film 1
        String titoloFilm1 = "Inception";
        String registaFilm1 = "Christopher Nolan";
        int durataFilm1 = 148;

        // Film 2
        String titoloFilm2 = "Titanic";
        String registaFilm2 = "James Cameron";
        int durataFilm2 = 195;

        // Serie TV 1
        String titoloSerie1 = "Stranger Things";
        int stagioniSerie1 = 4;
        int episodiSerie1 = 34;

        // Serie TV 2
        String titoloSerie2 = "Breaking Bad";
        int stagioniSerie2 = 5;
        int episodiSerie2 = 62;

        String scelta;

        do {
            System.out.println("Cosa desideri vedere?");
            System.out.println("1 - Film");
            System.out.println("2 - Serie TV");
            scelta = input.nextLine();

            switch (scelta) {
                case "1":
                    String filmScelto;

                    do {
                        System.out.println("Film disponibili:");
                        System.out.println("1 - " + titoloFilm1);
                        System.out.println("2 - " + titoloFilm2);
                        System.out.println("Quale film vuoi vedere?");
                        filmScelto = input.nextLine();

                        switch (filmScelto) {
                            case "1":
                                System.out.println("=== SCHEDA FILM ===");
                                System.out.println("Titolo: " + titoloFilm1);
                                System.out.println("Regista: " + registaFilm1);
                                System.out.println("Durata: " + durataFilm1 + " minuti");
                                break;

                            case "2":
                                System.out.println("=== SCHEDA FILM ===");
                                System.out.println("Titolo: " + titoloFilm2);
                                System.out.println("Regista: " + registaFilm2);
                                System.out.println("Durata: " + durataFilm2 + " minuti");
                                break;

                            default:
                                System.out.println("Film non valido. Riprova.");
                                break;
                        }

                    } while (!filmScelto.equals("1") && !filmScelto.equals("2"));

                    break;

                case "2":
                    String serieScelta;

                    do {
                        System.out.println("Serie TV disponibili:");
                        System.out.println("1 - " + titoloSerie1);
                        System.out.println("2 - " + titoloSerie2);
                        System.out.println("Quale serie TV vuoi vedere?");
                        serieScelta = input.nextLine();

                        switch (serieScelta) {
                            case "1":
                                System.out.println("=== SCHEDA SERIE TV ===");
                                System.out.println("Titolo: " + titoloSerie1);
                                System.out.println("Stagioni: " + stagioniSerie1);
                                System.out.println("Episodi: " + episodiSerie1);
                                break;

                            case "2":
                                System.out.println("=== SCHEDA SERIE TV ===");
                                System.out.println("Titolo: " + titoloSerie2);
                                System.out.println("Stagioni: " + stagioniSerie2);
                                System.out.println("Episodi: " + episodiSerie2);
                                break;

                            default:
                                System.out.println("Serie TV non valida. Riprova.");
                                break;
                        }

                    } while (!serieScelta.equals("1") && !serieScelta.equals("2"));

                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;
            }

        } while (!scelta.equals("1") && !scelta.equals("2"));

        input.close();
    }
}
