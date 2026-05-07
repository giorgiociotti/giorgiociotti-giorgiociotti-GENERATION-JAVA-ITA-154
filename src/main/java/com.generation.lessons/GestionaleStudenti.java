package com.generation.lessons;

public class GestionaleStudenti {
    public static void main(String[] args) {
        Studente s1 = new Studente();
        s1.nome = "Mario Rossi";
        s1.eta = 20;
        s1.votoJava = 25.5;
        s1.votoDatabase = 22.0;
        
        Studente s2 = new Studente();
        s2.nome = "Giulia Bianchi";
        s2.eta = 22;
        s2.votoJava = 29.0;
        s2.votoDatabase = 30.0;
        

        
        Studente[] classe = {s1, s2};
        
        double mediaMigliore = 0;
        String nomeMigliore = "";
        
        
        for (int i=0;i<classe.length;i++) {
            Studente s = classe[i];
            double media = (s.votoJava + s.votoDatabase) / 2;
            
            System.out.println("Studente: " + s.nome + " (" + s.eta + " anni)");
            System.out.println("Voti: Java " + s.votoJava + " | DB " + s.votoDatabase);
            System.out.println("Media: " + media);
            
            if (media >= 18) {
                System.out.println("Esito: PROMOSSO");
            } else {
                System.out.println("Esito: BOCCIATO");
            }
            
            if (media > mediaMigliore) {
                mediaMigliore = media;
                nomeMigliore = s.nome;
            }
            
        }
        
        System.out.println("Migliore studente della classe: " + nomeMigliore + " con media " + mediaMigliore);
    }
}