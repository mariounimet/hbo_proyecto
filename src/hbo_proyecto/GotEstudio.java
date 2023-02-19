/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo_proyecto;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Mario
 */
public class GotEstudio {
    public static int capitulosListos = 0;
    public static Semaphore[] semaforos = {new Semaphore(30), new Semaphore(25), new Semaphore(50), new Semaphore(55), new Semaphore(40)};
    public static int [] partes = {0,        0,         0,          0,          0};
                                 //intro    //credito  //inicio    //cierre    //plot
    public static Productor[] intro= new Productor[6];
    public static Productor[] credito= new Productor[6];
    public static Productor[] inicio= new Productor[6];
    public static Productor[] cierre= new Productor[6];
    public static Productor[] plot= new Productor[6];
    
    public void GotEstudio(){
        intro = llenarPuestos(1200, 0);
        credito = llenarPuestos(300, 1);
        inicio = llenarPuestos(2400, 2);
        cierre = llenarPuestos(3600, 3);
        plot = llenarPuestos(2400, 4);
        
        
        
    }
    
    public Productor[] llenarPuestos(int tiempo, int tipo){
        Productor[] p = new Productor[6];
        
        for(int i = 0; i <= 6; i++){
            p[i] = new Productor(tiempo, tipo);
        }
        return p;
    }
    
}
