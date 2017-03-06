/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.utildb;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *Класс для подключения к БД Apache Derby
 * @author DOG1
 */
public class DerbyConnection implements IDBConnection{
    private static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
    private static final String DBNAME = "tasksdb";
    private static final String URL = "jdbc:derby:" + DBNAME + ";create=true";
    
    private Connection conn;
    private final PrintWriter log;
    
    public DerbyConnection(){
        this.conn = null;
        this.log = new PrintWriter(System.out);
    }
    
    public static String getDefaultDriver(){
        return DRIVER;
    }
    
    public static String getDefaultUrl(){
        return URL;
    }
    
    private void log(String message){
        this.log.write(message + "\n");
        this.log.flush();
    }
    
    @Override
    public boolean createConnection(String driver, String url,
                                    String user, String passwd){
        boolean flag = false;
        //
        try{
            Class.forName(driver);
            this.conn = DriverManager.getConnection(url, user, passwd);
            flag = true;
        }
        catch(SQLException sqle){
            this.log("Can't create connection");
        }
        catch(ClassNotFoundException e){
            this.log("JDBC Driver " + driver + "not found in CLASSPATH");
        }
        //
        return flag;
    }
    
    @Override
    public Connection getConnection(){
        return this.conn;
    }
    
    @Override
    public boolean isAlive(){
        boolean flag = false;
        //
        try{
            flag = ((conn != null) && (!conn.isClosed()));
        }
        catch(SQLException e){
            this.log("Error when accessing to connection");
        }
        //
        return flag;
    }
    
    @Override
    public void closeConnection(Connection conn){
        try{
            if(conn != null){
                conn.close();
            }
        }
        catch(SQLException e){
            this.log("Can't close connection with database");
        }
    }
}
