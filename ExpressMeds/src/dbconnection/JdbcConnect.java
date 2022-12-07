/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Address;
import model.enterprise.Enterprise;
import model.enterprise.EnterpriseCatalog;

/**
 *
 * @author nehajoisher
 */
public class JdbcConnect {

    public Connection con;
    public PreparedStatement pet;
    public ResultSet myRs = null;

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }

    public PreparedStatement getPet() {
        return pet;
    }

    public void setPet(PreparedStatement pet) {
        this.pet = pet;
    }

    public ResultSet getMyRs() {
        return myRs;
    }

    public void setMyRs(ResultSet myRs) {
        this.myRs = myRs;
    }

    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/expressmeddb", "root", "amey@1105");

        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    public Connection connect(int i) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/expressmeddb", "root", "amey@1105");
            return con;
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return con;
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
            if (myRs.next()) {

                //System.out.println("UsER entered - " + Pass);
                //System.out.println((myRs.getString("password")));
                if (myRs.getString("password").equals(Pass)) {
                    //     System.out.println((Pass));

                    //  System.out.println(myRs.getString(password));
                    return 1;

                } else {
                    return 2;
                }
            }

        } catch (Exception e) {
            System.out.println(e.toString());

        }

        return 0;
    }

    public int insertenterprise(String ent_type, String name, String email, String location) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into enterprise(name,ent_type,email,location) values (?,?,?,?)");
            pet.setString(1, name);
            pet.setString(2, ent_type);
            pet.setString(3, email);
            pet.setString(4, location);
            int k = pet.executeUpdate();
            return k;
            

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
        
    }

    public int insertenterprise(Enterprise ent) {
        try {
            this.connect();
            pet = con.prepareStatement("insert into enterprise(name,ent_type,email,add_id) values (?,?,?,?)");
            pet.setString(1, ent.getName());
            pet.setString(2, ent.getEnt_type());
            pet.setString(3, ent.getEmail());
            pet.setInt(4, ent.getAddress_id());

            int k = pet.executeUpdate();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
    
//    public ArrayList<Enterprise> loadenterprisetab()
//    {
//        EnterpriseCatalog entcat=new  EnterpriseCatalog();
//        System.out.println("1");
//        try{
//        String query = "Select * from enterprise";
//        System.out.println("3");
//        PreparedStatement myStmt = con.prepareStatement(query);
//        System.out.println("4");
//            Enterprise e;
//            // Execute SQL query
//            ResultSet myRs = myStmt.executeQuery();
//            System.out.println("5");
//            while (myRs.next()) {
//                System.out.println(myRs.getString("name"));
//                e = new Enterprise(myRs.getInt("ent_id"),myRs.getString("ent_type"),myRs.getString("name"),myRs.getString("email"),myRs.getInt("add_id"));
//                entcat.addenterprise(e);
//            }
//        }
//        catch(Exception e)
//        {   System.out.println("2");
//            System.out.println(e.toString());}
//        return entcat;
//    }

    public int insertaddress(Address add) {
        int add_id = 9999;
        try {
            this.connect();
            pet = con.prepareStatement("insert into address(street,unit,city,state,zipcode) values (?,?,?,?,?)");
            pet.setString(1, add.getStreet());
            pet.setString(2, add.getUnit());
            pet.setString(3, add.getCity());
            pet.setString(4, add.getState());
            pet.setString(5, add.getZipcode());

            int k = pet.executeUpdate();
            //return k;
            pet = con.prepareStatement("select max(add_id) add_id from address");
            

            myRs = pet.executeQuery();

            if (myRs.next()) {
                System.out.println(myRs.getInt("add_id"));
                return myRs.getInt("add_id");
                
            }
        } catch (Exception e) {
            System.out.println(add_id);
            System.out.println(e.toString());
            return 0;
        }
        return 999;
    }

}
