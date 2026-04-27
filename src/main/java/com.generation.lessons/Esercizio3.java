package com.generation.lessons;

import com.generation.library.Console;

public class Esercizio3 {
    
    public static void main(String[] args) {
        Double lato1;
        Double lato2;
        
        Console.print("Inserire il primo lato del rettangolo");
        lato1 = Console.readDouble();
        
        Console.print("Inserire il secondo lato del rettangolo");
        lato2 = Console.readDouble();
        
        Double area = lato1 * lato2;
        Double perimetro = (lato1 + lato2) * 2;
        
        Console.print("Area = " + area + " Perimetro = " + perimetro);
    }
}