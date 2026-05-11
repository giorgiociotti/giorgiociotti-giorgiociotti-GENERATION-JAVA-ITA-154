package com.generation.lessons;

public class Main_Libro {
    public static void main(String[] args) {
        
        
        System.out.println(">> Costruttore vuoto:");
        Libro l1 = new Libro();
        System.out.println(l1);
        
        System.out.println(">> Costruttore completo:");
        Libro l2 = new Libro("Il Nome della Rosa", 1980, 14.99, "Umberto Eco", true);
        System.out.println(l2);
        
        System.out.println(">> Costruttore parziale:");
        Libro l3 = new Libro("1984", "George Orwell", 9.99);
        System.out.println(l3);
        
        System.out.println(">> Test setters su l1:");
        l1.setTitolo("La Divina Commedia");
        l1.setAutore("Dante Alighieri");
        l1.setAnnoPubblicazione(1320);
        l1.setPrezzo(7.50);
        l1.setDisponibile(false);
        System.out.println(l1);
        
        System.out.println(">> Test getters su l2:");
        System.out.println("  Titolo       : " + l2.getTitolo());
        System.out.println("  Autore       : " + l2.getAutore());
        System.out.println("  Anno         : " + l2.getAnnoPubblicazione());
        System.out.println("  Prezzo       : " + l2.getPrezzo() + " €");
        System.out.println("  Disponibile  : " + l2.isDisponibile());
        
        System.out.println("\n>> Test applicaSconto (20%) su l2:");
        l2.applicaSconto(20);
        System.out.println("  Prezzo dopo sconto: " + l2.getPrezzo() + " €");
        
        System.out.println("\n>> Test metodo statico piuEconomico (l2 vs l3):");
        Libro economico = Libro.piuEconomico(l2, l3);
        System.out.println("  Il più economico è: \"" + economico.getTitolo() + "\" a " + economico.getPrezzo() + " €");
        
        System.out.println("\n>> Totale libri creati (proprietà statica): " + Libro.getContatoreLibri());
        
    }
}
