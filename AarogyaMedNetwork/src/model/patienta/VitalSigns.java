/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patienta;

/**
 *
 * @author amey8
 */
public class VitalSigns {
    
    int patient_id;
    int vitalsignsid;
    String heartrate;
    String bloodpressure;
    String sugerlevel;
    String temperature;
    String symtoms;
    String timestamp;
    public VitalSigns(int patient_id, int vitalsignsid, String heartrate, String bloodpressure, String sugerlevel, String temperature, String symtoms) {
        this.patient_id = patient_id;
        this.vitalsignsid = vitalsignsid;
        this.heartrate = heartrate;
        this.bloodpressure = bloodpressure;
        this.sugerlevel = sugerlevel;
        this.temperature = temperature;
        this.symtoms = symtoms;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        this.patient_id = patient_id;
    }

    public int getVitalsignsid() {
        return vitalsignsid;
    }

    public void setVitalsignsid(int vitalsignsid) {
        this.vitalsignsid = vitalsignsid;
    }

    public String getHeartrate() {
        return heartrate;
    }

    public void setHeartrate(String heartrate) {
        this.heartrate = heartrate;
    }

    public String getBloodpressure() {
        return bloodpressure;
    }

    public void setBloodpressure(String bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public String getSugerlevel() {
        return sugerlevel;
    }

    public void setSugerlevel(String sugerlevel) {
        this.sugerlevel = sugerlevel;
    }

    public String getTemperature() {
        return temperature;
    }

    public void setTemperature(String temperature) {
        this.temperature = temperature;
    }

    public String getSymtoms() {
        return symtoms;
    }

    public void setSymtoms(String symtoms) {
        this.symtoms = symtoms;
    }
    
    
    
}
