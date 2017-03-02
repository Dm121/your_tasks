/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Класс для хранения сведений о статусе события/задачи
 * @author DOG1
 */
public class Status {
    private Integer idStatus;
    private String description;
    private ColorRGB colorRGB;
    private List<Task> tasks;
    
    /**
     * 
     */
    public Status(){
        //
    }
    
    /**
     * 
     * @param id
     * @param descr
     * @param rgb 
     */
    public Status(Integer id, String descr, ColorRGB rgb){
        this.idStatus = id;
        this.description = descr;
        this.colorRGB = rgb;
        this.tasks = null;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getIdStatus(){
        return this.idStatus;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdStatus(Integer id){
        this.idStatus = id;
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
        return "Id: " + this.idStatus.toString() + ": " + this.description + 
                "\n" + this.colorRGB.toString();
    }
}
