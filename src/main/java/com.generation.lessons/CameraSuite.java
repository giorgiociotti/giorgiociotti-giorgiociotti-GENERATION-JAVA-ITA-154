package com.generation.lessons;

public class CameraSuite extends CameraHotel {
    
    private double supplementoSuitePerNotte;
    private boolean accessoSpaIncluso;
    
    public CameraSuite(int numero, int piano, double prezzoPerNotte,
                       int capienzaMassima, int maxCaratteristiche, int maxServizi,
                       int maxPrenotazioni, double supplementoSuitePerNotte,
                       boolean accessoSpaIncluso) {
        super(numero, piano, prezzoPerNotte, capienzaMassima,
                maxCaratteristiche, maxServizi, maxPrenotazioni);
        this.supplementoSuitePerNotte = supplementoSuitePerNotte;
        this.accessoSpaIncluso = accessoSpaIncluso;
    }
    
    public double getSupplementoSuitePerNotte() { return supplementoSuitePerNotte; }
    public boolean isAccessoSpaIncluso() { return accessoSpaIncluso; }
    
    public void setSupplementoSuitePerNotte(double supplemento) { this.supplementoSuitePerNotte = supplemento; }
    public void setAccessoSpaIncluso(boolean accesso) { this.accessoSpaIncluso = accesso; }
    
    @Override
    public String getCategoriaCamera() {
        return "suite";
    }
    
    @Override
    public double calcolaCosto(int numeroNotti) {
        if (numeroNotti <= 0) return 0;
        return (getPrezzoPerNotte() + supplementoSuitePerNotte) * numeroNotti;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("  [Suite] Supplemento/notte: ").append(String.format("%.2f", supplementoSuitePerNotte)).append("€\n");
        sb.append("  [Suite] Accesso SPA: ").append(accessoSpaIncluso ? "incluso" : "non incluso").append("\n");
        return sb.toString();
    }
}