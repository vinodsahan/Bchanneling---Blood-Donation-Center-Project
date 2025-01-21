/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author msham
 */
public class AddPatiant {
    //add date
    int patiantNo;
    int bloodNo;
    String bloodGroup;
    String name;
    int age;
    String address;
    int id;
    //date birth
    String gender;
    int weight;
    int height;
    int pHome;
    int pMobile;

    public AddPatiant(int patiantNo, int bloodNo, String bloodGroup, String name, int age, String address, int id, String gender, int weight, int height, int pHome, int pMobile) {
        this.patiantNo = patiantNo;
        this.bloodNo = bloodNo;
        this.bloodGroup = bloodGroup;
        this.name = name;
        this.age = age;
        this.address = address;
        this.id = id;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
        this.pHome = pHome;
        this.pMobile = pMobile;
    }

    public int getPatiantNo() {
        return patiantNo;
    }

    public void setPatiantNo(int patiantNo) {
        this.patiantNo = patiantNo;
    }

    public int getBloodNo() {
        return bloodNo;
    }

    public void setBloodNo(int bloodNo) {
        this.bloodNo = bloodNo;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getpHome() {
        return pHome;
    }

    public void setpHome(int pHome) {
        this.pHome = pHome;
    }

    public int getpMobile() {
        return pMobile;
    }

    public void setpMobile(int pMobile) {
        this.pMobile = pMobile;
    }
    
    
}
