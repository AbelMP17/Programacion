package clases;

import java.time.*;
import java.util.*;
import javax.persistence.*;

public class Programa {
    // main principal. Este main llama a los demas mains
    public static void main(String[] args) {
        main7(args);
    }

    // Creamos un corredor de cada tipo
    public static void main7(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        
        Corredor c = new Corredor("Manuel", LocalDate.of(2000, 2, 3));
        Corredor c2 = new CorredorAmateur("Luis", LocalDate.of(2005, 1, 2), 29, 8);
        Corredor c3 = new CorredorProfesional("Ismael", LocalDate.of(1998, 8, 12), 1, "IESHLanz");
        
        em.getTransaction().begin();
        em.persist(c);
        em.persist(c2);
        em.persist(c3);
        em.getTransaction().commit();
        em.close();
    }

    // vamos a consultar los corredores con el nombreque el usuario instroduzca por teclado
    // usando una TypedQuery (invulnerable)
    public static void main6(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        System.out.print("Nombre del corredor: ");
        String nombre = new Scanner(System.in).nextLine();
        
        TypedQuery<Corredor> consulta =  em.createNamedQuery(
                "SELECT c FROM Corredor c WHERE c.name=?1",
                Corredor.class
        );
        consulta.setParameter(1, nombre);
        
        List<Corredor> corredores= consulta.getResultList();
        
        for(Corredor i : corredores){
            System.out.println(i.getNombre()+" "+i.getFechaNacimiento());
        }
        
    }


    // Vamos a modificar el nombre de Alvaro a Alvaro Manuel y ademas vamos a borrar el objeto con id 3
    public static void main5(String[] args) {
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
