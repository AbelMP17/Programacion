import java.util.*;
public class Ejercicio44 {
    public static void main(String[] a){
        System.out.println("Introduce el precio del producto: ");
        double precioProducto = new Scanner(System.in).nextDouble();
        
        System.out.println("Introduce el dinero con el que vas a pagar: ");
        double dineroPagar = new Scanner(System.in).nextDouble();
        
        if (dineroPagar>precioProducto){
            double vuelta = dineroPagar-precioProducto;
            System.out.println("El cambio es: "+vuelta+" €");
        }else if(dineroPagar==precioProducto){
            System.out.println("Su compra se ha hecho con éxito.");
        }else if(dineroPagar<precioProducto){
            double falta = precioProducto-dineroPagar;
            System.out.println("Necesita "+falta+" € más.");
        }
        
    }
}
