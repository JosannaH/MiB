/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
     *
     * @param rutaAttKolla
     * @return
     */
    public static boolean textFaltHarVarde(JTextField rutaAttKolla) {
        boolean resultat = true;

        // Om fältet är tomt ändras resultat till false.
        if (rutaAttKolla.getText().isEmpty()) {
            resultat = false;

            // Fokus hamnar på fältet som ej har värde.
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }

    /**
     * Metoden kontrollerar om ett fält har ett ifyllt värde.
     */
    public static boolean txtFaltHarSiffror(JTextField rutaAttKolla) {
        boolean resultat = true;

        // Kontrollerar att fältet inte består av siffror. Om det gör det ändras resultat till false.
        if (!rutaAttKolla.getText().matches("[0-9]")) {
            resultat = false;

            // Felmeddelande till användare om vad som inte fungerade.
            JOptionPane.showMessageDialog(null, "Kontrollera att fältet består av siffror!");

            // Fokus hamnar på fältet som ej har värde.
            rutaAttKolla.requestFocus();
        }

        return resultat;
    }

    /**
     * Metoden kontrollerar att en rullist har ett markerat värde.
     *
     * @param boxAttKolla
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
     *
     * @param losenordAttKolla
     * @return
     */
    public static boolean passwordHarVarde(JPasswordField losenordAttKolla) {
        boolean resultat = true;

        // Om fältet är tomt ändras resultat till false.
        if (losenordAttKolla.getText().isEmpty()) {
            resultat = false;
            // Fokus hamnar på fältet som ej har värde.
            losenordAttKolla.requestFocus();
        }

        return resultat;
    }

    /**
     * Metoden kontrollear att fältet har rätt datumformat.
     *
     * @param datum
     * @return
     */
    public static boolean kollaDatumFormat(String datum) {
        boolean resultat = true;

        // Anger vilket format som datumet ska ha. 
        try {
            Date formatter = new SimpleDateFormat("yyyy-mm-dd").parse(datum);

        } // Felmeddelande till användaren om att formatet inte är korrekt. 
        catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera att datum är korrekt ifyllt: ÅÅÅÅ-MM-DD");
            System.out.println("Internt felmeddelande" + e.getMessage());

            // Värdet ändras till false om fältet ej är korrekt ifyllt.
            resultat = false;
        }

        return resultat;
    }

    /**
     * Metoden kontrollerar att rätt format på telefonnumret finns.
     *
     * @param telefon
     * @return
     */
    public static boolean kollaTelefon(String telefon) {
        boolean resultat = true;

        // Genom array delar man värdet efter varje "-".
        String[] t = telefon.split("-");

        try {
            // Kontrollerar att det går att göra om värdet till int. Alltså om det är siffror som har skrivits in. 
            for (int i = 0; i < t.length; i++) {
                int j = Integer.parseInt(t[i]);
            }
        } // Om fältet ej är korrekt ifyllt skrivs felmeddelande ut till användaren. 
        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Kontrollera att telefonnumret endast består av siffror och bindestreck!");
            System.out.println("Internt felmeddelande" + e.getMessage());

            // Boolean ändras till false om värdet ej är korrekt ifyllt.
            resultat = false;
        }
        return resultat;
    }
}
