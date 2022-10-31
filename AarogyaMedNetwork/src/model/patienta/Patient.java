/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patienta;
import model.persona.*;
/**
 *
 * @author amey8
 */
public class Patient extends Person{
    
    static int patient_cnt=1;
    protected int patient_id;
    protected int age;
    String username;
    String password;
    public Patient() {
    }
    public Patient(int ipersonid ,int ipatient_id,String ifirstname,String ilastname,
            int iage,String igender,String iemail,String imobileno,int iaddress_id , String iusername, String ipassword) 
    {
        setPersonid(ipersonid);
        this.setPatient_id(ipatient_id);
        this.setFirstname(ifirstname);
        this.setLastname(ilastname);
        this.setAge(iage);
        this.setGender(igender);
        this.setEmail(iemail);
        this.setMobileno(imobileno);
        this.setAddressid(iaddress_id);
        this.setUsername(iusername);
        this.setPassword(ipassword);
    }

    public static int getPatient_cnt() {
        return patient_cnt;
    }

    public static void setPatient_cnt() {
        patient_cnt = patient_cnt+1;
    }
    public static void setPatient_cnt(int patient_cnt) {
        Patient.patient_cnt = patient_cnt+1;
    }
    public int getPatient_id() {
        return patient_id;
    }

    public  void setPatient_id() {
        patient_id = patient_cnt;
        setPatient_cnt() ;
    }
    public  void setPatient_id(int ipatient_id)
    {patient_id=ipatient_id;}
    
    public  int getPersonid() {
        return personid;
    }

    public  void setPersonid() {
        personid = getPersoncnt() ;
        setPersoncnt();
    }
    public  void setPersonid(int ipersonid) {
        personid = ipersonid;
    } 

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }
    public int getAddressid() {
        return address_id;
    }

    public void setAddressid(int address_id) {
        this.address_id = address_id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
