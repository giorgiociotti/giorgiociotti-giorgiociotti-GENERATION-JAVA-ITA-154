package com.generation.lessons;

public class Prenotazione {
    
    private String nomeCliente;
    private int numeroNotti;
    private int numeroOspiti;
    private boolean colazioneInclusa;
    private double costoTotale;
    private boolean attiva;
    
    public Prenotazione(String nomeCliente, int numeroNotti, int numeroOspiti,
                        boolean colazioneInclusa, double costoTotale) {
        this.nomeCliente = nomeCliente;
        this.numeroNotti = numeroNotti;
        this.numeroOspiti = numeroOspiti;
        this.colazioneInclusa = colazioneInclusa;
        this.costoTotale = costoTotale;
        this.attiva = true;
    }
    
    public String getNomeCliente() { return nomeCliente; }
    public int getNumeroNotti() { return numeroNotti; }
    public int getNumeroOspiti() { return numeroOspiti; }
    public boolean hasColazioneInclusa() { return colazioneInclusa; }
    public double getCostoTotale() { return costoTotale; }
    public boolean isAttiva() { return attiva; }
    
    public void setNomeCliente(String nomeCliente) { this.nomeCliente = nomeCliente; }
    public void setNumeroNotti(int numeroNotti) { this.numeroNotti = numeroNotti; }
    public void setNumeroOspiti(int numeroOspiti) { this.numeroOspiti = numeroOspiti; }
    public void setColazioneInclusa(boolean colazioneInclusa) { this.colazioneInclusa = colazioneInclusa; }
    public void setCostoTotale(double costoTotale) { this.costoTotale = costoTotale; }
    public void setAttiva(boolean attiva) { this.attiva = attiva; }
    
    public void chiudi() {
        this.attiva = false;
    }
    
    @Override
    public String toString() {
        return "Prenotazione{" +
                       "cliente='" + nomeCliente + "'" +
                       ", notti=" + numeroNotti +
                       ", ospiti=" + numeroOspiti +
                       ", colazione=" + colazioneInclusa +
                       ", costo=" + String.format("%.2f", costoTotale) + "€" +
                       ", attiva=" + attiva +
                       "}";
    }
}
