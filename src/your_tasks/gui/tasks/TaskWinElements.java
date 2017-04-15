/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui.tasks;

import java.util.List;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import javax.swing.*;
/**
 *Класс для работы с базовыми элементами окна "AddWindow" 
 * для добавления/редактирования данных события/задачи
 * @author dog1
 */
public abstract class TaskWinElements {
    
    private static final int LABEL_SIZE = 11;
    private static final int START_SIZE = 2;
    private static final int DUR_SIZE = 3;
    //
    private static final int COL_COUNT_TF = 40;
    private static final int COL_COUNT_TA = 80;
    private static final int ROW_COUNT_CNT = 8;
    private static final int ROW_COUNT_CTS = 4;
    //Special constants:
    public static final int OK_RES = 1;
    public static final int CANCEL_RES = 2;
    //Variables:
    private int i;      //for loop
    private int result;
    //Elements:
    private JLabel labels[];
    private JComboBox priority;
    private JComboBox status;
    private JSpinner start[];
    private JSpinner duration[];
    private JTextField subject;
    private JTextArea content;
    private JTextArea comments;
    private JButton chooseCatBut;
    private JButton okBut;
    private JButton cancelBut;
    
    /**
     * 
     */
    public TaskWinElements(){
        Font fontBut = new Font("Verdana", Font.BOLD, 12);
        Font fontLabels = new Font("Verdana", Font.BOLD, 11);
        Font fontText = new Font("Verdana", Font.PLAIN, 11);
        //
        Integer valStartMin = 30;
        Integer valStartHour = 12;
        Integer valDurMin = 0;
        Integer valDurHour = 0;
        Integer valDurDay = 1;
        Integer valMin = 0;
        Integer minMax = 59;
        Integer hourMax = 23;
        Integer dayMax = 3655;
        Integer step = 1;
        //
        this.result = 2;
        //
        this.labels = new JLabel[LABEL_SIZE];
        this.priority = new JComboBox();
        this.status = new JComboBox();
        this.start = new JSpinner[START_SIZE];
        this.duration = new JSpinner[DUR_SIZE];
        this.subject = new JTextField(COL_COUNT_TF);
        this.content = new JTextArea(ROW_COUNT_CNT, COL_COUNT_TA);
        this.comments = new JTextArea(ROW_COUNT_CTS, COL_COUNT_TA);
        this.chooseCatBut = new JButton();
        this.okBut = new JButton();
        this.cancelBut = new JButton();
        //
        for(i = 0; i < LABEL_SIZE; i++){
            this.labels[i] = new JLabel();
            this.labels[i].setFont(fontLabels);
        }
        for(i = 0; i < START_SIZE; i++){
            this.start[i] = new JSpinner();
            this.start[i].setFont(fontText);
        }
        this.start[0].setModel(
                new SpinnerNumberModel(valStartMin, valMin, minMax, step));
        this.start[1].setModel(
                new SpinnerNumberModel(valStartHour, valMin, hourMax, step));
        for(i = 0; i < DUR_SIZE; i++){
            this.duration[i] = new JSpinner();
            this.duration[i].setFont(fontText);
        }
        this.duration[0].setModel(
                new SpinnerNumberModel(valDurMin, valMin, minMax, step));
        this.duration[1].setModel(
                new SpinnerNumberModel(valDurHour, valMin, hourMax, step));
        this.duration[2].setModel(
                new SpinnerNumberModel(valDurDay, valMin, dayMax, step));
        this.subject.setFont(fontText);
        this.content.setFont(fontText);
        //
        this.content.setLineWrap(true);
        this.content.setWrapStyleWord(true);
        //
        this.comments.setFont(fontText);
        //
        this.comments.setLineWrap(true);
        this.comments.setWrapStyleWord(true);
        //
        this.chooseCatBut.setFont(fontBut);
        this.okBut.setFont(fontBut);
        this.cancelBut.setFont(fontBut);
    }
    
    /**
     * 
     * @return 
     */
    public int getResult(){
        return this.result;
    }
    
    /**
     * 
     * @param res 
     */
    protected void setResult(int res){
        this.result = res;
    }
    
    //perhaps, better modifier public
    //JLabel labels[] - setItemLabels(int)
    //JSpinner start[], duration[] - setItemStart(int), setItemDuration(int)
    /**
     * 
     * @return 
     */
    protected JLabel[] getLabels(){
        return this.labels;
    }
    
    /**
     * 
     * @return 
     */
    public JComboBox getPriority(){
        return this.priority;
    }
    
    /**
     * 
     * @return 
     */
    public JComboBox getStatus(){
        return this.status;
    }
    
    /**
     * 
     * @return 
     */
    public JSpinner[] getStart(){
        return this.start;
    }
    
    /**
     * 
     * @return 
     */
    public JSpinner[] getDuration(){
        return this.duration;
    }
    
    /**
     * 
     * @return 
     */
    public JTextField getSubject(){
        return this.subject;
    }
    
    /**
     * 
     * @return 
     */
    public JTextArea getContent(){
        return this.content;
    }
    
    /**
     * 
     * @return 
     */
    public JTextArea getComments(){
        return this.comments;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getChooseCatBut(){
        return this.chooseCatBut;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getOkBut(){
        return this.okBut;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getCancelBut(){
        return this.cancelBut;
    }
    
}
