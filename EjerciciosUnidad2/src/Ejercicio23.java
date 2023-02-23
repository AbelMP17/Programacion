
import bpc.daw.objetos.TarjetaCredito;

/*
Haz un programa que cree una tarjeta de crédito con contraseña 2222 y saldo
1000€. Mostrar la información de la cuenta por pantalla. Ingresar 100 € y volver a mostrar la
información. Retirar 2800 € de ella y volver a mostrar la información.
 */
public class Ejercicio23 {
    public static void main(String[] a) {
        TarjetaCredito tarjeta = new TarjetaCredito(1000,2222);
        
        try{
            System.out.println("El saldo actual es de "+tarjeta.getSaldo(2222));
            
            tarjeta.ingresarDinero(100);
            
            System.out.println("Ingresamos dinero.");
            
            System.out.println("El saldo actual es de "+tarjeta.getSaldo(2222));
            
            System.out.println("Intentamos sacar dinero.");
            boolean sacar = tarjeta.sacarDinero(2800,2222);
            
            System.out.println("¿Tienes suficiente dinero para sacar?: "+sacar);
            
            }catch(java.lang.Exception error){
            
            System.out.println("La contraseña esta mal o no te queda saldo.");
        }  
        
         
        

    }
}
