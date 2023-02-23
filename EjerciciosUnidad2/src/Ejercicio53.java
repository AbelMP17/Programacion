
import java.awt.Color;
import java.util.*;

/*
Repite los apartados a,b,c y d del ejercicio anterior pero rellenando el
Map<String,Color> con un TreeMap<String,Color>. ¿Notas alguna diferencia en la salida del
programa? 
 */
public class Ejercicio53 {
    public static void main(String[] args) {
        Map<String,Color> coches = new TreeMap<>();
        
        coches.put("12535ABC",Color.RED);
        coches.put("98525KWX",Color.YELLOW);
        coches.put("17632MSE",Color.GREEN);
        coches.put("85321ABC",Color.YELLOW);
        
        int tamaño = coches.size();
        System.out.println("El tamaño del map es de: "+tamaño);
        
        String mostrarCoches = coches.toString();
        System.out.println("El map contiene los siguiente: \n"+mostrarCoches);
        
        System.out.print("Introduce el numero de matricula del coche que quieras: ");
        String matricula = new Scanner (System.in).nextLine();
        
        if (coches.containsKey(matricula)){
             System.out.println(coches.get(matricula));
        }else{
            System.out.println("Has introducido mal la matricula o no existe.");
        }
        
    }
}
