package negocio.duck_simulation;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Voando com as minhas asas!");
    }
    
}
