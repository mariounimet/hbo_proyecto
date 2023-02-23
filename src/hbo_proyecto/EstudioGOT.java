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
    
    public static PMGOT pm;
    public static DirectorGOT director;
    
    public static float[] cantidadProdtuctores = {1, 1, 1, 1, 1, 1};
    public static int libres = 0;
    
    public EstudioGOT(int dia, int diasLanzamiento){
        capitulosListos = 0;
        contDia = diasLanzamiento;
        
        intro = llenarPuestos(dia, 0);
        credito = llenarPuestos(dia/4, 1);
        inicio = llenarPuestos(dia*2, 2);
        cierre = llenarPuestos(dia*4, 3);
        plot = llenarPuestos(dia*2, 4);
        ensamblador = llenarPuestosEnsambladores(dia*2);
        
        pm = new PMGOT(dia/12, dia/90);
        director = new DirectorGOT(diasLanzamiento, dia);
        
        pm.start();
        director.start();
        
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
        ingresos = vistas * 100;
        int anterior = Integer.parseInt(InterfaceGOT.ganancia.getText());
        int nuevo = anterior+ingresos-salario-salarioPm;
        InterfaceGOT.ganancia.setText(String.valueOf(nuevo));
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
    
    public static void estadoDirector(String msg){
        InterfaceGOT.actividadDirector.setText(msg);
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
}
