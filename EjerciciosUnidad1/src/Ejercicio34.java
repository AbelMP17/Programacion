/*
Realiza un programa con las variables que aparecen a continuación, y a continuación
muestre por pantalla su suma y su producto.
 */
public class Ejercicio34 {
    public static void main(String[] a){
        String n1 = "125";
        String n2 = "456";
        
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        
        int suma = num1+num2;
        int producto = num1*num2;
        
        System.out.println("Suma: "+suma+"\nProducto: "+producto);
        
    }
}
