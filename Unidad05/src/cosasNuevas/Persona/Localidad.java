package cosasNuevas.Persona;
public record Localidad(int id, String localidad) implements Comparable<Localidad>{

    @Override
    public int compareTo(Localidad o) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //return this.id - o.id;
        return  this.localidad().compareTo(o.localidad);
    }
    
}
