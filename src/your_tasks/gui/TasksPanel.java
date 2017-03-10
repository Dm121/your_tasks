/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui;

import java.awt.Font;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.*;
import your_tasks.util.ImageProcessing;
/**
 *Класс для описания панели JPanel с кнопками вызова окон приложения для
 * работы с событиями/задачами
 * @author DOG1
 */
public class TasksPanel extends JPanel{
    private static final int LABELS_COUNT = 2;
    //
    private final JButton seeBut;
    private final JButton addBut;
    private final List<JLabel> labels;
    
    /**
     * 
     */
    public TasksPanel(){
        super();
        //
        int i;      //for loop
        //
        this.seeBut = new JButton();
        this.addBut = new JButton();
        //
        this.labels = new ArrayList<JLabel>();
        for(i = 0; i < LABELS_COUNT; i++){
            this.labels.add(i, new JLabel());
        }
    }
    
    /**
     * 
     * @return 
     */
    public JButton getSeeBut(){
       return this.seeBut; 
    }
    
    /**
     * 
     * @return 
     */
    public JButton getAddBut(){
        return this.addBut;
    }
    
    //protecetd or public
    /**
     * 
     * @return 
     */
    private List<JLabel> getLabels(){
        return this.labels;
    }
    
    //@param ResourceBundle messages
    /**
     * 
     */
    public void formTasksPanel(){
        final int BUTTON_WIDTH = 20;
        final int LABEL_WIDTH = 85;
        final int ELEM_HEIGHT = 20;
        final int IMAGE_SIZE = 16;
        //
        Font fontLabels = new Font("Tahoma", Font.BOLD, 12);
        //
        ImageProcessing imgProc = new ImageProcessing();
        boolean flag = false;
        //
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        //
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        //
        layout.setHorizontalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(this.getLabels().get(0), GroupLayout.PREFERRED_SIZE, LABEL_WIDTH, GroupLayout.PREFERRED_SIZE)
                .addComponent(this.getLabels().get(1), GroupLayout.PREFERRED_SIZE, LABEL_WIDTH, GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(LEADING)
                .addComponent(this.seeBut, GroupLayout.PREFERRED_SIZE, BUTTON_WIDTH, GroupLayout.PREFERRED_SIZE)
                .addComponent(this.addBut, GroupLayout.PREFERRED_SIZE, BUTTON_WIDTH, GroupLayout.PREFERRED_SIZE))
        );
        
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(CENTER)
                .addComponent(this.getLabels().get(0), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE)
                .addComponent(this.seeBut, GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE))
            .addGroup(layout.createParallelGroup(CENTER)
                .addComponent(this.getLabels().get(1), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE)
                .addComponent(this.addBut, GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE))
        );
        //
        try{
            this.seeBut.setIcon(new ImageIcon(imgProc.toScaleImage(
                    getClass().getResource("/your_tasks/gui/img/see_2.png"),
                    IMAGE_SIZE)));
            flag = true;
            this.addBut.setIcon(new ImageIcon(imgProc.toScaleImage(
                    getClass().getResource("/your_tasks/gui/img/add.png"),
                    IMAGE_SIZE)));
        }
        catch(IOException ioe){
            if(!flag){
                System.out.println("Can't load image for See Button");
                System.out.println(ioe.getMessage());
            }
            else{
                System.out.println("Can't load image for Add Button");
                System.out.println(ioe.getMessage());
            }
        }
        //
        this.getLabels().get(0).setFont(fontLabels);
        this.getLabels().get(1).setFont(fontLabels);
        //
        this.setTextElements();
    }
    
    //@param ResourceBundle messages
    /**
     * 
     */
    public void setTextElements(){
        this.setBorder(new TitledBorder("Задачи: "));
        this.getLabels().get(0).setText("Просмотреть");
        this.getLabels().get(1).setText("Создать");
    }
}
