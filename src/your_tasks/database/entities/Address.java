/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Класс для хранения сведений об адресах (например, e-mail),
 * которые используются для напоминания о необходимости выполнения
 * приближающихся событий/задач
 * @author DOG1
 */
public class Address {
    private Long idAddress;
    private String address;
    private Boolean useFlag;
    private Method method;
    private User owner;
    private List<Task> tasks;
    
    /**
     * 
     */
    public Address(){
        //
    }
    
    /**
     * 
     * @param id
     * @param addr 
     */
    public Address(Long id, String addr){
        this.idAddress = id;
        this.address = addr;
        this.useFlag = true;
        this.method = null;
        this.owner = null;
        this.tasks = null;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdAddress(){
        return this.idAddress;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdAddress(Long id){
        this.idAddress = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getAddress(){
        return this.address;
    }
    
    /**
     * 
     * @param addr 
     */
    public void setAddress(String addr){
        this.address = addr;
    }
    
    /**
     * 
     * @return 
     */
    public Boolean getUseFlag(){
        return this.useFlag;
    }
    
    /**
     * 
     * @param flag 
     */
    public void setUseFlag(Boolean flag){
        this.useFlag = flag;
    }
    
    /**
     * 
     * @return 
     */
    public Method getMethod(){
        return this.method;
    }
    
    /**
     * 
     * @param method 
     */
    public void setMethod(Method method){
        this.method = method;
    }
    
    /**
     * 
     * @return 
     */
    public User getOwner(){
        return this.owner;
    }
    
    /**
     * 
     * @param owner 
     */
    public void setOwner(User owner){
        this.owner = owner;
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
        StringBuffer descr = new StringBuffer();
        descr.append("Id: ");
        descr.append(this.idAddress.toString());
        descr.append(": ");
        descr.append(this.address);
        descr.append(".");
        descr.append("\nUsed: ");
        if(this.useFlag){
            descr.append("Yes.");
        }
        else{
            descr.append("No.");
        }
        descr.append("\nMethod: ");
        if(this.method != null){
            descr.append(this.method.toString());
        }
        else{
            descr.append("Unknown.");
        }
        descr.append("\nOwner: ");
        if(this.owner != null){
            descr.append(this.owner.toString());
        }
        else{
            descr.append("Unknown.");
        }
        return descr.toString();
    }
}
