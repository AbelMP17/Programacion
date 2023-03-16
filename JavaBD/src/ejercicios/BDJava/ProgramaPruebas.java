/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios.BDJava;

/**
 *
 * @author usuario
 */
public class ProgramaPruebas {
    public static void main(String[] args) {
        for(Alumno i : CatalogoAlumnos.getAlumnos()){
            System.out.println(i.getId()+" : "+i.getNombre()+" : "+i.getCiudad());
        }
    }
}
