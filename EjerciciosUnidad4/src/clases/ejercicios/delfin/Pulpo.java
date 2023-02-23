package clases.ejercicios.delfin;
public class Pulpo implements Nadador{

    @Override
    public void nadar() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        System.out.println("El pulpo nada.");
    }

    @Override
    public void sumegirse(int profundidad) {
        //throw new UnsupportedOperationException("Not supported yet.");
        System.out.println("El pulpo se sumerge "+profundidad+" metros.");
    }
    
}
