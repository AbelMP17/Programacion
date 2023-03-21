/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases;

import java.io.*;
import java.time.*;
import javax.persistence.*;

/**
 *
 * @author usuario
 */
@Entity
public class CorredorAmateur extends Corredor implements Serializable{
    
    private double velocidadMedia;
    private int experiencia;
    
    public CorredorAmateur(){
    }
    
    public CorredorAmateur(String nombre, LocalDate fechaNac, double vm, int exp){
        super(nombre, fechaNac);
        this.velocidadMedia = vm;
        this.experiencia = exp;
    }

    public double getVelocidadMedia() {
        return velocidadMedia;
    }

    public void setVelocidadMedia(double velocidadMedia) {
        this.velocidadMedia = velocidadMedia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }
    
    
    
}
