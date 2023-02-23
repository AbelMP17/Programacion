/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.juegoDeNaves;

import clase.Framework.SpriteGameObject;
import java.awt.*;
import java.io.*;
import javax.imageio.*;

/**
 *
 * @author abelm
 */
public class Disparo extends SpriteGameObject{
    private int idJugador;
    private int vx;
    private int vy;
    
    public Disparo(int id, int x, int y, int vx, int vy) throws IOException {
        super(CacheImagenes.getInstancia().getImage("../img/disparoJugador.png"), x, y);
        this.idJugador = id;
        this.vx = vx;
        this.vy = vy;
    }

    @Override
    public void ejecutarFrame() {
        this.moverX(vx);
        this.moverY(vy);
        if(this.getX()<=0 || this.getX()>=this.juego.getAnchuraPantalla()){
            super.finalizar();
        }
       
        for(Enemigo i : new JuegoNaves().getEnemigos()){
            if(this.sprite.comprobarColision(i.sprite)){
                super.finalizar();
            }
        }
    }
}
