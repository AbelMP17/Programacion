/*
Haz un programa que calcule las dos soluciones de la ecuación 
𝑥^2 − 5𝑥 + 6
 */
public class Ejercicio38 {
    public static void main(String[] args) {
        double a = 1;
        double b = -5;
        double c = 6;
        
        double raíz = Math.sqrt(Math.pow(b, 2)-(4*a*c));
        double divisor = (2*a);
        
        double x1 = (-b+raíz)/divisor;
        double x2 = (-b-raíz)/divisor;
        
        System.out.println("Primer resultado: "+x1);
        System.out.println("Segundo resultado: "+x2);
                       
    }
}
