package clases.ejercicios.ejercicio42;

import clases.ejercicios.ejercicio41.*;

public class MarcadorFacil implements MarcadorBaloncesto{
    private String nombreEquipoLocal;
    private String nombreEquipoVisitante;
    private int puntosLocal;
    private int puntosVisitante;

    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch (e) {
            case Local -> {
                puntosLocal+=t.getValor();
            }
            case Visitante -> {
                puntosVisitante+=t.getValor();
            }
            default -> throw new IllegalArgumentException("Tipo de equipo erroneo");
        }
    }

    @Override
    public String getNombreEquipo(TipoEquipo e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return e.equals(TipoEquipo.Local)? nombreEquipoLocal:nombreEquipoVisitante;
    }

    @Override
    public int getPuntos(TipoEquipo e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
        return e.equals(TipoEquipo.Local)? puntosLocal:puntosVisitante;
    }
    
    public MarcadorFacil(String local, String visitante){
        this.nombreEquipoLocal = local;
        this.nombreEquipoVisitante = visitante;
    }
}
