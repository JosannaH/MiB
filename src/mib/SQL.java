/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;


import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import oru.inf.InfDB;
import oru.inf.InfException;

public class SQL extends javax.swing.JFrame {

    private InfDB idb;

    public SQL(InfDB idb) {
        this.idb = idb;
    }

    /**
     * Hämta alla områden och lägg till dom i en combobox
     */
    public void omraden(JComboBox x)
        {
            try{
                ArrayList<String> omradeLista = idb.fetchColumn("SELECT Benamning FROM omrade ORDER BY Benamning");
                for(int i = 0; i < omradeLista.size(); i++){
                    String omradesNamn = omradeLista.get(i);
                    x.addItem(omradesNamn);
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämta alla platser och lägg till dem i en combobox
     */
    public void plats(JComboBox x)
        {
            try{
                ArrayList<String> platsLista = idb.fetchColumn("SELECT Benamning FROM plats ORDER BY Benamning");
                for(int i = 0; i < platsLista.size(); i++){
                    String omradesNamn = platsLista.get(i);
                    x.addItem(omradesNamn);
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämta alla agenter och lägg till dem i en combobox
     */
    public void agent(JComboBox x)
        {
            try{
                ArrayList<String> agentLista = idb.fetchColumn("SELECT namn FROM agent ORDER BY namn");
                for(int i = 0; i < agentLista.size(); i++){
                    String agentNamn = agentLista.get(i);
                    x.addItem(agentNamn);
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
    
    /**
     * Fyll TextArea med lista över aliens från en vald plats
     * @param valdPlatsID
     * @param txtLista 
     */
    public void fyllListaAlienPlats(int valdPlatsID, JTextArea txtLista){
        txtLista.setText("");
        ArrayList<HashMap<String,String>> alienIDLista = new ArrayList<>();
        ArrayList<HashMap<String,String>> namnLista = new ArrayList<>();
        ArrayList<HashMap<String,String>> telefonLista = new ArrayList<>();
       try{
         alienIDLista= idb.fetchRows("SELECT alien_ID from alien WHERE plats = " + valdPlatsID);
         namnLista = idb.fetchRows("SELECT namn from alien WHERE plats = " + valdPlatsID);
        telefonLista = idb.fetchRows("SELECT telefon from alien WHERE plats = " + valdPlatsID);
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: fyllLista() " + e.getMessage());
        }
        txtLista.append("AlienID \t Namn \t\t Telefon \n");
        
        for (int i = 0; i < alienIDLista.size(); i++) {
            String a = alienIDLista.get(i).get("alien_ID");
            String n = namnLista.get(i).get("namn");
            String t = telefonLista.get(i).get("telefon");
            
            txtLista.append(a + " \t " + n + " \t\t" + t + "\n");
        }
    }
    
   /**
    * Hämta platser utifrån vilket område användaren valt
    * och lägg till dom i ComboBox
    * @param valtOmrade
    * @param cmbPlats 
    */
    public void getPlatser(String valtOmrade, JComboBox cmbPlats){
        try{
            String valtOmradeID = idb.fetchSingle("SELECT omrades_ID FROM omrade WHERE benamning = '" + valtOmrade + "'");
            ArrayList<HashMap<String, String>> listaPlatser = idb.fetchRows("SELECT Benamning FROM plats WHERE Finns_I = " + valtOmradeID+ "");
            // loopa igenom lista och lägg till alla områden i drop down menyn 
               for (int i = 0; i < listaPlatser.size(); i++) { 
                String plats = listaPlatser.get(i).get("Benamning");
                cmbPlats.addItem(plats);
               }
        }catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
}
