/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Set;
import java.util.HashSet;
/**
 *Класс для хранения сведений о событии/задаче
 * @author DOG1
 */
public class Task {
    private Long idTask;
    private String subject;
    private Date startTime;
    private Integer durationDays;
    private Integer durationHours;
    private Integer durationMinutes;
    private String content;
    private String comments;
    private Boolean remindFlag;
    private Type type;
    private Status status;
    private Priority priority;
    private CategoryT category;
    private User creator;
    private Set<Tag> tags;
    private Set<Address> addrRemind;
    
    /**
     * 
     */
    public Task(){
        //
    }
    
    /**
     * 
     * @param id
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
     */
    public Task(Long id, String subject, 
            Date start, Integer durD, Integer durH, Integer durM,
            String content, String comments, Type type, Status status,
            Priority priority, CategoryT category, User creator){
        this.idTask = id;
        this.subject = subject;
        this.startTime = start;
        this.durationDays = durD;
        this.durationHours = durH;
        this.durationMinutes = durM;
        this.content = content;
        this.comments = comments;
        this.remindFlag = false;
        this.type = type;
        this.status = status;
        this.priority = priority;
        this.category = category;
        this.creator = creator;
        this.tags = null;
        this.addrRemind = null;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdTask(){
        return this.idTask;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdTask(Long id){
        this.idTask = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getSubject(){
        return this.subject;
    }
    
    /**
     * 
     * @param subject 
     */
    public void setSubject(String subject){
        this.subject = subject;
    }
    
    /**
     * 
     * @return 
     */
    public Date getStartTime(){
        return this.startTime;
    }
    
    /**
     * 
     * @param start 
     */
    public void setStartTime(Date start){
        this.startTime = start;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getDurationDays(){
        return this.durationDays;
    }
    
    /**
     * 
     * @param durD 
     */
    public void setDurationDays(Integer durD){
        this.durationDays = durD;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getDurationHours(){
        return this.durationHours;
    }
    
    /**
     * 
     * @param durH 
     */
    public void setDurationHours(Integer durH){
        this.durationHours = durH;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getDurationMinutes(){
        return this.durationMinutes;
    }
    
    /**
     * 
     * @param durM 
     */
    public void setDurationMinutes(Integer durM){
        this.durationMinutes = durM;
    }
    
    /**
     * 
     * @return 
     */
    public String getContent(){
        return this.content;
    }
    
    /**
     * 
     * @param content 
     */
    public void setContent(String content){
        this.content = content;
    }
    
    /**
     * 
     * @return 
     */
    public String getComments(){
        return this.comments;
    }
    
    /**
     * 
     * @param comments 
     */
    public void setComments(String comments){
        this.comments = comments;
    }
    
    /**
     * 
     * @return 
     */
    public Boolean getRemindFlag(){
        return this.remindFlag;
    }
    
    /**
     * 
     * @param flag 
     */
    public void setRemindFlag(Boolean flag){
        this.remindFlag = flag;
    }
    
    /**
     * 
     * @return 
     */
    public Type getType(){
        return this.type;
    }
    
    /**
     * 
     * @param type 
     */
    public void setType(Type type){
        this.type = type;
    }
    
    /**
     * 
     * @return 
     */
    public Status getStatus(){
        return this.status;
    }
    
    /**
     * 
     * @param status 
     */
    public void setStatus(Status status){
        this.status = status;
    }
    
    /**
     * 
     * @return 
     */
    public Priority getPriority(){
        return this.priority;
    }
    
    /**
     * 
     * @param priority 
     */
    public void setPriority(Priority priority){
        this.priority = priority;
    }
    
    /**
     * 
     * @return 
     */
    public CategoryT getCategory(){
        return this.category;
    }
    
    /**
     * 
     * @param category 
     */
    public void setCategory(CategoryT category){
        this.category = category;
    }
    
    /**
     * 
     * @return 
     */
    public User getCreator(){
        return this.creator;
    }
    
    /**
     * 
     * @param creator 
     */
    public void setCreator(User creator){
        this.creator = creator;
    }
    
    /**
     * 
     * @return 
     */
    public Set<Tag> getTags(){
        return this.tags;
    }
    
    /**
     * 
     * @param tags 
     */
    public void setTags(Set<Tag> tags){
        this.tags = tags;
    }
    
    /**
     * 
     * @return 
     */
    public Set<Address> getAddrRemind(){
        return this.addrRemind;
    }
    
    /**
     * 
     * @param addresses 
     */
    public void setAddrRemind(Set<Address> addresses){
        this.addrRemind = addresses;
    }
    
    @Override
    public String toString(){
        StringBuffer taskD = new StringBuffer();
        taskD.append("Id: ");
        taskD.append(this.idTask.toString());
        taskD.append("\nSubject: ");
        taskD.append(this.subject);
        taskD.append("\nStart time: ");
        taskD.append(this.startTime.toString());
        taskD.append("\nDuration: ");
        taskD.append(this.durationDays.toString());
        taskD.append(" day(s) ");
        taskD.append(this.durationHours.toString());
        taskD.append(" hour(s) ");
        taskD.append(this.durationMinutes.toString());
        taskD.append(" minute(s).");
        taskD.append("\nDescription of task:\n");
        taskD.append(this.content);
        taskD.append("\nComments:\n");
        taskD.append(this.comments);
        taskD.append("\nReminded: ");
        if(this.remindFlag){
            taskD.append("Yes.");
        }
        else { taskD.append("No."); }
        //
        taskD.append("\nType of task: ");
        if(this.type != null){
            taskD.append(this.type.getDescription());
        }
        else { taskD.append("Unknown"); }
        taskD.append(".");
        //
        taskD.append("\nStatus of task: ");
        if(this.status != null){
            taskD.append(this.status.getDescription());
        }
        else { taskD.append("Unknown"); }
        taskD.append(".");
        //
        taskD.append("\nPriority of task: ");
        if(this.priority != null){
            taskD.append(this.priority.getDescription());
        }
        else { taskD.append("Unknown"); }
        taskD.append(".");
        //
        taskD.append("\nCategory of task: ");
        if(this.category != null){
            taskD.append(this.category.getName());
        }
        else { taskD.append("Unknown"); }
        taskD.append(".");
        //
        taskD.append("\nCreator: ");
        if(this.creator != null){
            taskD.append(this.creator.toString());
        }
        else { taskD.append("Unknown"); }
        taskD.append(".");
        //
        taskD.append("\nList of tags for task:");
        if((this.tags != null) && (!this.tags.isEmpty())){
            for(Tag tag : this.tags){
                taskD.append(" ");
                taskD.append(tag.getTagName());
            }
        }
        else { taskD.append(" Not tags."); }
        //
        taskD.append("\nList of addresses for reminder about task: ");
        if((this.addrRemind != null) && (!this.addrRemind.isEmpty())){
            for(Address addr : this.addrRemind){
                taskD.append("\n");
                taskD.append(addr.getAddress());
            }
        }
        else { taskD.append("Not addresses."); }
        //
        return taskD.toString();
    } 
}
