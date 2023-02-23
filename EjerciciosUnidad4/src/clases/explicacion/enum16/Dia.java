package clases.explicacion.enum16;
public enum Dia {
    
    //Constantes de la enum
    lunes(false,8) {
        @Override
        public boolean tocaBotellon() {
            return true;
        }
    }, martes(false,8) {
        @Override
        public boolean tocaBotellon() {
            return true;
        }
    }, miercoles(false,5) {
        @Override
        public boolean tocaBotellon() {
            return true;
        }
    }, 
    jueves(false,9) {
        @Override
        public boolean tocaBotellon() {
            return true;
        }
    }, viernes(false,10) {
        @Override
        public boolean tocaBotellon() {
            return true;
        }
    }, sabado(true,15) {
        @Override
        public boolean tocaBotellon() {
            return true;
        }
    }, domingo(true,21) {
        @Override
        public boolean tocaBotellon() {
            return true;
        }
    };
    
    private boolean finde;
    private int precioCine;
    
    private Dia(boolean f, int pc){
        this.finde = f;
        this.precioCine = pc;
    }
    
    public int getPrecioCine(){
        return precioCine;
    }
    
    public boolean esFinde(){
        //return this.equals(sabado) || this.equals(domingo);
        //return this.ordinal()>=5;
        return finde;
    }
    
    public boolean esLaborable(){
        return !this.esFinde();
    }
    
    public abstract boolean tocaBotellon();
    
}
