package clases.ejercicios.ejercicio41;
public interface MarcadorBaloncesto{
    public void añadirCanasta(TipoEquipo e, TipoCanasta t);
    public String getNombreEquipo(TipoEquipo e);
    public int getPuntos(TipoEquipo e);
    public default void mostrarMarcador(){
        System.out.println(this.getNombreEquipo(TipoEquipo.Local)+" "+this.getPuntos(TipoEquipo.Local)+" - "+this.getNombreEquipo(TipoEquipo.Visitante)+" "+this.getPuntos(TipoEquipo.Visitante));
    }
}
