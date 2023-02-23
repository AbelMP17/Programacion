package clases.explicacion.enum16;
public class Agenda {
    //Las enum pueden tener metodos
    //Las enum pueden tener metodos abstractos que debemos programarlos en las constantes de la enum.
    /*public static final int lunes = 1;
    public static final int martes = 2;
    public static final int miercoles = 3;
    public static final int jueves = 4;
    public static final int viernes = 5;
    public static final int sabado = 6;
    public static final int domingo = 7;
    */
    private Dia dia;
    private String deberes;
    
    public Agenda(Dia dia, String deberes){
        this.dia = dia;
        this.deberes = deberes; 
    }

    public Dia getDia() {
        return dia;
    }

    public void setDia(Dia dia) {
        this.dia = dia;
    }
    
    public String getDeberes() {
        return deberes;
    }

    public void setDeberes(String deberes) {
        this.deberes = deberes;
    }
    
    
    
}
