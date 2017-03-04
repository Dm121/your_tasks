/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package your_tasks.database.entities;

/**
 *Класс для описания рабочего статуса (должность, отдел, организация)
 * пользователя/контакта
 * @author DOG1
 */
public class Work {
    private Long idWorkRec;
    private String position;
    private String department;
    private String organization;
    private User employee;
    
    /**
     * 
     */
    public Work(){
        //
    }
    
    /**
     * 
     * @param id
     * @param pos
     * @param dep
     * @param org 
     */
    public Work(Long id, String pos, String dep, String org){
        this.idWorkRec = id;
        this.position = pos;
        this.department = dep;
        this.organization = org;
        this.employee = null;
    }
    
    /**
     * 
     * @return 
     */
    public Long getIdWorkRec(){
        return this.idWorkRec;
    }
    
    /**
     * 
     * @param id 
     */
    public void setIdWorkRec(Long id){
        this.idWorkRec = id;
    }
    
    /**
     * 
     * @return 
     */
    public String getPosition(){
        return this.position;
    }
    
    /**
     * 
     * @param pos 
     */
    public void setPosition(String pos){
        this.position = pos;
    }
    
    /**
     * 
     * @return 
     */
    public String getDepartment(){
        return this.department;
    }
    
    /**
     * 
     * @param dep 
     */
    public void setDepartment(String dep){
        this.department = dep;
    }
    
    /**
     * 
     * @return 
     */
    public String getOrganization(){
        return this.organization;
    }
    
    /**
     * 
     * @param org 
     */
    public void setOrganization(String org){
        this.organization = org;
    }
    
    /**
     * 
     * @return 
     */
    public User getEmployee(){
        return this.employee;
    }
    
    /**
     * 
     * @param emp 
     */
    public void setEmployee(User emp){
        this.employee = emp;
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public String toString(){
        StringBuffer workD = new StringBuffer();
        //
        workD.append("Id of record about work: ");
        workD.append(this.idWorkRec.toString());
        workD.append(".\nPosition: ");
        workD.append(this.position);
        workD.append(".\nDepartment: ");
        workD.append(this.department);
        workD.append(".\nOrganization: ");
        workD.append(this.organization);
        workD.append(".\nUser data: ");
        if(this.employee != null){
            workD.append("\n");
            workD.append(this.employee.toString());
        }
        else { workD.append("Unknown."); }
        //
        return workD.toString();
    }
}