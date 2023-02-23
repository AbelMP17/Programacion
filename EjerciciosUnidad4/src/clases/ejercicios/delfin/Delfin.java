package clases.ejercicios.delfin;

public class Delfin implements Nadador, Saltador{
    //A veces te das cuenta de que puedes programar un metodo dentro de la interfaz.
    //A partir de Java 8 es posible hacerlo pero ponemos la palabra "default" al metodo.
    @Override
    public void nadar() {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("El delfin nada.");
    }

    @Override
    public void sumegirse(int profundidad) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        System.out.println("El delfin se sumerge "+profundidad+" metros.");
    }

    @Override
    public void saltar() {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("El delfin salta.");
    }
    
    
}
