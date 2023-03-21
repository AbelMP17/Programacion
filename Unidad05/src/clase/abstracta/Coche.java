package clase.abstracta;

import java.awt.Color;
import java.util.Scanner;

public class Coche extends Vehiculo{
    private static final Color colorNegro = Color.black;
    
	private String matricula;
    private int potencia;
    public Coche(int numeroPasajeros, int vm, Color c, String m, int p) {
        super(numeroPasajeros, 120, c);
        this.matricula = m;
        this.potencia = p;
    }

    @Override
    public void mover(Point point) {
        System.out.println("El coche se mueve al punto: "+point.mx+", "+point.my);
    }    
    
    public static void main(String[] args) {
    	Coche c = new Coche(12, 45, colorNegro,"hhh8989", 9);
    	Coche c2 = new Coche(12, 45, colorNegro,"iii9898", 9);
    	System.out.print("Elige el coche 1 o 2: ");
    	int opc = new Scanner(System.in).nextInt();
    	
    	switch(opc) {
    	case 1 -> System.out.println(c.matricula);
    	case 2 -> System.out.println(c2.matricula);
    	default -> System.out.println("Opcion no valida");
    	}
    }
}
