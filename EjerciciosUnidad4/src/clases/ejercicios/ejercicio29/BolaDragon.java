package clases.ejercicios.ejercicio29;

public class BolaDragon {
    // Propiedades de la clase (estaticas)
    private static final int MAXIMO_BOLAS = 7;
    private static int siguienteBola = 1;
    
    // Propiedades (variables de instancia, atributos, propiedades)
    private int numero;

    private BolaDragon(int numero) {
        this.numero = numero;
    }
    
    public int getNumero() {
        return numero;
    }

    public static BolaDragon crearBolaDragon() throws Exception{

        if(siguienteBola > MAXIMO_BOLAS){
            throw new Exception(" Ya se han creado 7 bolas de dragon");
        }

            BolaDragon bola = new BolaDragon(siguienteBola);
            siguienteBola++;
        
            return bola;
        
    }
}
