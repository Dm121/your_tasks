/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.utildb;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
/**
 *Класс, реализующий действия по закрытию объектов для работы с БД
 * @author DOG1
 */
public class ClosingStatement implements ICloseAction{
    
    private PrintWriter log;
    
    public ClosingStatement(){
        this.log = new PrintWriter(System.out);
    }
    
    private void log(String message){
        this.log.write(message + "\n");
        this.log.flush();
    }
    
    @Override
    public void closeStatement(Statement st){
        try{
            if(st != null){
                st.close();
            }
        }
        catch(SQLException e){
            this.log("Can't close object of class java.sql.Statement");
            this.log("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void closePrStatement(PreparedStatement ps){
        try{
            if(ps != null){
                ps.close();
            }
        }
        catch(SQLException e){
            this.log("Can't close object of class java.sql.PreparedStatement");
            this.log("Error: " + e.getMessage());
        }
    }
    
    @Override
    public void closeResultSet(ResultSet rs){
        try{
            if(rs != null){
                rs.close();
            }
        }
        catch(SQLException e){
            this.log("Can't close object of class java.sql.ResultSet");
            this.log("Error: " + e.getMessage());
        }
    }
}
