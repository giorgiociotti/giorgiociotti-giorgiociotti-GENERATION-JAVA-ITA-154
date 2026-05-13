package com.generation.lessons;

public class Hotel {
    
    private String nome;
    private String citta;
    private CameraHotel[] camere;
    private int numeroCamereInserite;
    
    public Hotel(String nome, String citta, int maxCamere) {
        this.nome = nome;
        this.citta = citta;
        this.camere = new CameraHotel[maxCamere];
        this.numeroCamereInserite = 0;
    }
    
    public String getNome() { return nome; }
    public String getCitta() { return citta; }
    public CameraHotel[] getCamere() { return camere; }
    public int getNumeroCamereInserite() { return numeroCamereInserite; }
    
    public void setNome(String nome) { this.nome = nome; }
    public void setCitta(String citta) { this.citta = citta; }
    
    
    public boolean aggiungiCamera(CameraHotel camera) {
        if (numeroCamereInserite >= camere.length) {
            System.out.println("Errore: hotel al completo, impossibile aggiungere altre camere.");
            return false;
        }
        if (camera == null) {
            System.out.println("Errore: la camera non può essere null.");
            return false;
        }
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].equals(camera)) {
                System.out.println("Errore: camera " + camera.getNumero() + " già presente nell'hotel.");
                return false;
            }
        }
        camere[numeroCamereInserite++] = camera;
        System.out.println("Camera " + camera.getNumero() + " (" + camera.getCategoriaCamera() + ") aggiunta all'hotel.");
        return true;
    }
    
    public CameraHotel cercaCameraPerNumero(int numero) {
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].getNumero() == numero) return camere[i];
        }
        return null;
    }
    
    
    public boolean prenotaCamera(int numeroCamera, String nomeCliente, int numeroNotti) {
        CameraHotel c = cercaCameraPerNumero(numeroCamera);
        if (c == null) { System.out.println("Errore: camera " + numeroCamera + " non trovata."); return false; }
        return c.prenota(nomeCliente, numeroNotti);
    }
    
    public boolean prenotaCamera(int numeroCamera, String nomeCliente,
                                 int numeroNotti, int numeroOspiti) {
        CameraHotel c = cercaCameraPerNumero(numeroCamera);
        if (c == null) { System.out.println("Errore: camera " + numeroCamera + " non trovata."); return false; }
        return c.prenota(nomeCliente, numeroNotti, numeroOspiti);
    }
    
    public boolean prenotaCamera(int numeroCamera, String nomeCliente,
                                 int numeroNotti, int numeroOspiti,
                                 boolean colazioneInclusa) {
        CameraHotel c = cercaCameraPerNumero(numeroCamera);
        if (c == null) { System.out.println("Errore: camera " + numeroCamera + " non trovata."); return false; }
        return c.prenota(nomeCliente, numeroNotti, numeroOspiti, colazioneInclusa);
    }
    
    public boolean liberaCamera(int numeroCamera) {
        CameraHotel c = cercaCameraPerNumero(numeroCamera);
        if (c == null) {
            System.out.println("Errore: camera " + numeroCamera + " non trovata.");
            return false;
        }
        c.libera();
        System.out.println("Camera " + numeroCamera + " liberata.");
        return true;
    }
    
    
    public void stampaTutteLeCamere() {
        System.out.println("========== CAMERE DELL'HOTEL " + nome.toUpperCase() + " ==========");
        if (numeroCamereInserite == 0) { System.out.println("Nessuna camera inserita."); return; }
        for (int i = 0; i < numeroCamereInserite; i++) {
            System.out.print(camere[i]);
        }
    }
    
    public void stampaCamereLibere() {
        System.out.println("--- Camere libere ---");
        boolean trovata = false;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].isLibera()) {
                System.out.println("  Camera " + camere[i].getNumero() +
                                           " (" + camere[i].getCategoriaCamera() + ")");
                trovata = true;
            }
        }
        if (!trovata) System.out.println("  Nessuna camera libera.");
    }
    
    public void stampaCamerePerCategoria(String categoria) {
        System.out.println("--- Camere categoria: " + categoria + " ---");
        boolean trovata = false;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].getCategoriaCamera().equalsIgnoreCase(categoria)) {
                System.out.println("  " + camere[i].getNumero() +
                                           " (piano " + camere[i].getPiano() + ")");
                trovata = true;
            }
        }
        if (!trovata) System.out.println("  Nessuna camera trovata.");
    }
    
    public void stampaCamerePerCaratteristica(String caratteristica) {
        System.out.println("--- Camere con caratteristica: " + caratteristica + " ---");
        boolean trovata = false;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].contieneCaratteristica(caratteristica)) {
                System.out.println("  Camera " + camere[i].getNumero());
                trovata = true;
            }
        }
        if (!trovata) System.out.println("  Nessuna camera trovata.");
    }
    
    public void stampaCamerePerServizio(String servizio) {
        System.out.println("--- Camere con servizio: " + servizio + " ---");
        boolean trovata = false;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].contieneServizio(servizio)) {
                System.out.println("  Camera " + camere[i].getNumero());
                trovata = true;
            }
        }
        if (!trovata) System.out.println("  Nessuna camera trovata.");
    }
    
    public void stampaCamereSottoPrezzo(double prezzoMassimo) {
        System.out.println("--- Camere con costo/notte <= " + prezzoMassimo + "€ ---");
        boolean trovata = false;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].calcolaCosto(1) <= prezzoMassimo) {
                System.out.println("  Camera " + camere[i].getNumero() +
                                           " -> " + String.format("%.2f", camere[i].calcolaCosto(1)) + "€/notte");
                trovata = true;
            }
        }
        if (!trovata) System.out.println("  Nessuna camera trovata.");
    }
    
    public void stampaCamerePerCapienza(int personeRichieste) {
        System.out.println("--- Camere con capienza >= " + personeRichieste + " ---");
        boolean trovata = false;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].getCapienzaPrenotabile() >= personeRichieste) {
                System.out.println("  Camera " + camere[i].getNumero() +
                                           " (capienza prenotabile: " + camere[i].getCapienzaPrenotabile() + ")");
                trovata = true;
            }
        }
        if (!trovata) System.out.println("  Nessuna camera trovata.");
    }
    
    
    public CameraHotel trovaCameraPiuEconomica() {
        if (numeroCamereInserite == 0) return null;
        CameraHotel min = camere[0];
        for (int i = 1; i < numeroCamereInserite; i++) {
            if (camere[i].calcolaCosto(1) < min.calcolaCosto(1)) min = camere[i];
        }
        return min;
    }
    
    public CameraHotel trovaCameraPiuCostosa() {
        if (numeroCamereInserite == 0) return null;
        CameraHotel max = camere[0];
        for (int i = 1; i < numeroCamereInserite; i++) {
            if (camere[i].calcolaCosto(1) > max.calcolaCosto(1)) max = camere[i];
        }
        return max;
    }
    
    
    public int contaCamereLibere() {
        int count = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i].isLibera()) count++;
        }
        return count;
    }
    
    public int contaCamereOccupate() {
        int count = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (!camere[i].isLibera()) count++;
        }
        return count;
    }
    
    public double calcolaPrezzoMedioCamere() {
        if (numeroCamereInserite == 0) return 0;
        double totale = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            totale += camere[i].calcolaCosto(1);
        }
        return totale / numeroCamereInserite;
    }
    
    public double calcolaIncassoTotaleHotel() {
        double totale = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            totale += camere[i].calcolaIncassoTotaleCamera();
        }
        return totale;
    }
    
    public void stampaStoricoPrenotazioniCamera(int numeroCamera) {
        CameraHotel c = cercaCameraPerNumero(numeroCamera);
        if (c == null) {
            System.out.println("Errore: camera " + numeroCamera + " non trovata.");
            return;
        }
        c.stampaStoricoPrenotazioni();
    }
    
    public Prenotazione trovaPrenotazionePiuCostosaHotel() {
        Prenotazione max = null;
        for (int i = 0; i < numeroCamereInserite; i++) {
            Prenotazione p = camere[i].trovaPrenotazionePiuCostosa();
            if (p != null && (max == null || p.getCostoTotale() > max.getCostoTotale())) {
                max = p;
            }
        }
        return max;
    }
    
    public int contaPrenotazioniConColazioneHotel() {
        int count = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            count += camere[i].contaPrenotazioniConColazione();
        }
        return count;
    }
    
    
    public CameraSuite[] getCamereSuite() {
        int count = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i] instanceof CameraSuite) count++;
        }
        CameraSuite[] suite = new CameraSuite[count];
        int idx = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i] instanceof CameraSuite) suite[idx++] = (CameraSuite) camere[i];
        }
        return suite;
    }
    
    public void stampaDettagliSuite() {
        CameraSuite[] suite = getCamereSuite();
        System.out.println("--- Dettagli Suite ---");
        if (suite.length == 0) { System.out.println("  Nessuna suite."); return; }
        for (CameraSuite s : suite) {
            System.out.println("  Camera " + s.getNumero() +
                                       " | Supplemento: " + String.format("%.2f", s.getSupplementoSuitePerNotte()) + "€/notte" +
                                       " | SPA: " + (s.isAccessoSpaIncluso() ? "inclusa" : "non inclusa"));
        }
    }
    
    public CameraFamily[] getCamereFamily() {
        int count = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i] instanceof CameraFamily) count++;
        }
        CameraFamily[] family = new CameraFamily[count];
        int idx = 0;
        for (int i = 0; i < numeroCamereInserite; i++) {
            if (camere[i] instanceof CameraFamily) family[idx++] = (CameraFamily) camere[i];
        }
        return family;
    }
    
    public void stampaDettagliFamily() {
        CameraFamily[] family = getCamereFamily();
        System.out.println("--- Dettagli Family ---");
        if (family.length == 0) { System.out.println("  Nessuna camera family."); return; }
        for (CameraFamily f : family) {
            System.out.println("  Camera " + f.getNumero() +
                                       " | Letti bambini: " + f.getNumeroLettiBambini() +
                                       " | Supplemento pulizia: " + String.format("%.2f", f.getSupplementoPulizia()) + "€");
        }
    }
    
    @Override
    public String toString() {
        return "Hotel{nome='" + nome + "', citta='" + citta +
                       "', camere=" + numeroCamereInserite + "}";
    }
}