package com.generation.lessons;

public class Utility {
    
    public static int aggiungiArticolo(ArticoloSpesa[] lista, int numeroArticoli, ArticoloSpesa nuovoArticolo) {
        if (numeroArticoli >= lista.length) {
            
            System.out.println("Errore: lista piena.");
            return numeroArticoli;
        }
        
        for (int i = 0; i < lista.length; i++) {
            
            if (lista[i] == null) {
                
                lista[i] = nuovoArticolo;
                
                numeroArticoli++;
                
                System.out.println("Articolo aggiunto.");
                
                return numeroArticoli;
            }
        }
        
        return numeroArticoli;
    }
    
    public static int cercaIndiceArticolo(ArticoloSpesa[] lista, int numeroArticoli, String nome) {
        for (int i = 0; i < numeroArticoli; i++) {
            
            if (lista[i].equals(nome)) {
                return i;
            }
            
            
        }
        return -1;
    }
    
    public static double calcolaTotaleLista(ArticoloSpesa[] lista, int numeroArticoli){
        double tot=0.0;
        for (int i = 0; i < numeroArticoli; i++) {
            
            tot+=lista[i].calcolaTotaleArticolo();
        }
        return tot;
        
    }
    
    
    
    
    
    
}

    
    
    
    



