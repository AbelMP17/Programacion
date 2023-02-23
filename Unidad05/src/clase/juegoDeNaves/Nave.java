/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.juegoDeNaves;

import clase.Framework.*;
import java.awt.*;
import java.time.*;

public abstract class Nave extends SpriteGameObject {
    private int teclaIzquierda;
    private int teclaDerecha;
    private int teclaDisparo;
    private int velocidad;
    private Instant ultimoDisparoRealizado;
    
    public Nave(int ti, int tde, int tdi, int v, Image img, int x, int y) {
        super(img, x, y);
        this.teclaIzquierda = ti;
        this.teclaDerecha = tde;
        this.teclaDisparo = tdi;
        this.velocidad = v;
        //this.ultimoDisparoRealizado = Instant.now();
                
    }
    
    @Override
    public void ejecutarFrame(){
        if(this.getX()>0 && this.getX()<=this.juego.getAnchuraPantalla()){
            if(consola.getTeclado().teclaPulsada(teclaIzquierda)){
                this.setX(getX()-velocidad);
            }else if(consola.getTeclado().teclaPulsada(teclaDerecha)){
                this.setX(getX()+velocidad);
            }else if(consola.getTeclado().teclaPulsada(teclaDisparo)){
                disparar();
            }
        }
        
    }
    
    public void disparar(){
        if(Instant.now().plusSeconds(1).isAfter(ultimoDisparoRealizado)){
            this.ultimoDisparoRealizado = Instant.now();
            this.realizarDisparo();
        }
    }
    
    public abstract void realizarDisparo();
}
