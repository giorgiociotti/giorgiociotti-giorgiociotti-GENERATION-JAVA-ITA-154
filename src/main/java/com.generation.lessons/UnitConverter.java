package com.generation.lessons;


public class UnitConverter {
    
    public static double kmToMetri(double km) {
        return km * 1000.0;
    }
    
    public static double metriToKm(double metri) {
        return metri / 1000.0;
    }
    
    
    public static double metriToMiglia(double metri) {
        return metri / 1609.344;
    }
    
    
    public static double migliaToMetri(double miglia) {
        return miglia * 1609.344;
    }
    
    public static double kgToGrammi(double kg) {
        return kg * 1000.0;
    }
    
    
    public static double grammiToKg(double grammi) {
        return grammi / 1000.0;
    }
    
    
    public static double kgToLibbre(double kg) {
        return kg * 2.20462;
    }
    
    
    public static double libreToKg(double libbre) {
        return libbre / 2.20462;
    }
    
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }
    
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }
    
    
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    
    
    public static double litriToMillilitri(double litri) {
        return litri * 1000.0;
    }
    
    public static double millilitriToLitri(double millilitri) {
        return millilitri / 1000.0;
    }
    
    
    public static double litriToGalloni(double litri) {
        return litri * 0.264172;
    }
    
    
    public static double galloniToLitri(double galloni) {
        return galloni / 0.264172;
    }
    
    
    public static void main(String[] args) {
        
        System.out.println("5 km -> metri:   " + kmToMetri(5));
        System.out.println("5000 m -> km:    " + metriToKm(5000));
        System.out.println("1000 m -> miglia:" + metriToMiglia(1000));
        System.out.println("1 miglio -> m:   " + migliaToMetri(1));
        
        System.out.println("2 kg -> grammi:  " + kgToGrammi(2));
        System.out.println("2000 g -> kg:    " + grammiToKg(2000));
        System.out.println("1 kg -> libbre:  " + kgToLibbre(1));
        System.out.println("2.20462 lb -> kg:" + libreToKg(2.20462));
        
        System.out.println("100 C -> F:      " + celsiusToFahrenheit(100));
        System.out.println("212 F -> C:      " + fahrenheitToCelsius(212));
        System.out.println("0 C -> K:        " + celsiusToKelvin(0));
        System.out.println("273.15 K -> C:   " + kelvinToCelsius(273.15));
        
        System.out.println("2 litri -> ml:   " + litriToMillilitri(2));
        System.out.println("2000 ml -> litri:" + millilitriToLitri(2000));
        System.out.println("1 litro -> gal:  " + litriToGalloni(1));
        System.out.println("1 gal -> litri:  " + galloniToLitri(1));
    }
}