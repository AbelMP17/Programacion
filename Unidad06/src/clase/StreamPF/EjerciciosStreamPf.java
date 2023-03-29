/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.StreamPF;

import java.util.*;
import java.util.stream.*;

/**
 *
 * @author usuario
 */
public class EjerciciosStreamPf {
    public static void main(String[] args) {
        //Ejercicio 01
        //Guarda en una lista los empleados programadores
        Empleado a = new Empleado("Antonio", "Programador", 1000);
        Empleado b = new Empleado("Manuel", "Analista", 2000);
        Empleado c = new Empleado("Ana", "Programador", 1000);
        Empleado d = new Empleado("Lucia", "Jefe de proyecto", 5000);

//        List<Empleado> lista = Stream.of(a,b,c,d)
//                .filter(e -> e.getPuesto().equals("Programador"))
//                .toList();
        
        //Ejercicio 02
        //pide por teclado el nombre de un empleado y muestralo
//        System.out.print("Escribe el nombre del empleado: ");
//        String nombre = new Scanner(System.in).nextLine();
//        
//        lista.stream()
//                .filter(e -> e.getNombre().equals(nombre))
//                .findAny()
//                .ifPresentOrElse(
//                        e -> System.out.println("Nombre: "+e.getNombre()+" / Puesto: "+e.getPuesto()+" / Sueldo: "+e.getSueldo()),
//                        () -> System.out.println("No se encuentra el empleado "+nombre)
//                        );
        
        //Ejercicio 03
        //Muestra los nombre de todos los empleados ordenados por el sueldo
//        Stream.of(a,b,c,d)
//                .sorted()
//                .forEach(e -> System.out.println(e.getNombre()));
        
        //Ejercicio 04
        //Muestra en mayuscula el nombre de los no programadores 
        //y cuyo sueldo es mayor a 1500
//        Stream.of(a, b, c, d)
//                .filter(e -> ! e.getNombre().equals("Programador"))
//                .filter(e -> e.getSueldo()>1500)
//                .map(e -> e.getNombre().toUpperCase())
//                .forEach(System.out::println);
                
        //Ejercicio 05
        //Mostrar por pantalla todos los numeros pares entre 10 y 50
//        IntStream.range(10, 51)
//                .filter(n -> n%2==0)
//                .forEach(System.out::println);
    }
}
