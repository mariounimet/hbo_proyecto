/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo_proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Mario
 */
public class ProductorVelma extends Thread{
    
    int tiempo;
    int tipo;
    boolean running = false;
    
    public ProductorVelma(int t, int tp){
        this.tiempo = t;
        this.tipo = tp;
    }
    
    @Override
    public void run(){
        while (true){
            try {
                if(running){
                    int x = tiempo;
                    int y = tipo;
                    EstudioVelma.semaforos[y].acquire();
                    Thread.sleep(x);
                    EstudioVelma.partes[y] += 1;
                }
                else{
                    Thread.yield();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorVelma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
