import java.util.*;
public class Ejercicio45 {
    public static void main(String[] a){
        System.out.println("Escribe la longitud del primer lado: ");
        double lado1 = new Scanner(System.in).nextDouble();
        System.out.println("Escribe la longitud del segundo lado: ");
        double lado2 = new Scanner(System.in).nextDouble();
        System.out.println("Escribe la longitud del tercer lado: ");
        double lado3 = new Scanner(System.in).nextDouble();
        
        double lado1cuad = lado1*lado1;
        double lado2cuad = lado2*lado2;
        double lado3cuad = lado3*lado3;
        
        if(lado1cuad==lado2cuad+lado3cuad){
            System.out.println("Es un triángulo rectángulo.");
        }else if(lado1cuad<lado2cuad+lado3cuad){
            System.out.println("Es un triángulo Acutángulo.");
        }else if(lado1cuad>lado2cuad+lado3cuad){
            System.out.println("Es un triángulo Obtusángulo.");
        }else{
            System.out.println("No es ningun tipo de triángulo.");
        }
    }
}
