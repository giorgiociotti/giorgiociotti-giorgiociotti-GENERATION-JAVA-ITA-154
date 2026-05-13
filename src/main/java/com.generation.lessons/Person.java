package com.generation.lessons;

public class Person {
    
    protected String nome;
    protected String cognome;
    protected String giornoDiCompleanno;
    protected String genere;
    
    public Person(String n, String c, String gdb, String g) {
        setNome(n);
        setCognome(c);
        setGiornoDiCompleanno(gdb);
        setGenere(g);
    }
    
    
    public String getNome() {
        if (nome == null) {
            return "";
        }
        return nome;
    }
    
    public String getCognome() {
        if (cognome == null) {
            return "";
        }
        return cognome;
    }
    
    public String getGiornoDiCompleanno() {
        if (giornoDiCompleanno == null) {
            return "";
        }
        return giornoDiCompleanno;
    }
    
    public String getGenere() {
        if (genere == null) {
            return "";
        }
        return genere;
    }
    
    
    public void setNome(String nome) {
        if (nome == null) {
            return;
        }
        this.nome = nome;
    }
    
    public void setCognome(String cognome) {
        if (cognome == null) {
            return;
        }
        this.cognome = cognome;
    }
    
    public void setGiornoDiCompleanno(String giornoDiCompleanno) {
        if (giornoDiCompleanno == null) {
            return;
        }
        this.giornoDiCompleanno = giornoDiCompleanno;
    }
    
    public void setGenere(String genere) {
        if (genere == null) {
            return;
        }
        this.genere = genere;
    }
    
    @Override
    public String toString() {
        return "Nome: " + getNome() +
        ", Cognome: " + getCognome() +
        ", Compleanno: " + getGiornoDiCompleanno() +
        ", Genere: " + getGenere();
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof Person)) return false;
        
        Person other = (Person) obj;
        return getNome().equals(other.getNome()) &&
                       getCognome().equals(other.getCognome()) &&
                       getGiornoDiCompleanno().equals(other.getGiornoDiCompleanno()) &&
                       getGenere().equals(other.getGenere());
    }
}