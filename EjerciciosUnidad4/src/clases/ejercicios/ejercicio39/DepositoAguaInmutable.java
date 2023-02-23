package clases.ejercicios.ejercicio39;
public record DepositoAguaInmutable(int capacidadActual, int capacidadMaxima){
    public DepositoAguaInmutable{
        if(capacidadActual>capacidadMaxima){
            if(capacidadActual < 0 || capacidadMaxima < 0){
                throw new IllegalArgumentException("Capacidad erronea.");
            }
            throw new IllegalArgumentException("La capacidad no puede ser mayor que la máxima.");
        }
        
    }
    
    public DepositoAguaInmutable(int capacidadMaxima){
        this(0,capacidadMaxima);
    }
    
    public DepositoAguaInmutable añadirLitro(){
        DepositoAguaInmutable dp = new DepositoAguaInmutable(this.capacidadActual+1, this.capacidadMaxima);
        return dp;
    }
    
    public DepositoAguaInmutable retirarLitro(){
        DepositoAguaInmutable dp = new DepositoAguaInmutable(this.capacidadActual-1, this.capacidadMaxima);
        return dp;
    }
    
    public int getPorcentaje(){
        return capacidadActual * 100 / capacidadMaxima;
    }
}
