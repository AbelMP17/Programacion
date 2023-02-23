/*
Consulta el pdf de la “Librería Estándar de Java” y busca la clase Runtime. Haz un
programa que muestre por pantalla el número de procesadores de tu ordenador y la cantidad
de memoria total asociada al proceso de Java por el sistema operativo.
 */
public class Ejercicio40 {
    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();
        
        int pr = rt.availableProcessors();
        long max = rt.totalMemory();
        System.out.println("Numero de procesadores: "+pr);
        System.out.println("Numero de procesadores: "+max);
        
    }
}
