package com.generation.lessons;

public class CameraFamily extends CameraHotel {
    
    private int numeroLettiBambini;
    private double supplementoPulizia;
    
    public CameraFamily(int numero, int piano, double prezzoPerNotte,
                        int capienzaMassima, int maxCaratteristiche, int maxServizi,
                        int maxPrenotazioni, int numeroLettiBambini,
                        double supplementoPulizia) {
        super(numero, piano, prezzoPerNotte, capienzaMassima,
                maxCaratteristiche, maxServizi, maxPrenotazioni);
        this.numeroLettiBambini = numeroLettiBambini;
        this.supplementoPulizia = supplementoPulizia;
    }
    
    public int getNumeroLettiBambini() { return numeroLettiBambini; }
    public double getSupplementoPulizia() { return supplementoPulizia; }
    
    public void setNumeroLettiBambini(int n) { this.numeroLettiBambini = n; }
    public void setSupplementoPulizia(double s) { this.supplementoPulizia = s; }
    
    @Override
    public String getCategoriaCamera() {
        return "family";
    }
    
    @Override
    public int getCapienzaPrenotabile() {
        return getCapienzaMassima() + numeroLettiBambini;
    }
    
    @Override
    public double calcolaCosto(int numeroNotti) {
        if (numeroNotti <= 0) return 0;
        return getPrezzoPerNotte() * numeroNotti + supplementoPulizia;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("  [Family] Letti bambini: ").append(numeroLettiBambini).append("\n");
        sb.append("  [Family] Supplemento pulizia: ").append(String.format("%.2f", supplementoPulizia)).append("€\n");
        return sb.toString();
    }
}