package com.generation.lessons;

public class AvvioVariabili {

    // UNA VARIABILE e' un contenitore di un certo tipo che contiene un certo valore
    // il tipo ce lo immaginiamo come un'etichetta sul contenitore
    // il valore lo immaginiamo come il contenuto
    public static void main(String[] args){
        // TIPI DI VARIABILI:
        /*
         *  1) 8 TIPI PRIMITIVI, tra essi abbiamo
	 * - tipi numerici
	 * int -> da -2,147,483,648 a 2,147,483,647
	 * short -> da -32,768 a 32,767
	 * byte -> da -128 a 127
	 * long -> da -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
	 * float -> circa da ±1.4E-45 a ±3.4E+38 (precisione ~6-7 cifre)
	 * double -> circa da ±4.9E-324 a ±1.7E+308 (precisione ~15 cifre)
	 * 
	 * - tipi caratteri
	 * char -> da 0 a 65,535 (caratteri Unicode)
	 * 
	 * - tipi booleani
	 * boolean -> true / false
         * 
         *  2) TIPI COMPLESSI
         * String, che contiene piu caratteri
         * 
         */

         // per creare una variabile e' necessario fare 2 operazioni:

         // I) DICHIARAZIONE, che associa il tipo alla variabile
         //     attraverso la sintassi: [tipo] [nome];
        int numero;
	short numeroCorto;
	byte numeroPiccolo;
        double decimaleDouble;
        float decimaleFloat;
        long numeroGrande;
        char carattere;
        boolean booleano;
        String parola;

        // II) INIZIALIZZAZIONE, andiamo a dare un valore alla variabile
        //     attraverso la sintassi: [nome] = [nuovo valore];
        numero = 1;
	numeroCorto = 32000;
	numeroPiccolo = 120;
        decimaleDouble = 1.5;
        decimaleFloat = 3.45f;
        numeroGrande = 7367429872L;
        carattere = 'c';
        booleano = false;
        // .... codice
        booleano = true;
        parola = "la mia Casa è bella un sacco ma proprio tanto!! tipo 4";

        // I + II) DICHIARAZIONE e INIZIALIZZAZIONE nello stesso comando:
        //     attraverso la sintassi: [tipo] [nome] = [nuovo valore];
        int numeroSpeciale = 6;
        String parolaSpeciale = "aò";



        System.out.print(parolaSpeciale);
        




        /*
         * ATTENZIONE:
         * - non posso creare due variabili con lo stesso nome
         */


    }
    
}
