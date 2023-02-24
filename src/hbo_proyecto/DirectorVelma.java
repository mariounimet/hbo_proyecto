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
 * @author MARLON
 */
public class DirectorVelma extends Thread{
    
    boolean chequear = true;
    int resetDias;
    int duracion;
    
    public DirectorVelma(int dias, int duracion){
        this.resetDias = dias;
        this.duracion = duracion;
    }
    
    @Override
    public void run(){
        while(true){
            if(chequear){
                chequear = false;
                try {
                    EstudioVelma.estadoDirector("esperando para ver dia");
                    EstudioVelma.revisarDia.acquire();                   
                    int dia = EstudioGOT.contDia;
                    EstudioVelma.revisarDia.release();
                    if(dia > 0){
                        Random r1 = new Random();
                        Random r2 = new Random();
                        EstudioGOT.estadoDirector("nada");
                        Thread.sleep(r1.nextInt(duracion/2, (duracion*3)/4));
                        int aux = r2.nextInt(duracion/100, duracion/16);
                        EstudioVelma.estadoDirector("supervisar PM");
                        System.out.println(aux);
                        Thread.sleep(aux);                         
                        EstudioVelma.investigar();
                        
                    }else{
                        EstudioVelma.estadoDirector("lanzando episodios");
                        EstudioVelma.countdown = resetDias;
                        EstudioVelma.lanzar();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(DirectorVelma.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                Thread.yield();
            }
        }
    }
    
}
