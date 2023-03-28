/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.StreamPF;

import java.util.List;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 *
 * @author usuario
 */
public class Ejemplos {
    //Programa que cuenta las palabras de la lista que contienen la "a"
    public static void main2(String[] args) {
        List<String> lista = List.of("lunes","martes","miercoles","jueves","viernes","sabado","domingo");
        long cuenta = lista.stream().filter(p -> p.contains("a")).count();
        System.out.println("Hay "+cuenta+" palabras con la letra 'a'.");
    }
    
    //Programa que cuenta las palabras de la lista que contienen la "a" y de mas de 3 letras
    public static void main1(String[] args) {
        List<String> lista = List.of("lunes","martes","miercoles","jueves","viernes","sabado","domingo");
        lista.stream()
                .filter(p -> p.contains("a"))
                .filter(p->p.length()>3)
                .map(p->p.toUpperCase())
                .forEach(System.out::println);
        
    }
    
    //Programa que nos dice si ese numero es primo
    public static void main0(String[] args) {
//        long divisores = IntStream.range(2, 12530)
//                .filter(i -> 12531%i == 0)
//                .count();
//        if(divisores==0){
//            System.out.println("No es primo");
//        }else{
//            System.out.println("Es primo");
//        }
        IntStream.range(2, 12530) // Cadena de montaje
                            .filter(i -> 12531%i == 0) // Filtro que solo deja pasar a los divisores
                            .findAny() // devuelve una caja con cualquier divisor
                            .ifPresentOrElse(
                                    n -> System.out.println("El 12531 no es primo"),
                                    () -> System.out.println("El 12531 es primo")
                            );
    }
    
    //programaque ordena la siguiente lista de numeros de mayor a menor
    public static void main00(String[] args) {
        // 5,2,9,4,6
        IntStream.of(5,2,9,4,6)
                .sorted()
                .forEach(System.out::println);
    }
    
    
    // Creamos 4 empleados
    public static void main(String[] args) {
        Empleado a = new Empleado("Antonio", "Programador", 1000);
        Empleado b = new Empleado("Manuel", "Analista", 2000);
        Empleado c = new Empleado("Ana", "Programador", 1000);
        Empleado d = new Empleado("Lucia", "Jefe de proyecto", 5000);
        
        // Usa la programacion funcional para conseguir una lista
        // de empleados ordenados de menor a mayor sueldo
        List<Empleado> empleados = Stream.of(a,b,c,d)
                                            .sorted()
                                            .toList();
        
        // Usa la programacion funcional para conseguir una lista
        // de empleados ordenados por orden alfabetico
        List<Empleado> empleados2 = Stream.of(a,b,c,d)
                                            .sorted((e1,e2) -> e1.getNombre().compareTo(e2.getNombre()))
                                            .toList();
    }
    
}
