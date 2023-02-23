package clase.elTren;
public class Persona {
    private String nombre;
    private int peso;
    private Maleta equipaje;
    
    public Persona(String n, int p, int kgEquipaje){
        this.nombre = n;
        this.peso = p;
        if(kgEquipaje==0){
            this.equipaje = null;
        }else if(kgEquipaje<0){
            throw new IllegalArgumentException("El peso de la maleta no puede ser negativo.");
        }
        this.equipaje = new Maleta(this, kgEquipaje);
    }
    public Persona(String n, int p){
        this(n, p, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public Maleta getEquipaje() {
        return equipaje;
    }

    public void setEquipaje(Maleta m) {
        this.equipaje = m;
    }
    
}
