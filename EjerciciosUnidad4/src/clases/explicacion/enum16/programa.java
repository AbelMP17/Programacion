package clases.explicacion.enum16;
public class programa {
    public static void main(String[] args) {
        Agenda a = new Agenda(Dia.lunes, "ejercicio 41 programacion");
        Agenda b = new Agenda(Dia.viernes, "examen sorpresa de fol");
    
        Dia x = Dia.lunes;
        System.out.println(x.esFinde());
        System.out.println(x.esLaborable());
        Dia[] dias = Dia.values();
        for(Dia d : dias){
            System.out.print(d.name()+": ");
            System.out.println(d.getPrecioCine()+" euros");
        }
    }
    
}
