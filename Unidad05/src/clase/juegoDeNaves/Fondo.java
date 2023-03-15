package clase.juegoDeNaves;

import clase.Framework.*;
import java.awt.*;

public class Fondo extends GameObject{
    private Image imagen;
    private Rectangle camara;
    private int velocidadCamara;
    
    public Fondo(int vc){
        this.imagen = CacheImagenes.getInstancia().getImage("./fondo.png");
        this.velocidadCamara = vc;
    }
    
    @Override
    public void inicializar() {
        this.camara = new Rectangle(0, 0, this.juego.getAnchuraPantalla(),this.juego.getAlturaPantalla());
    }

    @Override
    public void ejecutarFrame() {
        super.consola.getCapaCanvas().getGraphics().drawImage(imagen, 0, 0,camara.width, camara.height, null);
        camara.translate(0, velocidadCamara);
        if(camara.y>=imagen.getHeight(null)){
            camara.translate(0, 0);
        }
    }

    @Override
    public void finalizar() {
        //no se hace nada
    }
}
