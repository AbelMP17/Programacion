package clases.repaso.CatalogoTitulos;

import java.io.*;
import java.util.*;

public class Programa{
    public static void main(String[] args) {
        boolean repetir=true;
		while(repetir){
		
        try{
        CatalogoTitulos ct = new CatalogoTitulosArchivos("titulos_daw.txt");
        System.out.println("""
                                1. Añadir título
                                2. Consultar todos los títulos
                                3. Cambiar estado del título
                                4. Salir
                            """);
            int sc = new Scanner(System.in).nextInt();
            switch (sc) {
                case 1->{
                        System.out.println("Introduzca DNI");
                        String DNI=new Scanner(System.in).nextLine();
                        System.out.println("Introduzca nombre");
                        String nombre =new Scanner(System.in).nextLine();
                        System.out.println("Introduzca estudios");
                        String estudios=new Scanner(System.in).nextLine();
                        System.out.println("Introduzca estado (SIN_RECIBIR, RECIBIDO, RECOGIDO)");
                        String estado=new Scanner(System.in).nextLine();
                        ct.anadirTitulo(DNI, nombre, estudios, Estado.valueOf(estado));
                       
                    }
                case 2->{
                    for(int i = 0; i<ct.getTitulos().size();i++){
                        System.out.println(ct.getTitulos().get(i).toString());
                    }
                }
                case 3->{
                        System.out.println("Introduzca DNI");
                        String DNI=new Scanner(System.in).nextLine();
                        try{
                            Titulo t = ct.getTitulo(DNI);
                            System.out.println("Introduzca nuevo estado  (SIN_RECIBIR, RECIBIDO, RECOGIDO)");
                            String NuevoEstado=new Scanner(System.in).nextLine();
                            Estado estadoNuevo=Estado.valueOf(NuevoEstado);
                            t.setEstado(estadoNuevo);
                        }catch(NoSuchElementException error){
                            System.out.println("dni no encontrado");
                        }
                    }
                case 4->{
                    ct.guardar();
                    repetir=false;
                }
                default->System.out.println("Opcion incorrecta");
            }
        }catch (IOException error){
            System.out.println(error);
        }
    }
    }
}
