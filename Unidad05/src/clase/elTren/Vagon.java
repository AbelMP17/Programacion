package clase.elTren;
public abstract class Vagon implements Pesado{
    private Vagon vagonSiguiente;
    private Vagon vagonAnterior;
    
    public void enganchar(Vagon v){
        this.vagonSiguiente = v;
        this.vagonAnterior = vagonSiguiente;
    }

    public Vagon getVagonSiguiente() {
        return this.vagonSiguiente;
    }

    public Vagon getVagonAnterior() {
        return this.vagonAnterior;
    }

    @Override
    public abstract int getPeso();
    
}
