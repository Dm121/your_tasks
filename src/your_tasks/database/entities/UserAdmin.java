/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

/**
 *Класс для описания пользовательских данных, используемых
 * при входе в программу:
 * - login;
 * - password.
 * @author DOG1
 */
public class UserAdmin extends User{
    private String login;
    private String password;
    
    /**
     * 
     */
    public UserAdmin(){
        super();
    }
    
    /**
     * 
     * @param id
     * @param name
     * @param surname
     * @param category
     * @param login
     * @param ps 
     */
    public UserAdmin(Long id, String name, String surname, CategoryU category,
                        String login, String ps){
        super(id, name, surname, category);
        this.login = login;
        this.password = ps;
    }
    
    /**
     * 
     * @return 
     */
    public String getLogin(){
        return this.login;
    }
    
    /**
     * 
     * @param login 
     */
    public void setLogin(String login){
        this.login = login;
    }
    
    /**
     * 
     * @return 
     */
    public String getPassword(){
        return this.password;
    }
    
    /**
     * 
     * @param ps 
     */
    public void setPassword(String ps){
        this.password = ps;
    }    
}
