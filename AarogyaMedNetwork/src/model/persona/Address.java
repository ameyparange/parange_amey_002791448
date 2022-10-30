/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.persona;

/**
 *
 * @author amey8
 */
public class Address {
    protected static int address_id=1;
    protected String Street;
    protected String Unit;
    protected String City;
    protected String State;
    protected int zipcode;
    
    public Address() {
    }
    
    public static int getAddress_id() {
        return address_id;
    }

    public static void setAddress_id() {
        address_id = address_id + 1;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getUnit() {
        return Unit;
    }

    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
}