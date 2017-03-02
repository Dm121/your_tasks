/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Класс для хранения сведений о приоритете события/задачи
 * @author DOG1
 */
public class Priority {
    private Integer idPriority;
    private String description;
    private ColorRGB colorRGB;
    private List<Task> tasks;
    
    /**
     * 
     */
    public Priority(){
        //
    }
    
    /**
     * 
     * @param id
     * @param descr
     * @param rgb 
     */
    public Priority(Integer id, String descr, ColorRGB rgb){
        this.idPriority = id;
        this.description = descr;
        this.colorRGB = rgb;
        this.tasks = null;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getIdPriority(){
        return this.idPriority;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdPriority(Integer id){
        this.idPriority = id;
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
    public ColorRGB getColorRGB(){
        return this.colorRGB;
    }
    
    /**
     * 
     * @param rgb 
     */
    public void setColorRGB(ColorRGB rgb){
        this.colorRGB = rgb;
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
        return "Id: " + this.idPriority.toString() + ": " + this.description +
                "\n" + colorRGB.toString();
    }
}
