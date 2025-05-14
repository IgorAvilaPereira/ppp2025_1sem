package apresentacao;

import negocio.TurkeyAdapter;
import negocio.duck_simulation.Duck;
import negocio.duck_simulation.MallardDuck;
import negocio.turkey_simulation.Turkey;
import negocio.turkey_simulation.WildTurkey;

public class Main {
    public static void main(String[] args) {
        // codigo original do simulador de patos
        Duck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();

        // codigo original/legado do simulador de perus
        Turkey wildTurkey = new WildTurkey();
        wildTurkey.fly();
        wildTurkey.gobble();

        // adapter: a ideia e "fantasiar" perus de patos
        System.out.println("adaptando...");
        Duck turkeyAdapter = new TurkeyAdapter(wildTurkey);
        turkeyAdapter.fly();
        turkeyAdapter.quack();

        if (turkeyAdapter instanceof Duck){
            System.out.println("OK");
        }
    }


}