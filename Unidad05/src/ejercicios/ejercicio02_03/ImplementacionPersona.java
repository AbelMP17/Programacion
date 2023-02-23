package ejercicios.ejercicio02_03;
public class ImplementacionPersona implements Persona{
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private Direccion direccion;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;
    
    @Override
    public String getNombre() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return nombre;
    }

    @Override
    public String getApellido1() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return apellido1;
    }

    @Override
    public String getApellido2() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return apellido2;
    }

    @Override
    public Direccion getDireccion() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return direccion;
    }

    @Override
    public String getTelefono() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return telefono;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return estadoCivil;
    }

    @Override
    public Persona getPareja() {
       //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
       return pareja;
    }
    
    public ImplementacionPersona(String nombre, String apellido1, String apellido2, int edad, String calle, String ciudad, String pais, String telefono, EstadoCivil ec, Persona pareja){
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.nombre = nombre; 
        this.edad = edad;
        this.direccion = new Direccion(calle, ciudad, pais);
        this.telefono = telefono;
        this.estadoCivil = ec;
        this.pareja = pareja;
    }
    
    private boolean comprobarEdad(){
        return edad>=0;
    }
    
    private boolean comprobarEstadoCivil(){
        return pareja.getPareja().getEstadoCivil().equals(EstadoCivil.CASADO) && pareja.getPareja()!= null || 
               pareja.getPareja().getEstadoCivil().equals(EstadoCivil.SOLTERO) && pareja.getPareja()== null;
    }
}
