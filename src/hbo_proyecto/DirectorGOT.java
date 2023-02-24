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
public class DirectorGOT extends Thread{
    
    boolean chequear = true;
    int resetDias;
    int duracion;
    
    public DirectorGOT(int dias, int duracion){
        this.resetDias = dias;
        this.duracion = duracion;
    }
    
    @Override
    public void run(){
        while(true){
            if(chequear){
                chequear = false;
                try {
                    EstudioGOT.estadoDirector("esperando para ver dia");
                    EstudioGOT.revisarDia.acquire();                   
                    int dia = EstudioGOT.contDia;
                    EstudioGOT.revisarDia.release();
                    if(dia > 0){
                        Random r1 = new Random();
                        Random r2 = new Random();
                        EstudioGOT.estadoDirector("nada");
                        Thread.sleep(r1.nextInt(duracion/2, (duracion*3)/4));
                        int aux = r2.nextInt(duracion/100, duracion/16);
                        EstudioGOT.estadoDirector("supervisar PM");
                        Thread.sleep(aux);                         
                        EstudioGOT.investigar();
                        
                    }else{
                        EstudioGOT.estadoDirector("lanzando episodios");
                        EstudioGOT.contDia = resetDias;
                        EstudioGOT.lanzar();
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(DirectorGOT.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else{
                Thread.yield();
            }
        }
    }
    
}
