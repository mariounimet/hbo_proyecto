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
<<<<<<< HEAD
    public static ProductorGOT[] intro;
    public static ProductorGOT[] credito;
    public static ProductorGOT[] inicio;
    public static ProductorGOT[] cierre;
    public static ProductorGOT[] plot;
=======
    public static Semaphore semaforoCountdown = new Semaphore(1);
    public static int countdown;
    public static Productor[] intro;
    public static Productor[] credito;
    public static Productor[] inicio;
    public static Productor[] cierre;
    public static Productor[] plot;
>>>>>>> 5d7b3ce4ec7e5260fab6817b8986caeaa8e2de76
    
    public EstudioVelma(){
        intro = llenarPuestos(1200, 0);
        credito = llenarPuestos(300, 1);
        inicio = llenarPuestos(2400, 2);
        cierre = llenarPuestos(3600, 3);
        plot = llenarPuestos(2400, 4);
    }
    
    public static ProductorGOT[] llenarPuestos(int tiempo, int tipo){
        ProductorGOT[] p = new ProductorGOT[6];
        
        for(int i = 0; i <= 5; i++){
            p[i] = new ProductorGOT(tiempo, tipo);
        }
        return p;
    }
    
}
