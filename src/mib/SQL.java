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
    private JComboBox cb;
    private JComboBox cb2;
    private JComboBox cb3;


    public SQL(InfDB idb) {
        this.idb = idb;
    }

    public SQL(InfDB idb, JComboBox cb){
        this.idb = idb;
        this.cb = cb;

    }

    public SQL(InfDB idb, JComboBox cb1, JComboBox cb2){
        this.idb = idb;
        this.cb = cb1;
        this.cb2 = cb2;

    }

    public SQL(InfDB idb, JComboBox cb1, JComboBox cb2, JComboBox cb3){
        this.idb = idb;
        this.cb = cb1;
        this.cb2 = cb2;
        this.cb3 = cb3;
    }

    /**
     * Hämta alla områden och lägg till dom i en combobox
     */
    public void omraden()
        {
            try{
                ArrayList<String> omradeLista = idb.fetchColumn("SELECT Benamning FROM omrade ORDER BY Benamning");
                for(int i = 0; i < omradeLista.size(); i++){
                    String omradesNamn = omradeLista.get(i);
                    cb.addItem(omradesNamn);
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
    public void plats()
        {
            try{
                ArrayList<String> platsLista = idb.fetchColumn("SELECT Benamning FROM plats ORDER BY Benamning");
                for(int i = 0; i < platsLista.size(); i++){
                    String omradesNamn = platsLista.get(i);
                    cb2.addItem(omradesNamn);
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
    public void agent()
        {
            try{
                ArrayList<String> agentLista = idb.fetchColumn("SELECT namn FROM agent ORDER BY namn");
                for(int i = 0; i < agentLista.size(); i++){
                    String agentNamn = agentLista.get(i);
                    cb3.addItem(agentNamn);
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
}
