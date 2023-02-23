package clase.juegoNaves;
public class NaveA extends Nave{
    @Override
    public void disparar() {
        System.out.println("Disparar dos rayos azules.");
    }

    @Override
    public void poderEspecial() {
        System.out.println("Disparar mega rayo de fuego.");
    }
    
}
