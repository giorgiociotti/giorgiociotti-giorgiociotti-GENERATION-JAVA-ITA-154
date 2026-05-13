package com.generation.lessons;

public class CameraHotel {
    
    private int numero;
    private int piano;
    private double prezzoPerNotte;
    private boolean occupata;
    private int capienzaMassima;
    private String[] caratteristiche;
    private int numeroCaratteristicheInserite;
    private String[] servizi;
    private int numeroServiziInseriti;
    private Prenotazione[] storicoPrenotazioni;
    private int numeroPrenotazioniRegistrate;
    
    private static double prezzo_minimo_consentito = 30.0;
    private static double costo_colazione_per_notte = 10.0;
    private static final String[] CARATTERISTICHE_CONSENTITE = {
            "vista mare", "accessibile", "balcone", "non fumatori",
            "pet friendly", "vicino ascensore", "piano alto"
    };
    
    public CameraHotel(int numero, int piano, double prezzoPerNotte,
                       int capienzaMassima, int maxCaratteristiche,
                       int maxServizi, int maxPrenotazioni) {
        this.numero = numero;
        this.piano = piano;
        this.prezzoPerNotte = (prezzoPerNotte < prezzo_minimo_consentito)? prezzo_minimo_consentito : prezzoPerNotte;
        this.capienzaMassima = capienzaMassima;
        this.occupata = false;
        this.caratteristiche = new String[maxCaratteristiche];
        this.servizi = new String[maxServizi];
        this.storicoPrenotazioni = new Prenotazione[maxPrenotazioni];
        this.numeroCaratteristicheInserite = 0;
        this.numeroServiziInseriti = 0;
        this.numeroPrenotazioniRegistrate = 0;
    }
    
    public int getNumero() { return numero; }
    public int getPiano() { return piano; }
    public double getPrezzoPerNotte() { return prezzoPerNotte; }
    public boolean isOccupata() { return occupata; }
    public int getCapienzaMassima() { return capienzaMassima; }
    public String[] getCaratteristiche() { return caratteristiche; }
    public int getNumeroCaratteristicheInserite() { return numeroCaratteristicheInserite; }
    public String[] getServizi() { return servizi; }
    public int getNumeroServiziInseriti() { return numeroServiziInseriti; }
    public int getNumeroPrenotazioniRegistrate() { return numeroPrenotazioniRegistrate; }
    
    public void setNumero(int numero) { this.numero = numero; }
    public void setPiano(int piano) { this.piano = piano; }
    public void setPrezzoPerNotte(double prezzoPerNotte) {
        this.prezzoPerNotte = (prezzoPerNotte < prezzo_minimo_consentito)? prezzo_minimo_consentito : prezzoPerNotte;
    }
    public void setOccupata(boolean occupata) { this.occupata = occupata; }
    public void setCapienzaMassima(int capienzaMassima) { this.capienzaMassima = capienzaMassima; }
    
    
    public String getCategoriaCamera() {
        return "standard";
    }
    
    public boolean isLibera() {
        return !occupata;
    }
    
    public int getCapienzaPrenotabile() {
        return capienzaMassima;
    }
    
    public boolean aggiungiCaratteristica(String caratteristica) {
        if (numeroCaratteristicheInserite >= caratteristiche.length) {
            System.out.println("Errore: array caratteristiche pieno per la camera " + numero);
            return false;
        }
        if (!isCaratteristicaConsentita(caratteristica)) {
            System.out.println("Errore: caratteristica '" + caratteristica + "' non consentita.");
            return false;
        }
        if (contieneCaratteristica(caratteristica)) {
            System.out.println("Errore: caratteristica '" + caratteristica + "' già presente.");
            return false;
        }
        caratteristiche[numeroCaratteristicheInserite++] = caratteristica;
        return true;
    }
    
    public boolean contieneCaratteristica(String caratteristica) {
        for (int i = 0; i < numeroCaratteristicheInserite; i++) {
            if (caratteristiche[i].equalsIgnoreCase(caratteristica)) return true;
        }
        return false;
    }
    
    public static boolean isCaratteristicaConsentita(String caratteristica) {
        for (String c : CARATTERISTICHE_CONSENTITE) {
            if (c.equalsIgnoreCase(caratteristica)) return true;
        }
        return false;
    }
    
    public static String[] getCaratteristicheConsentite() {
        return CARATTERISTICHE_CONSENTITE.clone();
    }
    
    public static void stampaCaratteristicheConsentite() {
        System.out.println("Caratteristiche consentite:");
        for (String c : CARATTERISTICHE_CONSENTITE) {
            System.out.println("  - " + c);
        }
    }
    
    public boolean rimuoviCaratteristica(String caratteristica) {
        for (int i = 0; i < numeroCaratteristicheInserite; i++) {
            if (caratteristiche[i].equalsIgnoreCase(caratteristica)) {
                
                for (int j = i; j < numeroCaratteristicheInserite - 1; j++) {
                    caratteristiche[j] = caratteristiche[j + 1];
                }
                caratteristiche[--numeroCaratteristicheInserite] = null;
                return true;
            }
        }
        System.out.println("Errore: caratteristica '" + caratteristica + "' non trovata.");
        return false;
    }
    
    public boolean aggiungiServizio(String servizio) {
        if (numeroServiziInseriti >= servizi.length) {
            System.out.println("Errore: array servizi pieno per la camera " + numero);
            return false;
        }
        if (contieneServizio(servizio)) {
            System.out.println("Errore: servizio '" + servizio + "' già presente.");
            return false;
        }
        servizi[numeroServiziInseriti++] = servizio;
        return true;
    }
    
    public boolean aggiungiServizio(String servizio, boolean inclusoNelPrezzo) {
        if (inclusoNelPrezzo) {
            System.out.println("Il servizio " + servizio + " è incluso nel prezzo.");
        } else {
            System.out.println("Il servizio " + servizio + " è a pagamento.");
        }
        return aggiungiServizio(servizio);
    }
    
    public boolean contieneServizio(String servizio) {
        for (int i = 0; i < numeroServiziInseriti; i++) {
            if (servizi[i].equalsIgnoreCase(servizio)) return true;
        }
        return false;
    }
    
    public boolean rimuoviServizio(String servizio) {
        for (int i = 0; i < numeroServiziInseriti; i++) {
            if (servizi[i].equalsIgnoreCase(servizio)) {
                for (int j = i; j < numeroServiziInseriti - 1; j++) {
                    servizi[j] = servizi[j + 1];
                }
                servizi[--numeroServiziInseriti] = null;
                return true;
            }
        }
        System.out.println("Errore: servizio '" + servizio + "' non trovato.");
        return false;
    }
    
    
    public boolean prenota(String nomeCliente, int numeroNotti) {
        return prenota(nomeCliente, numeroNotti, 1, false);
    }
    
    public boolean prenota(String nomeCliente, int numeroNotti, int numeroOspiti) {
        return prenota(nomeCliente, numeroNotti, numeroOspiti, false);
    }
    
    public boolean prenota(String nomeCliente, int numeroNotti, int numeroOspiti,
                           boolean colazioneInclusa) {
        if (!isLibera()) {
            System.out.println("Errore: camera " + numero + " è già occupata.");
            return false;
        }
        if (nomeCliente == null || nomeCliente.trim().isEmpty()) {
            System.out.println("Errore: nome cliente non può essere vuoto.");
            return false;
        }
        if (numeroNotti <= 0) {
            System.out.println("Errore: numero notti deve essere > 0.");
            return false;
        }
        if (numeroOspiti <= 0) {
            System.out.println("Errore: numero ospiti deve essere > 0.");
            return false;
        }
        if (numeroOspiti > getCapienzaPrenotabile()) {
            System.out.println("Errore: numero ospiti (" + numeroOspiti + ") supera la capienza prenotabile (" + getCapienzaPrenotabile() + ").");
            return false;
        }
        if (numeroPrenotazioniRegistrate >= storicoPrenotazioni.length) {
            System.out.println("Errore: storico prenotazioni pieno per la camera " + numero);
            return false;
        }
        double costo = calcolaCosto(numeroNotti, colazioneInclusa);
        Prenotazione p = new Prenotazione(nomeCliente, numeroNotti, numeroOspiti, colazioneInclusa, costo);
        storicoPrenotazioni[numeroPrenotazioniRegistrate++] = p;
        occupata = true;
        System.out.println("Camera " + numero + " prenotata da " + nomeCliente + " per " + numeroNotti + " notti. Costo: " + String.format("%.2f", costo) + "€");
        return true;
    }
    
    
    public double calcolaCosto(int numeroNotti) {
        if (numeroNotti <= 0) return 0;
        return prezzoPerNotte * numeroNotti;
    }
    
    public double calcolaCosto(int numeroNotti, double scontoEuro) {
        double costo = calcolaCosto(numeroNotti);
        if (scontoEuro < 0) scontoEuro = 0;
        costo -= scontoEuro;
        return Math.max(costo, 0);
    }
    
    public double calcolaCosto(int numeroNotti, boolean colazioneInclusa) {
        double costo = calcolaCosto(numeroNotti);
        if (colazioneInclusa) {
            costo += costo_colazione_per_notte * numeroNotti;
        }
        return costo;
    }
    
    public void libera() {
        occupata = false;
        for (int i = 0; i < numeroPrenotazioniRegistrate; i++) {
            if (storicoPrenotazioni[i].isAttiva()) {
                storicoPrenotazioni[i].chiudi();
                break;
            }
        }
    }
    
    
    public double calcolaIncassoTotaleCamera() {
        double totale = 0;
        for (int i = 0; i < numeroPrenotazioniRegistrate; i++) {
            totale += storicoPrenotazioni[i].getCostoTotale();
        }
        return totale;
    }
    
    public int calcolaTotaleNottiPrenotate() {
        int totale = 0;
        for (int i = 0; i < numeroPrenotazioniRegistrate; i++) {
            totale += storicoPrenotazioni[i].getNumeroNotti();
        }
        return totale;
    }
    
    public double calcolaMediaNottiPrenotate() {
        if (numeroPrenotazioniRegistrate == 0) return 0;
        return (double) calcolaTotaleNottiPrenotate() / numeroPrenotazioniRegistrate;
    }
    
    public Prenotazione trovaPrenotazionePiuCostosa() {
        if (numeroPrenotazioniRegistrate == 0) return null;
        Prenotazione max = storicoPrenotazioni[0];
        for (int i = 1; i < numeroPrenotazioniRegistrate; i++) {
            if (storicoPrenotazioni[i].getCostoTotale() > max.getCostoTotale()) {
                max = storicoPrenotazioni[i];
            }
        }
        return max;
    }
    
    public int contaPrenotazioniConColazione() {
        int count = 0;
        for (int i = 0; i < numeroPrenotazioniRegistrate; i++) {
            if (storicoPrenotazioni[i].hasColazioneInclusa()) count++;
        }
        return count;
    }
    
    public Prenotazione[] getStoricoPrenotazioni() {
        return storicoPrenotazioni;
    }
    
    public void stampaStoricoPrenotazioni() {
        System.out.println("--- Storico prenotazioni camera " + numero + " ---");
        if (numeroPrenotazioniRegistrate == 0) {
            System.out.println("  (nessuna prenotazione)");
            return;
        }
        for (int i = 0; i < numeroPrenotazioniRegistrate; i++) {
            System.out.println("  " + (i + 1) + ". " + storicoPrenotazioni[i]);
        }
    }
    
    
    public static double getPrezzoMinimoConsentito() { return prezzo_minimo_consentito; }
    public static void setPrezzoMinimoConsentito(double prezzo) { prezzo_minimo_consentito = prezzo; }
    public static double getCostoColazionePerNotte() { return costo_colazione_per_notte; }
    public static void setCostoColazionePerNotte(double costo) { costo_colazione_per_notte = costo; }
    
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof CameraHotel)) return false;
        CameraHotel other = (CameraHotel) obj;
        return this.numero == other.numero;
    }
    
    @Override
    public int hashCode() {
        return Integer.hashCode(numero);
    }
    
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Camera ").append(numero).append(" ===\n");
        sb.append("  Categoria : ").append(getCategoriaCamera()).append("\n");
        sb.append("  Piano     : ").append(piano).append("\n");
        sb.append("  Prezzo/n  : ").append(String.format("%.2f", prezzoPerNotte)).append("€\n");
        sb.append("  Capienza  : ").append(capienzaMassima).append("\n");
        sb.append("  Stato     : ").append(occupata ? "OCCUPATA" : "LIBERA").append("\n");
        
        sb.append("  Caratteristiche: ");
        if (numeroCaratteristicheInserite == 0) {
            sb.append("nessuna");
        } else {
            for (int i = 0; i < numeroCaratteristicheInserite; i++) {
                if (i > 0) sb.append(", ");
                sb.append(caratteristiche[i]);
            }
        }
        sb.append("\n");
        
        sb.append("  Servizi: ");
        if (numeroServiziInseriti == 0) {
            sb.append("nessuno");
        } else {
            for (int i = 0; i < numeroServiziInseriti; i++) {
                if (i > 0) sb.append(", ");
                sb.append(servizi[i]);
            }
        }
        sb.append("\n");
        
        sb.append("  Prenotazioni registrate: ").append(numeroPrenotazioniRegistrate).append("\n");
        for (int i = 0; i < numeroPrenotazioniRegistrate; i++) {
            sb.append("    ").append(i + 1).append(". ").append(storicoPrenotazioni[i]).append("\n");
        }
        return sb.toString();
    }
}