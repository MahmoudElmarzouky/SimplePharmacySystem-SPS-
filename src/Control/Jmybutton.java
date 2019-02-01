
package Control;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author mahmoud magdy
 */
public class Jmybutton extends JButton{
    public Jmybutton  (){
    setOpaque(false);
    setContentAreaFilled(false);
    setForeground(Color.white); 
    setCursor(new Cursor(Cursor.HAND_CURSOR));//دى علشان اما احد الماوس على الزرار يظهر علامة يد 
    
    }
    
    @Override
    protected void paintComponent(Graphics g){
    g.setColor(new Color(70 , 130 , 180));
    g.fillRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
    super.paintComponent(g);
    }
    @Override
    protected void paintBorder(Graphics g){
    g.setColor(Color.blue);
    g.drawRoundRect(0, 0, getWidth()-1, getHeight()-1, 20, 20);
   
    }    
}
