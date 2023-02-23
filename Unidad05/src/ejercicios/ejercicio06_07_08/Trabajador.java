package ejercicios.ejercicio06_07_08;
public class Trabajador {
    private String dni;
    private String nombre;
    protected int sueldo;
    public Trabajador(String nombre, int sueldo, int numDNI, char letraDNI){
        this.dni = String.valueOf(numDNI)+""+String.valueOf(letraDNI);
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSueldo() {
        return sueldo;
    }
}
