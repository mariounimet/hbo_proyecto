/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo_proyecto;

import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/** probando git
 *
 * @author Mario
 */
public class Estudio {
    public static int capitulosListos = 25;
    public static Semaphore[] semaforos = {new Semaphore(30), new Semaphore(25), new Semaphore(50), new Semaphore(55), new Semaphore(40)};
    public static int [] partes = {0,        0,         0,          0,          0};
                                 //intro    //credito  //inicio    //cierre    //plot
    public static Productor[] intro;
    public static Productor[] credito;
    public static Productor[] inicio;
    public static Productor[] cierre;
    public static Productor[] plot;
    
    public Estudio(){
        capitulosListos = 5;
        
        intro = llenarPuestos(1200, 0);
        credito = llenarPuestos(300, 1);
        inicio = llenarPuestos(2400, 2);
        cierre = llenarPuestos(3600, 3);
        plot = llenarPuestos(2400, 4);
        
    }
    
    public static Productor[] llenarPuestos(int tiempo, int tipo){
        Productor[] p = new Productor[6];
        
        for(int i = 0; i <= 5; i++){
            p[i] = new Productor(tiempo, tipo);
        }
        return p;
    }
    
}
