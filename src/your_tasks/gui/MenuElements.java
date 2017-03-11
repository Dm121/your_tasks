/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
/**
 *Класс для описания меню, используемого в приложении
 * @author DOG1
 */
public class MenuElements {
    
    private final JMenuBar mainWinMenu;
    private final JMenu fileMenu;
    private final JMenuItem aboutItem;
    private final JMenuItem exitItem;
    
    /**
     * 
     */
    public MenuElements(){
        this.mainWinMenu = new JMenuBar();
        this.fileMenu = new JMenu();
        this.aboutItem = new JMenuItem();
        this.exitItem = new JMenuItem();
    }
    
    public JMenuBar getMainWinMenu(){
        return this.mainWinMenu;
    }
    
    //@param ResourceBundle messages
    public void formMainMenu(){
        this.fileMenu.add(aboutItem);
        this.fileMenu.addSeparator();
        this.fileMenu.add(exitItem);
        this.mainWinMenu.add(fileMenu);
        //
        this.setTextMainWinMenu();
    }
    
    //@param ResourceBundle messages
    public void setTextMainWinMenu(){
        this.fileMenu.setText("Файл");
        this.aboutItem.setText("О программе");
        this.exitItem.setText("Выход");
    } 
}
