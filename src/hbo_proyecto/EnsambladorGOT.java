/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbo_proyecto;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 *
 * @author MARLON
 */
public class EnsambladorGOT extends Thread{
    int tiempo;
    boolean running = false;
    boolean isPlot = false;
    int cont = 1;
    
    public EnsambladorGOT(int t){
        this.tiempo = t;
    }
    
    @Override
    public void run(){
        while(true){
            if (running){
                
                try {
                    EstudioGOT.buscarPartes.acquire();
                    EstudioGOT.partes[0].acquire();
                    EstudioGOT.partes[1].acquire();
                    EstudioGOT.partes[2].acquire();
                    EstudioGOT.semaforos[0].release();
                    EstudioGOT.semaforos[1].release();
                    EstudioGOT.semaforos[2].release();
                    if (cont%5 != 0){
                        EstudioGOT.partes[3].acquire();
                        EstudioGOT.partes[3].acquire();
                        EstudioGOT.semaforos[3].release();
                        EstudioGOT.semaforos[3].release();
                        cont += 1;
                        this.isPlot = false;
                    }else{
                        EstudioGOT.partes[4].acquire();
                        EstudioGOT.partes[4].acquire();
                        EstudioGOT.semaforos[4].release();
                        EstudioGOT.semaforos[4].release();
                        this.isPlot = true;
                        cont = 1;
                    }
                    EstudioGOT.buscarPartes.release();
                    Thread.sleep(tiempo);
                    if(isPlot){
                        EstudioGOT.capitulosPlotListos += 1;
                        EstudioGOT.sumarEpisodioPlot();
                    }else{
                        EstudioGOT.capitulosListos += 1;
                        EstudioGOT.sumarEpisodio();
                    }
                    
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(EnsambladorGOT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                
            }else{
                Thread.yield();
            }
        }
    }
}
