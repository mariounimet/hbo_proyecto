/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbo_proyecto;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis Domingos
 */
public class ProjectManager extends Thread {
    boolean cambioDeDia;
    boolean RickandMorty;
    boolean sprintReviews;
    int accion;
    int tiempo;
    int intervalo;
    int contadorHoras = 0;
    int dia;
    public ProjectManager(int tiempo, int intervalo, int dia){
        this.intervalo = intervalo;
        this.tiempo = tiempo;
        this.dia = dia;
    }
    
    @Override
    public void run(){
        while (true){
            
            if(contadorHoras>=dia){
                try {
                    EstudioVelma.semaforoCountdown.acquire();
                    Thread.sleep(tiempo);
                    EstudioVelma.countdown -= 1;
                } catch (InterruptedException ex) {
                    Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                }
                EstudioVelma.semaforoCountdown.release();
                contadorHoras += tiempo;
            }else{
                Random r = new Random();
                accion = r.nextInt(2)+1;
                if(accion == 1){
                    RickandMorty = true;
                    try {
                        Thread.sleep(intervalo);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    RickandMorty = false;
                    contadorHoras += intervalo;
                }
                else if(accion == 2){
                    sprintReviews = true;
                    try {
                        Thread.sleep(intervalo);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(ProjectManager.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    sprintReviews = false;
                    contadorHoras += intervalo;
                }
            }
        }
    }
}
