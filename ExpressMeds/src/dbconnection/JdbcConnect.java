/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author nehajoisher
 */
public class JdbcConnect {

    Connection con;
    PreparedStatement pet;
    ResultSet myRs = null;

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/expressmeddb", "root", "");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public void insertrec() {
        try {
            this.connect();
            String name = "admin";
            int id = 1;
            String pass = "admin";
            String role = "admin";

            pet = con.prepareStatement("insert into useraccount(username,per_id,password,role_name) values (?,?,?,?)");
            pet.setString(1, name);
            pet.setInt(2, id);
            pet.setString(3, pass);
            pet.setString(4, role);

            pet.executeUpdate();
            displayData();

        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }

    public void displayData() {
        try {
            this.connect();
            // Prepare Statement

            String query = "Select * from useraccount";
            PreparedStatement myStmt = con.prepareStatement(query);

            // Execute SQL query
            ResultSet myRs = myStmt.executeQuery();
            while (myRs.next()) {
                String Name = myRs.getString("username");
                String role = myRs.getString("role_name");

                System.out.println(Name + "     " + role);
                System.out.println(Name + "     " + role);
            }

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }

    public void deleteData() {

        try {
            this.connect();

            pet = con.prepareStatement("DELETE FROM useraccount");
            pet.executeUpdate();

            displayData();

        } catch (Exception e) {
            System.out.println(e.toString());

        }

    }

    public int checkCred(String Uname, String Pass) {
        try {
            this.connect();

            pet = con.prepareStatement("select * from useraccount where username=?");
           pet.setString(1, Uname);
 
            myRs = pet.executeQuery();
            if(myRs.next()){
              
           System.out.println("UsER entered - "+Pass);
           System.out.println((myRs.getString("password")));
            if (myRs.getString("password").equals(Pass)) {
           //     System.out.println((Pass));
                
              //  System.out.println(myRs.getString(password));
                return 1;

            } else {
                return 2;
            }}

        } catch (Exception e) {
            System.out.println(e.toString());

        }

        return 0;
    }

}
