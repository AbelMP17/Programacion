
import java.awt.Color;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
En este ejercicio vamos a guardar las asociaciones entre la matrícula de un coche
y el color de dicho coche. Consulta la documentación de la interfaz Map<K,V>, la clase
HashMap<K,V> y la clase Color del paquete java.awt y haz un programa que haga esto:
    a) Crea un Map<String,Color> y rellenarlo con un HashMap<String,Color> vacío
    b) Añade al objeto creado en el apartado anterior estas asociaciones:
        12535ABC | Color rojo
        98525KWX | Color amarillo
        17632MSE | Color verde
        85321ABC | Color amarillo
    c) Muestra en pantalla el tamaño del map
    d) Llama al método toString del map y muestra lo que produce por pantalla
    e) Muestra en pantalla el color del coche cuya matrícula se introduce por teclado. En
    caso de introducir una matrícula que no esté en el map, se mostrará el mensaje “No
    existe esa matrícula” 

 */
public class Ejercicio52 {
    public static void main(String[] args) {
        Map<String,Color> coches = new HashMap<>();
        
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
