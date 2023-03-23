/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.Transformacion;

import java.io.*;
import java.time.*;
import java.util.*;
import java.util.function.*;

/**
 *
 * @author usuario
 */
public class EjemplosTransformaciones {
    public static void main(String[] args) {
        //Hago una variable que va a guardar la transformacion 
        // que a cada entero lo transforma en su cuadrado
        
        Function<Integer,Integer> t1 = n -> n*n; // expresión lambda
        
        int resultado = t1.apply(10);
        System.out.println(resultado);
        
        
        //Transformacion que convierte un string en su primera letra
        
        Function<String,Character> t2 = s -> s.charAt(0);
        
        System.out.println(t2.apply("Viernes"));
        
        
        //Transformacion que coge un String y lo convierte en su ultima letra
        Function<String,Character> t3 = s -> s.charAt(s.length()-1);
        
        System.out.println(t3.apply("Viernes"));
        
        // Una transformacion que transforma una fecha en el número 524
        Function<LocalDate,Integer> t4 = n -> 524;
        System.out.println(t4.apply(LocalDate.now()));
        
        // Una transformacion que convierte un String en su numero de caracteres
        Function<String,Integer> t5 = s -> s.length();
        System.out.println(t5.apply("hola"));
        
        // convierte un numero entero si true es par o false si es impar
        Function<Integer,Boolean> t6 = n -> n%2==0;
        System.out.println(t6.apply(6));
        
        // convierte una lista de enteros en el primer entero de la lista
        List<Integer> lista = List.of(1,2,3,4,5);
        Function<List<Integer>,Integer> t7 = n -> n.get(0);
        
        System.out.println(t7.apply(lista));
        
        
        // Vamos a crear una lista con las palabras hola y adios y vamos a convertir esa lista en true o false
        List<String> palabras = List.of("hola","adios");
        Predicate<List<String>> t9 = lista2 -> !lista2.isEmpty();
        System.out.println(t9.test(palabras));
        
        
        // Transformacion que recibe un string y nos devuelva true si comienza por mayuscula
        Predicate<String> t10 = s -> Character.isUpperCase(s.charAt(0));
        System.out.println(t10.test("Hola"));
        
        // una fecha que nos devuelva true si ese fecha ya ha pasado
        Predicate<LocalDate> t11 = f -> f.isBefore(LocalDate.now());
        System.out.println(t11.test(LocalDate.now().minusYears(2)));
        
        // recibe un numero entero y nis devuelve true si es un numero primo
        Predicate<Integer> t12 = n -> {
            boolean primo = true;
            for(int i = 2; i<n && primo;i++){
                if(n%i==0){
                    primo=false;
                }
            }
            return primo;
        };
        
        System.out.println(t12.test(12));
        
        // Transformacion que recibe una palabra y la muestra en la pantalla convertida en mayus
        Consumer<String> t13 = s -> System.out.println(s.toUpperCase());
        t13.accept("hola");
        
        // Transformacion que recibe un apalabra y la guarda en un archivo palabra.txt
        Consumer<String> t14 = s -> {
            try(PrintWriter fr = new PrintWriter(new File("palabra.txt"))){
                fr.write(s);
            }catch(IOException error){
                System.out.println(error.getMessage());
            }
        };
        
        t14.accept("palabra");
        
        //Transformacion que genera un numero aleatorio entre 0 y 1
        Supplier<Double> t15 = () -> Math.random();
        System.out.println(t15.get()+" : "+t15.get());
        
        
        // Transformacion que escriba en la pantalla el mensaje hoy es jueves
        Runnable t16 = () -> System.out.println("hoy es "+LocalDate.now());
        t16.run();
    }
}
