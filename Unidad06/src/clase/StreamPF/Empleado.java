/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.StreamPF;

/**
 *
 * @author usuario
 */
public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private String puesto;
    private int sueldo;
    
    public Empleado(String n, String p, int s){
        this.nombre = n;
        this.puesto = p;
        this.sueldo = s;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    @Override
    public int compareTo(Empleado o){
        return this.sueldo-o.sueldo;
    }
}
