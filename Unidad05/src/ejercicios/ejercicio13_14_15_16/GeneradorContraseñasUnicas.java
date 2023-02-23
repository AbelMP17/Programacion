package ejercicios.ejercicio13_14_15_16;

import java.util.*;

public class GeneradorContraseñasUnicas extends GeneradorContraseñas{
    private Set<String> contraseñasGeneradas;
    
    public GeneradorContraseñasUnicas(){
       //super();
       //el super sin propiedades es opcional
       contraseñasGeneradas = new HashSet<>();
    }
    
    public GeneradorContraseñasUnicas(Random r){
        super(r);
    }
    @Override
    public String generarContraseña(int longitud){
        String psw = super.generarContraseña(longitud);
        boolean repetir = true;
        while(repetir){
            if(contraseñasGeneradas.contains(psw)){
                psw = generarContraseña();
            }else{
                contraseñasGeneradas.add(psw);
                repetir = false;
            }
        }
        return psw;
    }
    
    @Override
    public String generarContraseña(){
        return generarContraseña(12);
    }
}
