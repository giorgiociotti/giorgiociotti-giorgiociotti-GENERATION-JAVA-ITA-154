package com.generation.lessons;
import com.generation.library.Console;

public class Modulo3Lesson2
{


    
    public class Lesson002
    {
        
        public static void main(String[] args)
        {
            // tipo nome
            int a;        // due dichiarazioni
            int b;
            
            Console.print("Inserire un numero");   // chiamata a metodo
            a = Console.readInt();                // chiamata a metodo con assegnamento
            
            Console.print("Hai inserito:");       // chiamata a metodo
            Console.print(a);                     // al posto di a Java vede sempre e solo il suo valore
            
            b = a * 2;                            // prendi il valore di a, quale che sia, moltiplicalo per 2 e mettilo in b
            
            Console.print("Il doppio è:");        // chiamata a metodo
            Console.print(b);                     // chiamata a metodo
        }
    }
}
