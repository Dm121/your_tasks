/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.Date;
import java.util.Set;
import java.util.HashSet;
/**
 *Класс хранит дополнительные сведения для
 * многопользовательского события/задачи
 * @author DOG1
 */
public class TaskOrder extends Task{
    private Long number;
    private Integer version;
    private Set<User> performers;
    
    /**
     * 
     */
    public TaskOrder(){
        super();
        //
    }
    
    /**
     * 
     * @param idOrderTask
     * @param subject
     * @param start
     * @param durD
     * @param durH
     * @param durM
     * @param content
     * @param comments
     * @param type
     * @param status
     * @param priority
     * @param category
     * @param creator
     * @param number
     * @param version
     * @param performers 
     */
    public TaskOrder(Long idOrderTask, String subject, 
            Date start, Integer durD, Integer durH, Integer durM,
            String content, String comments, Type type, Status status,
            Priority priority, CategoryT category, User creator,
            Long number, Integer version, Set<User> performers){
        super(idOrderTask, subject, start, durD, durH, durM,
                content, comments, type, status, priority,
                category, creator);
        this.number = number;
        this.version = version;
        this.performers = performers;
    }
    
    /**
     * 
     * @return 
     */
    public long getNumber(){
        return this.number;
    }
    
    /**
     * 
     * @param number 
     */
    public void setNumber(Long number){
        this.number = number;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getVersion(){
        return this.version;
    }
    
    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version){
        this.version = version;
    }
    
    /**
     * 
     * @return 
     */
    public Set<User> getPerformers(){
        return this.performers;
    }
    
    /**
     * 
     * @param performers 
     */
    public void setPerformers(Set<User> performers){
        this.performers = performers;
    }
    
    @Override
    public String toString(){
        StringBuffer taskMD = new StringBuffer();
        //
        taskMD.append(super.toString());
        taskMD.append("Information about order task: ");
        taskMD.append("\nNumber (Id): ");
        taskMD.append(this.number.toString());
        taskMD.append(".");
        taskMD.append("\nVersion: ");
        taskMD.append(this.version.toString());
        taskMD.append(".");
        taskMD.append("\nPerformers: ");
        if((this.performers != null) && (!this.performers.isEmpty())){
            for(User performer : this.performers){
                taskMD.append("\n");
                taskMD.append(performer.toString());
            }
        }
        else { taskMD.append("Unknown."); }
        //
        return taskMD.toString();
    }
}
