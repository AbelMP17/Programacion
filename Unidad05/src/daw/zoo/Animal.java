package daw.zoo;

import java.util.Objects;

public abstract class Animal {
    private String nombre;
    private int peso;
    private boolean encerrado;
    
    public Animal(String n, int p){
        this.nombre = n;
        this.peso = p;
        this.encerrado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public boolean isEncerrado() {
        return encerrado;
    }

    public void setEncerrado(boolean b) {
        this.encerrado = b;
    }
    
    @Override
    public String toString(){
        return "Nombre: "+this.getNombre()+"| Peso: "+this.getPeso();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    public abstract void emitirSonido();
    
}
