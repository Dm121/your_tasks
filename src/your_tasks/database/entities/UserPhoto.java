/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

import java.awt.Image;
import java.sql.Blob;
import java.io.File;
import java.io.IOException;
import your_tasks.util.ImageProcessing;
/**
 *Класс для хранения фотографии/изображения пользователя/контакта
 * @author DOG1
 */
public class UserPhoto {
    private Long idUser;
    private Image image;
    private MimeType mimeType;
    
    /**
     * 
     */
    public UserPhoto(){
        //
    }
    
    /*
     * (?) Нужен ли данный конструктор?:
    public UserPhoto(Long id, String path, int targetSize, MimeType mt){
        ImageProcessing imgP;
        //
        this.idUser = id;
        this.mimeType = mt;
        //
        imgP = new ImageProcessing();
        try{
            imgP.toScaleImage(path, targetSize);
        }
        catch(IOException e){
            System.err.println(e.getMessage());
            e.printStackTrace();
        }
        //
    }
    */
    
    /**
     * 
     * @param id
     * @param img
     * @param mt 
     */
    public UserPhoto(Long id, Image img, MimeType mt){
        this.idUser = id;
        this.image = img;
        this.mimeType = mt;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdUser(){
        return this.idUser; 
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdUser(Long id){
        this.idUser = id;
    }
    
    /**
     * 
     * @return 
     */
    public Image getImage(){
        return this.image;
    }
    
    /**
     * 
     * @param img 
     */
    public void setImage(Image img){
        this.image = img;
    }
    
    /**
     * 
     * @return 
     */
    public MimeType getMimeType(){
        return this.mimeType;
    }
    
    /**
     * 
     * @param mt 
     */
    public void setMimeType(MimeType mt){
        this.mimeType = mt;
    }
}
