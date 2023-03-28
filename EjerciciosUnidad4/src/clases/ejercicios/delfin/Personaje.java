
package clases.ejercicios.delfin;
/**
 * 
 * @author Abel Martínez Peinado
 */
public class Personaje {
    private String nombre;
    public int puntosVida;
    public int puntosAtaque;
    public int puntosDefensa;
    public int mana;
    
    /**
     * 
     * @param n Nombre del personaje
     */
    public Personaje(String n){
        this.nombre = n;
        this.puntosAtaque = 50;
        this.puntosVida = 100;
        this.puntosDefensa = 40;
        this.mana = 100;
    }
    /**
     * 
     * @return Devuelve el nombre del personaje
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * 
     * @param nombre Se introduce el nombre del personaje
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    public void setPuntosVida(int puntosVida) {
        this.puntosVida = puntosVida;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }
    
    
}
