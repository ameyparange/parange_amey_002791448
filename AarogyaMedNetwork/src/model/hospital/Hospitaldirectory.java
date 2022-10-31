/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospital;

import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class Hospitaldirectory {
    ArrayList<Hospital> hosdir;

    public Hospitaldirectory(ArrayList<Hospital> hosdir) {
        this.hosdir = hosdir;
    }

    public ArrayList<Hospital> getHosdir() {
        return hosdir;
    }

    public void setHosdir(ArrayList<Hospital> hosdir) {
        this.hosdir = hosdir;
    }

    public void addnewhospital() {
        Hospital add1 = new Hospital();
        hosdir.add(add1);
        
    }

    public void addnewhospital(Hospital add1) {
        hosdir.add(add1);
    }
    
    public void updatehospital(Hospital updpat, int hospital_id) {
        
        int i = 0;
        for (Hospital p : hosdir) {
            if (p.getHospital_id() == hospital_id) {
                deletehospitalrec(hospital_id);
                hosdir.add(i, updpat);
                break;
            }
            i++;
        }

    }
    public void deletehospitalrec(int pat) {
        //catalog.remove(emp);
        
        int i=0;
        for (Hospital c:hosdir){
            if (c.getHospital_id()==pat ) {
                hosdir.remove(i);
                        break;
            }
            i++;
        }

    }

    public Hospital searchIndexhospital(int add_id) {
        
        for (Hospital c:hosdir){
            if (c.getHospital_id()==add_id ) {
                return c;
            }
           
        }

        return null;
    }
    
}
