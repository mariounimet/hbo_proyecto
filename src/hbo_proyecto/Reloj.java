/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbo_proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MARLON
 */
public class Reloj extends Thread{
    
    int hora;
    int contador = 0;
    int contDias = 0;
    
    public Reloj(int duracion){
        this.hora = duracion/24;
    }
    
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(hora);
            } catch (InterruptedException ex) {
                Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
            }
            contador += 1;
                EstudioGOT.cambiaHora();
            
            if(contador == 24){
                EstudioGOT.cambiaDia();
                contDias += 1;
                contador = 0;
            }
        }
    }
}
