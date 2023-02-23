package ejercicios.ejercicio06_07_08;
public class TecladoJava implements Teclado{
    public TecladoJava(){
    }
    
    @Override
    public void escribirTexto(String mensaje) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        System.out.println(mensaje);
    }
}
