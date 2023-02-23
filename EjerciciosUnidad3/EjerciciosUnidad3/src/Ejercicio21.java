
import bpc.daw.consola.*;
import java.awt.*;

/*
: Usa la Consola DAW para hacer un programa que pregunte al usuario un número
de segundos. El programa finalizará cuando pase la cantidad de segundos introducida y
durante ese tiempo se dibujará y actualizar en la pantalla una barra de progreso como esta: 
 */
public class Ejercicio21 {

    public static void main(String[] args) {
        Consola cons = new Consola();

        CapaFondo capaFondo = cons.getCapaFondo();
        Fondo fon = new FondoColorSolido(Color.white);
        capaFondo.setFondo(fon);

        CapaTexto capaTexto = cons.getCapaTexto();
        capaTexto.setColorTexto(Color.black);

        CapaCanvas capaCanva = cons.getCapaCanvas();
        Graphics graphic = capaCanva.getGraphics();
        
        int ancho = 800;
        
        graphic.setColor(Color.black);
        graphic.drawRect(450, 400, ancho, 50);

        int i = 0;
        int acumulador = 0;
        
        boolean repetir = true;

        capaTexto.mostrarCuadricula(false);
        capaTexto.print("Introduce un numero de segundos : ");
        int num = cons.getTeclado().leerNumeroEntero();

        capaTexto.cls();

        while (repetir) {
            if (acumulador >= ancho) {
                capaTexto.print("Pulsa cualquier tecla para salir.");
                cons.getTeclado().leerCaracter();
                repetir = false;
            } else {
                capaTexto.print("Introduce un numero de segundos : " + num);
                i++;
                acumulador = acumulador + (ancho/100);
                graphic.setColor(Color.blue);
                graphic.fillRect(450, 400, acumulador, 50);
                
                int progreso = (i * num) / 100;
                
                capaTexto.print(12, 60, (i + "%"));
                capaTexto.print(15, 23, "Esperando finalizacion ... (" + progreso + " seg de " + num + ")");
                
                try {
                    Thread.sleep(num * 10);
                } catch (InterruptedException error) {
                    System.out.println(error);
                }
                capaTexto.cls();
            }
        }
    }

}
