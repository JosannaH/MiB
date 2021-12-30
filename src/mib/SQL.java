/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;


import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
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
}
