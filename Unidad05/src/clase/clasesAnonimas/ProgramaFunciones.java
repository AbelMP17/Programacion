package clase.clasesAnonimas;
public class ProgramaFunciones {
    public static void main(String[] args) {
        FuncionF f = new FuncionF();
        System.out.println(f.calcularY(0));
        
        Funcion g = new Funcion("g"){
            @Override
            public double calcularY(double x) {
                return Math.cos(x);
            }
        };
        System.out.println(g.calcularY(Math.PI));
        Funcion h = new Funcion("h"){
            @Override
            public double calcularY(double x) {
                return 1/x;
            }
            
        };
        System.out.println(h.calcularY(2));
        
   
    }
}
