/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package clase.Colegio;

/**
 *
 * @author usuario
 */
public record TutorLegal(String nombre, Alumno[] hijos) implements CalificacionListener{

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        for(Alumno i : hijos){
            if(i.equals(a)){
                if(nota.getValoracion().esAprobado()){
                    System.out.println("Bien hecho %s, has sacado un %D en %s.".formatted(i.nombre(),nota, p.getAsignatura()));
                }else{
                    System.out.println("Muy mal %s, has suspendido %s y te voy a castigar.".formatted(i.nombre(),p.getAsignatura()));
                }
            }else{
                throw new IllegalArgumentException("Alumno no encontrado.");
            }
        }
    }

}
