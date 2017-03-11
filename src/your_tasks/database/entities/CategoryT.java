/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Категория, к которой относится задача
 * @author DOG1
 */
public class CategoryT {
    private Long idCategoryT;
    private String name;
    private List<Task> tasks;
    
    /**
     * 
     */
    public CategoryT(){
        //
    }
    
    /**
     * 
     * @param id
     * @param name 
     */
    public CategoryT(Long id, String name){
        this.idCategoryT = id;
        this.name = name;
        this.tasks = null;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdCategoryT(){
        return this.idCategoryT;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdCategoryT(Long id){
        this.idCategoryT = id;
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
        return "Id: " + this.idCategoryT + ": " + this.name + ".";
    }
}
