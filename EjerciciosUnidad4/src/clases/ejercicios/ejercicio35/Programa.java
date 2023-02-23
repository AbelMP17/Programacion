/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.ejercicios.ejercicio35;

import bpc.daw.consola.CapaTexto;
import bpc.daw.consola.Consola;

/**
 *
 * @author usuario
 */
public class Programa {
    public static void main(String[] args) {
        Consola c = new Consola();
        Boligrafo b = new Boligrafo(c.getCapaTexto());
        b.escribirGuay("que");
        c.getTeclado().leerCaracter();
    }
}
