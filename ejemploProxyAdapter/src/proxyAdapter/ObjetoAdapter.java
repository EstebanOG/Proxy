/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxyAdapter;

/**
 *
 * @author juane
 */
public class ObjetoAdapter implements Interface{

    ObjetoRemoto remoto;

    public ObjetoAdapter() {
        this.remoto = new ObjetoRemoto();
        remoto.doSomething();
    }
    
    @Override
    public void proceso() {
        System.out.println("Proceso objeto adapter");
    }
    
}
