public class Ejercicio17 {
    public static void main(String[] a){
        
        double factor = 0;
        double segundoFactor = 1;
        double tercerFactor = -2;
        double factorO = (3*((factor/2)*(factor/2)*(factor/2)))/(factor*factor-factor+3);
        double factorI = (3*((segundoFactor/2)*(segundoFactor/2)*(segundoFactor/2)))/(segundoFactor*segundoFactor-segundoFactor+3);
        double factorZ = (3*((tercerFactor/2)*(tercerFactor/2)*(tercerFactor/2)))/(tercerFactor*tercerFactor-(tercerFactor)+3);
        
        System.out.println("Valor de f (0) es: "+factorO+"");
        System.out.println("Valor de f (1) es: "+factorI+"");
        System.out.println("Valor de f (-2) es: "+factorZ+"");
    }
}
