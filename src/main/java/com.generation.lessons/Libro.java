package com.generation.lessons;

public class Libro {

    private static int contatoreLibri = 0;

    private String titolo;
    private int annoPubblicazione;
    private double prezzo;
    private String autore;
    private boolean disponibile;


    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        if (titolo != null && !titolo.isEmpty()) {
            this.titolo = titolo;
        }
    }

    public int getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(int annoPubblicazione) {
        if (annoPubblicazione > 0) {
            this.annoPubblicazione = annoPubblicazione;
        }
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        if (prezzo >= 0) {
            this.prezzo = prezzo;
        }
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public boolean isDisponibile() {
        return disponibile;
    }

    public void setDisponibile(boolean disponibile) {
        this.disponibile = disponibile;
    }

    public static int getContatoreLibri() {
        return contatoreLibri;
    }


    public Libro() {
        this.titolo = "Titolo sconosciuto";
        this.annoPubblicazione = 2000;
        this.prezzo = 0.0;
        this.autore = "Autore sconosciuto";
        this.disponibile = true;
        contatoreLibri++;
    }

    public Libro(String titolo, int annoPubblicazione, double prezzo, String autore, boolean disponibile) {
        setTitolo(titolo);
        setAnnoPubblicazione(annoPubblicazione);
        setPrezzo(prezzo);
        setAutore(autore);
        setDisponibile(disponibile);
        contatoreLibri++;
    }

    public Libro(String titolo, String autore, double prezzo) {
        setTitolo(titolo);
        setAutore(autore);
        setPrezzo(prezzo);
        this.annoPubblicazione = 2024;
        this.disponibile = true;
        contatoreLibri++;
    }


    @Override
    public String toString() {
        return "Libro {" +
                "\n  Titolo        : " + getTitolo() +
                "\n  Autore        : " + getAutore() +
                "\n  Anno          : " + getAnnoPubblicazione() +
                "\n  Prezzo        : " + getPrezzo() + " €" +
                "\n  Disponibile   : " + (isDisponibile() ? "Sì" : "No") +
                "\n}";
    }


    public void applicaSconto(double percentuale) {
        if (percentuale > 0 && percentuale <= 100) {
            double sconto = getPrezzo() * (percentuale / 100);
            setPrezzo(getPrezzo() - sconto);
            System.out.println("Sconto del " + percentuale + "% applicato a \"" + getTitolo() + "\". Nuovo prezzo: " + getPrezzo() + " €");
        } else {
            System.out.println("Percentuale di sconto non valida.");
        }
    }
    


    public static Libro piuEconomico(Libro l1, Libro l2) {
        if (l1.getPrezzo() <= l2.getPrezzo()) {
            return l1;
        } else {
            return l2;
        }
    }
}
