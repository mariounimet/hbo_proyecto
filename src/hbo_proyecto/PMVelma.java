/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo_proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class PMVelma extends Thread{
    
    boolean cambioDia = false;
    boolean rickMorty = true;
    int tiempo;
    int intervalo;
    
    public PMVelma(int t, int interval){
        this.tiempo = t;
        this.intervalo = interval;
    }
    
    @Override
    public void run(){
        while (true){
            try {
                if(cambioDia){
                    cambioDia = false;
                    rickMorty = false;
                    EstudioVelma.revisarDia.acquire();
                    Thread.sleep(tiempo);
                    if (EstudioVelma.countdown != 0){                      
                        EstudioVelma.countdown -= 1;
                        
                    }
                    EstudioVelma.revisarDia.release();
                }else if(rickMorty){
                    Thread.sleep(intervalo);
                    rickMorty = !rickMorty;
                }else{
                    Thread.sleep(intervalo);
                    rickMorty = !rickMorty;
                }
            }catch (InterruptedException ex) {
                Logger.getLogger(PMVelma.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
