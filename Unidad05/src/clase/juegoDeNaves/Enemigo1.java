/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.juegoDeNaves;

import java.awt.Toolkit;

/**
 *
 * @author usuario
 */
public class Enemigo1 extends Enemigo{
    private int velocidad;

    public Enemigo1(int x, int y, int v) {
        super(CacheImagenes.getInstancia().getImage("./malo1.png"),x, y);
        this.velocidad = v;
    }
    
    

    @Override
    public int getPuntuacion() {
        return velocidad*2;
    }

    @Override
    public void ejecutarFrame() {
        if(this.getX()<=0){
            this.moverX(velocidad);
        }else if(this.getX()>=this.juego.getAnchuraPantalla()){
            this.moverX(-velocidad);
        }else{
            this.moverX(velocidad);
        }
        
    }
}
