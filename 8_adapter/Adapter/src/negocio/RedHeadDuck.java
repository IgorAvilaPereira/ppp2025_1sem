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
public class RedHeadDuck implements Duck{

    @Override
    public void quack() {
        System.out.println("QUACK QUACK :) .....");
    }

    @Override
    public void fly() {
        System.out.println("FLy redhead ;) #redheadflying");
    }
    
}
