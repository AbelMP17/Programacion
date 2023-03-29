package clase.StreamPF;

import java.util.*;

/**
 *
 * @author usuario
 */

public class Departamento {
    private String nombre;
    private List<Empleado2> empleados;
    
    public Departamento(String nombre, List<Empleado2> empleados){
        this.nombre = nombre;
        this.empleados = empleados;
    }

    public String getNombre() {
        return nombre;
    }

        public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Empleado2> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado2> empleados) {
        this.empleados = empleados;
    }
    
}
