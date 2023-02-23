package daw.zoo;
public class TransporteAnimales extends Jaula{

    public TransporteAnimales(){
        super(6, 500);
    }
    
    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        boolean si = false;
        if(animales.size()<this.getCapacidadMaxima() && a.getPeso()<this.getPesoMaximo()){
            si = true;
            animales.add(a);
        }
        return si;
    }

}
