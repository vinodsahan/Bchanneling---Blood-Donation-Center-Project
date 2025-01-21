/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Database.Connect;
import Models.AddDonor;
import javax.swing.JOptionPane;

/**
 *
 * @author msham
 */
public class AddDonorSrevice {
    static Connect c = Connect.getInstance();//
    public void addDonor(AddDonor d){
        String query = "INSERT INTO AddDonor Values ('"+d.getBloodGroup()+"','"+d.getName()+"','"+d.getBloodNo()+"','"+d.getAge()+"','"+d.getAddress()+"','"+d.getId()+"','"+d.getGender()+"','"+d.getWeight()+"','"+d.getHeight()+"','"+d.getpHome()+"','"+d.getpMobile()+"')";
        c.setQuery(query);
        JOptionPane.showMessageDialog(null,"Successfully saver ", "information", JOptionPane.INFORMATION_MESSAGE);
    }
}
//dates are not add in queary

