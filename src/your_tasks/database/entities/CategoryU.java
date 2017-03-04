/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.Set;
import java.util.HashSet;
/**
 *Класс для хранения сведений о категориях,
 * к которым принадлежат пользователи/контакты
 * @author DOG1
 */
public class CategoryU {
    private Long idCategoryU;
    private String name;
    private Set<User> users;
    
    /**
     * 
     */
    public CategoryU(){
        //
    }
    
    /**
     * 
     * @param id
     * @param name 
     */
    public CategoryU(Long id, String name){
        this.idCategoryU = id;
        this.name = name;
        this.users = null;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdCategoryU(){
        return this.idCategoryU;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdCategoryU(Long id){
        this.idCategoryU = id;
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
    public Set<User> getUsers(){
        return this.users;
    }
    
    /**
     * 
     * @param users 
     */
    public void setUsers(Set<User> users){
        this.users = users;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "Id: " + this.idCategoryU.toString() + ": " + 
                this.getName() + ".";
    }
}
