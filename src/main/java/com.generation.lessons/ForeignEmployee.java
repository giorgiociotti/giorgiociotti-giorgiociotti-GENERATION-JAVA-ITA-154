package com.generation.lessons;


    
    public class ForeignEmployee extends Employee {
        
        protected String nationality;
        protected String permitCode;
        
        public ForeignEmployee(String n, String c, String gdb, String g,
        double salary, String role,
        String nationality, String permitCode) {
            super(n, c, gdb, g, salary, role);
            setNationality(nationality);
            setPermitCode(permitCode);
        }
        
        public String getNationality() {
            if (nationality == null) {
                return "";
            }
            return nationality;
        }
        
        public String getPermitCode() {
            if (permitCode == null) {
                return "";
            }
            return permitCode;
        }
        
        public void setNationality(String nationality) {
            if (nationality == null) {
                return;
            }
            this.nationality = nationality;
        }
        
        public void setPermitCode(String permitCode) {
            if (permitCode == null) {
                return;
            }
            this.permitCode = permitCode;
        }
        
        @Override
        public String toString() {
            return super.toString() +
            ", Nazionalità: " + getNationality() +
            ", Permesso: " + getPermitCode();
        }
        
        public static void main(String[] args) {
            ForeignEmployee fe = new ForeignEmployee(
                    "Ahmed",
                    "Ben Ali",
                    "10/07/1990",
                    "M",
                    2500.00,
                    "Sviluppatore",
                    "Marocco",
                    "PDS-20241234"
            );
            
            System.out.println(fe);
            
            fe.setSalary(2800.00);
            fe.setRole("Senior Developer");
            System.out.println("\nDopo promozione:");
            System.out.println(fe);
        }
    }

