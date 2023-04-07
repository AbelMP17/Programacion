import bpc.daw.consola.*;
import java.awt.*;
import java.util.*;
/*

 El jugador parte con 0 puntos, nivel 1 y tiene 80 movimientos disponibles. La posición
inicial del jugador es el punto de coordenadas (40,15)
 El ordenador calcula las coordenadas (x,y) del tesoro de forma aleatoria, teniendo en
cuenta el número máximo de filas y columnas de la capa de texto.
 El jugador es una letra O situada en las coordenadas del jugador, mientras que el
tesoro no se ve. La pantalla muestra los puntos, nivel y movimientos disponibles.
 El jugador usa las siguientes teclas para moverse por la pantalla:
W Arriba
A Izquierda
D Derecha
S Abajo
 Cada vez que se mueve el jugador, disminuye en uno su número de movimientos
disponibles. Si éste llega a cero, se acaba la partida y se muestra en pantalla con el
signo $ la posición del tesoro.
 Al moverse el jugador, en la parte superior de la pantalla aparecerán las palabras MUY
FRIO, FRIO, CALIENTE o QUEMANDO, según sea la distancia desde el tesoro hasta el
jugador, que se calcula con la siguiente fórmula:

Donde suponemos que la posición del jugador es (xj,yj) y la del tesoro es (xt,yt). Tras
calcular la distancia buscamos en la tabla la palabra correspondiente:
Distancia       Palabra
Mayor de 35     Muy frio
Entre 15 y 35   Frio
Entre 5 y 15    Caliente
Menos de 5      Quemando
41
 Si el jugador se mueve y acierta con la posición del tesoro, se informará al usuario y se
pasará al siguiente nivel. Los puntos se incrementarán con el número de movimientos
que le queden. El número de movimientos disponible se incrementará en 10 unidades
al pasar al siguiente nivel.
 */
public class Ejercicio46 {
    public static void main(String[] args) {
        Consola cons = new Consola();
        
        Random rnd = new Random(); 
        
        CapaTexto cT = cons.getCapaTexto();
        cons.getTeclado().setTipoCursor(2);
        
        
        int puntos = 0;
        int nivel = 1; 
        
        
        int posicionJugadorX = 40;
        int posicionJugadorY = 15;
        int mov=2;
        
        boolean encontrado = true;   
        
        
        String temperatura = null;
        
        int movimientos = 80;    
        
        
        
            for(nivel = 1;movimientos>0;nivel++){
                
                
                double x = rnd.nextInt(2,40);
                double y = rnd.nextInt(2, 30);
                                
                CapaTexto tesoro = cons.getCapaTexto();
                tesoro.setColorTexto(Color.black);
                tesoro.print((int)y,(int)x , "$");
                
                for(movimientos = movimientos; movimientos>0 && encontrado;movimientos--){
                    
                    double distanciaX = posicionJugadorX-x;
                    double distanciaY = posicionJugadorY-y;
                
                    double distancia = Math.sqrt((Math.pow(distanciaX, 2))+(Math.pow(distanciaY, 2)));
                    
                    if(distancia>35){
                        temperatura="Muy Frio";
                    }else if(distancia>15 && distancia<35){
                        temperatura="Frio";
                    }else if(distancia>5 && distancia<15){
                        temperatura="Caliente";
                    }else if(distancia<5){
                        temperatura="Quemando";
                    }
                    
                    
                    cT.print(1, 1, "Puntos: "+puntos+"          Nivel: "+nivel+"       Movimiento: "+movimientos+"      "+temperatura);
                    cT.print(2, 1, "------------------------------------------------------------------------------------------");
                    cT.println("");
                    
                    CapaTexto jugador = cons.getCapaTexto();
                    jugador.setColorTexto(Color.white);
                    jugador.print(posicionJugadorY, posicionJugadorX, "o");
                    
                    char mover = cons.getTeclado().leerCaracter();
                    switch (mover) {
                        case 'w' -> {
                            jugador.cls();
                            posicionJugadorY=posicionJugadorY-mov;
                            jugador.print(posicionJugadorY, posicionJugadorX, "o");
                        }
                        case 'a' -> {
                            jugador.cls();
                            posicionJugadorX=posicionJugadorX-mov;
                            jugador.print(posicionJugadorY, posicionJugadorX, "o");
                        }
                        case 's' -> {
                            jugador.cls();
                            posicionJugadorY=posicionJugadorY+mov;
                            jugador.print(posicionJugadorY, posicionJugadorX, "o");
                        }
                        case 'd' -> {
                            jugador.cls();
                            posicionJugadorX=posicionJugadorX+mov;
                            jugador.print(posicionJugadorY, posicionJugadorX, "o");
                        }
                        default -> {
                            cT.print("Has pulsado una tecla erronea");
                            movimientos++;                            
                        }
                    } 
                    if (temperatura.equals("Quemando")){  
                        cT.print("Tesoro encontrado.");
                        movimientos = movimientos + 10;
                        puntos = puntos + movimientos;
                        nivel++;
                        encontrado = false;
                    }
                }
                
                if(movimientos==0){
                    cT.print("Has perdido."); 
                    tesoro.setColorTexto(Color.yellow);
                    movimientos=0;
                    cons.getTeclado().leerCaracter();
                }
                encontrado=true;
            }
            
        

        
    }
}
