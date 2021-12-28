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
    private JComboBox cbA;


    public SQL(InfDB idb) {
        this.idb = idb;
    }
    
    public SQL(InfDB idb, JComboBox cb){
        this.idb = idb;
        this.cb = cb;
        
    }
    
    public SQL(InfDB idb, JComboBox cb, JComboBox cbA){
        this.idb = idb;
        this.cb = cb;
        this.cbA = cbA;
        
    }

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
    
    public void plats()
        {
            try{
                ArrayList<String> platsLista = idb.fetchColumn("SELECT Benamning FROM plats ORDER BY Benamning");
                for(int i = 0; i < platsLista.size(); i++){
                    String omradesNamn = platsLista.get(i);
                    cb.addItem(omradesNamn);
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
    
    public void agent()
        {
            try{
                ArrayList<String> agentLista = idb.fetchColumn("SELECT namn FROM agent ORDER BY namn");
                for(int i = 0; i < agentLista.size(); i++){
                    String agentNamn = agentLista.get(i);
                    cbA.addItem(agentNamn);
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
}