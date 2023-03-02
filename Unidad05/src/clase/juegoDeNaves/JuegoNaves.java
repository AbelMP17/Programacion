/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.juegoDeNaves;

import clase.Framework.*;
import java.util.*;

/**
 *
 * @author usuario
 */
public class JuegoNaves extends Escena{
    private List<Enemigo> enemigos;
    
    public List<Enemigo> getEnemigos(){
        return enemigos;
    }

    @Override
    protected void añadirObjetosIniciales() {
        super.añadir(new ControladorFinJuego());
        super.añadir(new Fondo(100));
        super.añadir(new Nave1(65,68,32));
        super.añadir(new Nave2(37,39,13));
        for(int i = 1 ; i<=4;i++){
            int acumY = i*100;
            for(int j = 1 ; j<=11;j++){
                int acumX = j*150;
                super.añadir(new Enemigo1(acumX, acumY, 5));
            }
        }
        for(int i = 1 ; i<=11;i++){
            int acumX = i*120;
            super.añadir(new Enemigo1(acumX, 620, 5));
        }
        super.añadir(new Marcador());
    }
    
    @Override
    public void añadir(GameObject obj){
        super.añadir(obj);
        if(obj instanceof Enemigo e){
            this.enemigos.add(e);
        }
    }
    
    @Override
    public void retirar(GameObject obj){
        super.retirar(obj);
        if(obj instanceof Enemigo e){
            this.enemigos.remove(e);
        }
    }
    
    public static void main(String[] args){
        Juego j = new Juego();
        Escena e = new JuegoNaves();
        j.iniciar(e, Resolucion.PANTALLA_COMPLETA);
    }
}
