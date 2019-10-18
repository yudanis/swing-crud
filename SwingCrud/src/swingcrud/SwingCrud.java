/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingcrud;

import javax.swing.JFrame;
import javax.swing.JPanel;
import swingcrud.controler.MyCrudControler;

/**
 *
 * @author ytr
 */
public class SwingCrud {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyCrudControler controller = new MyCrudControler();
        JFrame frame = new JFrame();
        JPanel dlg = controller.GetCrudPanel();
        frame.setContentPane(dlg);
        frame.setSize(dlg.getPreferredSize());
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
