/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbo_proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Domingos
 */
public class EnsambladorVelma extends Thread {
    int tiempo;
    boolean running = false;
    int capPlot = 0;
    
    public EnsambladorVelma(int t){
        this.tiempo = t;
    }
    
    public void run(){
        while (true){
            if(running){
                try {
                    EstudioVelma.semaforoEnsamblador.acquire();
                } catch (InterruptedException ex) {
                    Logger.getLogger(EnsambladorVelma.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(EstudioVelma.partes[0]>=1 && EstudioVelma.partes[1]>=1 && EstudioVelma.partes[2]>=1 && EstudioVelma.partes[3]>=1 && capPlot < 5){
                    //Intro                 credito                inicio                   cierre
                    try {
                        
                        Thread.sleep(tiempo);
                        capPlot += 1;
                        EstudioVelma.capitulosListos +=1;
                        for(int i = 0; i <= 3; i++){
                            EstudioVelma.semaforos[i].release();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EnsambladorVelma.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(EstudioVelma.partes[0]>=1 && EstudioVelma.partes[1]>=1 && EstudioVelma.partes[2]>=1 && EstudioVelma.partes[3]>=1 && EstudioVelma.partes[4]>=1 && capPlot==5){
                    try {
                        
                        Thread.sleep(tiempo);
                        capPlot = 0;
                        EstudioVelma.capitulosListos +=1;
                        for(int i = 0; i <= 4; i++){
                            EstudioVelma.semaforos[i].release();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EnsambladorVelma.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                EstudioVelma.semaforoEnsamblador.release();
            }
        }
    }
}
