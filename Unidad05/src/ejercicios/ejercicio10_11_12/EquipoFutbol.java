/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.ejercicio10_11_12;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author usuario
 */
public class EquipoFutbol implements Nombrable{
    
    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;
    
    public EquipoFutbol(String n, double p){
        this.nombre = n;
        this.empleados = new ArrayList<>();
        this.presupuesto = p;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public double getPresuspuesto() {
        return presupuesto;
    }
    
    public void addEmpleado(Empleado e){
        int entrenadores = 0;
        int jugadores = 0;
        if(e instanceof Entrenador en){
            if(entrenadores<1){
                entrenadores++;
                empleados.add(en);
            }else{
                throw new IllegalArgumentException("Solo puede haber un entrenador");
            }
        }else if(e instanceof Futbolista f){
            if(jugadores<25){
                jugadores++;
                empleados.add(f);
            }else{
                throw new IllegalArgumentException("Solo puede haber 25 jugadores");
            }
        }else{
            throw new IllegalArgumentException("Empleado no válido");
        }
    }
    
    public void pagarSueldoEmpleados(){
        int contador = 0;
        for(Empleado i : empleados){
            double numEmpleados = empleados.size() - contador;
            double sueldoPrimados = i.getSueldo() + (i.getSueldo()*0.1);
            try {
                if(presupuesto>i.getSueldo()){
                    if(i instanceof EmpleadoPrimable ep){
                        if(ep.esPrimado()){
                            ep.cobrar(sueldoPrimados);
                            presupuesto -= ep.getSueldo();
                        }else{
                            ep.cobrar(ep.getSueldo());
                            presupuesto -= ep.getSueldo();
                        }
                    }else{
                        i.cobrar(i.getSueldo());
                        presupuesto -= i.getSueldo();
                    }
                }else{
                    double sueldoRestante = presupuesto / numEmpleados;
                    i.cobrar(sueldoRestante);
                    presupuesto -= sueldoRestante;
                }
            } catch (CabreoException error) {
                System.out.println(error);
            }
        }
    }
    
    @Override
    public String getNombre() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return nombre;
    }
    
}
