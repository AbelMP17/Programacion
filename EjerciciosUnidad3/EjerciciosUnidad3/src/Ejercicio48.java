
import java.util.*;

/*
Haz un programa que cree un Map<String,Integer> que almacene esas asociaciones. A 
continuación, el programa preguntará el nombre y el pin de un usuario y tras consultar el Map, 
nos dirá “Acceso permitido” o “Usuario/Pin incorrecto” 
*/
public class Ejercicio48 {
    public static void main(String[] args) {
        Map<String,Integer> aso = new HashMap<>();
        aso.put("Pepe",9385);
        aso.put("Manuel",1234);
        aso.put("Ana",1085);
        
        System.out.print("Escribe tu nombre de usuario: ");
        String usu = new Scanner (System.in).nextLine();
        
        System.out.print("Escribe tu pin: ");
        int pin = new Scanner (System.in).nextInt();
        
        boolean salir = true;
        boolean hecho = true;
        
        for(int i = 0;i<aso.size() && hecho;i++){
            if(aso.containsKey(usu)){
                int nom = aso.get(usu);
                
                if(pin==nom && salir){
                    System.out.println("Acceso Permitido");
                    hecho = false;
                }else{
                    System.out.println("Nombre de Usuario o Pin Incorrecto");
                    salir=false;
                }
                
            }else{
                System.out.println("Nombre de Usuario o Pin Incorrecto");
                hecho = false;
            }
        }
        
    }
}
