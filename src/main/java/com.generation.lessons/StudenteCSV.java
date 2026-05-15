package com.generation.lessons;

class StudenteCSV {
    
    private String nome;
    private String cognome;
    private int eta;
    private String corso;
    
    public StudenteCSV(String nome, String cognome, int eta, String corso) {
        this.nome    = nome;
        this.cognome = cognome;
        this.eta     = eta;
        this.corso   = corso;
    }
    
    public String getNome()    { return nome; }
    public String getCognome() { return cognome; }
    public int    getEta()     { return eta; }
    public String getCorso()   { return corso; }
    
    public void setNome(String nome)       { this.nome = nome; }
    public void setCognome(String cognome) { this.cognome = cognome; }
    public void setEta(int eta)            { this.eta = eta; }
    public void setCorso(String corso)     { this.corso = corso; }
    
    @Override
    public String toString() {
        return "Studente{nome='" + nome + "', cognome='" + cognome +
                       "', eta=" + eta + ", corso='" + corso + "'}";
    }
}