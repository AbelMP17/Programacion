public class Ejercicio35b {
    public static void main (String[] a){
        //Listas meses, ingresos y gastos de cada mes.
        String[] meses = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"};
        double[] ingresos = {15000,16000,10000,9000,12000,13000,7000,6000,11000,13000,14000,15000};
        double[] gastos = {8000,9000,11000,10000,12000,10000,9000,9000,9000,9000,12000,14000};
        
        //Positivo o Negativo
        
        System.out.println("- Meses positivos o negativos:");
        if (ingresos[0]>gastos[0]){
            System.out.println("    El mes de Enero es positivo.");
        }else{
            System.out.println("    El mes de Enero es negativo.");
        }
        if (ingresos[1]>gastos[1]){
            System.out.println("    El mes de febrero es positivo.");
        }else{
            System.out.println("    El mes de febrero es negativo.");
        }
        if (ingresos[2]>gastos[2]){
            System.out.println("    El mes de marzo es positivo.");
        }else{
            System.out.println("    El mes de marzo es negativo.");
        }
        if (ingresos[3]>gastos[3]){
            System.out.println("    El mes de abril es positivo.");
        }else{
            System.out.println("    El mes de abril es negativo.");
        }
        if (ingresos[4]>gastos[4]){
            System.out.println("    El mes de mayo es positivo.");
        }else{
            System.out.println("    El mes de mayo es negativo.");
        }
        if (ingresos[5]>gastos[5]){
            System.out.println("    El mes de junio es positivo.");
        }else{
            System.out.println("    El mes de junio es negativo.");
        }
        if (ingresos[6]>gastos[6]){
            System.out.println("    El mes de julio es positivo.");
        }else{
            System.out.println("    El mes de julio es negativo.");
        }
        if (ingresos[7]>gastos[7]){
            System.out.println("    El mes de agosto es positivo.");
        }else{
            System.out.println("    El mes de agosto es negativo.");
        }
        if (ingresos[8]>gastos[8]){
            System.out.println("    El mes de septiembre es positivo.");
        }else{
            System.out.println("    El mes de septiembre es negativo.");
        }
        if (ingresos[9]>gastos[9]){
            System.out.println("    El mes de octubre es positivo.");
        }else{
            System.out.println("    El mes de octubre es negativo.");
        }
        if (ingresos[10]>gastos[10]){
            System.out.println("    El mes de noviembre es positivo.");
        }else{
            System.out.println("    El mes de noviembre es negativo.");
        }
        if (ingresos[11]>gastos[11]){
            System.out.println("    El mes de diciembre es positivo.");
        }else{
            System.out.println("    El mes de diciembre es negativo.");
        }
        
        
        
        //Promedio
        System.out.println("- Promedio");
        double promedioI = (ingresos[0]+ingresos[1]+ingresos[2]+ingresos[3]+ingresos[4]+ingresos[5]+ingresos[6]+ingresos[7]+ingresos[8]+ingresos[9]+ingresos[10]+ingresos[11])/meses.length;
        System.out.println("    La media de ingresos al año son "+promedioI+" €");
        double promedioG = (gastos[0]+gastos[1]+gastos[2]+gastos[3]+gastos[4]+gastos[5]+gastos[6]+gastos[7]+gastos[8]+gastos[9]+gastos[10]+gastos[11])/meses.length;
        System.out.println("    La media de gastos al año son "+promedioG+" €");
        
        //Balance final
        System.out.println("- Balance final:");
        if (promedioI>promedioG){
            System.out.println("    El balance final ha sido positivo.");
        }else{
            System.out.println("    El balance final ha sido negativo.");
        }
        
    }
}
