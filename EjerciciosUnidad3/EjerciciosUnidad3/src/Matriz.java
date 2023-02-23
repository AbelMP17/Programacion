/*
Haz un programa que muestre cuantos números negativos hay en la tabla.
 */
public class Matriz {
    public static void main(String[] args) {
        
        int [][] tabla2 = {
            {5,3,5,8},
            {2,1,0,-1},
            {5,3},
            {1,0,1,1,5,2,5},
            {0,2,1,5}                       
        };
        
        int acumulador = 0;
        for(int i = 0; i<tabla2.length;i++){
            
            for(int j = 0;j<tabla2[i].length; j++){
                int dato = tabla2[i][j];
                if(dato<0){
                    acumulador++;
                }
            }
            
        }
        System.out.println(acumulador);
    }
}
