/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.util.List;
import java.util.ArrayList;
/**
 *Хранит сведения о Mime-типе изображения пользователя/контакта
 * @author DOG1
 */
public class MimeType {
    private Integer idMimeT;
    private String description;
    private String mimeT;
    private List<UserPhoto> imgs;
    
    /**
     * 
     */
    public MimeType(){
        //
    }
    
    /**
     * 
     * @param id
     * @param descr
     * @param ext 
     */
    public MimeType(Integer id, String descr, String ext){
        this.idMimeT = id;
        this.description = descr;
        this.mimeT = ext;
        this.imgs = null;
    }
    
    /**
     * 
     * @return 
     */
    public Integer getIdMimeT(){
        return this.idMimeT;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdMimeT(Integer id){
        this.idMimeT = id;
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
    public String getMimeT(){
        return this.mimeT;
    }
    
    /**
     * 
     * @param ext 
     */
    public void setMimeT(String ext){
        this.mimeT = ext;
    }
    
    /**
     * 
     * @return 
     */
    public List<UserPhoto> getImgs(){
        return this.imgs;
    }
    
    /**
     * 
     * @param imgs 
     */
    public void setImgs(List<UserPhoto> imgs){
        this.imgs = imgs;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "Id: " + this.idMimeT.toString() + 
                ".\nMIME-Type: " + this.mimeT + 
                ".\nDescription: " + this.description + ".";
    }
}
