package clases.ejercicios.delfin;
//Una interfaz puede tener propiedades y metodos estaticos.
public class Programa {
    public static void main(String[] args) {
        Personaje player1 = new Personaje("Master Chief");
        PowerUp poder = PowerUp.getPowerAleatorio();
        System.out.println("Te ha tocado: "+poder.getNombre());
        poder.aplicar(player1);
        System.out.println("Poder ha sido aplicado: "
                + "HP: "+player1.getPuntosVida()+" DMG: "+player1.getPuntosAtaque());
    }
}
