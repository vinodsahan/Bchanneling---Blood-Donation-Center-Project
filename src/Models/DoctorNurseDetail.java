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
public class DoctorNurseDetail {
    String doctorName;
    int doctorId;
    String Speciality;
    String doctorEducation;
    //expiriance date
    String doctorAddress;
    int doctorPhone;
    String nurseName;
    int nurseId;
    String section;
    String nurseEducation;
    //expiriance date
    String nurseAddress;
    String nursePhone;

    public DoctorNurseDetail(String doctorName, int doctorId, String Speciality, String doctorEducation, String doctorAddress, int doctorPhone, String nurseName, int nurseId, String section, String nurseEducation, String nurseAddress, String nursePhone) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.Speciality = Speciality;
        this.doctorEducation = doctorEducation;
        this.doctorAddress = doctorAddress;
        this.doctorPhone = doctorPhone;
        this.nurseName = nurseName;
        this.nurseId = nurseId;
        this.section = section;
        this.nurseEducation = nurseEducation;
        this.nurseAddress = nurseAddress;
        this.nursePhone = nursePhone;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String Speciality) {
        this.Speciality = Speciality;
    }

    public String getDoctorEducation() {
        return doctorEducation;
    }

    public void setDoctorEducation(String doctorEducation) {
        this.doctorEducation = doctorEducation;
    }

    public String getDoctorAddress() {
        return doctorAddress;
    }

    public void setDoctorAddress(String doctorAddress) {
        this.doctorAddress = doctorAddress;
    }

    public int getDoctorPhone() {
        return doctorPhone;
    }

    public void setDoctorPhone(int doctorPhone) {
        this.doctorPhone = doctorPhone;
    }

    public String getNurseName() {
        return nurseName;
    }

    public void setNurseName(String nurseName) {
        this.nurseName = nurseName;
    }

    public int getNurseId() {
        return nurseId;
    }

    public void setNurseId(int nurseId) {
        this.nurseId = nurseId;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getNurseEducation() {
        return nurseEducation;
    }

    public void setNurseEducation(String nurseEducation) {
        this.nurseEducation = nurseEducation;
    }

    public String getNurseAddress() {
        return nurseAddress;
    }

    public void setNurseAddress(String nurseAddress) {
        this.nurseAddress = nurseAddress;
    }

    public String getNursePhone() {
        return nursePhone;
    }

    public void setNursePhone(String nursePhone) {
        this.nursePhone = nursePhone;
    }
     
}
