/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.*;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.*;
import your_tasks.gui.table.*;
/**
 *Класс для описания панели JPanel с календарём,
 * позволяющим выбрать день, в который произойдёт событие или
 * необходимо выполнить задачу
 * @author DOG1
 */
public class CalendarPanel extends JPanel {
    
    private final CalendarTableModel model;
    private final Calendar cal = new GregorianCalendar();
    private final JLabel label;
    private final JTable table;
    private int month, year;
    
    /**
     * 
     */
    public CalendarPanel(){
        this.model = new CalendarTableModel();
        this.table = new JTable(this.model);
        this.table.setDefaultRenderer(String.class, 
                                                new StringRenderer(this.cal));
        //
        this.label = new JLabel();
        this.label.setHorizontalAlignment(SwingConstants.CENTER);
        //
        this.month = this.cal.get(Calendar.MONTH);
        this.year = this.cal.get(Calendar.YEAR);
    }
    
    /**
     * 
     * @return 
     */
    public JTable getTable(){
        return this.table;
    }
    
    /**
     * 
     * @return 
     */
    public int getMonth(){
        return this.month;
    }
    
    /**
     * 
     * @return 
     */
    public int getYear(){
        return this.year;
    }
    
    //@param ResourceBundle messages
    //@param Locale
    /**
     * 
     */
    public void formCalendarPanel(){
        JPanel panel = new JPanel();
        JButton prevBut = new JButton();
        JButton nextBut = new JButton();
        JScrollPane pane = new JScrollPane(panel);
        //
        int i;      //for loop
        //
        GroupLayout layout = new GroupLayout(panel);
        panel.setLayout(layout);
        GridLayout grid = new GridLayout(1, 1);
        this.setLayout(grid);
        //
        prevBut.setIcon(new ImageIcon(
                getClass().getResource("/your_tasks/gui/img/arrow_left.png")));
        nextBut.setIcon(new ImageIcon(
                getClass().getResource("/your_tasks/gui/img/arrow_right.png")));
        //
        layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(LEADING)
                    .addComponent(prevBut, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(CENTER)
                    .addComponent(this.label, GroupLayout.PREFERRED_SIZE, 240, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(TRAILING)
                    .addComponent(nextBut, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)))
            .addComponent(this.getTable().getTableHeader())
            .addComponent(this.getTable())
        );
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(prevBut, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.DEFAULT_SIZE)
                .addComponent(this.label, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.DEFAULT_SIZE)
                .addComponent(nextBut, GroupLayout.DEFAULT_SIZE, 30, GroupLayout.DEFAULT_SIZE))
            .addComponent(this.getTable().getTableHeader())
            .addComponent(this.getTable())
        );
        //
        prevBut.setSize(50, 30);
        nextBut.setSize(50, 30);
        this.label.setSize(240, 30);
        this.getTable().getColumnModel().getColumn(0).setMinWidth(60);
        this.getTable().getColumnModel().getColumn(0).setMaxWidth(60);
        for(i = 1; i < this.model.getColumnCount(); i++){
            this.getTable().getColumnModel().getColumn(i).setMinWidth(40);
            this.getTable().getColumnModel().getColumn(i).setMaxWidth(40);
        }
        //
        prevBut.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
               cal.add(Calendar.MONTH, -1);
               updateMonth();
           }
        });
        nextBut.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                cal.add(Calendar.MONTH, +1);
                updateMonth();
            }
        });
        //
        this.getTable().getTableHeader().setReorderingAllowed(false);
        //
        this.updateMonth();
        //
        this.add(pane);
    }
    
    //@param Locale
    /**
     * 
     */
    public void updateMonth(){
        String textMonth;
        int startDay, numberOfDays, weeks;
        int startWeekOfMonth;         //(?) + weekOfMonth
        int addDays, addWeeks;
        int i, day;      //for loop
        //
        this.cal.set(Calendar.DAY_OF_MONTH, 1);
        //
        this.month = this.cal.get(Calendar.MONTH);
        textMonth = this.cal.getDisplayName(
                        Calendar.MONTH, Calendar.LONG, new Locale("ru", "RU"));
        this.year = this.cal.get(Calendar.YEAR);
        this.label.setText(textMonth + " " + this.year);
        //
        startDay = this.cal.get(Calendar.DAY_OF_WEEK);
        numberOfDays = this.cal.getActualMaximum(Calendar.DAY_OF_MONTH);
        weeks = this.cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
        startWeekOfMonth = this.cal.get(Calendar.WEEK_OF_YEAR);
        //
        this.model.setRowCount(weeks);
        //
        for(i = 0; i < weeks; i++){
            this.model.setValueAt(
                        ((startWeekOfMonth + i)), i, 0);
        }
        this.getTable().revalidate();
        //
        i = startDay - 1;
        for(day = 1; day <= numberOfDays; day++){
            //
            if((i % 7) == 0){
                if(i == 0){
                    addDays = 7;
                    addWeeks = 0;
                }
                else{
                    addDays = 0;
                    addWeeks = -1;
                }
                //
                this.model.setValueAt(day, (i / 7) + addWeeks, 7);
                //
                if(addDays > 0){
                    i = i + addDays;
                    addDays = 0;
                }
            }
            else{
                this.model.setValueAt(day, (i / 7), (i % 7));
            }
            i = i + 1;
            //
        }
    }
    
    //@param ResourceBundle messages
    //public void setTextElements(){  }
    
}
