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
public class ObjetoProxy implements Interface{
    ObjetoReal real;
    ObjetoAdapter adapter;
    public ObjetoProxy(){
        this.real = new ObjetoReal();
        this.adapter = new ObjetoAdapter();
        real.proceso();
        adapter.proceso();
    }

    @Override
    public void proceso() {
        System.out.println("Procedo Proxy");
    }
    
}
