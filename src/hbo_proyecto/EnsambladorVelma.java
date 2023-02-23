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
    
    @Override
    public void run(){
        while (true){
            if(running){
                try {
                    EstudioGOT.semaforoEnsamblador.acquire();
                } catch (InterruptedException ex) {
                    Logger.getLogger(EnsambladorVelma.class.getName()).log(Level.SEVERE, null, ex);
                }
                if(EstudioGOT.partes[0]>=1 && EstudioGOT.partes[1]>=1 && EstudioGOT.partes[2]>=1 && EstudioGOT.partes[3]>=1 && capPlot < 5){
                    //Intro                 credito                inicio                   cierre
                    try {
                        
                        Thread.sleep(tiempo);
                        capPlot += 1;
                        EstudioGOT.capitulosListos +=1;
                        for(int i = 0; i <= 3; i++){
                            EstudioGOT.semaforos[i].release();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EnsambladorVelma.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(EstudioGOT.partes[0]>=1 && EstudioGOT.partes[1]>=1 && EstudioGOT.partes[2]>=1 && EstudioGOT.partes[3]>=1 && EstudioGOT.partes[4]>=1 && capPlot==5){
                    try {
                        
                        Thread.sleep(tiempo);
                        capPlot = 0;
                        EstudioGOT.capitulosListos +=1;
                        for(int i = 0; i <= 4; i++){
                            EstudioGOT.semaforos[i].release();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(EnsambladorVelma.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                EstudioGOT.semaforoEnsamblador.release();
            }
        }
    }
}
