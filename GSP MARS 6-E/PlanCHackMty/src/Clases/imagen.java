/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author cheko
 */
public class imagen extends JPanel{
    int x,y;
    int opcion;
    final static String ruta = "C:\\Users\\cheko\\OneDrive\\Escritorio\\Universidad\\PlanCHackMty\\src\\imagen\\planes.png";
    
    imagen(JPanel panel1){
        this.x = panel1.getWidth();
        this.y = panel1.getHeight();    
        this.setSize(x, y);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        ImageIcon img = new 
                ImageIcon(ruta);
                g.drawImage(img.getImage(),
                        0, 0,x,y, null);
    }
}
