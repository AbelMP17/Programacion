/*
Realiza un programa que calcule la suma de todos los números de esta lista: 
2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6 

 */
public class Ejercicio22 {
    public static void main(String[] args) {
        int[] nums = {2,9,4,5,6,1,2,3,45,2,1,2,65,3,2,6,1,2,3,5,2,2,6,67,11,67,3,2,1,7,8,5,3,27,8,93,1,6};
        int suma = 0;
        for(int i = 0;i<nums.length;i++){
            suma+=nums[i];
        }
        System.out.println("Suma: "+suma);
    }
}
