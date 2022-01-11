/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 * En klass som lagrar metoder som ska kunna används av andra klasser. Det är
 * metoder som kontrollerar att fält är korrekt ifyllda
 * 
 * @author Josanna, Linda & Lisa
 */

public class Validering {

    /**
     * Metoden kontrollerar om ett fält har ett ifyllt värde.
     */
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;

        if (rutaAttKolla.getText().isEmpty()) {
            resultat = false;
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }

    /**
     * Metoden kontrollerar om ett fält har ett ifyllt värde.
     */
    public static boolean txtFaltHarSiffror(JTextField rutaAttKolla) {
        boolean resultat = true;
        if (!rutaAttKolla.getText().matches("[0-9]")) {
            resultat = false;
            JOptionPane.showMessageDialog(null, "Kontrollera att fältet består av siffror!");
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }

    /**
     * Metoden kontrollerar att en rullist har ett markerat värde.
     */
    public static boolean comboHarVarde(JComboBox boxAttKolla) {
        boolean resultat = true;

        if (boxAttKolla.getSelectedItem().toString().isEmpty()) {
            resultat = false;
            boxAttKolla.requestFocus();
        }

        return resultat;
    }

    /**
     * Metoden kontrollerar att ett lösenordsfält har ett ifyllt värde.
     */
    public static boolean passwordHarVarde(JPasswordField losenordAttKolla) {
        boolean resultat = true;

        if (losenordAttKolla.getText().isEmpty()) {
            resultat = false;
            losenordAttKolla.requestFocus();
        }

        return resultat;
    }
    
    public static boolean kollaDatumFormat(String datum){
        boolean resultat = true;
        
        String[] d = datum.split("-");
       
        try {
            for(int i = 0; i < d.length; i ++){
            int j = Integer.parseInt(d[i]);
            
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera att datumen är korrekt ifyllda: ÅÅÅÅ-MM-DD");
            resultat = false;
        }
       
        return resultat;
    }
    
    public static boolean kollaTelefon(String telefon){
        boolean resultat = true;
        
        String[] t = telefon.split("-");
       
        try {
            for(int i = 0; i < t.length; i ++){
            int j = Integer.parseInt(t[i]);
            
        }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera att telefonnumret endast består av siffror!");
            resultat = false;
        }
       
        return resultat;
    }
}
