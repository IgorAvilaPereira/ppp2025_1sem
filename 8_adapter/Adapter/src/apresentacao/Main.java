/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
