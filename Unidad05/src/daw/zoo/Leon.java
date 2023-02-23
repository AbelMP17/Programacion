package daw.zoo;
public class Leon extends Animal{
    public Leon(String n, int p){
        super(n,p);
    }

    @Override
    public void emitirSonido() {
        System.out.println("Roooooarrr!!");
    }
}
