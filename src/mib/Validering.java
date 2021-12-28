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
 *
 * @author Josanna, Linda & Lisa
 */
public class Validering {
    
    public static boolean textFaltHarVarde(JTextField rutaAttKolla)
    {
        boolean resultat = true;
        
        if(rutaAttKolla.getText().isEmpty()){
            resultat = false;
            rutaAttKolla.requestFocus();
        }       
        
        return resultat;
    }
    
    public static boolean comboHarVarde(JComboBox boxAttKolla) {
        boolean resultat = true;
        
        if(boxAttKolla.getSelectedItem().toString().isEmpty()){
            resultat = false;
            boxAttKolla.requestFocus();
        }       
        
        return resultat; 
    }
            
            
    public static boolean passwordHarVarde(JPasswordField losenordAttKolla) {
         boolean resultat = true;
        
        if(losenordAttKolla.getText().isEmpty()){
            resultat = false;
            losenordAttKolla.requestFocus();
        }       
        
        return resultat;    
    }   
}