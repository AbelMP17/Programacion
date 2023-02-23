package clase.juegoDeNaves;

import clase.Framework.*;

public class Marcador extends GameObject{
    private int[] puntos;
    
    public Marcador(){
        puntos = new int[]{0,0};
    }
    
    public void incrementarPuntos(int jugador, int puntos){
        if(puntos<0){
            throw new IllegalArgumentException("La puntuacion no puede ser negativa.");
        }else{
            switch(jugador){
                //jugador 1
                case 0 -> {
                    this.puntos[jugador]=puntos;
                }
                //jugador 2
                case 1 -> {
                    this.puntos[jugador]=puntos;
                }
            }
        }
    }
    
    @Override
    public void inicializar() {
        puntos = new int[]{0,0};
    }

    @Override
    public void ejecutarFrame() {
        super.consola.getCapaCanvas().getGraphics().drawString("Puntos (jugador 1): %D".formatted(this.puntos[0]), 0, 0);
        super.consola.getCapaCanvas().getGraphics().drawString("Puntos (jugador 2): %D".formatted(this.puntos[1]), 0, 100);
    }

    @Override
    public void finalizar() {
        //no hace nada
    }
    
}
