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
            this.con.setAutoCommit(false);
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
            con.commit();
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
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public int updateenterprise(Enterprise ent) {
        try {
            this.connect();

            pet = con.prepareStatement("update enterprise "
                    + " set name=?,ent_type=?,email=? where ent_id= ? ");

            pet.setString(1, ent.getName());
            pet.setString(2, ent.getEnt_type());
            pet.setString(3, ent.getEmail());
            pet.setInt(4, ent.getEnt_id());
            System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }

    }

    public int searchenterpriseadd_id(int ent_id) {
        this.connect();
        try {
            pet = con.prepareStatement("select add_id from enterprise where ent_id=?");
            pet.setInt(1, ent_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {

                return myRs.getInt("add_id");

            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return 9999;
        }
        return 9999;
    }

    public Enterprise searchenterpriseon_entid(int ent_id) {
        Enterprise e;
        this.connect();
        try {
            pet = con.prepareStatement("select * from enterprise where ent_id=?");
            pet.setInt(1, ent_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));

                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

    public Enterprise searchenterpriseon_name(String name) {
        this.connect();
        Enterprise e;
        try {
            pet = con.prepareStatement("select * from enterprise where name=?");
            pet.setString(1, name);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));
                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

    public Enterprise searchenterpriseon_type(String type) {
        this.connect();
        Enterprise e;
        try {
            pet = con.prepareStatement("select * from enterprise where ent_type=?");
            pet.setString(1, type);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));
                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

    public Enterprise searchenterpriseon_city(String city) {
        this.connect();
        Enterprise e;
        try {
            pet = con.prepareStatement("select e.* from enterprise e join address a on a.add_id = e.add_id where a.city=?");
            pet.setString(1, city);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                e = new Enterprise(myRs.getInt("ent_id"), myRs.getString("ent_type"),
                        myRs.getString("name"), myRs.getString("email"), myRs.getInt("add_id"));
                return e;

            }
        } catch (Exception et) {
            System.out.println("9999");
            System.out.println(et.toString());
            return new Enterprise();
        }
        return new Enterprise();
    }

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
            con.commit();
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

    public int updateAddress(Address add) {
        try {
            this.connect();
            //pet = con.prepareStatement("insert into enterprise(name,ent_type,email,add_id) values (?,?,?,?)");
            pet = con.prepareStatement("update Address set street=?,unit=?,city=?,state=?,zipcode=? where add_id=?");

            pet.setString(1, add.getStreet());
            pet.setString(2, add.getUnit());
            pet.setString(3, add.getCity());
            pet.setString(4, add.getState());
            pet.setString(5, add.getZipcode());
            pet.setInt(6, add.getAdd_id());

            System.out.println(pet.toString());
            int k = pet.executeUpdate();
            con.commit();
            System.out.println("Value" + k);
            return k;

        } catch (Exception e) {
            System.out.println(e.toString());
            return 0;
        }
    }

    public Address searchAddress(int add_id) {
        this.connect();
        Address add;
        try {
            pet = con.prepareStatement("select * from address where add_id=?");
            pet.setInt(1, add_id);
            myRs = pet.executeQuery();

            if (myRs.next()) {
                add = new Address(add_id, myRs.getString("street"), myRs.getString("unit"), myRs.getString("city"), myRs.getString("state"), myRs.getString("zipcode"));
                return add;
            }
        } catch (Exception e) {
            System.out.println("9999");
            System.out.println(e.toString());
            return new Address();
        }
        return new Address();
    }

//        public Address searchAddresson_city(String city) {
//        this.connect();
//        Address add;
//        try {
//            pet = con.prepareStatement("select * from address where city=?");
//            pet.setString(1, city);
//            myRs = pet.executeQuery();
//
//            if (myRs.next()) {
//                add = new Address(add_id, myRs.getString("street"), myRs.getString("unit"), myRs.getString("city"), myRs.getString("state"), myRs.getString("zipcode"));
//                return add;
//            }
//        } catch (Exception e) {
//            System.out.println("9999");
//            System.out.println(e.toString());
//            return new Address();
//        }
//        return new Address();
//    }
}
