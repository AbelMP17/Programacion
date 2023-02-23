/*
Consulta el pdf de la “Librería Estándar de Java” y busca las clases Math y
NumberFormat. Haz un programa que calcule el valor del número pi usando la siguiente
fórmula: 𝜋 = 4 ∗ 𝑎𝑟𝑐 𝑡𝑔(1) y muestre el valor usando 4 cifras decimales. 
 */

import java.text.*;

public class Ejercicio43 {
    public static void main(String[] args) {
        double pi = 4* Math.atan(1);
        
        NumberFormat decimales = NumberFormat.getInstance();
        
        decimales.setMaximumFractionDigits(4);

        System.out.println(decimales.format(pi));       
        
    }
}
