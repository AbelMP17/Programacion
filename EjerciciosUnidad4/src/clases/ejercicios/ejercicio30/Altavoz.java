package clases.ejercicios.ejercicio30;
public class Altavoz {
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;
    
    public Altavoz(){
        this.volumen = this.VOL_MIN;
    }
    
    public void ponerVolumenMaximo(){
        this.volumen = this.VOL_MAX; 
    }
    
    public void setVolumen(int v){
        this.volumen = v;
    }
    
    public int getVolumen(){
        return this.volumen;
    }    
    
    public String toString(){
        String barra = "";
        int porcentajeVolumen = (volumen * 100 / VOL_MAX)/10;
        for(int i = 0; i<porcentajeVolumen;i++){
            barra+="*";
        }
        
        for(int i = porcentajeVolumen; i<10;i++){
            barra+="-";
        }   
        return barra;
    }
}
