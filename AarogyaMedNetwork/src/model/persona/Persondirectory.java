/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.persona;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import model.hospemp.Doctor;
import model.patienta.Patient;
/**
 *
 * @author amey8
 */
public class Persondirectory {
    
    ArrayList<Person> persondir;

    public Persondirectory() {
        this.persondir = new ArrayList<Person>();
        Person pat;
        try ( BufferedReader br = new BufferedReader(new FileReader("files/person.csv"))) {
            String line;
            int i = 0, tperson_id = 0;
            while ((line = br.readLine()) != null) {
                if (i == 0) {
                    i++;
                    //System.out.println(line);

                } else {
                    //System.out.println(line);
                    String[] values = line.split(",");
                    pat = new Person(Integer.valueOf(values[0]), values[1], values[2],
                            Integer.valueOf(values[3]), values[4],values[6], values[5],  Integer.valueOf(values[7]),
                            values[8], values[9],values[10],values[11],values[12],values[13],values[14] // Integer.valueOf(values[8])
                    );
                    //System.out.println(pat.getFirstname());
                    tperson_id = Integer.valueOf(values[0]);
                    
                    this.addnewperson(pat);

                }
                if (tperson_id != 0 ) {
                    Patient.setPersoncnt(tperson_id);
                }
            }
        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public ArrayList<Person> getPersondir() {
        return persondir;
    }

    public void setPersondir(ArrayList<Person> persondir) {
        this.persondir = persondir;
    }
    
    public Person addnewperson() {
        Person pat = new Person();
        persondir.add(pat);
        return pat;
    }

    public void addnewperson(Person pat) {

        persondir.add(pat);
        //return emp;
    }

    public void deletepersonrec(int pat) {
        //catalog.remove(emp);
        Person p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = persondir.get(i);
            if (p.getPersonid() == pat) {
                break;
            }
        }

        persondir.remove(i);

    }

    public void updateperson(Person updpat, int patient_id) {
        Person temp = new Person();
        int i = 0;
        for (Person p : persondir) {
            if (p.getPersonid() == patient_id) {
                deletepersonrec(patient_id);
                persondir.add(i, updpat);
                break;
            }
            i++;
        }

    }

    public Person searchIndexPer(int idx) {
        Person p;
        int i;
        for (i = 0; i < 1000; i++) {
            p = persondir.get(i);
            if (p.getPersonid() == idx) {
                break;
            }
        }
        return persondir.get(i);
    }

    public Person searchIndexPer(String tusername) {

        for (Person p : persondir) {
            if (p.getUsername().equalsIgnoreCase(tusername)) {
                return p;
            }
        }
        return (new Person());
    }
    public Boolean checkpersonexist(Patient pat)
    {
        for (Person p : getPersondir()){
            if (p.firstname.equalsIgnoreCase(pat.getFirstname())&& p.lastname.equalsIgnoreCase(pat.getLastname())
                    &&p.mobileno.equalsIgnoreCase(pat.getMobileno())&&p.getPat().equals("1")){
                return true;
            }
        }
        return false;
    }
    public void addpatient(Patient p){
        Person per= p;
        per.setPat("1");
        per.setDoc("0");
        per.setRec("0");
        per.setHadm("0");
        per.setSadm("0");
        this.addnewperson(per);
    }
    public void adddoctor(Doctor p,String pat,String doc,String hadm,String sadm){
        Person per= p;
        per.setPat(pat);
        per.setDoc(doc);
        per.setRec(sadm);
        per.setHadm(hadm);
        per.setSadm("0");
        this.addnewperson(per);
    }
    
    /*
    private void addpatient(Patient p){
        Person per= p;
        per.setPat(1);
        this.addnewperson(per);
    }
    private void addpatient(Patient p){
        Person per= p;
        per.setPat(1);
        this.addnewperson(per);
    }
    private void addpatient(Patient p){
        Person per= p;
        per.setPat(1);
        this.addnewperson(per);
    }
    private void addpatient(Patient p){
        Person per= p;
        per.setPat(1);
        this.addnewperson(per);}
*/
    
}
