/*
Hacer un programa en el que haya una variable entera llamada dinero e inicializarla a
cualquier valor. El programa nos expresará esa cantidad en billetes de 500, 100, 50, 20 y 10 € y
monedas de 2 y 1 €. Se ignoran los céntimos.
 */
import java.util.*;
public class Ejercicio50 {
    public static void main(String[] a){
        System.out.print("Instruce una cantidad de euros: ");
        int dinero = new Scanner(System.in).nextInt();
        /*
        double b500 = dinero/500;
        double b200 = dinero/200;
        double b100 = dinero/100;
        double b50 = dinero/50;
        double b20 = dinero/20;
        double b10 = dinero/10;
        double b5 = dinero/5; 
        int m2 = dinero/2;
        int m1 = dinero/1;
        System.out.println("- La cantidad "+dinero+" de euros son: \n   · Billetes 500: "+b500
                +"\n   · Billetes 200€: "+b200+"\n   · Billetes 100€: "+b100+"\n   · Billetes 50€: "+b50
                +"\n   · Billetes 20€: "+b20+"\n   · Billetes 10€: "+b10+"\n   · Billetes 5€: "+b5
                +"\n   · Monedas 2€: "+m2+"\n   · Monedas 1€: "+m1);
        */
        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0, m2 = 0, m1 = 0;
        
    if (dinero>=0 && dinero<=Integer.MAX_VALUE){
            
        if (dinero >=500){
            b500 = dinero/500;
            dinero = dinero % 500;
        }
         
        if (dinero >=200){
            b200 = dinero/200;
            dinero = dinero % 200;
        }
        
        if (dinero >=100){
            b100 = dinero/100;
            dinero = dinero % 100;
        }
        
        if (dinero >=50){
            b50 = dinero/50;
            dinero = dinero % 50;
        }
        
        if (dinero >=20){
            b20 = dinero/500;
            dinero = dinero % 20;
        } 
        
        if (dinero >=10){
            b10 = dinero/10;
            dinero = dinero % 10;
        } 
        if (dinero >=5){
            b5 = dinero/5;
            dinero = dinero % 5;
        }
        
        if (dinero >=2){
            m2 = dinero/2;
            dinero = dinero % 2;
        }
        
        if (dinero >=1){
            m1 = dinero/1;
            dinero = dinero % 1;
        }
    }else{
        System.out.println("HAS INTRODUCIDO MAL UN DATO");
    }
        System.out.println("- La cantidad "+dinero+" de euros son: \n   · Billetes 500: "+b500
                +"\n   · Billetes 200€: "+b200+"\n   · Billetes 100€: "+b100+"\n   · Billetes 50€: "+b50
                +"\n   · Billetes 20€: "+b20+"\n   · Billetes 10€: "+b10+"\n   · Billetes 5€: "+b5
                +"\n   · Monedas 2€: "+m2+"\n   · Monedas 1€: "+m1);
    
    }
}
