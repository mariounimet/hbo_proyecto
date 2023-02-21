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
public class Productor extends Thread{
    
    int tiempo;
    int tipo;
    boolean running = true;
    
    public Productor(int t, int tp){
        this.tiempo = t;
        this.tipo = tp;
    }
    
    @Override
    public void run(){
        while (running){
            try {
                Estudio.semaforos[tipo].acquire();
                Thread.sleep(tiempo);
                Estudio.partes[tipo] += 1;
                System.out.println(Estudio.partes[tipo]);
            } catch (InterruptedException ex) {
                Logger.getLogger(Productor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
