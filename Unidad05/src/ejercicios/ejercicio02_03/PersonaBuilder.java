package ejercicios.ejercicio02_03;
public class PersonaBuilder {
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private String calle;
    private String ciudad;
    private String pais;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;
    
    public PersonaBuilder(String nombre, String apellido1, String apellido2){
        this.edad = 0;
        this.calle = null;
        this.ciudad = null;
        this.pais = "España";
        this.telefono = null;
        this.estadoCivil = EstadoCivil.SOLTERO;
        this.pareja = null;
    }

    public PersonaBuilder setEdad(int edad) {
        this.edad = edad;
        return this;
    }

    public PersonaBuilder setCalle(String calle) {
        this.calle = calle;
        return this;
    }

    public PersonaBuilder setCiudad(String ciudad) {
        this.ciudad = ciudad;
        return this;
    }

    public PersonaBuilder setPais(String pais) {
        this.pais = pais;
        return this;
    }

    public PersonaBuilder setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    public PersonaBuilder setTelefono(String telefono){
        this.telefono = telefono;
        return this;
    }
    
    public PersonaBuilder setPareja(Persona pareja) {
        this.pareja = pareja;
        return this;
    }
    
    public Persona build(){
        return new ImplementacionPersona(nombre, apellido1, apellido2, edad, calle, ciudad, pais, telefono, estadoCivil, pareja);
    }
}
