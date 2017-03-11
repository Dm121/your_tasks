/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui.table;

import java.util.List;
import java.util.Vector;
import javax.swing.table.AbstractTableModel;
/**
 *Класс для описания модели таблицы с календарём
 * @author DOG1
 */
public class CalendarTableModel extends AbstractTableModel{
    
    private final List<String> columnNames;
    private List<List<Object>> tableData;
    private final List<Object> vColClass;
    
    //@param ResourceBundle messages
    /**
     * 
     */
    public CalendarTableModel(){
        super();
        //
        //int i;      //for loop
        //
        this.vColClass = new Vector<Object>();
        this.vColClass.add(0, String.class);
        this.vColClass.add(1, String.class);
        this.vColClass.add(2, String.class);
        this.vColClass.add(3, String.class);
        this.vColClass.add(4, String.class);
        this.vColClass.add(5, String.class);
        this.vColClass.add(6, String.class);
        this.vColClass.add(7, String.class);
        //
        this.columnNames = new Vector<String>();
        this.columnNames.add("Неделя");
        this.columnNames.add("Пн");
        this.columnNames.add("Вт");
        this.columnNames.add("Ср");
        this.columnNames.add("Чт");
        this.columnNames.add("Пт");
        this.columnNames.add("Сб");
        this.columnNames.add("Вс");
        //
        this.tableData = new Vector<List<Object>>();
    }
    
    /**
     * 
     * @param i
     * @param columnName 
     */
    public void setColumnName(int i, String columnName){
        if((i > -1) && (i < this.columnNames.size())){
            this.columnNames.set(i, columnName);
        }
        this.fireTableStructureChanged();
    }
    
    /**
     *Возвращает (Показывает) заголовки колонок 
     * @param column номер столбца таблицы
     * @return имя столбца таблицы
     */
    @Override
    public String getColumnName(int column){
        return ((Vector<String>)this.columnNames).get(column);
    }
       
    /**
     * 
     * @param rowCount 
     */
    public void setRowCount(int rowCount){
        int i, j;      //for loop
        List<Object> curRow;
        //
        this.tableData.clear();
        for(i = 0; i < rowCount; i++){
            curRow = new Vector<Object>();
            for(j = 0; j < this.columnNames.size(); j++){
                curRow.add(j, "");
            }
            this.tableData.add(i, curRow);
        }
        this.fireTableDataChanged();
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public int getColumnCount(){
        return this.columnNames.size();
    }
    
    /**
     * 
     * @return 
     */
    @Override 
    public int getRowCount(){
        return this.tableData.size();
    }
    
    /**
     * 
     * @param row
     * @param col
     * @return 
     */
    @Override
    public Object getValueAt(int row, int col){
        Object value = null;
        //
        if((row > -1) && (row < this.getRowCount())){
            if((col > -1) && (col < this.getColumnCount())){
                value = (this.tableData.get(row)).get(col);
            }
        }
        //
        return value;
    }
    
    /**
     * 
     * @param value
     * @param row
     * @param col 
     */
    @Override
    public void setValueAt(Object value, int row, int col){
        if((row > -1) && (row < this.getRowCount())){
            if((col > -1) && (col < this.getColumnCount())){
                //test:
                //System.out.println(value.toString());
                //
                this.getTableData().get(row).set(col, value.toString());
            }
        }
        this.fireTableDataChanged();
    }
    
    /**
     * 
     * @param column
     * @return 
     */
    @Override
    public Class<?> getColumnClass(int columnIndex){
        Class<?> c = Object.class;
        //
        try{
            c = (Class<?>)this.vColClass.get(columnIndex);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        //
        return c;
    }
        
    /**
     * 
     * @return 
     */
    public List<List<Object>> getTableData(){
        return this.tableData;
    } 
    
    /**
     * 
     * @param tableData 
     */
    public void setTableData(List<List<Object>> tableData){
        this.tableData = tableData;
        this.fireTableDataChanged();
    }
}
