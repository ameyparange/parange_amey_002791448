/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.confidential;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author amey8
 */
public class Authentication {
    ArrayList<Credentials> records = new ArrayList<>();

    public Authentication() {
        Credentials cred ;
        try ( BufferedReader br = new BufferedReader(new FileReader("files/credentails.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                cred  = new Credentials(values[0],values[1],values[2]);
                System.out.println(cred.usertype);
                records.add(cred);
            }
        } catch (Exception e) {
            System.out.println("File Not Found;");
        }
    }
    
    public boolean checkauth(Credentials cred) {
        for (Credentials auth : records)
        {
            
            System.out.println(auth.getUsername()+":"+cred.getUsername());
            System.out.println(auth.getPassword()+":"+cred.getPassword());
            System.out.println(auth.getUsertype()+":"+cred.getUsertype());
            
            if (auth.getUsername().equals(cred.getUsername()) && auth.getPassword().equals(cred.getPassword() )
                    && auth.getUsertype().equals(cred.getUsertype())){
                return true;}
        }
        return false;
    }
}