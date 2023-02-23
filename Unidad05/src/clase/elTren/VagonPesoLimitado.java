package clase.elTren;
public abstract class VagonPesoLimitado extends Vagon{
    private int pesoMaximo;
    
    public VagonPesoLimitado(int pm){
        if(pm <= 0){
            throw new IllegalArgumentException("El peso debe ser positivo.");
        }
        this.pesoMaximo = pm;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }
    protected boolean comprobarPesoMaximoExcedido(){
        boolean excede = true;
        if(getPeso()>getPesoMaximo()){
            throw new IllegalArgumentException("El peso máximo ha sido superado");
        }
        return excede;
    }
    
    @Override
    public abstract int getPeso();
}
