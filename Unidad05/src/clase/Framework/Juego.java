package clase.Framework;

import bpc.daw.consola.*;
import java.awt.Toolkit;

public class Juego{
    private Consola consola;
    private Escena escena;
    private boolean detener;
    private Resolucion resolucion;

    public void iniciar(Escena e, Resolucion r){
        resolucion = r;
        detener = false;
        int x = r.getResolucion().width;
        int y = r.getResolucion().height;
        this.consola = new Consola("PantallaCompleta", x, y);
        
        this.setEscena(e);
        
        while(detener==false || !consola.getTeclado().teclaPulsada(27)){
            consola.esperarSiguienteFrame();
            escena.ejecutarFrame();
        }
        
    }
    
    public void setEscena(Escena e){
        this.escena = e;
        escena.juego = this;
        escena.consola = consola;
        escena.inicializar();
    }
    
    public void detener(){
        this.detener = true;
    }
    
    public int getAnchuraPantalla(){
        return Toolkit.getDefaultToolkit().getScreenSize().width;
    }
    
    public int getAlturaPantalla(){
        return Toolkit.getDefaultToolkit().getScreenSize().height;
    }
    
}
