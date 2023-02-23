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
public class ProductorGOT extends Thread{
    
    int tiempo;
    int tipo;
    boolean running = false;
    
    public ProductorGOT(int t, int tp){
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
                    EstudioGOT.semaforos[y].acquire();
                    Thread.sleep(x);
                    EstudioGOT.partes[y].release();
                }
                else{
                    Thread.yield();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(ProductorGOT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
