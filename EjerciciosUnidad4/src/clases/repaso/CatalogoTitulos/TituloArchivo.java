package clases.repaso.CatalogoTitulos;
public class TituloArchivo implements Titulo{
    private String dni;
    private String nombre;
    private String estudios;
    private Estado estado;
    public TituloArchivo(String d, String n, String e, Estado s){
        this.dni = d;
        this.nombre = n;
        this.estudios = e;
        this.estado = s;
    }
    
    public String toString(){
        return dni+";"+nombre+";"+estudios+";"+estado;
        
    }

    @Override
    public String getDNI() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return dni;
    }

    @Override
    public String getEstudios() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return estudios;
    }

    @Override
    public Estado getEstado() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return estado;
    }

    @Override
    public void setEstado(Estado e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        this.estado = e;
    }
    
    
}
