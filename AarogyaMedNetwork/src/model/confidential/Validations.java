/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.confidential;

import java.util.regex.Pattern;

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
        if (i!=10)
            return false;
        else return true;
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
}
