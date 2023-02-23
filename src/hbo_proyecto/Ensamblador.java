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
public class Ensamblador extends Thread {
    int tiempo;
    boolean running = false;
    int capPlot = 0;
    
    public Ensamblador(int t){
        this.tiempo = t;
    }
    
    public void run(){
        while (true){
            if(running){
                if(Estudio.partes[0]>=1 && Estudio.partes[1]>=1 && Estudio.partes[2]>=1 && Estudio.partes[3]>=1 && capPlot < 5){
                    //Intro                 credito                inicio                   cierre
                    try {
                        
                        Thread.sleep(tiempo);
                        capPlot += 1;
                        Estudio.capitulosListos +=1;
                        for(int i = 0; i <= 3; i++){
                            Estudio.semaforos[i].release();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }else if(Estudio.partes[0]>=1 && Estudio.partes[1]>=1 && Estudio.partes[2]>=1 && Estudio.partes[3]>=1 && Estudio.partes[4]>=1 && capPlot==5){
                    try {
                        
                        Thread.sleep(tiempo);
                        capPlot = 0;
                        Estudio.capitulosListos +=1;
                        for(int i = 0; i <= 4; i++){
                            Estudio.semaforos[i].release();
                        }
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Ensamblador.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }
}
