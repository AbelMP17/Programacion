/*
Haz un proyecto nuevo y añade la librería “ObjetosSencillos.jar”. En dicha librería encontrarás la clase DepósitoAgua. Haz un programa en el que haya un depósito de agua con
capacidad máxima 50 litros y capacidad inicial 15 litros. Dibújalo en la pantalla y calcula el tanto por ciento de ocupación del depósito.
 */
import bpc.daw.objetos.*;
public class Ejercicio07 {
    public static void main(String[] a){
        DepositoAgua deposito = new DepositoAgua(15,50);
        
        int cantidadActual = deposito.getCantidadActual();
        int capacidadMaxima = deposito.getCapacidadMaxima();
        int porcentaje = (cantidadActual*100)/capacidadMaxima;
       
        deposito.dibujar();
        
        System.out.println("La opcupacion actual del deposito de agua es del "+porcentaje+"%");
    }
}
