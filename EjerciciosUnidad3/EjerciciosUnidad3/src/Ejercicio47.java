
import java.util.*;

/*
Supongamos que un diccionario español – inglés tiene las palabras de la tabla.
Realiza tres programas que pregunten cada uno por teclado al usuario una palabra en español
y nos salga su palabra traducida al inglés, de esta forma:
    a) Usando dos arrays unidimensionales (listas) para guardar los datos de la tabla
    b) Usando un array bidimensional (tabla) para guardar los datos de la tabla
    c) Usando un Map<String,String> para guardar los datos de la tabla
hola    casa    caballo     hacha   manzana     ventana     tortuga     ratón   mesa
hello   house   horse       axe     apple       window      turtle      mouse   table
 */
public class Ejercicio47 {
    public static void main(String[] args) {
        //programa 1:
        /*
        String[] esp = {"hola","casa","caballo","hacha","manzana","ventana","tortuga","ratón","mesa"};
        String[] ing = {"hello","house","horse","axe","apple","window","turtle","mouse","table"};
        
        System.out.print("Dime una palabra del diccionario español: ");
        String pal = new Scanner (System.in).nextLine();
        
        for(int i = 0;i<esp.length;i++){
            if(pal.equalsIgnoreCase(esp[i])){
                System.out.println("Español: "+esp[i]+"\nIngles: "+ing[i]);
                System.out.println("-------------------------------------");
            }          
        }
        */
        //fin programa 1
        

        //programa 2:
        /*
        String[][] dic = {
            {"hola","casa","caballo","hacha","manzana","ventana","tortuga","ratón","mesa"},
            {"hello","house","horse","axe","apple","window","turtle","mouse","table"}            
        };
        
        System.out.print("Dime una palabra del diccionario español: ");
        String pal = new Scanner (System.in).nextLine();
        
        boolean salir = true;
        
        for(int i = 0;i<dic.length;i++){
            for(int j = 0;j<dic[i].length && salir;j++){
                if(pal.equalsIgnoreCase(dic[i][j])){
                    System.out.println("Español: "+pal+"\nIngles: "+dic[1][j]);
                    System.out.println("-------------------------------------");
                    salir = false;
                }  
            }
        }
        */
        //fin programa 2
        
        //programa 3:
        Map<String,String> dic = Map.of(
                "hola","hello",
                "casa","house",
                "caballo","horse",
                "hacha","axe",
                "manzana","apple",
                "ventana","window",
                "tortuga","turtle",
                "raton","mouse",
                "mesa","table"
        );
        
        System.out.print("Introduce una palabra: ");
        String pal = new Scanner(System.in).nextLine();
        String eng = "";
        for(int i = 0;i<dic.size();i++){
            if (dic.containsKey(pal)){
                eng = dic.get(pal);
            }
        }
        System.out.println("En ingles: "+eng);
    }
}
