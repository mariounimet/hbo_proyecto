/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo_proyecto;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Mario
 */
public class Main {
    public static int capitulosListos = 0;
    public static Semaphore[] semaforos = {new Semaphore(30), new Semaphore(25), new Semaphore(50), new Semaphore(55), new Semaphore(40)};
    public static int [] partes = {0,        0,         0,          0,          0};
                                 //intro    //credito  //inicio    //cierre    //plot
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Productor p = new Productor(0, 0);
        Productor p2 = new Productor(0, 0);
        Productor p3 = new Productor(0, 0);
        Productor p4 = new Productor(0, 0);

        p.start();
        p2.start();
        p3.start();
        p4.start();
    }
    
    public static void cambiar(){
        System.out.println("cambiado");
    }
    
}
