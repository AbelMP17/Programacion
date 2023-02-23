package ejercicios.ejercicio06_07_08;

import bpc.daw.consola.*;

public class TecladoConsolaDAW implements Teclado{
    private CapaTexto ct;
    public TecladoConsolaDAW(CapaTexto ct){
        this.ct = ct;
    }

    @Override
    public void escribirTexto(String mensaje) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        ct.print(mensaje);
    }
    
}
