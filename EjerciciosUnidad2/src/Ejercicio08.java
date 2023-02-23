/*
Haz un programa en el que haya dos depósitos de agua de capacidad máxima 20
litros y con capacidades iniciales 15 y 5 litros respectivamente. Retira del primero cinco litros
de agua y añádelos al segundo. Dibuja los depósitos antes y después de la operación.
 */
import bpc.daw.objetos.*;
public class Ejercicio08 {
    public static void main(String[] a){
        DepositoAgua deposito = new DepositoAgua(15,20);
        DepositoAgua deposito2 = new DepositoAgua(5,20);
        
        System.out.println("Antes de retirar y añadir litros de agua:");
                
        deposito.dibujar();
        deposito2.dibujar();    
        int cantidadActual1 = deposito.getCantidadActual();
        int capacidadMaxima1 = deposito.getCapacidadMaxima();
        int porcentaje1 = (cantidadActual1*100)/capacidadMaxima1;
        
        int cantidadActual2 = deposito2.getCantidadActual();
        int capacidadMaxima2 = deposito2.getCapacidadMaxima();
        int porcentaje2 = (cantidadActual2*100)/capacidadMaxima2;
        
        System.out.println("La opcupacion actual del deposito 1 de agua es del "+porcentaje1+"%");
        System.out.println("La opcupacion actual del deposito 2 de agua es del "+porcentaje2+"%\n-------------------------------------------------------");
        
        deposito.retirarLitro();
        deposito.retirarLitro();
        deposito.retirarLitro();
        deposito.retirarLitro();
        deposito.retirarLitro();
        
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        deposito2.añadirLitro();
        
        System.out.println("Después de retirar y añadir litros de agua:"); 
        
        deposito.dibujar();
        deposito2.dibujar();
        
        int cantidadActual3 = deposito.getCantidadActual();
        int capacidadMaxima3 = deposito.getCapacidadMaxima();
        int porcentaje3 = (cantidadActual3*100)/capacidadMaxima3;
        
        int cantidadActual4 = deposito2.getCantidadActual();
        int capacidadMaxima4 = deposito2.getCapacidadMaxima();
        int porcentaje4 = (cantidadActual4*100)/capacidadMaxima4;
        
        System.out.println("La opcupacion actual del deposito 1 de agua es del "+porcentaje3+"%");
        System.out.println("La opcupacion actual del deposito 2 de agua es del "+porcentaje4+"%");
    }
}
