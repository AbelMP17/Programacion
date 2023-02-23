package clase.Framework;

import bpc.daw.consola.*;
import java.awt.*;

public abstract class SpriteGameObject extends GameObject{
    public Sprite sprite;
    private Image imagen;
    private Point puntoInicial;
    
    public SpriteGameObject(Image img, int x, int y){
        this.sprite = null;
        this.imagen = img;
        this.puntoInicial = new Point(x,y);
    }
    
    @Override
    public void inicializar(){
        CapaSprites cS = consola.getCapaSprites();
        sprite = cS.crearSprite(imagen, new Rectangle(), puntoInicial.x, puntoInicial.y);
    }
    
    public int getAnchura(){
        return imagen.getWidth(null);
    }
    
    public int getAltura(){
        return imagen.getHeight(null);
    }
    public int getX(){
        return sprite.getX();
    }
    
    public int getY(){
        return sprite.getY();
    }
    
    public void moverX(int cx){
        sprite.moverX(cx);
    } 
    
    public void moverY(int cy){
        sprite.moverY(cy);
    }   
    
    public void setX(int x){
        int nx = getX()-x;
        consola.getCapaSprites().eliminarSprite(sprite);
        sprite = consola.getCapaSprites().crearSprite(imagen, new Rectangle(), nx, getY());
        
    }
    public void setY(int y){
        int ny = getY()-y;
        consola.getCapaSprites().eliminarSprite(sprite);
        sprite = consola.getCapaSprites().crearSprite(imagen, new Rectangle(), getX(), ny);
    }
    @Override
    public void finalizar(){
        consola.getCapaSprites().eliminarSprite(sprite);
    }
}
