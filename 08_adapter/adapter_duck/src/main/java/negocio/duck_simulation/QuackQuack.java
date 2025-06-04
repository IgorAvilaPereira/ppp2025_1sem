package negocio.duck_simulation;

public class QuackQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("Quack Quack");
    }

}
