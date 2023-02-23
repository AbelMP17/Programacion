/*

 */
public class Ejercicio47 {
    public static void main(String[] a){
        char caracter = 'F';
        
        int asciiCaracter = (int)caracter;
        
        System.out.println("El caracter ("+caracter+") en la tabla ascci es el número "+asciiCaracter);
        
        if (asciiCaracter>=65 && asciiCaracter<=90){
            System.out.println("El caracter corresponde a una letra mayúscula.");
        }else if(asciiCaracter>=97 && asciiCaracter<=122){
            System.out.println("El caracter corresponde a una letra minúscula.");
        }else{
            System.out.println("El caracter no corresponde a una letra.");
        }
    
    }
}
