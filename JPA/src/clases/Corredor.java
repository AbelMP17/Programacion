package clases;

import java.io.*;
import java.time.LocalDate;
import javax.persistence.*;

/*Cuando quiera que una clase se guarde en una BD hago estos pasos:
1) Pongo @Entity a la clase
2) La clase debe implementar la interfaz señalizada
3) Le ponemos un constructor vacio
4) Le ponemos Getters y Setters a todas las propiedades que se vayab a guardar en la BD.
5) Le ponemos @Id a la propiedad que queramos que sea la clave primaria. 
Si queremos que sea autoincrementado le pondremos @GeneratedValue
*/

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Corredor implements Serializable {
    @Id @GeneratedValue 
    private int id;
    
    private String nombre;
    
    private LocalDate fechaNacimiento;

    //Constructor vacio
    public Corredor(){
    }
    
    // Este constructor crea un corredor con el nombre y fechaNacimiento pasados como parametro
    // El id se autoincrementa
    public Corredor(String n, LocalDate fn){
        this.nombre = n;
        this.fechaNacimiento = fn;
    }
    
    //Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
}
