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
    public static int capitulosListosPlot = 0;
    public static int ingreso = 0;
    public static int faltas = 0;
    public static int salario = 0;
    public static int salarioPm = 0;
    public static Semaphore[] semaforos = {new Semaphore(30), new Semaphore(25), new Semaphore(50), new Semaphore(55), new Semaphore(40)};
    public static Semaphore semaforoEnsamblador = new Semaphore(1);
    public static Semaphore revisarDia = new Semaphore(1);
    public static int [] partes = {0,        0,         0,          0,          0};
                                 //intro    //credito  //inicio    //cierre    //plot
    public static ProductorVelma[] intro;
    public static ProductorVelma[] credito;
    public static ProductorVelma[] inicio;
    public static ProductorVelma[] cierre;
    public static ProductorVelma[] plot;
    public static EnsambladorVelma[] ensamblador;
    Reloj reloj;
    public static Semaphore semaforoCountdown = new Semaphore(1);
    public static int countdown = 0;
    public static PMVelma Pmvelma;
    public static DirectorVelma director;
    
    public static float[] cantidadProdtuctores = {1, 1, 1, 1, 1, 1};
    public static int libres = 0;

    
    public EstudioVelma(int dia, int DiasdeLanzamiento){
        intro = llenarPuestos(dia/3, 0);
        credito = llenarPuestos(dia/3, 1);
        inicio = llenarPuestos(dia*4, 2);
        cierre = llenarPuestos(dia*3, 3);
        plot = llenarPuestos(dia*3, 4);
        ensamblador = llenarPuestosEnsamblador(dia*2);
        Pmvelma = new PMVelma(dia/4, (dia/1440)*22);
        director = new DirectorVelma(DiasdeLanzamiento, dia);
        reloj = new Reloj(dia);
        Pmvelma.start();
        director.start();
        reloj.start();
        
        intro[0].start();
        intro[0].running = true;
        
        credito[0].start();
        credito[0].running = true;
        
        inicio[0].start();
        inicio[0].running = true;
        
        cierre[0].start();
        cierre[0].running = true;
        
        plot[0].start();
        plot[0].running = true;
        
        
        ensamblador[0].start();
        ensamblador[1].start();
        ensamblador[0].running = true;
    
    }
    public static void cambiaDia(){
        Pmvelma.cambioDia = true;
        director.chequear = true;
        salario += 100;
    }
    
    public static void cambiaHora(){
        salarioPm += 7;
        salario += cantidadProdtuctores[0] * 5;
        salario += cantidadProdtuctores[1] * 3;
        salario += cantidadProdtuctores[2] * 7;
        salario += cantidadProdtuctores[3] * 7.5;
        salario += cantidadProdtuctores[4] * 10;
        salario += cantidadProdtuctores[5] * 8;   
    }
    public static ProductorVelma[] llenarPuestos(int tiempo, int tipo){
        ProductorVelma[] p = new ProductorVelma[12];
        
        for(int i = 0; i <= 11; i++){
            p[i] = new ProductorVelma(tiempo, tipo);
        }
        return p;
    }
     public static EnsambladorVelma[] llenarPuestosEnsamblador(int tiempo){
        EnsambladorVelma[] p = new EnsambladorVelma[12];
        
        for(int i = 0; i <= 11; i++){
            p[i] = new EnsambladorVelma(tiempo);
        }
        return p;
    }
    
}
