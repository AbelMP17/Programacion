package clases.ejercicios.ejercicio32;
import java.util.*;
public class Bombo {
    private Queue<Bola> bolas;
    
    public Bombo(int totalBolas){
        bolas = new ArrayDeque<>();
        Random r = new Random();
        for(int i = 0; i<totalBolas; i++){
            int num = r.nextInt(1, 100);
            bolas.add(new Bola(num));
        }
    }
    
    public int getNúmeroBolas(){
        return bolas.size();
    }
    
    public Bola sacarBola(){
        return bolas.element();
    }
}
