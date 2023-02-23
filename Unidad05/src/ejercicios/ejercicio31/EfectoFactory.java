package ejercicios.ejercicio31;
public class EfectoFactory {
    public static EfectoEspecial getEfecto(TipoEfecto tipo){
        EfectoEspecial ee = null;
        switch (tipo) {
            case CORCHETES -> ee = new EfectoCorchetes();
            case GUIONES -> ee = new EfectoGuiones();
            case INVERSO -> ee = new EfectoInverso();
            case MAYUSCULAS -> ee = new EfectoMayusculas();
            default -> throw new IllegalArgumentException("Tipo introducido no es existente");
        }
        return ee;
    }
}
