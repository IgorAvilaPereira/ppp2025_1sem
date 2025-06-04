package negocio;

import negocio.duck_simulation.Duck;
import negocio.turkey_simulation.Turkey;

public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        this.turkey.fly();
    }

    // externamente "parece" um pato - internamente invoca-se metodos de peru!
    @Override
    public void quack() {
        this.turkey.gobble();
    }
    
}
