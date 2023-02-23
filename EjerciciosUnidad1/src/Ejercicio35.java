public class Ejercicio35 {
    public static void main (String[] a){
        double eneroI = 15000;
        double eneroG = 8000;
        double febreroI = 16000;
        double febreroG = 9000;
        double marzoI = 10000;
        double marzoG = 11000;
        double abrilI = 9000;
        double abrilG = 10000;
        double mayoI = 12000;
        double mayoG = 12000;
        double junioI = 13000;
        double junioG = 10000;
        double julioI = 7000;
        double julioG = 9000;
        double agostoI = 6000;
        double agostoG = 9000;
        double septiembreI = 11000;
        double septiembreG = 9000;
        double octubreI = 13000;
        double octubreG = 9000;
        double noviembreI = 14000;
        double noviembreG = 12000;
        double diciembreI = 15000;
        double diciembreG = 14000;
        final int meses = 12;
        
        //Positivo o Negativo
        
        System.out.println("- Meses positivos o negativos:");
        if (eneroI>eneroG){
            System.out.println("    El mes de Enero es positivo.");
        }else{
            System.out.println("    El mes de Enero es negativo.");
        }
        if (febreroI>febreroG){
            System.out.println("    El mes de febrero es positivo.");
        }else{
            System.out.println("    El mes de febrero es negativo.");
        }
        if (marzoI>marzoG){
            System.out.println("    El mes de marzo es positivo.");
        }else{
            System.out.println("    El mes de marzo es negativo.");
        }
        if (abrilI>abrilG){
            System.out.println("    El mes de abril es positivo.");
        }else{
            System.out.println("    El mes de abril es negativo.");
        }
        if (mayoI>mayoG){
            System.out.println("    El mes de mayo es positivo.");
        }else{
            System.out.println("    El mes de mayo es negativo.");
        }
        if (junioI>junioG){
            System.out.println("    El mes de junio es positivo.");
        }else{
            System.out.println("    El mes de junio es negativo.");
        }
        if (julioI>julioG){
            System.out.println("    El mes de julio es positivo.");
        }else{
            System.out.println("    El mes de julio es negativo.");
        }
        if (agostoI>agostoG){
            System.out.println("    El mes de agosto es positivo.");
        }else{
            System.out.println("    El mes de agosto es negativo.");
        }
        if (septiembreI>septiembreG){
            System.out.println("    El mes de septiembre es positivo.");
        }else{
            System.out.println("    El mes de septiembre es negativo.");
        }
        if (octubreI>octubreG){
            System.out.println("    El mes de octubre es positivo.");
        }else{
            System.out.println("    El mes de octubre es negativo.");
        }
        if (noviembreI>noviembreG){
            System.out.println("    El mes de noviembre es positivo.");
        }else{
            System.out.println("    El mes de noviembre es negativo.");
        }
        if (diciembreI>diciembreG){
            System.out.println("    El mes de diciembre es positivo.");
        }else{
            System.out.println("    El mes de diciembre es negativo.");
        }
        
        //Promedio 
        System.out.println("- Promedio");
        double promedioI = (eneroI+febreroI+marzoI+abrilI+mayoI+junioI+julioI+agostoI+septiembreI+octubreI+noviembreI+diciembreI)/meses;
        System.out.println("    La media de ingresos al año son "+promedioI+" €");
        double promedioG = (eneroG+febreroG+marzoG+abrilG+mayoG+junioG+julioG+agostoG+septiembreG+octubreG+noviembreG+diciembreG)/meses;
        System.out.println("    La media de ingresos al año son "+promedioG+" €");
        
        //Balance final
        System.out.println("- Balance final:");
        if (promedioI>promedioG){
            System.out.println("    El balance final ha sido positivo.");
        }else{
            System.out.println("    El balance final ha sido negativo.");
        }
        
    }
}
