
package Collision;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


public class ImagenPosicion {
    public int x = 800;
    public int y = 300;
    public JPanel jpanel1;
    
    
    
    public ImagenPosicion(JPanel Panel2){
        jpanel1 = Panel2;
    }
            
    public void draw(JPanel pane, int x, int y, String ArrayImagenes){
        this.jpanel1 = pane;
        this.x = x;
        this.y = y;
        ImageIcon img = new ImageIcon(ArrayImagenes);
        pane.getGraphics().drawImage(img.getImage(), x, y, null);
    }
    
    public void cuadrado(JPanel jpanel){
        jpanel.getGraphics().setColor(Color.red);
        jpanel.getGraphics().fillRect(x,y, 150, 150);
        jpanel.update(jpanel.getGraphics());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
}
