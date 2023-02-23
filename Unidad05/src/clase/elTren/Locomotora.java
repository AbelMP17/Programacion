package clase.elTren;
public class Locomotora extends Vagon{
    
    public Locomotora(){
    }
    public int getNumeroVagonesTren(){
        int i = 0;
        while(getVagonSiguiente() instanceof Vagon){
            i++;
        }
        return i;
    }
    public int getPesoTren(){
        int i = 0;
        while(getVagonSiguiente() instanceof Vagon){
            if(getVagonSiguiente() instanceof VagonPasajeros vp){
                i+=vp.getPeso();
            }else if(getVagonSiguiente() instanceof VagonEquipaje ve){
                i+=ve.getPeso();
            }
        }
        return i;
    }
    public void arrancar(){
        if(getPesoTren()<145600){
            System.out.println("Tren en marcha");
        }else{
            throw new IllegalStateException("La locomotora no puede tirar del tren.");
        }
    }
    @Override
    public void enganchar(Vagon v){
        if(v instanceof Locomotora){
            throw new IllegalArgumentException("Solo puede haber una locomotora.");
        }
        super.enganchar(v);
    }
    @Override
    public int getPeso() {
        return 76400;
    }
    
}
