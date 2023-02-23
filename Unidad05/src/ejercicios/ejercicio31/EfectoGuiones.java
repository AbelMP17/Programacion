package ejercicios.ejercicio31;
public class EfectoGuiones implements EfectoEspecial{

    EfectoGuiones(){}
    @Override
    public String getNombre() {
        return TipoEfecto.GUIONES.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        StringBuilder st = new StringBuilder(frase).replace(frase.indexOf(" "), frase.indexOf(" ")+1, "_");
        return st.toString();
    }
    
}
