
import bpc.daw.objetos.MarcadorBaloncesto;

/*
+
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        MarcadorBaloncesto marcador = new MarcadorBaloncesto("Estudiantes", "CB Granada");
        
        marcador.anotarCanasta('L', 2);
        marcador.anotarCanasta('V', 3);
        marcador.anotarCanasta('L', 2);
        marcador.anotarCanasta('V',2);
        marcador.anotarCanasta('V', 3);
        marcador.anotarCanasta('L',1);
        marcador.anotarCanasta('L',1);
        marcador.anotarCanasta('V',2);
        
        String nombreGanador = marcador.getNombreEquipoGanador();
        int puntosVisitante = marcador.getPuntosVisitante();
        String nombrePerdedor = marcador.getNombreEquipoPerdedor();
        int puntosLocal = marcador.getPuntosLocal();        
        
        System.out.println("El equipo ganador es el "+nombreGanador+" y tiene "+puntosVisitante+" puntos.");
        System.out.println("El equipo que ha perdido es el "+nombrePerdedor+" y tiene "+puntosLocal+" puntos.");
    }
}
