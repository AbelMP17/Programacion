package ejercicios.ejercicio10_11_12;
public class Empleado {
    private String nombre;
    private double sueldo;
    private double dinero;
    
    public Empleado(String n, double s){
        this.nombre = n;
        this.sueldo = s;
        this.dinero = 0;
    }

    public double getSueldo() {
        return sueldo;
    }

    public double getDinero() {
        return dinero;
    }
    
    public void cobrar(double cantidad)throws CabreoException{
        this.dinero += cantidad;
        if(cantidad<sueldo){
            throw new CabreoException("Págame máaaaaaas!!");
        }else if(cantidad>=sueldo){
            System.out.println("grasias cantepuelco.");
        }else{
            throw new CabreoException("Cantepuelco me autodespido por esclavizacion");
        }
    }
    
}
