package clases.ejercicios.delfin;

public interface Saltador {
    /*Los metodos de la interfaz que estan sin prigramar se llaman METODOS ABSTRACTOS 
    y deben ser programados en la clase que implemente la interfaz*/
    public void saltar();
    public default void saltarMucho(int numeroVeces){
        for(int i = 0;i<numeroVeces;i++){
            this.saltar();
        }
    }
}
