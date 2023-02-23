/*
Las notas de un alumno en una asignatura son: 4,6,8,5,2,9,6. El profesor solo
calcula la media del alumno si todas sus notas son mayores o iguales a 3. Realiza un programa
que muestre por pantalla si el alumno tiene derecho o no a que se calcule su nota media. El
programa deberá ser eficiente, lo que significa que si se descubre una nota menor que 3, el
programa deberá finalizar inmediatamente el bucle sin continuar analizando más notas. 
 */
public class Ejercicio31 {
    public static void main(String[] args) {
        
        int[] nums = {4,6,8,5,2,9,6};
        
        int suma = 0;
        boolean hacerMedia = true;
        for(int i = 0;i<nums.length;i++){
            
            if(nums[i]==2){
                System.out.println("No tienes derecho a tu nota media.");
                i=nums.length+1;
                hacerMedia = false;
            }else{
                suma += nums[i];
            }
        }
        if(hacerMedia){
            double media = suma/nums.length;
            System.out.println("Tu nota media es: "+media);
        }
        
    }
}
