package clases;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import javax.persistence.*;

public class Programa {
    // Vamos a modificar el nombre de Alvaro a Alvaro Manuel y ademas vamos a borrar el objeto con id 3
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        Corredor alvaro = (Corredor) em.createQuery("SELECT c FROM Corredor c WHERE nombre = 'Alvaro'").getSingleResult();
        
        // Recupero el corredor id 3
        Corredor id3 = em.find(Corredor.class, 3);
        
        alvaro.setNombre("Alvaro Manuel");
        
        em.getTransaction().begin();
        em.persist(alvaro); // Actualiza el corredor alvaro
        em.remove(id3); // elimina el corredor con id 3
        em.getTransaction().commit();
        
        em.close();
    }

    // Programa que recupera corredores
    public static void main4(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        // vamos a hacer una consulta en lenguaje jpql que nos recupera todos los objetos de la clase Corredor.
        Query q = em.createQuery("SELECT c FROM Corredor c");
        List<Corredor> resultado = q.getResultList();
        for(Corredor i : resultado){
            System.out.println(i.getNombre());
        }
        em.close();
    }
    
    // Programa que añade corredores
    public static void main3(String[] args) {
        boolean repetir = true;
        
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        while(repetir){
            for(int i = 0; i<50;i++){
                System.out.println("");
            }
            System.out.println("""
                           Base de datos de Corredores:
                           ============================
                            1. Nuevo Corredor
                            2. Salir
                           ============================
                           """);
            System.out.print("- Elegir Opcion: ");
            int opc = new Scanner(System.in).nextInt();
            switch(opc){
                case 1 ->{
                    System.out.print("Nombre del corredor: ");
                    String nombre = new Scanner(System.in).nextLine();

                    System.out.print("Fecha de nacimiento (yyyy-mm-dd): ");
                    String fechaNac = new Scanner(System.in).nextLine();

                    Corredor c = new Corredor(nombre, LocalDate.parse(fechaNac));

                    em.getTransaction().begin();
                    em.persist(c);
                    em.getTransaction().commit();
                }
                case 2 -> repetir = false;
                default -> System.out.println("Opcion no valida.");
            }
            em.close();
        }
        
    }
    
    
    
    //Vamos a recuperar el corredor creado antes
    public static void main2(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        Corredor c = em.find(Corredor.class, 1);
        System.out.println("Nombre: "+c.getNombre()+" / Fecha Nacimiento: "+c.getFechaNacimiento());
    }
            
    
    // EJmplo que crea un corredor y lo guarda en una BD
    public static void main1(String[] args) {
        // Conectarnos a la unidad de persistencia CARRERA
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        // Creamos un corredor
        Corredor c = new Corredor("Alvaro", LocalDate.now().minusYears(20));
        
        // Guardamos el corredor en la unidad de persistencia
        em.getTransaction().begin(); //Comenzamos a modificar la BD
        em.persist(c); //Hacemos lo que sea en la BD
        em.getTransaction().commit(); //Confirmamos lo que hemos hecho
        
        // Desconectamos
        em.close();
    }
}
