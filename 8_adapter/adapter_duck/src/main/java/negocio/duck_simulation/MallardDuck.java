package negocio.duck_simulation;

public class MallardDuck implements Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new QuackQuack();
    }

    @Override
    public void fly() {
        this.flyBehavior.fly();

    }

    @Override
    public void quack() {
        this.quackBehavior.quack();
    }

}
