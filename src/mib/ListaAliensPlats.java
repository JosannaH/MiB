/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author luna
 */
public class ListaAliensPlats extends javax.swing.JFrame {

    /**
     * Creates new form StartsidaAgent
     */
    private InfDB idb;
    private String anvId;
    private String anvTyp;
    
    
    public ListaAliensPlats(InfDB idb) {
        initComponents();
        this.idb = idb;
  
    }

    public ListaAliensPlats(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        menuBarInloggadSom.setText("Inloggad som " + anvTyp);
        getOmraden();
        
        //Hämta alla områden så dom finns i Combobox från början
       // SQL s = new SQL(idb, cmBoxPlats);
      //  s.plats();
    }
  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblListaAliens = new javax.swing.JLabel();
        btnGaTillbaka = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTabell = new javax.swing.JTable();
        lblPlats = new javax.swing.JLabel();
        cmBoxPlats = new javax.swing.JComboBox<>();
        btnSok = new javax.swing.JButton();
        lblOmrade = new javax.swing.JLabel();
        cmbOmrade = new javax.swing.JComboBox<>();
        menuBar = new javax.swing.JMenuBar();
        menuBarTillStartsida = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        menuBarInloggadSom = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblListaAliens.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblListaAliens.setText("Lista aliens efter plats");

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGaTillbakaMouseClicked(evt);
            }
        });

        tblTabell.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Alien ID", "Namn", "Ras", "Reg. datum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblTabell.setColumnSelectionAllowed(true);
        tblTabell.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblTabell);
        tblTabell.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (tblTabell.getColumnModel().getColumnCount() > 0) {
            tblTabell.getColumnModel().getColumn(0).setHeaderValue("Alien ID");
            tblTabell.getColumnModel().getColumn(1).setHeaderValue("Namn");
            tblTabell.getColumnModel().getColumn(2).setHeaderValue("Telefon");
            tblTabell.getColumnModel().getColumn(3).setHeaderValue("Ras");
            tblTabell.getColumnModel().getColumn(4).setHeaderValue("Reg. datum");
        }

        lblPlats.setText("Välj plats:");

        cmBoxPlats.setToolTipText("");

        btnSok.setText("Sök");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSokMouseClicked(evt);
            }
        });

        lblOmrade.setText("Välj område:");

        menuBarTillStartsida.setText("Gå till Startsida");
        menuBarTillStartsida.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        menuBarTillStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarTillStartsidaMouseClicked(evt);
            }
        });
        menuBar.add(menuBarTillStartsida);

        jMenu5.setText("                                                                                 ");
        menuBar.add(jMenu5);

        menuBarInloggadSom.setText("Inloggad som XXX");
        menuBar.add(menuBarInloggadSom);

        menuBarLoggaUt.setText("Logga ut");
        menuBarLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarLoggaUtMouseClicked(evt);
            }
        });
        menuBar.add(menuBarLoggaUt);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGaTillbaka)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSok)
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cmBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblListaAliens, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPlats)
                    .addComponent(cmBoxPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmrade)
                    .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGaTillbaka)
                    .addComponent(btnSok))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Logga ut högst upp i MenuBar
     * @param evt 
     */
    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked

    /**
     * Gå tillbaka till föregående sida
     * @param evt 
     */
    private void btnGaTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGaTillbakaMouseClicked
         setVisible(false);
        HanteraAliens hanteraAliens = new HanteraAliens(idb, anvId, anvTyp);
        hanteraAliens.setVisible(true);
    }//GEN-LAST:event_btnGaTillbakaMouseClicked

    /**
     * Gå till startsidan i MenuBar
     * @param evt 
     */
    private void menuBarTillStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarTillStartsidaMouseClicked
        setVisible(false);
        StartsidaAgent startsidaAgent = new StartsidaAgent(idb, anvId, anvTyp);
        startsidaAgent.setVisible(true);
    }//GEN-LAST:event_menuBarTillStartsidaMouseClicked

    /**
     * Sök efter aliens
     * @param evt 
     */
    private void btnSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMouseClicked
      String cmbSok = cmBoxPlats.getSelectedItem().toString();
      String platsID = "";
      
      try{
      platsID = idb.fetchSingle("SELECT plats_ID from plats WHERE benamning = '" + cmbSok + "'");
          System.out.println("fetch platsID: " + platsID);
      }
      catch(InfException e){
           JOptionPane.showMessageDialog(null, "Något gick fel!");
           System.out.println("Internt felmeddelande:" + e.getMessage() + " fetch platsID");
      }
      int platsIDint = Integer.parseInt(platsID);
      SQL sql = new SQL(idb);
      //sql.getAlienFranPlats(platsIDint);
    }//GEN-LAST:event_btnSokMouseClicked

    private void getOmraden() {
        try {
            // Hämta alla områden, spara i hashmap i bokstavsordning
             ArrayList<HashMap<String, String>> listaOmraden = idb.fetchRows("SELECT Benamning FROM omrade ORDER BY Benamning ASC");
             
             // loopa igenom lista och lägg till alla områden i drop down menyn 
               for (int i = 0; i < listaOmraden.size(); i++) {
                   
                String omrade = listaOmraden.get(i).get("Benamning");
                cmbOmrade.addItem(omrade);
               }
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande:" + e.getMessage());
        }
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGaTillbaka;
    private javax.swing.JButton btnSok;
    private javax.swing.JComboBox<String> cmBoxPlats;
    private javax.swing.JComboBox<String> cmbOmrade;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblListaAliens;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarInloggadSom;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarTillStartsida;
    private javax.swing.JTable tblTabell;
    // End of variables declaration//GEN-END:variables
}
