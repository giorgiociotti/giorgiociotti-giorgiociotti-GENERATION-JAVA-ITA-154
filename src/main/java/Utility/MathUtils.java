package Utility;

public class MathUtils {
    
    public static int maxInt(int a, int b) {
        return (a > b) ? a : b;
    }
    
    public static int minInt(int a, int b) {
        return (a < b) ? a : b;
    }
    
    public static double minDouble(double a, double b) {
        return (a < b) ? a : b;
    }
    
    public static double maxDouble(double a, double b) {
        return (a > b) ? a : b;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean isInRangeInt(int n, int min, int max) {
        return n >= min && n <= max;
    }
    
    public static boolean isInRangeDouble(double n, double min, double max) {
        return n >= min && n <= max;
    }
    
    
}