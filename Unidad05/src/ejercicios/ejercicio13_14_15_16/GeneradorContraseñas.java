package ejercicios.ejercicio13_14_15_16;

import java.util.*;

public class GeneradorContraseñas {
    private Random random;
    
    public GeneradorContraseñas(){
        random = new Random();
    }
    
    public GeneradorContraseñas(Random r){
        random = r;
    }
    
    public String generarContraseña(int longitud){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<longitud;i++){  
            int num = random.nextInt(2);
            switch (num) {
                case 0 -> {
                    int n1 = random.nextInt(48, 58);
                    str.append((char) n1);
                }
                case 1 -> {
                    int n1 = random.nextInt(64, 91);
                    str.append((char) n1);
                }
                case 2 -> {
                    int n1 = random.nextInt(97, 123);
                    str.append((char) n1);
                }
                default -> System.out.println("valor no valido.");
            }
            
        }
        return str.toString();
    }
    public String generarContraseña(){
        return generarContraseña(8);
    }
    
    public static void main(String[] args) {
        GeneradorContraseñas c = new GeneradorContraseñas();
        for(int i= 0;i<4;i++){
            
        }
    }
    
}
