/*

 */
public class Ejercicio39 {
    public static void main(String[] args) {
        for(int i = 1; i<10; i++){
            System.out.println("Tabla del "+i+":");
            for(int j = 0; j<11; j++){
                //System.out.println("Tabla del "+i+": "+i+"*"+j+" = "+i*j);
                System.out.println("%d x %d = %d".formatted(i,j,i*j));
            }
            System.out.println("-------------------------------------------------------------");
        }
    }
}
