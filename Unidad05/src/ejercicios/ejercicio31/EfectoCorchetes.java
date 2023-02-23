package ejercicios.ejercicio31;
public class EfectoCorchetes implements EfectoEspecial,Simetrico{
    EfectoCorchetes(){
    }

    @Override
    public String getNombre() {
        return TipoEfecto.CORCHETES.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        String salida = "";
        if(frase.startsWith("[") && frase.endsWith("]")){
            StringBuilder st = new StringBuilder(frase).deleteCharAt(frase.indexOf('[')).deleteCharAt(frase.indexOf(']'));
                          
                          salida = st.toString();
        }else{
            StringBuilder st = new StringBuilder(frase).insert(0, '[').insert(frase.length()+1,']');
                          
                          salida = st.toString();
        }
        return salida;
    }
    
}
