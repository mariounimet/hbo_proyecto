/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo_proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class Menu extends javax.swing.JFrame {

    InterfaceGOT int1;
    InterfaceGOT int2;
    int Duradia;
    int Diaslanzamiento;
    int pIntro;
    int pCredito;
    int PInicio;
    int pCierre;
    int pPlot;
    int Ensamblador;
    
    public Menu() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        serie2 = new javax.swing.JLabel();
        serie1 = new javax.swing.JLabel();
        importar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        intro1 = new javax.swing.JLabel();
        credito1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inicio1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cierre1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        plot1 = new javax.swing.JLabel();
        ensamblador1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        intro2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        credito2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        inicio2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cierre2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        plot2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        duracion = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        ensamblador3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        duracion1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        intro3 = new javax.swing.JLabel();
        credito3 = new javax.swing.JLabel();
        inicio3 = new javax.swing.JLabel();
        cierre3 = new javax.swing.JLabel();
        plot3 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        serie2.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        serie2.setText("Serie 2");
        jPanel1.add(serie2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        serie1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        serie1.setText("Serie 1");
        jPanel1.add(serie1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        importar.setText("Importar datos");
        importar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarActionPerformed(evt);
            }
        });
        jPanel1.add(importar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, -1, -1));

        jLabel1.setText("Intro:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        intro1.setText("0");
        jPanel1.add(intro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        credito1.setText("0");
        jPanel1.add(credito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        jLabel2.setText("Crédito:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));

        jLabel3.setText("Inicio:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        inicio1.setText("0");
        jPanel1.add(inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, -1, -1));

        jLabel4.setText("Cierre:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        cierre1.setText("0");
        jPanel1.add(cierre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, -1, -1));

        jLabel5.setText("Plot::");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        plot1.setText("0");
        jPanel1.add(plot1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, -1));

        ensamblador1.setText("0");
        jPanel1.add(ensamblador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, -1, -1));

        jLabel6.setText("Ensamblador:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel7.setText("Intro:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        intro2.setText("0");
        jPanel1.add(intro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 70, -1, -1));

        jLabel8.setText("Crédito:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        credito2.setText("0");
        jPanel1.add(credito2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 90, -1, -1));

        jLabel9.setText("Inicio:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        inicio2.setText("0");
        jPanel1.add(inicio2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, -1, -1));

        jLabel10.setText("Cierre:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, -1, -1));

        cierre2.setText("0");
        jPanel1.add(cierre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, -1, -1));

        jLabel11.setText("Plot::");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, -1, -1));

        plot2.setText("0");
        jPanel1.add(plot2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel12.setText("Ensamblador:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        duracion.setText("0");
        jPanel1.add(duracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, -1, -1));

        jLabel13.setText("Duración de día:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        ensamblador3.setText("0");
        jPanel1.add(ensamblador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel14.setText("Días entre lanzamientos:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        duracion1.setText("0");
        jPanel1.add(duracion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, -1, -1));

        jLabel15.setText("Drive GB");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel16.setText("Intro:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        jLabel17.setText("Crédito:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel18.setText("Inicio:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, -1, -1));

        jLabel19.setText("Cierre:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        intro3.setText("0");
        jPanel1.add(intro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, -1, -1));

        credito3.setText("0");
        jPanel1.add(credito3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, -1, -1));

        inicio3.setText("0");
        jPanel1.add(inicio3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, -1, -1));

        cierre3.setText("0");
        jPanel1.add(cierre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 300, -1, -1));

        plot3.setText("0");
        jPanel1.add(plot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));

        jLabel20.setText("Plot::");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 340, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarActionPerformed
        String line;
        String txt = "";

        JFileChooser archivo = new JFileChooser();
        int seleccion;
        seleccion = archivo.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String nameArchivo = archivo.getSelectedFile().getAbsolutePath();
            File archivoTxt = new File(nameArchivo);
            
            try{
                FileReader fr = new FileReader(archivoTxt);
                if (fr.ready()){
                    BufferedReader br = new BufferedReader(fr);
                     while ((line = br.readLine()) != ";"){
                        if (!line.isEmpty()) {
                            txt += line + "\n";
                        }
                     }
                     if (!txt.isEmpty()) {
                         String[] txtSplit = txt.split("\n");
                         for (int i = 0; i < txtSplit.length; i++){
                             String[] lectura = txt.split(": ");
                             if(lectura[0] == "Duracion de 1 dia en segundos"){
                                String duracionDia = lectura[1];
                                this.Duradia = Integer.parseInt(duracionDia);
                                
                             }else if(lectura[0] == "Cantidad de dias entre lanzamientos"){
                                String DiasLanzamiento = lectura[1];
                                this.Diaslanzamiento = Integer.parseInt(DiasLanzamiento);
             
                             }else if(lectura[0] == "Cantidad de productores de intro"){
                                String pIntro = lectura[1];
                                this.pIntro = Integer.parseInt(pIntro);
                                
                             }else if(lectura[0] == "Cantidad de productores de credito"){
                                 String pCredito = lectura[1];
                                 this.pCredito = Integer.parseInt(pCredito);
                                 
                             }else if(lectura[0] == "Cantidad de productores de inicio"){
                                 String pInicio = lectura[1];
                                 this.PInicio = Integer.parseInt(pInicio);
                                 
                             }else if(lectura[0] == "Cantidad de productores de cierre"){
                                 String pCierre = lectura[1];
                                 this.pCierre = Integer.parseInt(pCierre);
                                 
                             }else if(lectura[0] == "Cantidad de productores de plot twist"){
                                 String pPlot = lectura[1];
                                 this.pPlot = Integer.parseInt(pPlot);
                                 
                             }else if(lectura[0] == "Cantidad inicial de ensambladores"){
                                 String Ensamblador = lectura[1];
                                 this.Ensamblador = Integer.parseInt(Ensamblador);
                             }
                        }
                        br.close();
                        JOptionPane.showMessageDialog(null, "Se ha cargado el archivo correctamente");
                     }
                }else{
                    JOptionPane.showMessageDialog(null, "El archivo no esta listo para ser leido");
                    
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Archivo no compatible");
            }
        }
    }//GEN-LAST:event_importarActionPerformed
      
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int1 = new InterfaceGOT("GOT");
        //int2 = new InterfaceVelma("Velma");
        int1.setVisible(true);
        //int2.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cierre1;
    private javax.swing.JLabel cierre2;
    private javax.swing.JLabel cierre3;
    private javax.swing.JLabel credito1;
    private javax.swing.JLabel credito2;
    private javax.swing.JLabel credito3;
    private javax.swing.JLabel duracion;
    private javax.swing.JLabel duracion1;
    private javax.swing.JLabel ensamblador1;
    private javax.swing.JLabel ensamblador3;
    private javax.swing.JButton importar;
    private javax.swing.JLabel inicio1;
    private javax.swing.JLabel inicio2;
    private javax.swing.JLabel inicio3;
    private javax.swing.JLabel intro1;
    private javax.swing.JLabel intro2;
    private javax.swing.JLabel intro3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel plot1;
    private javax.swing.JLabel plot2;
    private javax.swing.JLabel plot3;
    private javax.swing.JLabel serie1;
    private javax.swing.JLabel serie2;
    // End of variables declaration//GEN-END:variables
}
