/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.util;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 *Класс, содержащий методы для обработки изображений
 * @author DOG1
 */
public class ImageProcessing {
    
    /**
     * 
     */
    public ImageProcessing(){
        //
    } 
    
    /**
     * 
     * Надо будет переделать; Ещё не тестировалось
     * 
     * @param url
     * @param sizeSideSquare
     * @return
     * @throws IOException 
     */
    public Image toScaleImage(URL url, int sizeSideSquare)
                                    throws IOException{
        int w, h, targetW, targetH;
        float xScale;
        //BufferedImage tmp;
        //Graphics2D g2;
        Image originalImage = ImageIO.read(url);
        //((BufferedImage)object)
        w = ((BufferedImage)originalImage).getWidth();
        h = ((BufferedImage)originalImage).getHeight();
        //Для уменьшения: && (w > sizeSideSquare)
        //
        if(w >= h){
            xScale = (float)sizeSideSquare / (float)w;
            targetW = sizeSideSquare;
            targetH = (int)(xScale * h);
        }
        else{
            xScale = (float)sizeSideSquare / (float)h;
            targetH = sizeSideSquare;
            targetW = (int)(xScale * w);
        }
        //from JDK 1.1 - зависит от платформы (platform-dependent):
        Image destImage = originalImage.getScaledInstance(
                            targetW, targetH, Image.SCALE_SMOOTH);
        //
        //g2 = (Graphics2D)destImage.getGraphics();
        //g2.drawImage(destImage, 0, 0, null);
        //g2.dispose();
        //
        return destImage;
    }
    
    /**
     * 
     * Надо будет переделать; Ещё не тестировалось
     * 
     * @param path
     * @param sizeSideSquare
     * @return
     * @throws IOException 
     */
    public Image toScaleImage(String path, int sizeSideSquare)
                                    throws IOException{
        int w, h, targetW, targetH;
        float xScale;
        //BufferedImage tmp;
        //Graphics2D g2;
        File fImg = new File(path);
        Image originalImage = ImageIO.read(fImg);
        //((BufferedImage)object)
        w = ((BufferedImage)originalImage).getWidth();
        h = ((BufferedImage)originalImage).getHeight();
        //Для уменьшения: && (w > sizeSideSquare)
        //
        if(w >= h){
            xScale = sizeSideSquare / w;
            targetW = sizeSideSquare;
            targetH = (int)(xScale * h);
        }
        else{
            xScale = sizeSideSquare / h;
            targetH = sizeSideSquare;
            targetW = (int)(xScale * w);
        }
        //from JDK 1.1 - зависит от платформы (platform-dependent):
        Image destImage = originalImage.getScaledInstance(
                            targetW, targetH, Image.SCALE_SMOOTH);
        //
        //g2 = ((BufferedImage)destImage).createGraphics();
        //g2.drawImage(destImage, 0, 0, null);
        //g2.dispose();
        //
        return destImage;
    }
    
    /**
     * 
     * Надо переделать с использованием того же алгоритма,
     * что будет использоваться и в выше указанном методе
     * 
     * @param img
     * @param sizeSideSquare
     * @return
     */
    public Image toScaleImage(Image img, int sizeSideSquare){
        int w, h, targetW, targetH;
        float xScale;
        //Graphics2D g2;
        //
        w = ((BufferedImage)img).getWidth();
        h = ((BufferedImage)img).getHeight();
        //
        if(w >= h){
            xScale = sizeSideSquare / w;
            targetW = sizeSideSquare;
            targetH = (int)(xScale * h);
        }
        else{
            xScale = sizeSideSquare / h;
            targetH = sizeSideSquare;
            targetW = (int)(xScale * w);
        }
        //from JDK 1.1 - зависит от платформы (platform-dependent):
        Image destImage = img.getScaledInstance(
                            targetW, targetH, Image.SCALE_SMOOTH);
        //<...>
        //
        //g2 = ((BufferedImage)destImage).createGraphics();
        //g2.drawImage(destImage, 0, 0, null);
        //g2.dispose();
        //<...>
        //
        return destImage;
    }
    
    /**
     * 
     * Надо переделать с использованием того же алгоритма,
     * что будет использоваться и в выше указанных методах 
     * 
     * @param img
     * @param targetWidth
     * @param targetHeight
     * @return 
     */
    /*
    public Image toScaleImage(Image img, int targetWidth, int targetHeight){
        int w, h, targetW, targetH;
        float xScale;
        Graphics2D g2;
        //
        w = ((BufferedImage)img).getWidth();
        h = ((BufferedImage)img).getHeight();
        //Сохранение пропорций относительно длины на ширину
        if(w >= h){
            xScale = sizeSideSquare / w;
            targetW = sizeSideSquare;
            targetH = (int)(xScale * h);
        }
        else{
            xScale = sizeSideSquare / h;
            targetH = sizeSideSquare;
            targetW = (int)(xScale * w);
        }
        //from JDK 1.1 - зависит от платформы (platform-dependent):
        Image destImage = img.getScaledInstance(
                            targetW, targetH, Image.SCALE_SMOOTH);
        //<...>
        //
        g2 = ((BufferedImage)destImage).createGraphics();
        g2.drawImage(destImage, 0, 0, null);
        g2.dispose();
        //<...>
        //
        return destImage;
    }
    */
}
