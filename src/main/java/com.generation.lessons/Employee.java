package com.generation.lessons;

public class Employee extends Person {
    
    protected double salary;
    protected String role;
    
    public Employee(String n, String c, String gdb, String g, double salary, String role) {
        super(n, c, gdb, g);
        setSalary(salary);
        setRole(role);
    }
    
    public double getSalary() {
        return salary;
    }
    
    public String getRole() {
        if (role == null) {
            return "";
        }
        return role;
    }
    
    public void setSalary(double salary) {
        if (salary < 0) {
            return;
        }
        this.salary = salary;
    }
    
    public void setRole(String role) {
        if (role == null) {
            return;
        }
        this.role = role;
    }
    
    @Override
    public String toString() {
        return super.toString() +
                       ", Ruolo: " + getRole() +
                       ", Salario: " + getSalary();
    }
    @Override
    public boolean equals(Object obj) {
        if (!super.equals(obj)) return false;
        if (!(obj instanceof Employee)) return false;
        
        Employee other = (Employee) obj;
        return getSalary() == other.getSalary() && getRole().equals(other.getRole());
    }
}