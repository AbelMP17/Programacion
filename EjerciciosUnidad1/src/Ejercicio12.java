import java.util.*;
public class Ejercicio12 {
    public static void main(String[] a){
    
        System.out.println("Escribe el precio del producto: ");
        double precioNormal = new Scanner (System.in).nextDouble();
        System.out.println("Escribe el porcentaje de la rebaja: ");
        double porcentajeRebaja = new Scanner (System.in).nextDouble();
        
        double descuentoAplicado = precioNormal*(porcentajeRebaja/100);
        double precioFinal =precioNormal-descuentoAplicado;
        
        System.out.println("Precio normal del artículo: "+precioNormal+" euros");
        System.out.println("Porcentaje de rebaja aplicado: "+porcentajeRebaja+" %");
        System.out.println("Descuento aplicado: "+descuentoAplicado+" euros");
        System.out.println("Precio final del artículo: "+precioFinal+" euros");
    }
}
