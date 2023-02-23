
import bpc.daw.consola.*;
/*
Usa la Consola DAW para realizar un programa que muestre 20 veces por pantalla
la frase "En clase no se juega" de forma que las primeras 10 veces aparezcan pegadas a la
izquierda y las siguientes 10 veces aparezcan pegadas a la derecha. 
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        Consola cons = new Consola();
        for (int i = 0; i < 20; i++) {
            if (i>=10){
                cons.getCapaTexto().print(i-10,50,i+1+") En clase no se juega.");
            }else{
                cons.getCapaTexto().print(i,0,i+1+") En clase no se juega.");
            }
        }
        cons.getTeclado().leerCaracter();
    }
}
