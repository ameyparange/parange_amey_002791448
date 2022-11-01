/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.patienta;

import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class Encounter {
    ArrayList<VitalSigns> encounter;

    public Encounter(ArrayList<VitalSigns> encounter) {
        this.encounter = encounter;
    }

    public ArrayList<VitalSigns> getEncounter() {
        return encounter;
    }

    public void setEncounter(ArrayList<VitalSigns> encounter) {
        this.encounter = encounter;
    }


    
    
    
}
