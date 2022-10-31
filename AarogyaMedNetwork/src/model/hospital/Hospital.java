/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.hospital;

/**
 *
 * @author amey8
 */
public class Hospital {
    static int hos_cnt=1;
    int hospital_id;
    String hospital_name;
    String desc;
    int address_id;

    public Hospital(int hospital_id, String hospital_name, String desc, int address_id) {
        this.hospital_id = hospital_id;
        this.hospital_name = hospital_name;
        this.desc = desc;
        this.address_id = address_id;
    }

    public Hospital() {
    }

    public static int getHos_cnt() {
        return hos_cnt;
    }

    public static void setHos_cnt() {
        hos_cnt = hos_cnt+1;
    }

    public int getHospital_id() {
        return hospital_id;
    }

    public void setHospital_id(int ihospital_id) {
        hospital_id = ihospital_id;
    }
    
    public void setHospital_id() {
        hospital_id = hos_cnt;
        setHos_cnt();
    }

    public String getHospital_name() {
        return hospital_name;
    }

    public void setHospital_name(String hospital_name) {
        this.hospital_name = hospital_name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getAddress_id() {
        return address_id;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }
    
}
