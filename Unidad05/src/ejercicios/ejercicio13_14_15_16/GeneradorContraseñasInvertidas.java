package ejercicios.ejercicio13_14_15_16;

import java.util.*;

public class GeneradorContraseñasInvertidas extends GeneradorContraseñasUnicas{
    public GeneradorContraseñasInvertidas(){
    }
    public GeneradorContraseñasInvertidas(Random r){
        super(r);
    }
    @Override
    public String generarContraseña(int longitud){
        String psw = super.generarContraseña(longitud);
        String psw2 = "";
        for (int i = 0;i<longitud;i++) {
            char c = psw.charAt(i);
            if(Character.isUpperCase(c)){
                psw2 += String.valueOf(c).toLowerCase();
            }else if(Character.isLowerCase(c)){
                psw2 += String.valueOf(c).toUpperCase();
            }else{
                //es un numero
            }
        }
        return psw2;
    }
    
}
