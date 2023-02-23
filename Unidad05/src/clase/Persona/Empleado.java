package clase.Persona;

import clase.Ordenador.IsmaelException;

public class Empleado extends Persona{
    private double sueldo;
    
    public Empleado(String n, int e, double altura, double peso,double sueldo) throws IsmaelException{
        super(n,e,altura,peso);
        this.sueldo = sueldo;
    }
    
    public Empleado(String n, double altura, double peso) throws IsmaelException{
        this(n, 18, altura, peso, 1000);
    }
    
    public double getSueldo(){
        return sueldo;
    }
}
