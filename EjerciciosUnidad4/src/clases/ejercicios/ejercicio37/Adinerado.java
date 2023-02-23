package clases.ejercicios.ejercicio37;

public interface Adinerado {
    public static int TRANSFERENCIA_MINIMA=1526;
    
    public double getDineroTotal();
    public boolean añadirDinero(int cantidad);
    public boolean retirarDinero(int cantidad);
    
    public default boolean tieneDinero(){
        return getDineroTotal()>0;
    }
    public default boolean transferirHacia(Adinerado receptor,double cantidad){
        boolean puede = false;
        if(cantidad>=TRANSFERENCIA_MINIMA && tieneDinero()){
            receptor.añadirDinero((int) cantidad);
            this.retirarDinero((int) cantidad);
            puede = true;
        }
        return puede;
    }
    public default boolean transferirDesde(Adinerado emisor,double cantidad){
        boolean puede = false;
        if(cantidad>=TRANSFERENCIA_MINIMA && tieneDinero()){
            emisor.retirarDinero((int) cantidad);
            this.añadirDinero((int) cantidad);
            puede = true;
        }
        return puede;
    }
    
    public static boolean transferir(Adinerado emisor, Adinerado receptor, double cantidad){
        return emisor.transferirHacia(receptor, cantidad);
    }
    
}
