package com.generation.lessons;

public class ArticoloSpesa {
    String nome;
    String categoria;
    double prezzoUnitario;
    int quantita;
    boolean acquistato;
    
    
    
    public ArticoloSpesa (){}
    
    
    
      public ArticoloSpesa (String nome,String categoria,double prezzo){
    this.nome=nome;
    this.categoria=categoria;
    this.prezzoUnitario=prezzo;
    }
    
    
    public ArticoloSpesa (String nome){
    this.nome=nome;
    }
     public  ArticoloSpesa(String nome, String categoria, Double prezzo, int quantita, boolean acquistato){
        this.nome=nome;
        this.categoria=categoria;
        this.prezzoUnitario=prezzo;
        this.quantita=quantita;
        this.acquistato=acquistato;
     }
    
    public  String ToString(){
        return "nome:"+nome+"\ncategoria"+categoria+" \nprezzo"+prezzoUnitario+" \nquantita"+quantita+" \nacquistato"+acquistato;
    }
    
    public double calcolaTotaleArticolo(){
        return this.prezzoUnitario*this.quantita;
    }
    
    void aumentaQuantita(int quantitaDaAggiungere){
        if(quantitaDaAggiungere<=0){
            System.out.println("ERRORE");
            return;
        }
        quantita+=quantitaDaAggiungere;
        System.out.println("quantita aggiunta ="+ quantita);
    }
    
    void ridurreQuantita(int quantitaDaRidurre){
        if(quantitaDaRidurre<=0){
            System.out.println("ERRORE");
            return;
        }
        
        if ((quantita-quantitaDaRidurre)<=0){
            System.out.println("ERRORE");
            return;
            
        }
        
        quantita-=quantitaDaRidurre;
        System.out.println("quantita aggiornata ="+ quantita);
    }
    void aggiornaPrezzoUnitario(double nuovoPrezzo){
        if(nuovoPrezzo<0){
            System.out.println("ERRORE");
            return;
        }
        this.prezzoUnitario=nuovoPrezzo;
        System.out.println("prezzo aggiornato");
        
    }
    
    
    void applicaSconto(double percentuale) {
    if (percentuale < 0) {
        System.out.println("ERRORE");
        return;
    } else if (percentuale > 100) {
        System.out.println("ERRORE");
        return;
    }
    
    double sconto = prezzoUnitario * (percentuale / 100);
    prezzoUnitario -= sconto;
    System.out.println("Sconto applicato. Nuovo prezzo: " + prezzoUnitario);
}
    
}
