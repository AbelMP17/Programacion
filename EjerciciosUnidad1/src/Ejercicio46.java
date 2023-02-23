/*

 */
import java.util.*;
public class Ejercicio46 {
    public static void main(String[] a){
        
        System.out.println("Escribe tu año de nacimiento: ");
        double añoNacimiento = new Scanner(System.in).nextDouble();
        
        double edad = 2022-añoNacimiento;
        
        System.out.println("Escribe si eres hombre (true) o mujer (false): ");
        boolean sexo = new Scanner(System.in).nextBoolean();
        
        System.out.println("Escribe tu altura en metros: ");
        double altura = new Scanner(System.in).nextDouble();
        
        System.out.println("Escribe tu peso en kg: ");
        double peso = new Scanner(System.in).nextDouble();
        
        double frecuencia = sexo==true? 220-edad:
                            sexo==false? 226-edad:
                            0;
        System.out.println("Tu frecuencia cardíaca es de "+frecuencia);

        double imc = peso/(altura*altura);
        System.out.println("Tu imc es "+imc);
        
        String frase = imc<16?"Delgadez severa. (Come más)":
                        imc<16.99?"Delgadez moderada. (Come un poco más)":
                        imc<18.49?"Delgadez aceptable. (Come un poco)":
                        imc<24.99?"Peso normal":
                        imc<29.99?"Sobre peso (Come un poco menos)":
                        imc<34.99?"Sobre peso tipo 1. (Come menos)":
                        imc<40.00?"Sobre peso tipo 2. (Come bastante menos)":
                        imc>40.00?"Sobre peso tipo 3. (Deja de comer)":
                        "Has introducido mal un dato";
        System.out.println(frase);  
        
        
    }
}
