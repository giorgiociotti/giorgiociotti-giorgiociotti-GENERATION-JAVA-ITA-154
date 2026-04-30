package com.generation.lessons;

import java.util.Scanner;

public class Ospedale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroMedici;

        do {
            System.out.println("Quanti medici vuoi inserire?");
            numeroMedici = input.nextInt();
            input.nextLine();

            if (numeroMedici <= 0) {
                System.out.println("Il numero di medici deve essere maggiore di 0.");
            }

        } while (numeroMedici <= 0);

        int contatore = 1;

        double stipendioTotale = 0;
        double stipendioTotalePediatri = 0;

        int numeroPediatri = 0;
        int numeroSerialKiller = 0;

        String listaSerialKiller = "";

        String nomeStipendioMassimoNoPediatria = "";
        double stipendioMassimoNoPediatria = 0;

        String nomeMassimeUccisioni = "";
        int massimoUccisioni = -1;

        String nomeRapportoPeggiore = "";
        double rapportoPeggiore = -1;

        do {
            System.out.println("\n Medico numero " + contatore);

            System.out.println("Inserisci il nome:");
            String nome = input.nextLine();

            int anniEsperienza;
            do {
                System.out.println("Inserisci gli anni di esperienza:");
                anniEsperienza = input.nextInt();
                input.nextLine();
                if (anniEsperienza < 0) {
                    System.out.println("Gli anni di esperienza non possono essere negativi.");
                }
            } while (anniEsperienza < 0);

            System.out.println("Inserisci il reparto:");
            String reparto = input.nextLine();

            int interventi;
            do {
                System.out.println("Inserisci il numero di interventi:");
                interventi = input.nextInt();
                input.nextLine();
                if (interventi < 0) {
                    System.out.println("Il numero di interventi non può essere negativo.");
                }
            } while (interventi < 0);

            int interventiRiusciti;
            do {
                System.out.println("Inserisci il numero di interventi riusciti:");
                interventiRiusciti = input.nextInt();
                input.nextLine();
                if (interventiRiusciti < 0) {
                    System.out.println("Gli interventi riusciti non possono essere negativi.");
                } else if (interventiRiusciti > interventi) {
                    System.out.println("Gli interventi riusciti non possono superare il totale (" + interventi + ").");
                }
            } while (interventiRiusciti < 0 || interventiRiusciti > interventi);

            int interventiFalliti = interventi - interventiRiusciti;

            double stipendio = 0;

            switch (reparto.toLowerCase()) {
                case "anatomia":
                    stipendio = 1300;
                    break;
                case "chirurgia":
                    stipendio = 1500;
                    break;
                case "pediatria":
                    stipendio = 2000;
                    break;
                default:
                    stipendio = 1700;
                    break;
            }

            if (reparto.equalsIgnoreCase("pediatria")) {
                stipendio += anniEsperienza * 100;
            } else {
                stipendio += anniEsperienza * 50;
            }

            stipendio += interventiRiusciti * 10;

            if (reparto.equalsIgnoreCase("pediatria")) {
                stipendio += interventiFalliti * 20;
            } else {
                stipendio -= interventiFalliti * 50;
            }

            System.out.println("Stipendio di " + nome + ": " + stipendio + " euro");

            stipendioTotale += stipendio;

            if (reparto.equalsIgnoreCase("pediatria")) {
                numeroPediatri++;
                stipendioTotalePediatri += stipendio;
            }

            if (!reparto.equalsIgnoreCase("pediatria")) {
                if (stipendio > stipendioMassimoNoPediatria) {
                    stipendioMassimoNoPediatria = stipendio;
                    nomeStipendioMassimoNoPediatria = nome;
                }
            }

            if (!reparto.equalsIgnoreCase("pediatria") && interventiFalliti >= interventiRiusciti * 2) {
                numeroSerialKiller++;
                listaSerialKiller = listaSerialKiller + nome + "\n";
            }

            if (interventiFalliti > massimoUccisioni) {
                massimoUccisioni = interventiFalliti;
                nomeMassimeUccisioni = nome;
            }

            double rapporto;
            if (interventiRiusciti == 0) {
                rapporto = interventiFalliti;
            } else {
                rapporto = (double) interventiFalliti / interventiRiusciti;
            }

            if (rapporto > rapportoPeggiore) {
                rapportoPeggiore = rapporto;
                nomeRapportoPeggiore = nome;
            }

            contatore++;

        } while (contatore <= numeroMedici);

        double stipendioMedio = stipendioTotale / numeroMedici;


        System.out.println("Stipendio totale dei medici: " + stipendioTotale + " euro");
        System.out.println("Stipendio medio dei medici: " + stipendioMedio + " euro");
        System.out.println("Numero di pediatri: " + numeroPediatri);
    }
}