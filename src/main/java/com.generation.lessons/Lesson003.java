package com.generation.lessons;

import com.generation.library.Console;

public class Lesson003 {
    public static void main(String[] args) {
        Double lato;
        Double area;
        Double perimetro;
        
        Console.print("Inserire lato quadrato");
        lato = Console.readDouble();
        area = lato * lato;
        perimetro = lato * 4;
        Console.print("Area = " + area + " perimetro = " + perimetro);
    }
}