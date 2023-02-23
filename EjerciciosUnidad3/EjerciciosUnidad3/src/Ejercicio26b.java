/*
Consulta la documentación del “Java Collection Framework” para hacer este
programa:
    a) Se comenzará creando un objeto List<String> y lo rellenará con un objeto
    ArrayList<String> (se usará abstracción para ello como se vio en el tema 2).
    b) El programa mostrará este menú de opciones, que se repetirá hasta que el usuario
    pulse la opción de salir.
        1. Añadir mensaje a la lista
        2. Consultar el número de mensajes de la lista
        3. Consultar mensaje
        4. Comprobar mensaje
        5. Consultar todos los mensajes
        6. Borrar toda la lista
        7. Salir
    c) Lo que hay que hacer en cada opción es:
        1. Pide al usuario que introduzca una frase y la añadirá al List<String>
        2. Muestra en pantalla el número de elementos que hay en el List<String>
        3. Cuando se selecciona, pueden pasar dos cosas
            1. Si la lista está vacía, se mostrará “No hay mensajes” y volverá al menú.
            2. Si la lista no está vacía, el programa preguntará el número del mensaje
            que se desea consultar y el usuario deberá introducir un número entre
            0 y la última posición válida de la lista. Si se introduce un número fuera
            de ese rango, el programa avisará de ello. En caso contrario, se
            mostrará el mensaje indicado.
        4. Pedirá al usuario que escriba un mensaje y el programa mostrará si el mensaje
        está o no en la lista. En caso de que si esté, se mostrará también su número de
        posición.
        5. Mostrará todos los mensajes de la lista, cada uno en una línea con el formato
        “El mensaje de la posición … es …”
        6. Borra todos los mensajes de la lista
 */
import java.util.*;

public class Ejercicio26b {

    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        int opc = 1;
        while (opc > 0 && opc < 7) {
            System.out.print("""
                             --------------------------------------------------------------
                                1. Añadir mensaje a la lista
                                2. Consultar el número de mensajes de la lista
                                3. Consultar mensaje
                                4. Comprobar mensaje
                                5. Consultar todos los mensajes
                                6. Borrar toda la lista
                                7. Salir
                             --------------------------------------------------------------
                                    - Opción: """);
            opc = new Scanner(System.in).nextInt();

            switch (opc) {
                case 1 -> {
                    System.out.print("Introduce una frase: ");
                    String frase = new Scanner(System.in).nextLine();
                    lista.add(frase);
                }
                case 2 -> {
                    System.out.println("Tamaño de la lista: " + lista.size());
                }
                case 3 -> {
                    if (lista.isEmpty()) {
                        System.out.println("No hay mensajes.");
                    } else if (!lista.isEmpty()) {
                        System.out.print("Introduzca el numero mensaje que desea mostrar: ");
                        int numMensaje = new Scanner(System.in).nextInt();

                        if (numMensaje >= 0 && numMensaje <= lista.size()) {
                            System.out.println(lista.get(numMensaje-1));
                        } else {
                            System.out.println("El numero de mensaje introduicido no se encuentra dentro de la lista.");
                        }
                    }
                }
                case 4 -> {
                    System.out.print("Introduzca el mensaje que desea mostrar: ");
                    String mensaje = new Scanner(System.in).nextLine();
                    int i = 0;    
                    for (i = 0; i < lista.size(); i++) {
                        if (mensaje.equalsIgnoreCase(lista.get(i))) {
                            System.out.println("Mensaje: " + mensaje+ " -> Posicion: " + (i+1));
                        }                                          
                    }
                    if(!mensaje.equalsIgnoreCase(lista.get(i-1))){
                        System.out.println("No se encuentra dentro de la lista");
                    } 
                    
                }
                case 5 -> {
                    for (int i = 0; i < lista.size(); i++) {
                        System.out.println("El mensaje de la posicion " + (i+1) + " es " + lista.get(i));
                    }

                }
                case 6 -> {
                    lista.removeAll(lista);
                    System.out.println("Lista borrada, para ver cuantos mensajes hay pulsa la opcion 2.");
                }
                case 7 -> {
                    System.out.println("Has salido con exito.");
                }
                default -> {
                    System.out.println("Error default");
                }
            }

        }

    }
}
