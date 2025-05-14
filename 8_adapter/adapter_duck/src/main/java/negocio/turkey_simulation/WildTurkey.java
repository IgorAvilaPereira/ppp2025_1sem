package negocio.turkey_simulation;

public class WildTurkey implements Turkey {

    @Override
    public void gobble() {
        System.out.println("gobble goobble...!");
    }

    @Override
    public void fly() {
        System.out.println("fly like a wild turkey!!");
    }

}
