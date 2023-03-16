package clase.juegoDeNaves;

import java.io.*;

public class Nave1 extends Nave{
    public Nave1(int ti, int tde, int tdi) {
        super(ti, tde, tdi, 5, CacheImagenes.getInstancia().getImage("../img/nave1.png"), 100, 1000);
    }

    @Override
    public void realizarDisparo() {
        try{
            Disparo d = new Disparo(0, this.getX(), this.getY(), 0, -10);
        }catch (IOException error){
            System.out.println(error);
        }
    }
}
