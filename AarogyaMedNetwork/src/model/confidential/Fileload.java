/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.confidential;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.patienta.Patient;
import model.patienta.Patientdirectory;

/**
 *
 * @author amey8
 */
public class Fileload {
    public ArrayList<Patient> loadpatientdir ( )
    {
        Patientdirectory patientcatalog=new Patientdirectory();
        String filename="file/patient.csv";
        
        return patientcatalog;
    }
    
}
