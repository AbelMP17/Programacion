package clase.abstracta;

import java.awt.Color;
import java.util.Scanner;

public class Coche2 extends Vehiculo{
    public static class Coche2Data {
		public Coche2Data data;

		public Coche2Data(Coche2Data data) {
			this.data = data;
		}
	}

	private static final Color colorNegro = Color.black;
    
	private Coche2Data data = new Coche2Data(new Coche2Data());

	private static Coche2 c2;
	public Coche2(int numeroPasajeros, int vm, Color c, String m, int p) {
        super(new VehiculoParameter(numeroPasajeros, 120, c));
        this.data.data.matricula = m;
        this.data.data.potencia = p;
    }

    @Override
    public void mover(Point point) {
        System.out.println("El coche se mueve al punto: "+point.mx+", "+point.my);
    }    
    
    public static void main(String[] args) {
    	Coche2 c = new Coche2(12, 45, colorNegro,"hhh8989", 9);
    	c2 = new Coche2(12, 45, colorNegro,"iii9898", 9);
    	System.out.print("Elige el coche 1 o 2: ");
    	int opc = new Scanner(System.in).nextInt();
    	
    	switch(opc) {
    	case 1 -> System.out.println(c.data.data.matricula);
    	case 2 -> System.out.println(c2.data.data.matricula);
    	default -> System.out.println("Opcion no valida");
    	}
    }
}
