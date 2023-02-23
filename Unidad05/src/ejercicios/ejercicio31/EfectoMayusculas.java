package ejercicios.ejercicio31;

public class EfectoMayusculas implements EfectoEspecial{
    
    EfectoMayusculas() {}
    
    @Override
    public String getNombre() {
        return TipoEfecto.MAYUSCULAS.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        return frase.toUpperCase();
    }
    
}
