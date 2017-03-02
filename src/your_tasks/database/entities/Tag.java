/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Класс для хранения тега, ассоциирующегося с событием/задачей
 * @author DOG1
 */
public class Tag {
    private Long idTag;
    private String tagName;
    private List<Task> tasks;
    
    /**
     * 
     */
    public Tag(){
        //
    }
    
    /**
     * 
     * @param id
     * @param tag 
     */
    public Tag(Long id, String tag){
        this.idTag = id;
        this.tagName = tag;
        this.tasks = null;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdTag(){
        return this.idTag;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdTag(Long id){
        this.idTag = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getTagName(){
        return this.tagName;
    }
    
    /**
     * 
     * @param tag 
     */
    public void setTagName(String tag){
        this.tagName = tag;
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
        return "Id: " + this.idTag.toString() + ": " + this.tagName + ".";
    }
}
