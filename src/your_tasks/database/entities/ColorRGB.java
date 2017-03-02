/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

/**
 *Класс для хранения информации о цвете в палитре RGB,
 * соответствующем конкретному статусу и/или приоритету события/задачи
 * @author DOG1
 */
public class ColorRGB {
    private Short colorR;
    private Short colorG;
    private Short colorB;
    
    /**
     * 
     */
    public ColorRGB(){
        this.colorR = 255;
        this.colorG = 255;
        this.colorB = 255;
    }
    
    /**
     * 
     * @param r
     * @param g
     * @param b 
     */
    public ColorRGB(Short r, Short g, Short b){
        this.colorR = r;
        this.colorG = g;
        this.colorB = b;
    }
    
    /**
     * 
     * @return 
     */
    public Short getColorR(){
        return this.colorR;
    }
    
    /**
     * 
     * @param r 
     */
    public void setColorR(Short r){
        this.colorR = r;
    }
    
    /**
     * 
     * @return 
     */
    public Short getColorG(){
        return this.colorG;
    }
    
    /**
     * 
     * @param g 
     */
    public void setColorG(Short g){
        this.colorG = g;
    }
    
    /**
     * 
     * @return 
     */
    public Short getColorB(){
        return this.colorB;
    }
    
    /**
     * 
     * @param b 
     */
    public void setColorB(Short b){
        this.colorB = b;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        return "Color Parameters:\nR: " + this.colorR + ";\nG: " + this.colorG + 
                ";\nB: " + this.colorB + ".";
    }
}
