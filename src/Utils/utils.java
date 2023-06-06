/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Utils;

import javax.swing.JOptionPane;

/**
 *
 * @author Alfian Widitama
 */
public class utils {
    String name, age, classStr;
    int id;
    
    public static void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void setStudents(String nameArgs, String ageArgs, String classArgs, int idArgs){
        this.name = nameArgs;
        this.age = ageArgs;
        this.classStr = classArgs;
        this.id = idArgs;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAge(){
        return this.age;
    }
    
    public String getClassStr(){
        return this.classStr;
    }
    
    public int getId(){
        return this.id;
    }
}
