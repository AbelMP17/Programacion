package daw.zoo;
public class Jaula extends ContenedorAnimales{
    private int capacidadMaxima;
    private int pesoMaximo;
    
    public Jaula(int cm, int pm){
        this.capacidadMaxima = cm;
        this.pesoMaximo = pm;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }

    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        boolean si = false;
        if(animales.size()<capacidadMaxima && a.getPeso()<pesoMaximo){
            si = true;
            animales.add(a);
        }
        return si;
    }
}
