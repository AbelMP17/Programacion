package clase.juegoDeNaves;

import clase.Framework.SpriteGameObject;
import java.awt.Image;

public abstract class Enemigo extends SpriteGameObject{
    
    public Enemigo(Image img, int x, int y) {
        super(img, x, y);
    }
    
    public abstract int getPuntuacion();
    
}
