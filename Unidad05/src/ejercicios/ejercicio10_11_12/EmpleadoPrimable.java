package ejercicios.ejercicio10_11_12;
public class EmpleadoPrimable extends Empleado{
    private boolean primado;

    public EmpleadoPrimable(String n, double s) {
        super(n, s);
        this.primado = false;
    }
    
    public void primar(){
        this.primado = true;
    }
    
    public boolean esPrimado(){
        return primado;
    }
    
    
}
