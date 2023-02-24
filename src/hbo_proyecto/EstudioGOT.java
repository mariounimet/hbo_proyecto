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
public class EstudioGOT {
    public static int capitulosListos = 0;
    public static int capitulosPlotListos = 0;
    public static int contDia = 0;
    public static int ingresos = 0;
    
    public static int faltas = 0;
    public static int salario = 0;
    public static int salarioPm = 0;
    public static int salarioMes = 0;
    
    
    public static Semaphore buscarPartes = new Semaphore(1);
    public static Semaphore revisarDia = new Semaphore(1);
    public static Semaphore[] semaforos = {new Semaphore(30), new Semaphore(25), new Semaphore(50), new Semaphore(55), new Semaphore(40)};
    public static Semaphore[] partes = {new Semaphore(0), new Semaphore(0), new Semaphore(0), new Semaphore(0), new Semaphore(0)};
                                            //intro             //credito       //inicio            //cierre        //plot
    public static ProductorGOT[] intro;
    public static ProductorGOT[] credito;
    public static ProductorGOT[] inicio;
    public static ProductorGOT[] cierre;
    public static ProductorGOT[] plot;
    public static EnsambladorGOT[] ensamblador;
    
    public static Reloj reloj;
    
    public static PMGOT pm;
    public static DirectorGOT director;
    
    public static int[] cantidadProdtuctores = {1, 1, 1, 1, 1, 1};
    public static int libres = 0;
    
    public EstudioGOT(int dia, int diasLanzamiento){
        capitulosListos = 0;
        contDia = diasLanzamiento;
        
        InterfaceGOT.entrega.setText(String.valueOf(contDia));
        
        intro = llenarPuestos(dia, 0);
        credito = llenarPuestos(dia/4, 1);
        inicio = llenarPuestos(dia*2, 2);
        cierre = llenarPuestos(dia*4, 3);
        plot = llenarPuestos(dia*2, 4);
        ensamblador = llenarPuestosEnsambladores(dia*2);
        
        pm = new PMGOT(dia/12, dia/90);
        director = new DirectorGOT(diasLanzamiento, dia);
        reloj = new Reloj(dia);
        
        InterfaceGOT.intro.setText(String.valueOf(cantidadProdtuctores[0]));
        InterfaceGOT.credito.setText(String.valueOf(cantidadProdtuctores[1]));
        InterfaceGOT.inicio.setText(String.valueOf(cantidadProdtuctores[2]));
        InterfaceGOT.cierre.setText(String.valueOf(cantidadProdtuctores[3]));
        InterfaceGOT.plot.setText(String.valueOf(cantidadProdtuctores[4]));
        InterfaceGOT.ensamblador1.setText(String.valueOf(cantidadProdtuctores[5]));
        
        pm.start();
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
    public static void sumarEpisodio(){
        InterfaceGOT.epNormal.setText(String.valueOf(capitulosListos));
    }
    public static void sumarEpisodioPlot(){
        InterfaceGOT.epPlot.setText(String.valueOf(capitulosPlotListos));
    }
    
    public static void lanzar(){
        InterfaceGOT.lanzados.setText(String.valueOf(capitulosListos + capitulosPlotListos));
        
        int vistas;
        vistas = (int) ((capitulosListos + capitulosPlotListos)*980000)/150000;
        ingresos = vistas * 100000;
        int anterior = Integer.parseInt(InterfaceGOT.ganancia.getText());
        int nuevo = anterior+ingresos-salario-salarioPm;
        InterfaceGOT.ganancia.setText(String.valueOf(nuevo));
        
        capitulosListos = 0;
        capitulosPlotListos = 0;
    }
    
    public static boolean investigar(){
        if (pm.rickMorty){
            faltas += 1;
            salarioPm -= 1;
            InterfaceGOT.fallas1.setText(String.valueOf(faltas));
            return false;
        }
        return true;
    }
    
    public static void cambiaDia(){
        pm.cambioDia = true;
        director.chequear = true;
        salario += 100;
        
        if (reloj.contDias == 30){
            InterfaceGOT.salario1.setText(String.valueOf(salarioMes));
            salarioMes =0;
        }
    }
    
    public static void cambiaContDia(){
        InterfaceGOT.entrega.setText(String.valueOf(contDia));
    }
    
    public static void cambiaHora(){
        salarioPm += 7;
        salario += cantidadProdtuctores[0] * 5;
        salario += cantidadProdtuctores[1] * 3;
        salario += cantidadProdtuctores[2] * 7;
        salario += cantidadProdtuctores[3] * 7.5;
        salario += cantidadProdtuctores[4] * 10;
        salario += cantidadProdtuctores[5] * 8;
        
      
        salarioMes += cantidadProdtuctores[0] * 5;
        salarioMes += cantidadProdtuctores[1] * 3;
        salarioMes += cantidadProdtuctores[2] * 7;
        salarioMes += cantidadProdtuctores[3] * 7.5;
        salarioMes += cantidadProdtuctores[4] * 10;
        salarioMes += cantidadProdtuctores[5] * 8;
        
        InterfaceGOT.salarioPM.setText(String.valueOf(salarioPm));
    }
    
    
    
    public static void estadoDirector(String msg){
        InterfaceGOT.actividadDirector.setText(msg);
    }
    
    public static void estadoPM(String msg){
        InterfaceGOT.actividadPM.setText(msg);
    }
    
    public static ProductorGOT[] llenarPuestos(int tiempo, int tipo){
        ProductorGOT[] p = new ProductorGOT[6];
        
        for(int i = 0; i <= 5; i++){
            p[i] = new ProductorGOT(tiempo, tipo);
        }
        return p;
    }
    
    public static EnsambladorGOT[] llenarPuestosEnsambladores(int tiempo){
        EnsambladorGOT[] p = new EnsambladorGOT[6];
        
        for(int i = 0; i <= 5; i++){
            p[i] = new EnsambladorGOT(tiempo);
        }
        return p;
    }
    
    public static void restarIntro(){
        if (cantidadProdtuctores[0] > 1){
            intro[cantidadProdtuctores[0]-1].running = false;
            cantidadProdtuctores[0] -= 1;
        }
    }
    
    public static void sumarIntro(){
        if (libres > 0){
            intro[cantidadProdtuctores[0]-1].running = true;
            cantidadProdtuctores[0]+= 1;
        }
    }
    public static void restarCredito(){
        if (cantidadProdtuctores[1] > 1){
            credito[cantidadProdtuctores[1]-1].running = false;
            cantidadProdtuctores[1] -= 1;
            libres += 1;
        }
    }
    
    public static void sumarCredito(){
        if (libres > 0){
            credito[cantidadProdtuctores[1]-1].running = true;
            cantidadProdtuctores[1]+= 1;
        }
    }
    public static void restarInicio(){
        if (cantidadProdtuctores[2] > 1){
            inicio[cantidadProdtuctores[2]-1].running = false;
            cantidadProdtuctores[2] -= 1;
            libres += 1;
        }
    }
    
    public static void sumarInicio(){
        if (libres > 0){
            inicio[cantidadProdtuctores[2]-1].running = true;
            cantidadProdtuctores[2]+= 1;
        }
    }
    public static void restarCierre(){
        if (cantidadProdtuctores[3] > 1){
            cierre[cantidadProdtuctores[3]-1].running = false;
            cantidadProdtuctores[3] -= 1;
            libres += 1;
        }
    }
    
    public static void sumarCierre(){
        if (libres > 0){
            cierre[cantidadProdtuctores[3]-1].running = true;
            cantidadProdtuctores[3]+= 1;
        }
    }
    public static void restarPlot(){
        if (cantidadProdtuctores[4] > 1){
            plot[cantidadProdtuctores[4]-1].running = false;
            cantidadProdtuctores[4] -= 1;
            libres += 1;
        }
    }
    
    public static void sumarPlot(){
        if (libres > 0){
            plot[cantidadProdtuctores[4]-1].running = true;
            cantidadProdtuctores[4]+= 1;
        }
    }
    public static void restarEnsamblador(){
        if (cantidadProdtuctores[5] > 1){
            ensamblador[cantidadProdtuctores[5]-1].running = false;
            cantidadProdtuctores[5] -= 1;
            libres += 1;
        }
    }
    
    public static void sumarEnsamblador(){
        if (libres > 0){
            ensamblador[cantidadProdtuctores[5]-1].running = true;
            cantidadProdtuctores[5]+= 1;
        }
    }
}
