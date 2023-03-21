package clases;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Libro implements Serializable{
    @Id @GeneratedValue
    private int id;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    
    public Libro(){
    }
    
    public Libro(String t, String a, int np){
        this.titulo = t;
        this.autor = a;
        this.numeroPaginas = np;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }
}
