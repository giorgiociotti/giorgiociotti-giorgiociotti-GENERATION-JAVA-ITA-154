package com.generation.lessons;
import com.generation.library.Console;

public class DoppioLesson2 {
    
    public static void main(String[] args) {
        
        Double a;
        
        Console.print("Inserire un numero");
        a = Console.readDouble();
        Console.print(a);
        
        Double b = a * 2;
        Console.print("il doppio di " + a + " è " + b);
    }
}