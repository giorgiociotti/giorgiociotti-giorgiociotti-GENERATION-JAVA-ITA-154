package com.generation.lessons;

import java.util.Scanner;

public class AcquistoOnline {
    
    public static void main(String[] args) {
        
        double prezzoProdotto = 80.0;
        boolean prodottoDisponibile = true;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Inserisci il tuo saldo disponibile: ");
        double saldo = scanner.nextDouble();
        
        System.out.print("Sei un cliente premium? Inserisci true o false: ");
        boolean clientePremium = scanner.nextBoolean();
        
        System.out.println("Scegli il tipo di spedizione:");
        System.out.println("1 - spedizione standard");
        System.out.println("2 - spedizione rapida");
        System.out.println("3 - Ritiro in negozio");
        System.out.print("Inserisci la tua scelta: ");
        int sceltaSpedizione = scanner.nextInt();
        
        if (!prodottoDisponibile) {
            System.out.println("Prodotto non disponibile");
        } else {
            
            if (saldo < prezzoProdotto) {
                System.out.println("saldo insufficiente per acquistare il prodotto");
            } else {
                
                double costoSpedizione = 0.0;
                boolean spedizioneValida = true;
                
                switch (sceltaSpedizione) {
                    
                    case 1:
                        costoSpedizione = clientePremium ? 0.0 : 5.0;
                        break;
                        
                
                case 2:
                    costoSpedizione = clientePremium ? 7.0 : 12.0;
                    break;
                    
                    
                    case 3:
                        costoSpedizione = 0.0;
                        break;
                    
                    default:
                        System.out.println("scelta spedizione non valida");
                        spedizioneValida = false;
                        break;
                }
                
                if (spedizioneValida) {
                    
                    double totaleDaPagare = prezzoProdotto + costoSpedizione;
                    
                    if (saldo >= totaleDaPagare) {
                        System.out.println("Acquisto completato");
                        System.out.println("Prezzo prodotto: " + prezzoProdotto + " euro");
                        System.out.println("Costo spedizione: " + costoSpedizione + " euro");
                        System.out.println("Totale pagato: " + totaleDaPagare + " euro");
                    } else {
                        System.out.println("saldo sufficiente per il prodotto, ma non per la spedizione");
                        System.out.println("Totale richiesto: " + totaleDaPagare + " euro");
                        System.out.println("saldo disponibile: " + saldo + " euro");
                    }
                }
            }
        }
        
        scanner.close();
    }
}
