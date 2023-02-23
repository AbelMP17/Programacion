package clase.juegoDeNaves;

import clase.Framework.*;

public class ControladorFinJuego extends GameObject{

    @Override
    public void inicializar() {
        //no hace nada
    }

    @Override
    public void ejecutarFrame() {
        if(new JuegoNaves().getEnemigos().isEmpty()){
            this.juego.detener();
        }
    }

    @Override
    public void finalizar() {
        //no hace nada
    }
    
}
