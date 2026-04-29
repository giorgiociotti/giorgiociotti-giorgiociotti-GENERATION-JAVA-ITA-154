package com.generation.lessons;

import java.util.Scanner;

public class Ospedale {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numeroMedici;

        // Chiedo il numero di medici
        do {
            System.out.println("Quanti medici vuoi inserire?");
            numeroMedici = input.nextInt();
            input.nextLine(); // pulisce l'invio rimasto nello Scanner

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
        int massimoUccisioni = 0;

        String nomeRapportoPeggiore = "";
        double rapportoPeggiore = 0;

        do {
            System.out.println("\n--- Medico numero " + contatore + " ---");

            System.out.println("Inserisci il nome:");
            String nome = input.nextLine();

            System.out.println("Inserisci gli anni di esperienza:");
            int anniEsperienza = input.nextInt();
            input.nextLine();

            System.out.println("Inserisci il reparto:");
            String reparto = input.nextLine();

            System.out.println("Inserisci il numero di interventi:");
            int interventi = input.nextInt();

            System.out.println("Inserisci il numero di interventi riusciti:");
            int interventiRiusciti = input.nextInt();
            input.nextLine();

            int interventiFalliti = interventi - interventiRiusciti;

            double stipendio = 0;

            // Stipendio base in base al reparto
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

            // Aumento per anni di esperienza
            if (reparto.equalsIgnoreCase("pediatria")) {
                stipendio = stipendio + anniEsperienza * 100;
            } else {
                stipendio = stipendio + anniEsperienza * 50;
            }

            // Bonus per interventi riusciti
            stipendio = stipendio + interventiRiusciti * 10;

            // Gestione interventi falliti
            if (reparto.equalsIgnoreCase("pediatria")) {
                stipendio = stipendio + interventiFalliti * 20;
            } else {
                stipendio = stipendio - interventiFalliti * 50;
            }

            System.out.println("Stipendio di " + nome + ": " + stipendio + " euro");

            stipendioTotale = stipendioTotale + stipendio;

            // Controllo pediatri
            if (reparto.equalsIgnoreCase("pediatria")) {
                numeroPediatri++;
                stipendioTotalePediatri = stipendioTotalePediatri + stipendio;
            }

            // Stipendio massimo, ma NON pediatria
            if (!reparto.equalsIgnoreCase("pediatria")) {
                if (stipendio > stipendioMassimoNoPediatria) {
                    stipendioMassimoNoPediatria = stipendio;
                    nomeStipendioMassimoNoPediatria = nome;
                }
            }

            // Serial killer: falliti almeno il doppio dei riusciti, tranne pediatri
            if (!reparto.equalsIgnoreCase("pediatria") && interventiFalliti >= interventiRiusciti * 2) {
                numeroSerialKiller++;
                listaSerialKiller = listaSerialKiller + nome + "\n";
            }

            // Medico con più uccisioni
            if (interventiFalliti > massimoUccisioni) {
                massimoUccisioni = interventiFalliti;
                nomeMassimeUccisioni = nome;
            }

            // Rapporto uccisioni / salvataggi più alto
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

        System.out.println("\n=== RISULTATI FINALI ===");
        System.out.println("Stipendio totale dei medici: " + stipendioTotale + " euro");
        System.out.println("Stipendio medio dei medici: " + stipendioMedio + " euro");
        System.out.println("Numero di pediatri: " + numeroPediatri);

        if (numeroPediatri > 0) {
            double stipendioMedioPediatri = stipendioTotalePediatri / numeroPediatri;
            System.out.println("Stipendio medio dei pediatri: " + stipendioMedioPediatri + " euro");
        } else {
            System.out.println("Non ci sono pediatri, quindi non posso calcolare la media.");
        }

        System.out.println("\n=== BONUS ===");

        if (!nomeStipendioMassimoNoPediatria.equals("")) {
            System.out.println("Medico con stipendio più alto NON pediatria: " + nomeStipendioMassimoNoPediatria);
        } else {
            System.out.println("Non ci sono medici fuori dal reparto pediatria.");
        }

        System.out.println("Numero di serial killer: " + numeroSerialKiller);

        if (numeroSerialKiller > 0) {
            System.out.println("Lista serial killer:");
            System.out.println(listaSerialKiller);
        } else {
            System.out.println("Non ci sono serial killer.");
        }

        System.out.println("Medico con più uccisioni: " + nomeMassimeUccisioni);
        System.out.println("Medico con rapporto uccisioni/salvataggi più alto: " + nomeRapportoPeggiore);

        input.close();
    }
}
