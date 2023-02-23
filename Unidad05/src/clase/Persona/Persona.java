package clase.Persona;

import clase.Ordenador.IsmaelException;

public class Persona {
    String nombre;
    private int edad;
    public double altura;
    protected double peso;
    
    public Persona(String n, int e, double altura, double peso) throws IsmaelException{
        this.nombre = n; 
        this.edad = e;
        if(altura<0){
            throw new IsmaelException("altura negativa");
        }
        this.altura = altura;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }
    
    public double getPeso() {
        return peso;
    }
}
