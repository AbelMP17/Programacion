package clase.Persona;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private List<Paciente> pacientes;
    
    public Hospital(){
        pacientes = new ArrayList<>();
        pacientes.add(new Paciente(123456,"Paco"));
    }
    public boolean pacienteIngresado(Paciente p){
        return pacientes.contains(p);
    }
}
