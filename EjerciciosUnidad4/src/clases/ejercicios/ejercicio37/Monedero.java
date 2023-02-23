package clases.ejercicios.ejercicio37;
public class Monedero implements Adinerado{
    private double dinero;
    
    @Override
    public double getDineroTotal() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean añadir = true;
        if(cantidad>0 && cantidad<=1000){
            dinero+=cantidad;
        }else{
            añadir = false;
        }
        return añadir;
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        boolean retira = true;
        if(dinero<cantidad){
            retira = false;
        }else{
            dinero-=cantidad;
        }
        return retira;
    }
    
}
