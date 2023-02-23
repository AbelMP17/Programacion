package clases.ejercicios.ejercicio43;

import clases.ejercicios.ejercicio41.*;

public class MarcadorDefinitivo implements MarcadorBaloncesto {
    private Equipo local;
    private Equipo visitante;
    
    public MarcadorDefinitivo(String local, String visitante){
        new Equipo(local);
        new Equipo(visitante);
    }

    @Override
    public void añadirCanasta(TipoEquipo e, TipoCanasta t) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        switch (e) {
            case Local -> {
                local.añadirCanasta(t);
            }
            case Visitante -> {
                visitante.añadirCanasta(t);
            }
            default -> throw new AssertionError();
        }
    }

    @Override
    public String getNombreEquipo(TipoEquipo e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return e.name();
    }

    @Override
    public int getPuntos(TipoEquipo e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return e.equals(TipoEquipo.Local)? local.puntos():visitante.puntos();
    }
}
