/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.utildb;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *Интерфейс для описания методов для работы с конкретной базой данных
 * @author DOG1
 */
public interface IDBConnection {
    public boolean createConnection(String driver, String url, 
                                    String user, String passwd);
    public Connection getConnection();
    /**
     * Вызывает метод conn.isClosed() и обрабатывает исключение SQLException,
     * если таковое возникло
     * @return 
     */
    //public boolean isClosed();
    /**
     * Проверяет, что объект Connection is not null
     * @return true если объекту Connection присвоено значение и
     * соединение не закрыто, иначе false
     */
    public boolean isAlive();
    public void closeConnection(Connection conn);
}
