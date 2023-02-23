
package ejercicios.ejercicio04_05;
public class Rascacielos extends Edificio{
    private int altura;
    
    public Rascacielos(String d, int np, int a) {
        super(d, np);
        if(a<0){
            throw new IllegalArgumentException("Altura inconrrecta (debe ser positiva)");
        }
        this.altura = a;
    }

    public int getAltura() {
        return altura;
    }
    
}
