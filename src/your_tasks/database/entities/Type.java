/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Тип события/задачи (однопользовательская, многопользовательская)
 * @author DOG1
 */
public class Type {
    private Integer idType;
    private String description;
    private List<Task> tasks;
    
    
    /**
     * 
     */
    public Type(){
        //
    }
    
    /**
     * 
     * @param id
     * @param descr 
     */
    public Type(Integer id, String descr){
        this.idType = id;
        this.description = descr;
        this.tasks = null;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getIdType(){
        return this.idType;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdType(Integer id){
        this.idType = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getDescription(){
        return this.description;
    }
    
    /**
     * 
     * @param descr 
     */
    public void setDescription(String descr){
        this.description = descr;
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
    
    @Override
    public String toString(){
        return "Id " + this.idType + ": " + this.description + ".";
    }
}
