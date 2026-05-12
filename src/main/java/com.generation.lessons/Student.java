package com.generation.lessons;

public class Student extends Person {
    
    protected int year;
    protected String section;
    
    public Student(String n, String c, String gdb, String g, int year, String section) {
        super(n, c, gdb, g);
        setYear(year);
        setSection(section);
    }
    
    public int getYear() {
        return year;
    }
    
    public String getSection() {
        if (section == null) {
            return "";
        }
        return section;
    }
    
    public void setYear(int year) {
        if (year <= 0) {
            return;
        }
        this.year = year;
    }
    
    public void setSection(String section) {
        if (section == null) {
            return;
        }
        this.section = section;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                       ", Anno: " + getYear() +
                       ", Sezione: " + getSection();
    }
    
    public static void main(String[] args) {
        Student s = new Student("Mario", "Rossi", "15/03/2005", "M", 3, "A");
        System.out.println(s);
        
        System.out.println("Nome: "     + s.getNome());
        System.out.println("Cognome: "  + s.getCognome());
        System.out.println("Anno: "     + s.getYear());
        System.out.println("Sezione: "  + s.getSection());
        
        s.setYear(4);
        s.setSection("B");
        System.out.println("\nDopo modifica:");
        System.out.println(s);
    }
}