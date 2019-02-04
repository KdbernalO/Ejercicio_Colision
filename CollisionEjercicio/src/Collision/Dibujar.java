
package Collision;


import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;


public class Dibujar extends Thread {

    
    public JPanel panel;
    
    public Dibujar(JPanel pn){
        panel = pn;
    }
    
    @Override
    public void run(){
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while (true) {
            try {
                panel.update(panel.getGraphics());
                Dibujar.sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(Dibujar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
