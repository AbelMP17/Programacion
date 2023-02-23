package clase.Colegio;
public record Nota(double valorNumerico) {
    public Valoracion getValoracion(){
        Valoracion v = Valoracion.BIEN;
        if(valorNumerico>=0 && valorNumerico<3){
            v = Valoracion.MUY_DEFICIENTE;
        }else if(valorNumerico<5){
            v = Valoracion.INSUICIENTE;
        }else if(valorNumerico>=5){
            v = Valoracion.SUFICIENTE;
        }else if(valorNumerico>=6){
            v = Valoracion.BIEN;
        }else if(valorNumerico>=7 && valorNumerico<=8){
            v = Valoracion.NOTABLE;
        }else if(valorNumerico<=9 && valorNumerico<=10){
            v = Valoracion.SOBRESALIENTE;
        }else{
            throw new IllegalArgumentException("Número novalido");
        }              
        
        return v;
    }
}
