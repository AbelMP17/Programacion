package daw.zoo;
public class Tigre extends Animal{

    public Tigre(String n, int p) {
        super(n, p);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Miaaau!!");
    }
    
}
