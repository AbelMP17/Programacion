import java.util.*;
public class Ejercicio36 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int num = new Scanner (System.in).nextInt();
        
        for(int i = 1; i<=num; i++){
            if(num%i==0){
                System.out.println(i);
            }
        }
    }
}
