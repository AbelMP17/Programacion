package clases;

import java.util.*;
import javax.persistence.*;

public class ProgramaLibro {
    public static void main(String[] args) {
        EntityManager em = Persistence.createEntityManagerFactory("CARRERAS").createEntityManager();
        boolean repetir = true;
        while(repetir){
            System.out.println("""
                               =========================================
                               Elige una de estas opciones:
                                    1. Crear nuevo libro
                                    2. Consultar libros por autor
                                    3. Consultar libros grandes
                                    4. Actualizar páginas de un libro
                                    5. Salir
                               =========================================
                               """);
            System.out.print("Escribe la opcion: ");
            int opc = new Scanner(System.in).nextInt();
            
            switch(opc){
                case 1 -> {
                    System.out.print("Escribe el titulo del libro: ");
                    String tit = new Scanner(System.in).nextLine();
                    
                    System.out.print("Escribe el autor del libro: ");
                    String aut = new Scanner(System.in).nextLine();
                    
                    System.out.print("Escribe el numero de paginas: ");
                    int numP = new Scanner(System.in).nextInt();
                    
                    Libro l = new Libro(tit, aut, numP);
                    
                    em.getTransaction().begin();
                    em.persist(l);
                    em.getTransaction().commit();
                }
                case 2 -> {
                    System.out.print("Escribe el nombre del autor: ");
                    String aut = new Scanner(System.in).nextLine();
                    
                    Query q = em.createQuery("SELECT c FROM Libro c WHERE c.autor = '"+aut+"'");
                    
                    List<Libro> resultado = q.getResultList();
                    for(Libro i : resultado){
                        System.out.println("Titulo Libro: "+i.getTitulo());
                    }
                    
                }
                case 3 -> {
                    Query q = em.createQuery("SELECT c FROM Libro c WHERE c.numeroPaginas > 400");
                    List<Libro> resultado = q.getResultList();
                    for(Libro i : resultado){
                        System.out.println("Titulo Libro: "+i.getTitulo());                       
                    }
                }
                case 4 -> {
                    System.out.print("Escribe el titulo del libro: ");
                    String tit = new Scanner(System.in).nextLine();
                    
                    Libro l = (Libro) em.createQuery("SELECT c FROM Libro c WHERE titulo = '"+tit+"'").getSingleResult();
                    
                    System.out.print("Escribe el numero de paginas: ");
                    int numP = new Scanner(System.in).nextInt();
                    
                    l.setNumeroPaginas(numP);
                    
                    em.getTransaction().begin();
                    em.persist(l);
                    em.getTransaction().commit();
                }
                case 5 -> {
                    System.out.println("Saliendo...");
                    repetir = false;
                    em.close();
                } 
                default -> {
                    System.out.println("Opcion no válida."); 
                    repetir = false;
                }
            }
        }
    }
}
