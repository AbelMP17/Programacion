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
public class ProgramasClase {
    private static List<String> lista = List.of("lunes","martes","miercoles","jueves","viernes","sabado","domingo");
    private static List<Departamento> departamentos = List.of(
            new Departamento("informatica", 
                            List.of(
                                    new Empleado2("Antonio", 1000),
                                    new Empleado2("Jose", 900),
                                    new Empleado2("María", 1200)
                            )),
            new Departamento("limpieza", 
                            List.of(
                                    new Empleado2("Pepa", 900),
                                    new Empleado2("Lucía", 950)
                            )),
            new Departamento("transporte", 
                            List.of(
                                    new Empleado2("Ana", 1200),
                                    new Empleado2("Hermenegildo", 2000)
                            ))
    );
    
    public static void main(String[] args) {
        departamentos.stream()
                .flatMap(dep -> dep.getEmpleados().stream())
                .filter(e -> e.sueldo()>1000)
                .sorted(Comparator.comparing(e -> e.nombre()))
                .map(e -> e.nombre()+" "+e.sueldo())
                .forEach(System.out::println);
    }
    
    public static void main1(String[] args) {
        /*
            Muestra en pantalla en MAYUSULAS
            las palabras que empiezan por la letra m
            y tienen mas de 5 letras
            y ordenadas alfabeticamente
        */
        
        lista.stream()
                .filter(p -> p.startsWith("m"))
                .filter(p -> p.length()>5)
                .sorted()
                .map(String::toUpperCase)
                .forEach(System.out::println);
        
        /*
            Genera 500 números aleatorios entre 100 y 5000
        */
        
        Stream.generate( () -> new Random().nextInt(100, 5001) )
                .distinct()
                .limit(500)
                .toList()
                .forEach(System.out::println);
        
        /*
            Pide al usuario un string y muestra por pantalla
            cuantas veces sale la letra a
        */
        System.out.print("Escribe un string: ");
        String str = new Scanner(System.in).nextLine();
        
        str.chars()
                .filter(l -> l == 'a')
                .count();
        
        /*
            Genera 1000 números aleatorios entre 0 y 500 y calcula la suma de sus cuadrados
        */
        
        Stream.generate(()-> new Random().nextInt(0, 501))
                .limit(1000)
                .distinct()
                .map(numero -> numero*numero)
                .reduce(0,
                        (identidad,numero) -> identidad+numero);
        
        /*
            Genera 1000 números aleatorios entre 0 y 500 y calcula la suma de sus cuadrados (((Modificado)))
        */
        
        int num = Stream.generate(()-> new Random().nextInt(0, 501))
                .limit(1000)
                .distinct()
                .map(numero -> numero*numero)
                .mapToInt(i -> i)
                .sum();
        
        /*
            forma un string con todas las palabras pegadas y separadas por comas
        */
        lista.stream()
                .reduce(
                        "",
                        (identidad,palabra) -> identidad+","+palabra
                );
        
        /*
            forma un string con todas las palabras pegadas y separadas por comas
        */
        lista.stream()
                .collect( Collectors.joining(","));
    }
}
