/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbcconnect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author amey8
 */
public class Dbconnect {
    Connection con;
    PreparedStatement pet;

    public Dbconnect() {
    }
    
    public void connect(){
        try{
            Class.forName("com.mysql.jdbc.Driver" );
            this.con = DriverManager.getConnection("jdbc:mysql://localhost/expressmeddb","root","amey@1105")   ;   
        }
        catch( Exception e) {
            System.out.println(e.toString());
        }
    }
    
    public int insertrec(){
        try{
            this.connect();
            String name="Samadhan";
        String ent_type="Supplier";
        String email="sam@gmail.com";
        String location= "Boston";
        pet = con.prepareStatement("insert into enterprise(name,ent_type,email,location) values (?,?,?,?)");
        pet.setString(1, name);
        pet.setString(2, ent_type);
        pet.setString(3, email);
        pet.setString(4, location);
        int k= pet.executeUpdate();
        return k;
        
    }catch ( Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
    
    public int insertenterprise(String ent_type, String name, String email, String location ){
        try{
            this.connect();
        pet = con.prepareStatement("insert into enterprise(name,ent_type,email,location) values (?,?,?,?)");
        pet.setString(1, name);
        pet.setString(2, ent_type);
        pet.setString(3, email);
        pet.setString(4, location);
        int k= pet.executeUpdate();
        return k;
        
    }catch ( Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }
}

