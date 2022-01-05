/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mib;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JComboBox;
import javax.swing.JLabel;
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
    public void omraden(JComboBox x) {
        try {
            ArrayList<String> omradeLista = idb.fetchColumn("SELECT Benamning FROM omrade ORDER BY Benamning");
            for (int i = 0; i < omradeLista.size(); i++) {
                String omradesNamn = omradeLista.get(i);
                x.addItem(omradesNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämta alla platser och lägg till dem i en combobox
     */
    public void plats(JComboBox x) {
        try {
            ArrayList<String> platsLista = idb.fetchColumn("SELECT Benamning FROM plats ORDER BY Benamning");
            for (int i = 0; i < platsLista.size(); i++) {
                String omradesNamn = platsLista.get(i);
                x.addItem(omradesNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Hämta alla agenter och lägg till dem i en combobox
     */
    public void agent(JComboBox x) {
        try {
            ArrayList<String> agentLista = idb.fetchColumn("SELECT namn FROM agent ORDER BY namn");
            for (int i = 0; i < agentLista.size(); i++) {
                String agentNamn = agentLista.get(i);
                x.addItem(agentNamn);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }

    /**
     * Fyll TextArea med lista över aliens från en vald plats
     *
     * @param valdPlatsID
     * @param txtLista
     */
    public void fyllListaAlienPlats(int valdPlatsID, JTextArea txtLista) {
        //Tömmer TextArea så att användaren kan göra flera sökningar utan
        // att listan blir längre och längre
        txtLista.setText("");
        ArrayList<HashMap<String, String>> alienIDLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> namnLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> telefonLista = new ArrayList<>();
        try {
            alienIDLista = idb.fetchRows("SELECT alien_ID from alien WHERE plats = " + valdPlatsID);
            namnLista = idb.fetchRows("SELECT namn from alien WHERE plats = " + valdPlatsID);
            telefonLista = idb.fetchRows("SELECT telefon from alien WHERE plats = " + valdPlatsID);
        } catch (InfException e) {
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
 * Fyll text area med aliens efter vald ras
 * @param valdRas
 * @param txtLista 
 */
    public void fyllListaAlienRas(String valdRas, JTextArea txtLista) {
        txtLista.setText("");
        ArrayList<String> alienIDLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> namnLista = new ArrayList<>();
        ArrayList<HashMap<String, String>> telefonLista = new ArrayList<>();

        // Listans rubriker
        txtLista.append("AlienID \t Namn \t\t Telefon \n");
        try {

            // hämta alla alienID i tabellen för vald ras
            alienIDLista = idb.fetchColumn("SELECT alien_ID from " + valdRas);

            // loopa igenom alien-tabellen och spara info om aliens med IDn från alienIDLista
            for (int i = 0; i < alienIDLista.size(); i++) {

                namnLista = idb.fetchRows("SELECT namn from alien WHERE alien_ID = " + alienIDLista.get(i));
                telefonLista = idb.fetchRows("SELECT telefon from alien WHERE alien_ID = " + alienIDLista.get(i));

                String a = alienIDLista.get(i);
                // tittar på indexplats 'i' i arraylisten och sedan under nyckeln 'namn' i hashmap
                String n = namnLista.get(i).get("namn");
                String t = telefonLista.get(i).get("telefon");

                txtLista.append(a + " \t " + n + " \t\t" + t + "\n");
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: fyllListaAlienRas() " + e.getMessage());
        }

    }

    /**
     * Hämta platser utifrån vilket område användaren valt och lägg till dom i
     * ComboBox
     *
     * @param valtOmrade
     * @param cmbPlats
     */
    public void getPlatser(String valtOmrade, JComboBox cmbPlats) {
        try {
            String valtOmradeID = idb.fetchSingle("SELECT omrades_ID FROM omrade WHERE benamning = '" + valtOmrade + "'");
            ArrayList<HashMap<String, String>> listaPlatser = idb.fetchRows("SELECT Benamning FROM plats WHERE Finns_I = " + valtOmradeID + "");
            // loopa igenom lista och lägg till alla områden i drop down menyn 
            for (int i = 0; i < listaPlatser.size(); i++) {
                String plats = listaPlatser.get(i).get("Benamning");
                cmbPlats.addItem(plats);
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
    
    /**
     * Fyll text area med lista på vilka aliens en specifik agent är ansvarig för
     * @param agent_ID
     * @param txtAreaAliens 
     */
    public void getAliensForAnsvaigAgent(String agent_ID, JTextArea txtAreaAliens){
        txtAreaAliens.setText("");
        txtAreaAliens.append("Alien ID \t Namn \n");
        
        ArrayList<HashMap<String, String>> hashID = new ArrayList<>();
        ArrayList<HashMap<String, String>> hashNamn = new ArrayList<>();
        
        try{
            hashID = idb.fetchRows("SELECT alien_ID FROM alien WHERE ansvarig_agent = " + agent_ID + " ORDER BY alien_ID ASC");
            hashNamn = idb.fetchRows("SELECT namn FROM alien WHERE ansvarig_agent = " + agent_ID + " ORDER BY alien_ID ASC");
        }
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: getAliensForAnsvarigAgent() " + e.getMessage());
        }
        
        for (int i = 0; i < hashID.size(); i++) {
            txtAreaAliens.append(hashID.get(i).get("alien_ID") + "\t" + hashNamn.get(i).get("namn") + "\n");
        }
    }

    /**
     * Fyll text area med lista över vilka aliens som registrerats under en viss tidsperiod
     * @param franDatum
     * @param tillDatum
     * @param txtAreaListaDatum
     * @param ordning 
     */
    public void getRegistreringsdatum(String franDatum, String tillDatum, JTextArea txtAreaListaDatum, String ordning) {

        String[] fran = franDatum.split("-");
        String[] till = tillDatum.split("-");
        String franDatumString = fran[0] + fran[1] + fran[2];
        String tillDatumString = till[0] + till[1] + till[2];

        int franDatumInt = Integer.parseInt(franDatumString);
        int tillDatumInt = Integer.parseInt(tillDatumString);

        // töm textarea inför ny sökning
        txtAreaListaDatum.setText("");
        // Listans rubriker
        txtAreaListaDatum.append("Reg. datum \t Alien ID \t Namn \n");

        ArrayList<String> listaDatum = new ArrayList<>();
        ArrayList<String> listaID = new ArrayList<>();
        ArrayList<String> listaNamn = new ArrayList<>();
        
        String queryDatum;
        String queryID;
        String queryNamn;

        if (ordning.equals("Äldsta först")) {
            queryDatum = "SELECT date_format(Registreringsdatum, '%Y%m%d') FROM alien ORDER BY Registreringsdatum ASC";
            queryID = "SELECT alien_ID FROM alien ORDER BY Registreringsdatum ASC";
            queryNamn = "SELECT namn FROM alien ORDER BY Registreringsdatum ASC";
        } else {
            queryDatum = "SELECT date_format(Registreringsdatum, '%Y%m%d') FROM alien ORDER BY Registreringsdatum DESC";
            queryID = "SELECT alien_ID FROM alien ORDER BY Registreringsdatum DESC";
            queryNamn = "SELECT namn FROM alien ORDER BY Registreringsdatum DESC";
        }

        try {
            listaDatum = idb.fetchColumn(queryDatum);
            listaID = idb.fetchColumn(queryID);
            listaNamn = idb.fetchColumn(queryNamn);

            for (int i = 0; i < listaDatum.size(); i++) {

                String datum = listaDatum.get(i);
                int datumInt = Integer.parseInt(datum);

                if (datumInt >= franDatumInt && datumInt <= tillDatumInt) {
                    String id = listaID.get(i);
                    String namn = listaNamn.get(i);

                    txtAreaListaDatum.append(datum + "\t" + id + "\t" + namn + "\n");
                }
            }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel! Kontrollera att datumen är korrekt ifyllda: ÅÅÅÅ-MM-DD");
            System.out.println("Internt felmeddelande: getPlatser() " + e.getMessage());
        }
    }
    
    /**
     * Visa områdeschef utifrån ett valt område, setText i en label
     * @param lblChef
     * @param omrade 
     */
    public void getOmradeschef(JLabel lblChef, String omrade){
         try {
            String omradesID = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + omrade + "'");
            String agentID = idb.fetchSingle("SELECT Agent_ID FROM omradeschef WHERE Omrade =" + omradesID);
            String agentNamn = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID =" + agentID);

            lblChef.setText("Områdeschef för " + omrade + " är " + agentNamn + "");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
    
    /**
     * Visa vilka kontor som finns i tabellen kontorschef, fyll combobox
     * @param cmbKontor 
     */
     public void getKontor(JComboBox cmbKontor){
         ArrayList<String> kontorLista = new ArrayList<>();
         String kontor = "";
         // hämta alla kontor från DB
         try {
            kontorLista = idb.fetchColumn("SELECT kontorsbeteckning FROM kontorschef"); 
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: hämta kontor" + e.getMessage());
        }
          // loopa igenom lista och lägg till alla kontor i drop down menyn 
            for (int i = 0; i < kontorLista.size(); i++) {
                kontor = kontorLista.get(i);
                cmbKontor.addItem(kontor);        
    }        
}
     /**
      * Visa vilken agent som är chef över ett valt kontor, set text i en label
      * @param kontor
      * @param lblNuvChef 
      */
     public void getKontorschef(String kontor, JLabel lblNuvChef){
         String chefID = "";
         String chefNamn = "";
         try{
             chefID = idb.fetchSingle("SELECT agent_ID FROM kontorschef WHERE kontorsbeteckning = '" + kontor + "'");
             chefNamn = idb.fetchSingle("SELECT namn FROM agent WHERE agent_ID = " + chefID);
         }catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: hämta kontorschef" + e.getMessage());
        }
         lblNuvChef.setText("Kontorschef för " + kontor + " är " + chefNamn);
     }
     
     /**
      * Uppdatera tabellen Omradeschef med en ny chef
      * @param nyChefNamn
      * @param omrade 
      */
     public void uppdateraOmradeschef(String nyChefNamn, String omrade, JLabel lblNyChef){
         String nyChefID = "";
         String omradeID = "";
         try{
             nyChefID = idb.fetchSingle("SELECT agent_ID FROM agent WHERE namn = '" + nyChefNamn + "'");
             omradeID = idb.fetchSingle("SELECT omrades_ID FROM omrade WHERE benamning = '" + omrade + "'" );
             idb.update("UPDATE omradeschef SET agent_ID = " + nyChefID + " WHERE omrade = " + omradeID);
             
         }catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: uppdateraOmradeschef() " + e.getMessage());
        }
         lblNyChef.setText("Ny chef för " + omrade + " är " + nyChefNamn);
     }
     /**
      * Uppdatera tabellen kontorschef med en ny chef
      * @param nyChefNamn
      * @param kontor 
      */
     public void uppdateraKontorschef(String nyChefNamn, String kontor, JLabel lblNyChef){
         String nyChefID = "";
         try{
             nyChefID = idb.fetchSingle("SELECT agent_ID FROM agent WHERE namn = '" + nyChefNamn + "'");
            
             idb.update("UPDATE kontorschef SET agent_ID = " + nyChefID + " WHERE kontorsbeteckning = '" + kontor + "'");
             
         }catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande: uppdateraKontorschef() " + e.getMessage());
        }
         lblNyChef.setText("Ny chef för " + kontor + " är " + nyChefNamn);
     }
}
