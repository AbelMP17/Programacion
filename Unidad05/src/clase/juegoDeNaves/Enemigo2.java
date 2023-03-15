package clase.juegoDeNaves;

public class Enemigo2 extends Enemigo{
    private int centroX;
    private int centroY;
    private int radio;
    private double angulo;
    private double velocidad;

    public Enemigo2(int x, int y, int cx, int cy, int r, int v) {
        super(CacheImagenes.getInstancia().getImage("./malo2.png"), x, y);
        this.centroX = cx;
        this.centroY = cy;
        this.radio = r;
        this.angulo = 0;
        this.velocidad = v;
    }
    
    @Override
    public int getPuntuacion() {
        return (int) velocidad*3;
    }

    @Override
    public void ejecutarFrame() {
        this.angulo += this.velocidad;
        if(this.angulo>= 2*Math.PI){
            this.angulo = 0;
            this.moverX((int) Math.cos(angulo) * centroX);
            this.moverY((int) Math.sin(angulo) * centroY);
        }
    }
}
