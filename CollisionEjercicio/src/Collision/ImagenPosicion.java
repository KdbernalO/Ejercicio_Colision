
package Collision;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class ImagenPosicion {
    public int x = 800;
    public int y = 300;
    public JPanel jpanel1;
    public JLabel labelMuro;
    public ImageIcon imagenMuro;
    public int alto_Muro;
    public int ancho_Muro;
    public int alto_Imagen;
    public int ancho_Imagen;
    
    
    public ImagenPosicion(JPanel Panel2){
        jpanel1 = Panel2;
    }
            
    public void draw(JPanel pane, int x, int y, String ArrayImagenes){
        this.jpanel1 = pane;
        this.x = x;
        this.y = y;
        ImageIcon img = new ImageIcon(ArrayImagenes);
        alto_Imagen = img.getIconHeight();
        ancho_Imagen = img.getIconWidth();
        pane.getGraphics().drawImage(img.getImage(), x, y, null);
    }
    
    public void cuadrado(JPanel jpanel){
        imagenMuro = new ImageIcon("C:/Users/Usuario/Documents/NetBeansProjects/Ejercicio_Colision-master/CollisionEjercicio/src/Imagenes/Muro.jpg");
        labelMuro = new JLabel ();
        labelMuro.setBounds(x, y, 150,150);
        labelMuro.setIcon(new ImageIcon(imagenMuro.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
        alto_Muro = labelMuro.getHeight();
        ancho_Muro = labelMuro.getWidth();
        jpanel.add(labelMuro);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    
}
