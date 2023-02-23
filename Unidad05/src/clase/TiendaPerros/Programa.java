package clase.TiendaPerros;

import java.util.*;

public class Programa {
    public static void main(String[] args) {
        List<Perro> catalogo = new ArrayList<>();
        for(int i = 0;i<8;i++){
            Perro p = PerroFactory.generarPerroAleaorio();
            catalogo.add(p);
        }
        
        Carrito c = new Carrito();
        boolean repetir = true;
        while(repetir){
            System.out.println("""
                               Tienda de perros HLanz:
                               ======================================
                               Elige el número de perro para añadirlo
                               al carrito y pulsa 0 para finalizar 
                               la compra
                               ======================================
                               """);
            for(int i = 0; i<catalogo.size();i++){
                Perro p = catalogo.get(i);
                if(p instanceof PerroAbandonado a){
                    if(!a.estaSano()){
                        System.out.println((i+1)+"..."+p.getNombre()+"..."+p.getRaza()+"..."+p.getPrecio()+"..."+a.getEnfermedades()+" - Tiene descuento");
                    }else{
                        System.out.println((i+1)+"..."+p.getNombre()+"..."+p.getRaza()+"..."+p.getPrecio()+"..."+a.getEnfermedades());
                    }
                }else{
                    System.out.println((i+1)+"..."+p.getNombre()+"..."+p.getRaza()+"..."+p.getPrecio());
                }
            }
            int opc = new Scanner(System.in).nextInt();
            switch(opc){
                case 0->{
                    repetir = false;
                    System.out.println("El precio es: "+c.getPrecio());
                }
                default-> {
                    Perro p = catalogo.get(opc-1);
                    c.comprar(p);
                    catalogo.remove(p);
                }
            }
        }
        c.comprar(catalogo.get(0));


    }
}
