package clase.Ordenador;

import clase.Persona.YeraiException;
import java.io.IOException;

public class Ordenador {
    private boolean encendido;
    private int capacidadRam;
    private String sistemaOperativo;
    private String marca;
    
    public Ordenador(int cr, String so, String m){
        this.encendido = false;
        this.capacidadRam = cr;
        this.sistemaOperativo = so;
        this.marca = m;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public int getCapacidadRam() {
        return capacidadRam;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public String getMarca() {
        return marca;
    }
    
    public void encender(){
        encendido = true;
        System.out.println("Comprobando memoria RAM.");
        System.out.println("Comprobando memoria CPU.");
        System.out.println("Carga de sistema operativo "+sistemaOperativo);
    }
    
    public void abrirNavegador(){
        if(!encendido){
            throw new YeraiException();
        }
        try {
            Runtime.getRuntime().exec("C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
        } catch (IOException error) {
            System.out.println(error);
        }
    }
    
}
