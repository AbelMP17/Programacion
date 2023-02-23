package ejercicios.ejercicio06_07_08;

import java.time.*;

public class Administrativo extends TrabajadorTecleante{
    
    public Administrativo(String n, int s, int ndni, char ldni, int ppm) {
        super(n, s, ndni, ldni, ppm);
    }
    public void escribirInforme(String t){
        teclado.escribirTexto(LocalDateTime.now().toString());
        teclado.escribirTexto(t);
    }
}
