/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
/**
 *Класс для главного окна приложения MainWindow
 * @author DOG1
 */
public class MainWindow extends JFrame{
    
    private static final int DEFAULT_WIDTH = 725;
    private static final int DEFAULT_HEIGHT = 500;
    //
    private final UserPanel userPanel;
    private final CalendarPanel claendarPanel;
    private final TasksPanel tasksPanel;
    private final MenuElements mainWinMenu;
    //
    private Connection connApp;
    
    /**
     * 
     * @param conn
     */
    public MainWindow(Connection conn){
        super();
        //
        Rectangle maxSizeRect = new Rectangle();
        //
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setText();                                             //*2
        //
        this.setResizable(false);
        maxSizeRect.setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        this.setMaximizedBounds(maxSizeRect);       //setBounds(Rectangle r)
        //
        this.userPanel = new UserPanel();
        this.claendarPanel = new CalendarPanel();
        this.tasksPanel = new TasksPanel();
        this.mainWinMenu = new MenuElements();
        //
        this.connApp = conn;
    }
    
    //@param ResourceBundle messages
    public void setText(){
        this.setTitle("Your_tasks v0.8.7");
        //this.setTitle("Your_tasks v1.0.0");
    }
    
    public UserPanel getUserPanel(){
        return this.userPanel;
    }
    
    public CalendarPanel getCalendarPanel(){
        return this.claendarPanel;
    }
    
    public TasksPanel getTasksPanel(){
        return this.tasksPanel;
    }
    
    public MenuElements getMainWinMenu(){
        return this.mainWinMenu;
    }
    
    public synchronized void formGUI(){
        JPanel mainPanel = new JPanel();
        JScrollPane scroll = new JScrollPane(mainPanel);
        //
        mainPanel.setLayout(new BorderLayout());                 //GroupLayout
        this.getUserPanel().formUserPanel();
        mainPanel.add(this.getUserPanel(), BorderLayout.WEST);
        this.getCalendarPanel().formCalendarPanel();
        mainPanel.add(this.getCalendarPanel(), BorderLayout.CENTER);
        this.getTasksPanel().formTasksPanel();
        mainPanel.add(this.getTasksPanel(), BorderLayout.EAST);
        this.setLayout(new BorderLayout());
        this.add(scroll, BorderLayout.CENTER);
        this.getMainWinMenu().formMainMenu();
        this.setJMenuBar(this.getMainWinMenu().getMainWinMenu());
        //
        this.getMainWinMenu().getMainWinMenu().getMenu(0)
                .getItem(2).addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
        //tests: for example:
        this.getTasksPanel().getAddBut().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                int row, column;
                column = getCalendarPanel().getTable().getSelectedColumn();
                if(column > 0){
                    row = getCalendarPanel().getTable().getSelectedRow();
                    System.out.println("row: " + row + "; column: " + column);
                    System.out.println("value of cell: " + 
                            getCalendarPanel().getTable().getModel().
                                    getValueAt(row, column).toString());
                }
                else{
                    row = getCalendarPanel().getTable().getSelectedRow();
                    System.out.println("column: weeks");
                }
                if((row > -1) && (column > -1)){
                    getCalendarPanel().getTable().requestFocusInWindow();
                }
            }
        });
        //
        this.setVisible(true);
    }
    
    
}
