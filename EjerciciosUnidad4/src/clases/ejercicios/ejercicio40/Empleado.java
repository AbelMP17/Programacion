package clases.ejercicios.ejercicio40;

import java.util.*;

public record Empleado(String nombre, List<Empleado> subordinados){
    public Empleado{
    }
    
    public Empleado(String nombre){
        this(nombre,new ArrayList<>());
    }
    
    public void mostrarSubordinados(){
        System.out.println(nombre);
        this.mostrarSubordinados(1);
    }
    
    private void mostrarSubordinados(int tabs){
        for(Empleado e : subordinados){
            for(int i = 0; i<tabs;i++){
                System.out.print("-");
            }            
            System.out.println(e.nombre);
            e.mostrarSubordinados(tabs+1);
        }
    }
}
