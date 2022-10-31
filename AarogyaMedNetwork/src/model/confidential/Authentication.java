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
    ArrayList<Credentials> auth = new ArrayList<>();

    public Authentication() {
        Credentials cred ;
        
        try ( BufferedReader br = new BufferedReader(new FileReader("files/credentials.csv"))) {
            String line;
            int i=0;
            
            System.out.println("2");
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                        i++;
                        //System.out.println(line);

                    } else {
                String[] values = line.split(",");
                System.out.println(" 3");
                cred  = new Credentials(values[0],values[1],values[2],Integer.valueOf(values[3]));
                System.out.println(" 4");
                auth.add(cred);
                System.out.println(" 1");
            }}
            br.close();
        } catch (Exception e) {
            System.out.println(e+" credentials.csv File Not Found;");
        }
    }

    public ArrayList<Credentials> getAuth() {
        return auth;
    }

    public void setAuth(ArrayList<Credentials> auth) {
        this.auth = auth;
    }
    
    public void addnewcredentials(Credentials cred) {

        auth.add(cred);
        //return emp;
    }
    
    public boolean checkauth(Credentials cred) {
        for (Credentials cred1 : auth)
        {
            if (cred1.getUsername().equals(cred.getUsername()) && cred1.getPassword().equals(cred.getPassword() )
                    && cred1.getUsertype().equals(cred.getUsertype())){
                return true;}
        }
        return false;
    }
}