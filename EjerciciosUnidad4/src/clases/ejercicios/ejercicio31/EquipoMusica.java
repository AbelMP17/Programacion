package clases.ejercicios.ejercicio31;
import clases.ejercicios.ejercicio30.Altavoz;
public class EquipoMusica {
    private Altavoz[] altavoces; 
    
    public EquipoMusica(int numeroAltavoces){
        for(int i = 0; i<numeroAltavoces; i++){
            Altavoz[] altavoz = {new Altavoz()};
            this.altavoces = altavoz;
        }
    }
    public Altavoz getAltavoz(int posición){
        Altavoz a = new Altavoz();
        for(int i = 0; i<posición; i++){
            a = altavoces[i];
        }
        return a;
    }
    
    public void setVolumen(int numeroAltavoz, int volumen){
        Altavoz a = getAltavoz(numeroAltavoz);
        a.setVolumen(volumen);
        
    }
}
