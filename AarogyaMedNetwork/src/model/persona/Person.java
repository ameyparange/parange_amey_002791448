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
    protected static int personid =1000; //includes Patient, Doctor, Staff...
    protected String firstname;
    protected String lastname;
    protected String birthdate; //mmddyyyy
    protected String gender;    
    protected String email;
    protected int mobileno;
    ArrayList<Address> add1  ;

    public Person(ArrayList<Address> add1) {
        this.add1 = add1;
    }

    public static int getPersonid() {
        return personid;
    }

    public static void setPersonid() {
        personid = personid + 1;
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

    public int getMobileno() {
        return mobileno;
    }

    public void setMobileno(int mobileno) {
        this.mobileno = mobileno;
    }

    public ArrayList<Address> getAdd1() {
        return add1;
    }

    public void setAdd1(ArrayList<Address> add1) {
        this.add1 = add1;
    }
    
}
