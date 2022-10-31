/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.confidential;

import java.util.ArrayList;
import java.util.regex.Pattern;
import model.patienta.Patient;
import model.patienta.Patientdirectory;

/**
 *
 * @author amey8
 */
public class Validations {

    public boolean valstring(String s) {
        int i;
        for (i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) == false) {
                return false;
            }
        }
        return true;

    }

    public boolean valage(String tage) {
        int i;
        for (i = 0; i < tage.length(); i++) {
            if (Character.isDigit(tage.charAt(i)) == false) {
                return false;
            }
        }
        return true;
    }

    public boolean valnumber(String tmobileno) {
        int i;
        for (i = 0; i < tmobileno.length(); i++) {
            if (Character.isDigit(tmobileno.charAt(i)) == false) {
                return false;
            }
        }
        if (i != 10) {
            return false;
        } else {
            return true;
        }
    }

    public boolean valnum(String tmobileno) {
        int i;
        for (i = 0; i < tmobileno.length(); i++) {
            if (Character.isDigit(tmobileno.charAt(i)) == false) {
                return false;
            }
        }

        return true;
    }

    public boolean valemailid(String temailid) {

        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."
                + "[a-zA-Z0-9_+&*-]+)*@"
                + "(?:[a-zA-Z0-9-]+\\.)+[a-z"
                + "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);

        return pat.matcher(temailid).matches();

    }

    public boolean valusername(String tusername, ArrayList<Patient> patientcatalog) {

        Patient p;
        int i;
        if (tusername.length() < 5 && tusername.length() > 16) {
            return false;
        }
        for (i = 0; i < tusername.length(); i++) {
            if (Character.isAlphabetic(tusername.charAt(i)) || Character.isDigit(tusername.charAt(i))
                    || tusername.charAt(i) == '_') {

            } else {
                return false;
            }
        }
        for (i = 0; i < 1000; i++) {
            p = patientcatalog.get(i);

            if (p.getUsername().compareToIgnoreCase(tusername) == 1) {
                return true;
            }
        }
        return false;

    }

    public boolean valpassword(String tpassword, ArrayList<Patient> patientcatalog) {
        //ArrayList<Patient> patientcatalog =
        Patient p;
        int i;
        if (tpassword.length() < 8 && tpassword.length() > 16) {
            return false;
        }
        for (i = 0; i < tpassword.length(); i++) {
            if (Character.isAlphabetic(tpassword.charAt(i)) || Character.isDigit(tpassword.charAt(i))
                    || tpassword.charAt(i) == '_' || tpassword.charAt(i) == '@' || tpassword.charAt(i) == '$') {

            } else {
                return false;
            }
        }

        return false;

    }
}
