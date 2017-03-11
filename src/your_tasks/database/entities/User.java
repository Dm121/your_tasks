/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Класс для хранения основной информации о пользователе/контакте
 * @author DOG1
 */
public class User {
    private Long idUser;
    private String name;
    private String surname;
    private UserPhoto photo;
    private Work work;
    private CategoryU category;
    private List<Task> tasks;
    
    /**
     * 
     */
    public User(){
        //
    }
    
    /**
     * 
     * @param id
     * @param name
     * @param surname
     * @param category 
     */
    public User(Long id, String name, String surname, CategoryU category){
        this.idUser = id;
        this.name = name;
        this.surname = surname;
        this.category = category;
        this.photo = null;
        this.work = null;
        this.tasks = null;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdUser(){
        return this.idUser;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdUser(Long id){
        this.idUser = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getName(){
        return this.name;
    }
    
    /**
     * 
     * @param name 
     */
    public void setName(String name){
        this.name = name;
    }
    
    /**
     * 
     * @return 
     */
    public String getSurname(){
        return this.surname;
    }
    
    /**
     * 
     * @param surname 
     */
    public void setSurname(String surname){
        this.surname = surname;
    }
    
    /**
     * 
     * @return 
     */
    public UserPhoto getPhoto(){
        return this.photo;
    }
    
    /**
     * 
     * @param photo 
     */
    public void setPhoto(UserPhoto photo){
        this.photo = photo;
    }
    
    /**
     * 
     * @return 
     */
    public Work getWork(){
        return this.work;
    }
    
    /**
     * 
     * @param work 
     */
    public void setWork(Work work){
        this.work = work;
    }
    
    /**
     * 
     * @return 
     */
    public CategoryU getCategory(){
        return this.category;
    }
    
    /**
     * 
     * @param category 
     */
    public void setCategory(CategoryU category){
        this.category = category;
    }
    
    /**
     * 
     * @return 
     */
    public List<Task> getTasks(){
        return this.tasks;
    }
    
    /**
     * 
     * @param tasks 
     */
    public void setTasks(List<Task> tasks){
        this.tasks = tasks;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        StringBuffer userD = new StringBuffer();
        //
        userD.append("Id: ");
        userD.append(this.idUser.toString());
        userD.append(".\nName: ");
        userD.append(this.name);
        userD.append(".\nSurname: ");
        userD.append(this.surname);
        userD.append(".");
        //...there can be additional user data:
        //- work;
        //- addresses.
        //...may be separate method for description user with all his data
        //is better use
        //
        return userD.toString();
    }
}
