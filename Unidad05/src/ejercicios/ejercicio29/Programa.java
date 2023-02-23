package ejercicios.ejercicio29;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        Persona Juan = new Persona("Juan Pérez", 25, true);
        Persona María = new Persona("María López", 39, false);
        Persona Javier = new Persona("Javier Presley", 19, false);
        Persona Robert = new Persona("Robert Jimenez", 30, false);

        personas.add(Juan);
        personas.add(María);
        personas.add(Javier);
        personas.add(Robert);
        
        
        System.out.println("""
                           =====================================================
                           1) Ver personas casadas 
                           2) Ver personas solteras mayores de edad 
                           3) Ver personas cuyo nombre empieza por la letra J. 
                           =====================================================
                           """);
        int opc = new Scanner(System.in).nextInt();
        
        Filtro f = new Filtro() {
            @Override
            public boolean aceptar(Persona p) {
                return !p.soltero();
            }
        };
        Filtro f2 = new Filtro() {
            @Override
            public boolean aceptar(Persona p) {
                return p.soltero() && p.edad()>18;
            }
        };
        Filtro f3 = new Filtro() {
            @Override
            public boolean aceptar(Persona p) {
                return p.nombre().startsWith("J");
            }
        };
        
        switch(opc){
            case 1 -> { 
                    Persona.mostrarEnPantalla(personas, f);
            }
            case 2 -> { 
                Persona.mostrarEnPantalla(personas, f2);
            }
            case 3 -> { 
                Persona.mostrarEnPantalla(personas, f3);
            }
            default -> System.out.println("Valor no valido.");
        }
        
    }

}
