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
public class PMGOT extends Thread{
    
    boolean cambioDia = false;
    boolean rickMorty = true;
    int tiempo;
    int intervalo;
    
    public PMGOT(int t, int interval){
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
                    EstudioGOT.revisarDia.acquire();
                    Thread.sleep(tiempo);
                    if (EstudioGOT.contDia != 0){                      
                        EstudioGOT.contDia -= 1;
                    }
                    EstudioGOT.revisarDia.release();
                }else if(rickMorty){
                    Thread.sleep(intervalo);
                    rickMorty = !rickMorty;
                }else{
                    Thread.sleep(intervalo);
                    rickMorty = !rickMorty;
                }
            }catch (InterruptedException ex) {
                Logger.getLogger(PMGOT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
