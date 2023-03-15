/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase.juegoDeNaves;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author abelm
 */
public class Nave2 extends Nave{
    public Nave2(int ti, int tde, int tdi) {
        super(ti, tde, tdi, 3, CacheImagenes.getInstancia().getImage("./nave2.png"), 400, 1000);
    }

    @Override
    public void realizarDisparo() {
        try{
            Disparo d = new Disparo(1, this.getX(), this.getY(), -3, -3);
            Disparo d2 = new Disparo(1, this.getX(), this.getY(), 3, -3);

        }catch (IOException error){
            System.out.println(error);
        }
    }
}
