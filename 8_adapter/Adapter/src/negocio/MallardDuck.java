/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MallardDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("Quack Quack....");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying like a Duck...");
    }
    
}
