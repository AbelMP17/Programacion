import java.util.*;
public class Ejercicio42 {
    public static void main(String[] a){

        System.out.println("¿Qué nota tienes?");
        double nota = new Scanner (System.in).nextDouble();

        if (nota>=0 && nota<5){
            System.out.println("Insuficiente");
        }else if (nota>=5 && nota<6){
            System.out.println("Suficiente");
        }else if (nota>=6 && nota<7){
            System.out.println("Bien");
        }else if (nota>=7 && nota<9){
            System.out.println("Notable");
        }else if (nota>=9 && nota <=10){
            System.out.println("Sobresaliente");
        }
        else{
            System.out.println("Nº Incorrecto!!!");
        }
        }
}
