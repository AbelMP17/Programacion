package ejercicios.ejercicio31;
public class EfectoInverso implements Simetrico, EfectoEspecial{

    EfectoInverso(){
    }

    @Override
    public String getNombre() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return TipoEfecto.INVERSO.name();
    }

    @Override
    public String aplicarEfecto(String frase) {
        return new StringBuilder(frase).reverse().toString();
    }
    
}
