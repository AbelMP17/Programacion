/*

 */
public class Ejercicio41 {
    public static void main(String[] args) {
        String[] alumnos = {"Pepe","Ana","Juan","Roberta"};
        int[][] notas = {
            {9,5,4,3},
            {4,8,6,5},
            {2,5,10,2},
            {10,10,10,9},
        };
        
        int j = 0;
        double suma = 0;
        for(int i = 0; i<notas.length;i++){
            System.out.println("Nombre: "+alumnos[i]);
            
            for(j = 0;j<notas[i].length;j++){
                suma+=notas[i][j];
            }
            System.out.println("    - Nota media: "+suma/notas[i].length);
            suma = 0;
        }
    }
}
