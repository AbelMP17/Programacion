package ejercicios.ejercicio25_26_27_28;
public interface Apoyable extends FiguraGeométrica{
    public int getLongitudBase();
    public int getLongitudAltura();
    public default boolean esHorizontal(){
        return getLongitudBase()>getLongitudAltura();
    }
    public default boolean esVertical(){
        return getLongitudAltura()>getLongitudBase();
    }
}
