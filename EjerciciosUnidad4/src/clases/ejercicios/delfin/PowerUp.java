package clases.ejercicios.delfin;
public interface PowerUp {
    public String getNombre();
    public void aplicar(Personaje p);
    public static PowerUp getPowerAleatorio(){
        return Math.random()<0.5? new Curar():new Veneno();
    }
}
