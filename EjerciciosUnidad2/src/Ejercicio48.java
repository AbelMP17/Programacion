/*
En la librería “Objetos Sencillos” está la clase MarcadorMejorado. Haz un
programa en el que se cree un partido de baloncesto para el partido que van a jugar el
Estudiantes y el CB Granada. Registra las siguientes canastas y muestra el nombre de los
equipos, los puntos que tiene cada uno, el nombre del equipo que va ganando y el que va
perdiendo. Compara el código con el del ejercicio 12. ¿Cuál crees que es mejor?
    E ->2, CB -> 3, E->2, CB->2, CB->3, E->1, E->1, CB->2
 */

import bpc.daw.objetos.*;
public class Ejercicio48 {
    public static void main(String[] args) {
        MarcadorMejorado marcador = new MarcadorMejorado("Estudiantes", "CB Granada");
               
        int local = MarcadorMejorado.CANASTA_LOCAL;
        int visitante = MarcadorMejorado.CANASTA_VISITANTE; 
        int normal = MarcadorMejorado.NORMAL; 
        int libre = MarcadorMejorado.TIRO_LIBRE; 
        int triple = MarcadorMejorado.TRIPLE;
        
        marcador.anotarCanasta(local, normal);
        marcador.anotarCanasta(visitante, triple);
        marcador.anotarCanasta(local, normal);
        marcador.anotarCanasta(visitante,normal);
        marcador.anotarCanasta(visitante, triple);
        marcador.anotarCanasta(local,libre);
        marcador.anotarCanasta(local,libre);
        marcador.anotarCanasta(visitante,normal);
        
        String nombreGanador = marcador.getNombreEquipoGanador();
        int puntosVisitante = marcador.getPuntosVisitante();
        String nombrePerdedor = marcador.getNombreEquipoPerdedor();
        int puntosLocal = marcador.getPuntosLocal();        
        
        System.out.println("El equipo ganador es el "+nombreGanador+" y tiene "+puntosVisitante+" puntos.");
        System.out.println("El equipo que ha perdido es el "+nombrePerdedor+" y tiene "+puntosLocal+" puntos.");
    }
}
