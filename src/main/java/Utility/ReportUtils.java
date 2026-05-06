package Utility;

public class ReportUtils {
    
   
        
        public static void stampaTitoloApplicazione() {
            System.out.println("=== LABORATORIO DI RICERCA AMBIENTALE ===");
        }
        
        public static void stampaMessaggioIntroduzione() {
            System.out.println("Questo programma analizza misurazioni ambientali provenienti da sensori.");
            System.out.println("Le misure verranno convertite in unita standard e controllate rispetto ai range di sicurezza.");
        }
        
        public static void stampaSeparatore() {
            System.out.println("----------------------------------------");
        }
        
        public static void stampaValoriConvertiti(double temperaturaCelsius, double distanzaMetri,
                                                  double pesoKg, double volumeLitri) {
            
            System.out.println("--- Valori convertiti ---");
            System.out.println("Temperatura: " + temperaturaCelsius + " gradi C");
            System.out.println("Distanza: " + distanzaMetri + " m");
            System.out.println("Peso: " + pesoKg + " kg");
            System.out.println("Volume: " + volumeLitri + " litri");
        }
        
        public static void stampaEsitoRange(String nomeMisura, boolean valoreValido) {
            if (valoreValido) {
                System.out.println(nomeMisura + ": OK");
            } else {
                System.out.println(nomeMisura + ": FUORI RANGE");
            }
        }
        
        public static void stampaEsitoCodice(int codice, boolean codiceValido) {
            if (codiceValido) {
                System.out.println("Codice identificativo " + codice + ": valido");
            } else {
                System.out.println("Codice identificativo " + codice + ": non valido");
            }
        }
        
        public static void stampaConfrontoMisura(String nomeMisura, double valore1, double valore2) {
            double max = Math.max(valore1, valore2);
            double min = Math.min(valore1, valore2);
            
            System.out.println(nomeMisura + " - Max: " + max + ", Min: " + min);
        }
    }