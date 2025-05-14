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
public class PeruBrazil implements Turkey {

    @Override
    public void gobble() {
        System.out.println("GOBBLE: Foi gol de mão....");
    }

    @Override
    public void fly() {
        System.out.println("FLY:Vai tá complicada as eliminatorias....");
    }
    
}
