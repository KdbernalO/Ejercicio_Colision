/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Collision;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Timer;
import java.util.TimerTask;


/**
 *
 * @author Usuario
 */
public class VentanaColision extends javax.swing.JFrame {

    public int x, y ,j;
    Dibujar dibujo;
    ImagenPosicion posimagen;
    ImagenPosicion cuadro;
    String[] imagenes = new String [6];
    Timer timer;
    
            
    public VentanaColision() {
        initComponents();
        setLocationRelativeTo(null);
        x = 10;
        y = 10;
        j = 0;
        Panel1.setBackground(Color.WHITE);
        posimagen = new ImagenPosicion(Panel1);
        dibujo = new Dibujar(Panel1);
        cuadro = new ImagenPosicion(Panel1);
        
        dibujo.start();
        
        imagenes[0]="C:/Users/Estudiantes/Documents/NetBeansProjects/CollisionEjercicio/src/Imagenes/Imagen1.png";
        imagenes[1]="C:/Users/Estudiantes/Documents/NetBeansProjects/CollisionEjercicio/src/Imagenes/Imagen2.png";
        imagenes[2]="C:/Users/Estudiantes/Documents/NetBeansProjects/CollisionEjercicio/src/Imagenes/Imagen3.png";
        imagenes[3]="C:/Users/Estudiantes/NetBeansProjects/CollisionEjercicio/src/Imagenes/Imagen4.png";
        imagenes[4]="C:/Users/Estudiantes/Documents/NetBeansProjects/CollisionEjercicio/src/Imagenes/Imagen5.png";
        imagenes[5]="C:/Users/Estudiantes/Documents/NetBeansProjects/CollisionEjercicio/src/Imagenes/Imagen6.png";
        
        timer = new Timer();
        
        timer.schedule(new Tarea(), 0, 10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 700));
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        Panel1.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (68 == evt.getKeyCode()){
            x += 10;
        }
        if (65 == evt.getKeyCode()){
            x -= 10;
        }
        if (87 == evt.getKeyCode()){
            y -= 10;
        }
        if (83 == evt.getKeyCode()){
            y += 10;
        }
        j++;
        if ( j == 15){
            j = 0;
        }
        
    }//GEN-LAST:event_formKeyPressed

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
            java.util.logging.Logger.getLogger(VentanaColision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaColision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaColision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaColision.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VentanaColision().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    // End of variables declaration//GEN-END:variables
    private class Tarea extends TimerTask{

        @Override
        public void run() {
            posimagen.draw(Panel1, x, y, imagenes[j / 5]);
            cuadro.cuadrado(Panel1);
        }
        
    }
}
