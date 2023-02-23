package clase.Persona;

import clase.Ordenador.*;

public class Programa {
    public static void main(String[] args) {
        /*
            El metodo hashCode combierte un objeto en un número entero.
            Objetos que sean iguales tienen que tener el mismo hashcode.
            El método hashCode es la posición de memoria del objeto dependiendo del Sistema Operativo.
            Se sobreescribe para que dos hermanos gemelos tengan el mismo hashCode.
            Siempre que se sobre escribe equals, hay que sobreescribir hashCode.
        */
        Hospital h = new Hospital();
        Paciente p = new Paciente(123456, "Paco");
        Paciente p2 = new Paciente(123356, "Manuel");
        System.out.println(p.hashCode());
        System.out.println(p2.hashCode());
    }
}
