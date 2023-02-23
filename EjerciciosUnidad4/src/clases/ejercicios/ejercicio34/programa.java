package clases.ejercicios.ejercicio34;
public class programa {
    public static void main(String[] args) {
        Reloj r = new Reloj();
        System.out.println(r.toString());
        r.añadir(1000);
        System.out.println(r.toString());
        System.out.println(r.esNoche());
    }
}
