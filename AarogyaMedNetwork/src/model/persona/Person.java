/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.persona;
import java.util.ArrayList;
/**
 *
 * @author amey8
 */
public class Person {
    //Person is a general class for Patient, Doctor, Staff...
    protected static int personcnt =1; //includes Patient, Doctor, Staff...
    protected int personid;
    protected String firstname;
    protected String lastname;
    protected String birthdate; //mmddyyyy
    protected int age;
    protected String gender;    
    protected String email;
    protected String mobileno;
    protected int address_id  ;

    public Person() {
        
    }

    public static int getPersoncnt() {
        return personcnt;
    }

    public static void setPersoncnt(int personcnt) {
        Person.personcnt = personcnt+1;
    }
    
    public static void setPersoncnt() {
        Person.personcnt = personcnt +1;
    }
    public  int getPersonid() {
        return personid;
    }

    public  void setPersonid() {
        personid = personcnt;
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
    
}
