/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hbo_proyecto;

/**
 *
 * @author Mario
 */
public class Interface extends javax.swing.JFrame {

    public static Estudio est;
    public Interface(String nombre) {
        initComponents();
        this.titulo.setText(nombre);
        est = new Estudio();
    }

    private Interface() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        titulo = new javax.swing.JLabel();
        intro = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        masIntro = new javax.swing.JButton();
        menosIntro = new javax.swing.JButton();
        menosCredito = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        masCredito = new javax.swing.JButton();
        credito = new javax.swing.JLabel();
        menosPlot = new javax.swing.JButton();
        actividadDirector = new javax.swing.JLabel();
        plot = new javax.swing.JLabel();
        masPlot = new javax.swing.JButton();
        menosInicio = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        inicio = new javax.swing.JLabel();
        masInicio = new javax.swing.JButton();
        menosCierre = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cierre = new javax.swing.JLabel();
        masCierre = new javax.swing.JButton();
        menosEnsamblador = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        entrega = new javax.swing.JLabel();
        masEnsamblador = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        salarioPM = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ensamblador1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        actividadPM = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        plot3 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fallas1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        salario1 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        ganancia = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        epNormal = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        lanzados = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        epPlot = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo.setFont(new java.awt.Font("Dialog", 0, 36)); // NOI18N
        titulo.setText("Serie");
        jPanel1.add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 220, 50));

        intro.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        intro.setText("0");
        jPanel1.add(intro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel3.setText("Intro:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        masIntro.setText("+");
        masIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masIntroActionPerformed(evt);
            }
        });
        jPanel1.add(masIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 50, 20));

        menosIntro.setText("-");
        menosIntro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosIntroActionPerformed(evt);
            }
        });
        jPanel1.add(menosIntro, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 50, 20));

        menosCredito.setText("-");
        menosCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(menosCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 50, 20));

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel4.setText("Crédito:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        masCredito.setText("+");
        masCredito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masCreditoActionPerformed(evt);
            }
        });
        jPanel1.add(masCredito, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 50, 20));

        credito.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        credito.setText("0");
        jPanel1.add(credito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        menosPlot.setText("-");
        menosPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosPlotActionPerformed(evt);
            }
        });
        jPanel1.add(menosPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 50, 20));

        actividadDirector.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        actividadDirector.setText("init");
        jPanel1.add(actividadDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 250, -1));

        plot.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        plot.setText("0");
        jPanel1.add(plot, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, -1, -1));

        masPlot.setText("+");
        masPlot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masPlotActionPerformed(evt);
            }
        });
        jPanel1.add(masPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, 50, 20));

        menosInicio.setText("-");
        menosInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosInicioActionPerformed(evt);
            }
        });
        jPanel1.add(menosInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 50, 20));

        jLabel6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel6.setText("Inicio:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        inicio.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        inicio.setText("0");
        jPanel1.add(inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        masInicio.setText("+");
        masInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masInicioActionPerformed(evt);
            }
        });
        jPanel1.add(masInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 50, 20));

        menosCierre.setText("-");
        menosCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosCierreActionPerformed(evt);
            }
        });
        jPanel1.add(menosCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 50, 20));

        jLabel7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel7.setText("Cierre:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        cierre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cierre.setText("0");
        jPanel1.add(cierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, -1, -1));

        masCierre.setText("+");
        masCierre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masCierreActionPerformed(evt);
            }
        });
        jPanel1.add(masCierre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 50, 20));

        menosEnsamblador.setText("-");
        menosEnsamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menosEnsambladorActionPerformed(evt);
            }
        });
        jPanel1.add(menosEnsamblador, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 50, 20));

        jLabel8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel8.setText("Salario PM: $");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 90, -1));

        entrega.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        entrega.setText("0");
        jPanel1.add(entrega, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 80, -1));

        masEnsamblador.setText("+");
        masEnsamblador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                masEnsambladorActionPerformed(evt);
            }
        });
        jPanel1.add(masEnsamblador, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 240, 50, 20));

        jLabel9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel9.setText("Libres:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        salarioPM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        salarioPM.setText("0");
        jPanel1.add(salarioPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, -1));

        jLabel10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel10.setText("Ensamblador:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        ensamblador1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ensamblador1.setText("0");
        jPanel1.add(ensamblador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel11.setText("Plot twist:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel12.setText("Director:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel13.setText("Fallas de PM: ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        actividadPM.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        actividadPM.setText("init");
        jPanel1.add(actividadPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 250, -1));

        jLabel14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel14.setText("PM:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, -1, -1));

        plot3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        plot3.setText("0");
        jPanel1.add(plot3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, -1, -1));

        jLabel15.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel15.setText("Días para entrega:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 220, -1));

        fallas1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        fallas1.setText("0");
        jPanel1.add(fallas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, -1, -1));

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel5.setText("Distribución de empleados");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel16.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel16.setText("Gasto en salario mensual: $");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 330, -1));

        salario1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        salario1.setText("0");
        jPanel1.add(salario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 180, -1));

        jLabel17.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel17.setText("Ganancias totales: $");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, 240, -1));

        ganancia.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        ganancia.setText("0");
        jPanel1.add(ganancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, 170, -1));

        jLabel18.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jLabel18.setText("(anterior lote)");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, 100, -1));

        jLabel19.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel19.setText("- Normales:");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 140, -1));

        epNormal.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        epNormal.setText("0");
        jPanel1.add(epNormal, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 80, -1));

        jLabel20.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel20.setText("- Plot twist:");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 140, -1));

        lanzados.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        lanzados.setText("0");
        jPanel1.add(lanzados, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, 80, -1));

        jLabel21.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel21.setText("Episodios listos:");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 220, -1));

        jLabel22.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel22.setText("Episodios lanzados:");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, 240, -1));

        epPlot.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        epPlot.setText("0");
        jPanel1.add(epPlot, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 80, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void masIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masIntroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masIntroActionPerformed

    private void menosIntroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosIntroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosIntroActionPerformed

    private void menosCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosCreditoActionPerformed

    private void masCreditoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masCreditoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masCreditoActionPerformed

    private void menosPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosPlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosPlotActionPerformed

    private void masPlotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masPlotActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masPlotActionPerformed

    private void menosInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosInicioActionPerformed

    private void masInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masInicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masInicioActionPerformed

    private void menosCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosCierreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosCierreActionPerformed

    private void masCierreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masCierreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masCierreActionPerformed

    private void menosEnsambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menosEnsambladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menosEnsambladorActionPerformed

    private void masEnsambladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_masEnsambladorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_masEnsambladorActionPerformed

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
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel actividadDirector;
    public static javax.swing.JLabel actividadPM;
    public static javax.swing.JLabel cierre;
    public static javax.swing.JLabel credito;
    public static javax.swing.JLabel ensamblador1;
    public static javax.swing.JLabel entrega;
    public static javax.swing.JLabel epNormal;
    public static javax.swing.JLabel epPlot;
    public static javax.swing.JLabel fallas1;
    public static javax.swing.JLabel ganancia;
    public static javax.swing.JLabel inicio;
    public static javax.swing.JLabel intro;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JLabel lanzados;
    private javax.swing.JButton masCierre;
    private javax.swing.JButton masCredito;
    private javax.swing.JButton masEnsamblador;
    private javax.swing.JButton masInicio;
    private javax.swing.JButton masIntro;
    private javax.swing.JButton masPlot;
    private javax.swing.JButton menosCierre;
    private javax.swing.JButton menosCredito;
    private javax.swing.JButton menosEnsamblador;
    private javax.swing.JButton menosInicio;
    private javax.swing.JButton menosIntro;
    private javax.swing.JButton menosPlot;
    public static javax.swing.JLabel plot;
    public static javax.swing.JLabel plot3;
    public static javax.swing.JLabel salario1;
    public static javax.swing.JLabel salarioPM;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
