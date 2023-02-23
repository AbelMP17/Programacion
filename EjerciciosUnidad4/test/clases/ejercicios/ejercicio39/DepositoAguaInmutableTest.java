/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package clases.ejercicios.ejercicio39;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class DepositoAguaInmutableTest {
    
    public DepositoAguaInmutableTest() {
    }
    
    @Test
    public void setSomeMethod() {
        DepositoAguaInmutable dp = new DepositoAguaInmutable(0, 10);

        for(int i = 0; i<8;i++){
            dp = dp.añadirLitro();
        }
        
        System.out.println(dp.getPorcentaje());
    }
    
}
