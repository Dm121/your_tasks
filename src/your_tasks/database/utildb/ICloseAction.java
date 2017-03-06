/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.utildb;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *Интерфейс, описывающий дополнительные методы
 * по закрытию объектов для работы с БД
 * @author DOG1
 */
public interface ICloseAction {
    public void closeStatement(Statement st);
    /**
     * PreparedStatement
     * @param ps
     */
    public void closePrStatement(PreparedStatement ps);
    public void closeResultSet(ResultSet rs);
}
