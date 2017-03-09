/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui;

import java.awt.BorderLayout;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
/**
 *Класс для главного окна приложения MainWindow
 * @author DOG1
 */
public class MainWindow extends JFrame{
    
    private static final int DEFAULT_WIDTH = 650;
    private static final int DEFAULT_HEIGHT = 500;
    //
    private UserPanel userPanel;
    private CalendarPanel claendarPanel;
    //
    private Connection connApp;
    
    /**
     * 
     * @param conn
     */
    public MainWindow(Connection conn){
        super();
        //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setText();                                             //*2
        //
        this.userPanel = new UserPanel();
        this.claendarPanel = new CalendarPanel();
        //
        this.connApp = conn;
    }
    
    //@param ResourceBundle messages
    public void setText(){
        this.setTitle("Your_tasks v1.0.0");
    }
    
    public UserPanel getUserPanel(){
        return this.userPanel;
    }
    
    public CalendarPanel getCalendarPanel(){
        return this.claendarPanel;
    }
    
    public synchronized void formGUI(){
        this.setLayout(new BorderLayout());                 //GroupLayout
        this.getUserPanel().formUserPanel();
        this.add(this.getUserPanel(), BorderLayout.WEST);
        this.getCalendarPanel().formCalendarPanel();
        this.add(this.getCalendarPanel(), BorderLayout.CENTER);
        //
        this.setVisible(true);
    }
    
    
}
