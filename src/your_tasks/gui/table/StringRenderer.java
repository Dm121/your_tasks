/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui.table;

/*OpenJDK 7 Here - Ok!*/
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.time.LocalDate;
import java.util.Calendar;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.border.LineBorder;
import javax.swing.table.TableCellRenderer;
/**
 *Класс для форматирования столбцов с целочисленными данными
 * @author DOG1
 */
public class StringRenderer extends JLabel 
                             implements TableCellRenderer{
        
    private LocalDate curDate;
    private final Calendar cal;
    
    /**
     * 
     * @param cal 
     */
    public StringRenderer(Calendar cal){
        this.cal = cal;
    }
    
    /**
     * 
     * @param table
     * @param value
     * @param isSelected
     * @param hasFocus
     * @param row
     * @param column
     * @return 
     */
    @Override
    public Component getTableCellRendererComponent(JTable table,
                            Object value, boolean isSelected, boolean hasFocus,
                            int row, int column){
        Font fontCells = new Font("Tahoma", Font.BOLD, 14);
        Font fontWeeksCells = new Font("Tahoma", Font.BOLD, 14);
        Font fontFocus = new Font("Tahoma", Font.BOLD, 15);
        //
        this.curDate = LocalDate.now();
        //
        this.setFont(fontCells);
        this.setOpaque(true);
        //
        if(isSelected){
            this.setBackground(Color.WHITE);
        }
        else{
            this.setBackground(Color.WHITE);
        }
        //
        if(column == 0){
            this.setFont(fontWeeksCells);
            table.setColumnSelectionAllowed(false);
            table.setRowSelectionAllowed(true);
            if(hasFocus){
                this.setBorder(new LineBorder(Color.BLUE));
                this.setBackground(Color.BLUE);
                this.setForeground(new Color(255, 255, 255));
            }
            else{
                this.setBorder(new LineBorder(null, 0));
                this.setBackground(Color.WHITE);
                this.setForeground(new Color(0, 0, 255));
            }
            this.setHorizontalAlignment(JLabel.RIGHT);
        }
        else{
            this.setForeground(Color.ORANGE);
            table.setColumnSelectionAllowed(true);
            table.setRowSelectionAllowed(true);
            if(hasFocus){
                this.setBorder(new LineBorder(Color.RED));
                this.setFont(fontFocus);
                this.setForeground(Color.RED);
            }
            else{
                this.setBorder(new LineBorder(null, 0));
                this.setFont(fontCells);
                this.setForeground(new Color(0, 0, 0));
            }
            if((column == 6) || (column == 7)){
                if(hasFocus){
                    this.setBorder(new LineBorder(Color.RED));
                    this.setBackground(Color.RED);
                    this.setForeground(new Color(255, 255, 255));
                }
                else{
                    this.setBorder(new LineBorder(null, 0));
                    this.setBackground(Color.WHITE);
                    this.setForeground(new Color(255, 0, 0));
                }
            }
            //          
            if((table.getModel().getValueAt(row, column)
                    .equals("" + this.curDate.getDayOfMonth())) && 
                    ((this.curDate.getMonthValue() - 1) == 
                    this.cal.get(Calendar.MONTH)) && 
                    (this.curDate.getYear() == this.cal.get(Calendar.YEAR))){
                this.setBackground(new Color(255, 150, 65));
                this.setForeground(new Color(255, 255, 255));
            }
            this.setHorizontalAlignment(JLabel.CENTER);
        }
        //
        this.setText((value == null) ? "" : "" + value);
        return this;
    }
}
