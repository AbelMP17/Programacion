package ejercicios.ejercicio31;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        EfectoEspecial ee = new EfectoCorchetes();
        EfectoEspecial ee2 = new EfectoGuiones();
        EfectoEspecial ee3 = new EfectoInverso();
        EfectoEspecial ee4 = new EfectoMayusculas();
        
        Simetrico es = new EfectoCorchetes();
        Simetrico es2 = new EfectoInverso();
                
        System.out.println("Escribe una frase: ");
        String frase = new Scanner(System.in).nextLine();
        
        System.out.println("""
                           =======================================
                           Elija una de estas dos opciones:
                           =======================================
                           1) Aplicar todos los efectos a la frase.
                           2) Aplicar solo los efectos simétricos.
                           """);
        int opc = new Scanner(System.in).nextInt();
        
        switch(opc){
            case 1 -> {
                System.out.println("Efecto Corchetes: "+ee.aplicarEfecto(frase));
                System.out.println("Efecto Guiones: "+ee2.aplicarEfecto(frase));
                System.out.println("Efecto Inverso: "+ee3.aplicarEfecto(frase));
                System.out.println("Efecto Mayusculas: "+ee4.aplicarEfecto(frase));
            }
            case 2 -> {
                //System.out.println("Efecto Corchetes: "+es.aplicarEfecto(frase));
                //System.out.println("Efecto Inverso: "+es2.aplicarEfecto(frase));
                System.out.println("Efecto Corchetes: "+ee.aplicarEfecto(frase));
                System.out.println("Efecto Inverso: "+ee3.aplicarEfecto(frase));
            }
            default -> System.out.println("Opcion no valida.");
        }
    }
}
