package clases.ejercicios.delfin;

public class Curar implements PowerUp{
    
    @Override
    public String getNombre() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        return "Curación";
    }

    @Override
    public void aplicar(Personaje p) {
        //throw new UnsupportedOperationException("Not supported yet.");
        p.setPuntosVida(100);
    }
    
}
