package com.generation.lessons;

public class House {
    String address;
    int area;
    int spm;
    
    int getPrice() {
        return spm * area;
    }
    
    public String toString() {
        return "Indirizzo: " + address +
                       "\nArea: " + area + " MQ" +
                       "\nPrezzo: " + getPrice() + " €";
    }
}