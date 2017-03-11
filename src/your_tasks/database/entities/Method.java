/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.Set;
import java.util.HashSet;
/**
 *Класс для хранения сведений о методах (напрмер, e-mail).
 * используемых для напоминания о необходимости выполнения
 * грядущего события/задачи
 * @author DOG1
 */
public class Method {
    private Integer idMethod;
    private String description;
    private Set<Address> setAddr;
    
    /**
     * 
     */
    public Method(){
        //
    }
    
    /**
     * 
     * @param id
     * @param descr 
     */
    public Method(Integer id, String descr){
        this.idMethod = id;
        this.description = descr;
        this.setAddr = null;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getIdMethod(){
        return this.idMethod;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdMethod(Integer id){
        this.idMethod = id;
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
    public Set<Address> getSetAddr(){
        return this.setAddr;
    }
    
    /**
     * 
     * @param addresses 
     */
    public void setSetAddr(Set<Address> addresses){
        this.setAddr = addresses;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "Id: " + this.idMethod.toString() + ": " + 
                this.description + ".";
    }
}
