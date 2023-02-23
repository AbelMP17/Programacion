
import java.util.*;


/*
Ejercicio 3: Realiza un programa que pregunte al usuario una palabra y cree una variable de
    tipo char llamada letraCentral inicializada con cualquier valor. A continuación, se usará el
    switch mejorado para hacer lo siguiente:

    · Si la palabra tiene un número impar de letras, se guardará en letraCentral el carácter
    de su posición central.

    · Si la palabra tiene un número par de letras, el programa preguntará al usuario: “hay
    dos posibles letras centrales. ¿Quieres la de la izquierda (i) o la de la derecha (d)?” Si el
    usuario elige “i” o “I”, se guardará en letraCentral la letra cuya posición pega a la
    izquierda del centro de la palabra. Si se elige “d” o “D” se guardará en letraCentral la
    letra cuya posición pega a la derecha del centro de la palabra. Ejemplos:
   
        · Si elegimos “ADIOS”, como hay cantidad impar de letras, guardamos en
        letraCentral la letra I

        · Si elegimos “HOLA”, hay dos posibles letras centrales, que serían la O (la que
        pega a la izquierda) y la L (la que pega a la derecha)  
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        System.out.print("Escribe una palabra: ");
        String palabra = new Scanner(System.in).nextLine();

        int tamaño = palabra.length();

        char letraCentral = 'e';

        switch (tamaño%2) {
            case 1 -> {
                letraCentral = palabra.charAt(tamaño / 2);
                System.out.println("Es impar y la letra cntral es " + letraCentral);
            }
            case 0 -> {

                System.out.println("Izquierda(i) o derecha(d)");
                String elegir = new Scanner(System.in).nextLine();

                switch (elegir) {
                    case "i" -> {

                        letraCentral = palabra.charAt((tamaño / 2) - 1);
                        System.out.println("Es par y has elegido la izquierda: " + letraCentral);

                    }

                    case "d" -> {

                        letraCentral = palabra.charAt(tamaño / 2);
                        System.out.println("Es par y has elegido la derecha " + letraCentral);

                    }

                    default ->
                        System.out.println("No has elegido el carácter correcto");

                }

            }
        }

    }
}
