/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.gui;

import java.awt.Image;
import java.awt.Font;
import java.awt.Color;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import static javax.swing.GroupLayout.Alignment.*;
import javax.swing.border.*;
import your_tasks.util.ImageProcessing;
/**
 *Класс для описания панели JPanel с пользовательскими данными
 * @author DOG1
 */
public class UserPanel extends JPanel{
    private final static int DEFAULT_NSIZE = 3;
    //
    private final List<JLabel> titleLabel;
    //
    private final List<JLabel> dataLabel;
    //
    private final JLabel photoLabel;
    //
    private final JButton regBut;
    private final JButton signInBut;
    //
    private final ImageProcessing imgProc;
    
    /**
     * 
     */
    public UserPanel(){
       super();
       //
       int i;   //for loop
       this.titleLabel = new ArrayList<JLabel>();
       this.dataLabel = new ArrayList<JLabel>();
       //
       this.photoLabel = new JLabel();
       //
       this.regBut = new JButton();
       this.signInBut = new JButton();
       //
       this.imgProc = new ImageProcessing();
       //
       for(i = 0; i < DEFAULT_NSIZE; i++){
           this.titleLabel.add(new JLabel());
           this.dataLabel.add(new JLabel());
       }
    }
    
    /**
     * 
     * @param i
     * @return 
     */
    public JLabel getDataLabelItem(int i){
        JLabel elem = null;
        //
        if((i > -1) && (i < this.dataLabel.size())){
            elem = this.dataLabel.get(i);
        }
        //
        return elem;
    }
    
    /**
     * 
     * @param img 
     */
    public void setPhoto(Image img){
        ImageIcon imgIc = new ImageIcon(
                this.imgProc.toScaleImage(img, this.photoLabel.getWidth()));
        this.photoLabel.setIcon(imgIc);
    }
    
    /**
     * 
     * @param path 
     */
    public void setPhoto(String path){
        try{
            ImageIcon imgIc = new ImageIcon(
                this.imgProc.toScaleImage(path, this.photoLabel.getWidth()));
            this.photoLabel.setIcon(imgIc);
        }
        catch(IOException ioe){
            System.out.println("Can't load image at the specified path\n");
            ioe.printStackTrace();
        }
    }
    
    /**
     * 
     * @param url 
     */
    public void setPhoto(URL url){
        try{
            ImageIcon imgIc = new ImageIcon(
                this.imgProc.toScaleImage(url, this.photoLabel.getWidth()));
            this.photoLabel.setIcon(imgIc);
        }
        catch(IOException ioe){
            System.out.println("Can't load image from the specified url\n");
            ioe.printStackTrace();
        }
    }
    
    /**
     * 
     * @return 
     */
    public JButton getRegBut(){
        return this.regBut;
    }
    
    /**
     * 
     * @return 
     */
    public JButton getSignInBut(){
        return this.signInBut;
    }
    
    /**
     * 
     */
    public void formUserPanel(){
        final int SIZE_PHOTO = 128;
        final int TITLE_WIDTH = 50;
        final int DATA_WIDTH = 100;
        final int BUTTON_WIDTH = 150;
        final int ELEM_HEIGHT = 25;
        //
        int i;  //for loop
        //
        Font fontElem = new Font("Tahoma", Font.BOLD, 11);
        Font fontBorderGroup = new Font("Tahoma", Font.BOLD, 12);
        //
        GroupLayout layout = new GroupLayout(this);
        this.setLayout(layout);
        //
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);
        //
        layout.setHorizontalGroup(layout.createParallelGroup(LEADING)
            .addComponent(this.photoLabel, GroupLayout.PREFERRED_SIZE, SIZE_PHOTO, GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(LEADING)
                    .addComponent(this.titleLabel.get(0), GroupLayout.PREFERRED_SIZE, TITLE_WIDTH, GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.titleLabel.get(1), GroupLayout.PREFERRED_SIZE, TITLE_WIDTH, GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.titleLabel.get(2), GroupLayout.PREFERRED_SIZE, TITLE_WIDTH, GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(LEADING)
                    .addComponent(this.dataLabel.get(0), GroupLayout.PREFERRED_SIZE, DATA_WIDTH, GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.dataLabel.get(1), GroupLayout.PREFERRED_SIZE, DATA_WIDTH, GroupLayout.PREFERRED_SIZE)
                    .addComponent(this.dataLabel.get(2), GroupLayout.PREFERRED_SIZE, DATA_WIDTH, GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(CENTER)    //BASELINE
                .addComponent(this.getRegBut(), GroupLayout.PREFERRED_SIZE, BUTTON_WIDTH, GroupLayout.PREFERRED_SIZE)
                .addComponent(this.getSignInBut(), GroupLayout.PREFERRED_SIZE, BUTTON_WIDTH, GroupLayout.PREFERRED_SIZE))
        );
        
        layout.setVerticalGroup(layout.createSequentialGroup()
            .addComponent(this.photoLabel, GroupLayout.DEFAULT_SIZE, SIZE_PHOTO, GroupLayout.DEFAULT_SIZE)
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(this.titleLabel.get(0), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE)
                .addComponent(this.dataLabel.get(0), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE))
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(this.titleLabel.get(1), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE)
                .addComponent(this.dataLabel.get(1), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE))
            .addGroup(layout.createParallelGroup(BASELINE)
                .addComponent(this.titleLabel.get(2), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE)
                .addComponent(this.dataLabel.get(2), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE))
            .addComponent(this.getRegBut(), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE)
            .addComponent(this.getSignInBut(), GroupLayout.DEFAULT_SIZE, ELEM_HEIGHT, GroupLayout.DEFAULT_SIZE)
        );
        
        this.photoLabel.setSize(SIZE_PHOTO, SIZE_PHOTO);
        this.setPhoto(getClass().getResource("/your_tasks/gui/img/photo.png"));
        //
        for(i = 0; i < DEFAULT_NSIZE; i++){
            this.titleLabel.get(i).setSize(TITLE_WIDTH, ELEM_HEIGHT);
            this.titleLabel.get(i).setFont(fontElem);
            this.dataLabel.get(i).setSize(DATA_WIDTH, ELEM_HEIGHT);
        }
        //
        this.getRegBut().setSize(BUTTON_WIDTH, ELEM_HEIGHT);
        this.getRegBut().setFont(fontElem);
        this.getSignInBut().setSize(BUTTON_WIDTH, ELEM_HEIGHT);
        this.getSignInBut().setFont(fontElem);
        //
        TitledBorder tb = new TitledBorder(new LineBorder(Color.GRAY));
        tb.setTitleFont(fontBorderGroup);
        this.setBorder(tb);
        //
        this.setTextElements();     //*1
    }
    
    //@param ResourceBundle messages = 
    // ResourceBundle.getBundle("MessagesBundle", 
    // new Locale(language, country));
    // >> new Locale("ru", "RU") >> new Locale("en", "US")
    /**
     * 
     */
    public void setTextElements(){
        ((TitledBorder)this.getBorder()).setTitle("Пользователь: ");
        this.photoLabel.setToolTipText("Фотография пользователя");
        this.titleLabel.get(0).setText("Имя: ");
        this.titleLabel.get(1).setText("Фамилия: ");
        this.titleLabel.get(2).setText("E-mail: ");
        this.getDataLabelItem(0).setText("");
        this.getDataLabelItem(1).setText("");
        this.getDataLabelItem(2).setText("");
        this.getRegBut().setText("Регистрация");
        this.getSignInBut().setText("Вход");
    }
}
