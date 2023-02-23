/*

 */
import bpc.daw.ascensor.*;
public class pruebaError {
    public static void main(String[] a){
        Persona humano = new Persona("Pepo",80);
        Persona humano2 = new Persona("Pepa",60);
        Ascensor asc = new Ascensor(0,8,100);
        
        try{
            asc.añadir(humano);
            System.out.println("Persona añadida perfectamente");
            asc.añadir(humano2);
            System.out.println("Persona añadida perfectamente");
            asc.mover(6);
            System.out.println("Ascensor desplazado correctamente");
        }catch(PesoMaximoException  | PlantaIncorrectaException error){
            System.out.println("No se pudo meter en el ascensor");
                    System.out.println("No se pudo ir a la planta especificada.");
        }      
                                 
        System.out.println("Fin");
        
        
        
    }
}
