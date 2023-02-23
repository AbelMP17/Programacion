package clase.Colegio;
public enum Valoracion {
    MUY_DEFICIENTE, INSUICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE;
    public boolean esAprobado(){
        return ordinal()>1;
    }
    public boolean esSuspenso(){
        return ordinal()<=1;
    }
}
