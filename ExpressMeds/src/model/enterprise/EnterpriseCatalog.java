/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.enterprise;

import dbconnection.JdbcConnect;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author amey8
 */
public class EnterpriseCatalog {
    ArrayList<Enterprise> ent; 

    public EnterpriseCatalog(ArrayList<Enterprise> ent) {
        this.ent = ent;
    }
public EnterpriseCatalog() {
    JdbcConnect jdbc = new JdbcConnect();
    
    try {
            jdbc.connect();
            // Prepare Statement

            String query = "Select * from enterprise";
            PreparedStatement myStmt = jdbc.con.prepareStatement(query) ;

            // Execute SQL query
            Enterprise e;
            // Execute SQL query
            ResultSet myRs = myStmt.executeQuery();
            //System.out.println("5");
            while (myRs.next()) {
                //System.out.println(myRs.getString("name"));
                e = new Enterprise(myRs.getInt("ent_id"),myRs.getString("ent_type"),
                        myRs.getString("name"),myRs.getString("email"),myRs.getInt("add_id"));
                this.addenterprise(e);
            }

        } catch (Exception e) {
            System.out.println(e.toString());

        }
    //this.ent=jdbc.loadenterprisetab();
    }
    public ArrayList<Enterprise> getEnt() {
        return ent;
    }

    public void setEnt(ArrayList<Enterprise> ent) {
        this.ent = ent;
    }
    
    public void addenterprise(Enterprise e)
    {//System.out.println(e.getEnt_type());
    
        this.ent.add(e);
    }
}
