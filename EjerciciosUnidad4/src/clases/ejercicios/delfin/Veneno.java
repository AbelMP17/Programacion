/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.ejercicios.delfin;

/**
 *
 * @author usuario
 */
public class Veneno implements PowerUp{

    @Override
    public String getNombre() {
        //throw new UnsupportedOperationException("Not supported yet."); 
        return "Poción de veneno";
    }

    @Override
    public void aplicar(Personaje p) {
        //throw new UnsupportedOperationException("Not supported yet."); 
        p.setPuntosVida(p.getPuntosVida()-10);
        p.setPuntosAtaque(p.getPuntosAtaque()-20);
    }
    
}
