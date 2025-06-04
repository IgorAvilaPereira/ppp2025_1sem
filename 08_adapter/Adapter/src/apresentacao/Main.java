package apresentacao;

import negocio.Duck;
import negocio.MallardDuck;
import negocio.PeruBrazil;
import negocio.Turkey;
import negocio.TurkeyAdapter;
import negocio.WildTurkey;

/**
 *
 * @author iapereira
 */
public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        System.out.println("Duck:");
        duck.quack();
        System.out.println("------------------------");
        System.out.println("Turkey");
        Turkey turkey = new WildTurkey();
        turkey.gobble();
        System.out.println("----------------------");
        System.out.println("Adapter");
        Duck turkeyAdapter = new TurkeyAdapter(turkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
        System.out.println("---------------------");
        Duck turkeyAdapter2 = new TurkeyAdapter(new PeruBrazil());
        turkeyAdapter2.quack();
        turkeyAdapter2.fly();
        
    }
    
}
