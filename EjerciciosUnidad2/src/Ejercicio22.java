/*
En la librería ObjetosSencillos.jar se encuentra la clase TarjetaCrédito. Haz un
programa que cree una tarjeta de crédito con contraseña 1111 y saldo 5000€. Mostrar la
información de la cuenta por pantalla. Sacar 2000 € y volver a mostrar la información.
 */
import bpc.daw.objetos.*;
public class Ejercicio22 {
    public static void main(String[] a) {
        TarjetaCredito tarjeta = new TarjetaCredito(5000,1111);
        
        try{
            System.out.println("El saldo actual es de "+tarjeta.getSaldo(1111));
            
            tarjeta.sacarDinero(2000, 1111);
            
            System.out.println("Sacamos dinero.");
            
            System.out.println("El saldo actual es de "+tarjeta.getSaldo(1111));
            
        }catch(java.lang.Exception error){
            
            System.out.println("La contraseña esta mal o no te queda saldo.");
        }  
        

    }
}
