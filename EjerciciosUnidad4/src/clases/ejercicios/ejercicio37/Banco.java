
package clases.ejercicios.ejercicio37;

public class Banco implements Adinerado{
    private double dinero;
    @Override
    public double getDineroTotal() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        return this.dinero;
    }

    @Override
    public boolean añadirDinero(int cantidad) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        boolean añadir = true;
        if(cantidad>0 && cantidad<Integer.SIZE){
            dinero+=cantidad;
        }else{
            añadir = false;
        }
        return añadir;
        
    }

    @Override
    public boolean retirarDinero(int cantidad) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        
        boolean retira = true;
        if(dinero<0 || dinero<cantidad){
            retira = false;
        }else{
            dinero-=cantidad;
        }
        return retira;
    }
    
    public Banco(){
        this.dinero = 0;
    }
    
}
