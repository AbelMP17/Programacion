/*

 */
public class Ejercicio24 {
    public static void main(String[] args) {
        String[] nombre = {"Pepe","Ana","Juan","Roberta"};
        int[] notaPr = {9,4,2,10};
        int[] notaBd = {5,8,5,10};
        int[] notaSi = {4,6,10,10};
        int[] notaFo = {3,5,2,9};
        
        for(int i = 0;i<nombre.length;i++){
            double suma = notaPr[i]+notaBd[i]+notaSi[i]+notaFo[i];
            System.out.println("Nombre: "+nombre[i]+" -> Nota media: "+suma/nombre.length);
        }
    }
}
