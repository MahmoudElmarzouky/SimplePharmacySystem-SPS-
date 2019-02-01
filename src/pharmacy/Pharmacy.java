/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacy;

import View.Frames.*;
import View.Panel.*;
import javax.swing.JFrame;

/**
 *
 * @author 20120
 */
public class Pharmacy {

    public static void main(String[] args) {
   Items c =   new Items();
        JFrame f=new  JFrame();
        f.add(c);
         
        f.setSize(1113,635);
        f.setVisible(true);
    }
    
}
