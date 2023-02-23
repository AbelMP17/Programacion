package programas.ProgramaEjercicio02_03;
import ejercicios.ejercicio02_03.Persona;
import ejercicios.ejercicio02_03.PersonaBuilder;
public class Programa {
    public static void main(String[] args) {
        PersonaBuilder jaime = new PersonaBuilder("Jaime", "Lara","Ramos")
                            .setTelefono("958000000")
                            .setCiudad("Granada")
                            .setEdad(15);
        
        PersonaBuilder maria = new PersonaBuilder("María", "García", "Pérez")
                            .setCiudad("Almería")
                            .setPareja((Persona) new PersonaBuilder("Juan", "Molina", "Molina")
                                    .setEdad(30)
                                    .setPais("Ecuador")
                            );
    }
}
