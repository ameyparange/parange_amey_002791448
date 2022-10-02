/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author AMEY PARANGE
 */
public class EmployeeCatalog {

    private ArrayList<Employee> catalog;

    public EmployeeCatalog() {
        this.catalog = new ArrayList<Employee>();
    }

    public ArrayList<Employee> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<Employee> catalog) {
        this.catalog = catalog;
    }

    public Employee addnewemployee() {
        Employee emp = new Employee();
        catalog.add(emp);
        return emp;
    }

    public void deleteemprec(Employee emp) {
        catalog.remove(emp);

    }

}
