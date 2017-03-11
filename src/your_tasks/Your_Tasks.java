/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks;

import java.awt.EventQueue;
import javax.swing.SwingUtilities;
import your_tasks.gui.MainWindow;
/**
 *
 * @author DOG1
 */
public class Your_Tasks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindow mainWin = new MainWindow(null);
        
        //
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                mainWin.formGUI();
            }
        });
        //
    }
    
}
