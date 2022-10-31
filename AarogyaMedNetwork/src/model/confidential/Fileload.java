/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.confidential;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import model.patienta.Patient;
import model.patienta.Patientdirectory;
import model.persona.Address;
import model.persona.Community;

/**
 *
 * @author amey8
 */
public class Fileload {

    public void loadpatientfile(Patientdirectory patdir) {
        
        String filename = "file/patient.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter("files/patient.csv"))) {
            String line = "person_id,patient_id, firstname, lastname, age, gender,mobileno, email,  address_id";
            int i = 0;
            String rec;
            wr.write(line);
            for (Patient p : patdir.getPatientcatalog()) {
                wr.newLine();
                rec = p.getPersonid() + "," + p.getPatient_id() + "," + p.getFirstname() + "," + p.getLastname() + "," + p.getAge() + "," + p.getGender() + "," + p.getMobileno() + "," + p.getEmail();
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File Not Found1;");
        }

    }
    
    public void loadaddressfile(Community community){
        String filename = "file/address.csv";
        try ( BufferedWriter wr = new BufferedWriter(new FileWriter(filename))) {
            String line = "address_id, street, unit, city, state, zipcode";
            int i = 0;
            String rec;
            wr.write(line);
            for (Address add : community.getCommunity() ) {
                wr.newLine();
                //rec = p.getPersonid() + "," + p.getPatient_id() + "," + p.getFirstname() + "," + p.getLastname() + "," + p.getAge() + "," + p.getGender() + "," + p.getMobileno() + "," + p.getEmail();
                rec = add.getAddress_id()+ "," +add.getStreet()+ "," +add.getUnit()+ "," +add.getCity()+ "," +add.getState()+ "," +add.getZipcode();
                wr.append(rec);
            }

            wr.close();
        } catch (Exception e) {
            System.out.println("File Not Found1;");
        }
    
    }

}
