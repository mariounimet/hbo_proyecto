/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hbo_proyecto;

import java.util.concurrent.Semaphore;

/**
 *
 * @author Luis Domingos
 */
public class EstudioVelma {
    public static int capitulosListos = 0;
    public static Semaphore[] semaforos = {new Semaphore(30), new Semaphore(25), new Semaphore(50), new Semaphore(55), new Semaphore(40)};
    public static Semaphore semaforoEnsamblador = new Semaphore(1);
    public static int [] partes = {0,        0,         0,          0,          0};
                                 //intro    //credito  //inicio    //cierre    //plot
    public static Productor[] intro;
    public static Productor[] credito;
    public static Productor[] inicio;
    public static Productor[] cierre;
    public static Productor[] plot;
    
    public EstudioVelma(){
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
