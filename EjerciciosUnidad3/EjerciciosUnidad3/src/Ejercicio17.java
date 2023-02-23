
import bpc.daw.consola.*;
/*
Usa la Consola DAW para realizar un programa que muestre 20 veces por pantalla
la frase "En clase no se juega" cada una en renglón diferente. Las veces impares se alinearán a
la izquierda y las pares a la derecha. 
 */
public class Ejercicio17 {
    public static void main(String[] args) {
        Consola cons = new Consola();
        for (int i = 0; i < 20; i++) {
            if (i % 2 != 0){
                cons.getCapaTexto().print(i,65,i+1+") En clase no se juega.");
            }else{
                cons.getCapaTexto().print(i,0,i+1+") En clase no se juega.");
            }
        }
        cons.getTeclado().leerCaracter();
    }
}
