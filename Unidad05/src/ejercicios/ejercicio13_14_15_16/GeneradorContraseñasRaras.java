package ejercicios.ejercicio13_14_15_16;

import java.util.*;

public class GeneradorContraseñasRaras extends GeneradorContraseñasUnicas{
    public GeneradorContraseñasRaras(){
    }
    public GeneradorContraseñasRaras(Random r){
        super(r);
    }
    
    public String generarContraseñas(int longitud){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<longitud;i++){  
            int num = new Random().nextInt(2);
            switch (num) {
                case 0 -> {
                    int n1 = new Random().nextInt(48, 58);
                    n1+=122;
                    str.append((char) n1);
                }
                case 1 -> {
                    int n1 = new Random().nextInt(64, 91);
                    n1+=122;
                    str.append((char) n1);
                }
                case 2 -> {
                    int n1 = new Random().nextInt(97, 123);
                    n1+=122;
                    str.append((char) n1);
                }
                default -> System.out.println("valor no valido.");
            }
            
        }
        return str.toString();
    }
}
