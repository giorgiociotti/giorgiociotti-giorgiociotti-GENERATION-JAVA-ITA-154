package com.generation.lessons;

import java.util.Scanner;

public class Modulo3Lesson4 {
    
    public static void main(String[] args)
    {
        Scanner tastiera = new Scanner(System.in);
        
        int ricavato;
        int tasse = 0;
        String mes;
        
        System.out.println("Inserisci il tuo ricavato:");
        ricavato = tastiera.nextInt();
        
        if (ricavato <= 20000) {
            mes = "Sei salvo";
        } else {
            tasse = ((ricavato - 20000) * 20) / 100;
            mes = "Devi pagare € " + tasse;
        }
        
        System.out.println(mes);
        
        tastiera.close();
    }
}