/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josanna, Linda & Lisa
 */
public class UppdateraAgent extends javax.swing.JFrame {

    private InfDB idb;
    private String anvId;
    private String anvTyp;

    /**
     * Creates new form UppdateraAgent
     */
    public UppdateraAgent(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        lblErrorEmpty.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrik = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnSok = new javax.swing.JButton();
        lblLosen = new javax.swing.JLabel();
        txtLosenord = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        txtNamn = new javax.swing.JTextField();
        lblTele = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblBehorighet = new javax.swing.JLabel();
        cmbAdmin = new javax.swing.JComboBox<>();
        lblDatum = new javax.swing.JLabel();
        txtAnsDat = new javax.swing.JTextField();
        lblAnsvar = new javax.swing.JLabel();
        lblErrorEmpty = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        cmbOmrade = new javax.swing.JComboBox<>();
        btnTillbaka = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuStartsida = new javax.swing.JMenu();
        menuInget = new javax.swing.JMenu();
        menuInlogg = new javax.swing.JMenu();
        menuLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrik.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        lblRubrik.setText("UPPDATERA BEFINTLIGA AGENTUPPGIFTER");

        lblID.setText("Agent-ID");

        btnSok.setText("Sök");
        btnSok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokActionPerformed(evt);
            }
        });

        lblLosen.setText("Lösenord");

        lblNamn.setText("Benämning");

        lblTele.setText("Telefon");

        lblBehorighet.setText("Behörigheter");

        cmbAdmin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administratör", "Agentstandard" }));
        cmbAdmin.setToolTipText("");

        lblDatum.setText("Anställningsdatum");

        lblAnsvar.setText("Områdesansvar");

        lblErrorEmpty.setText("* Inga tomma fält får finnas vid sparning.");

        btnSpara.setText("Spara uppdateringar");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        cmbOmrade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        menuStartsida.setText("Gå till startsida");
        menuStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuStartsidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuStartsida);

        menuInget.setText("                                                                                                                                    ");
        jMenuBar1.add(menuInget);

        menuInlogg.setText("Inloggad som Admin");
        jMenuBar1.add(menuInlogg);

        menuLoggaUt.setText("Logga ut");
        menuLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuLoggaUtMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuLoggaUt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblID)
                                        .addComponent(lblLosen))
                                    .addGap(81, 81, 81)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSok))
                                        .addComponent(txtLosenord)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(68, 68, 68)
                                    .addComponent(btnSpara))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNamn)
                                        .addComponent(lblTele)
                                        .addComponent(lblBehorighet)
                                        .addComponent(lblDatum)
                                        .addComponent(lblAnsvar))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cmbAdmin, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelefon, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtNamn)
                                        .addComponent(txtAnsDat)
                                        .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(206, 206, 206))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblRubrik)
                            .addGap(118, 118, 118)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblErrorEmpty, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblRubrik)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSok))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLosen)
                    .addComponent(txtLosenord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNamn)
                    .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTele)
                    .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBehorighet)
                    .addComponent(cmbAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDatum)
                    .addComponent(txtAnsDat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAnsvar)
                    .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(btnSpara)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblErrorEmpty)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)
                        .addGap(21, 21, 21))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoden söker upp information om angett agentID.
     */
    private void btnSokActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokActionPerformed

        // Kontrollerar att fältet har ett värde samt att det består av siffror. 
        if (Validering.textFaltHarVarde(txtID)) {
            if (Validering.txtFaltHarSiffror(txtID)) {
                String soktID = txtID.getText();

                // Hämtar information från databasen baserat på ifyllt ID.
                try {

                    String los = idb.fetchSingle("SELECT Losenord FROM Agent WHERE Agent_ID =  '" + soktID + "'");
                    String namn = idb.fetchSingle("SELECT Namn FROM Agent WHERE Agent_ID = '" + soktID + "'");
                    String tel = idb.fetchSingle("SELECT Telefon FROM Agent WHERE Agent_ID = '" + soktID + "'");
                    String admin = idb.fetchSingle("SELECT Administrator FROM Agent WHERE Agent_ID = '" + soktID + "'");
                    String ansdat = idb.fetchSingle("SELECT Anstallningsdatum FROM Agent WHERE Agent_ID = '" + soktID + "'");
                    String omrID = idb.fetchSingle("SELECT Omrade FROM Agent WHERE Agent_ID = '" + soktID + "'");
                    String omr = idb.fetchSingle("SELECT Benamning FROM Omrade WHERE Omrades_ID ='" + omrID + "'");

                    // Fyller fälten med hämtad information. 
                    txtLosenord.setText(los);
                    txtNamn.setText(namn);
                    txtTelefon.setText(tel);
                    txtAnsDat.setText(ansdat);
                    cmbOmrade.setSelectedItem(omr);

                    // Kontrollerar om vald agenten är administratör och markerar detta i rullisten. 
                    if (admin.contains("J")) {
                        cmbAdmin.setSelectedItem("Administratör");
                    } else if (admin.contains("N")) {
                        cmbAdmin.setSelectedItem("Agentstandard");
                    }
                } // Om något inte fungerar visas ett felmeddelande.
                catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel!");
                    System.out.println("Internt felmeddelande:" + e.getMessage());
                }
            }
        } // Om ID inte är ifyllt visas ett felmeddelande. 
        else {
            JOptionPane.showMessageDialog(null, "AgentID måste vara ifyllt!");
        }
    }//GEN-LAST:event_btnSokActionPerformed

    /**
     * Metoden anropas när man trycker på sparaknappen.
     *
     * @param evt
     */
    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed

        // Kontrollerar att fälten har ifyllda värden. 
        if (Validering.textFaltHarVarde(txtID) && Validering.textFaltHarVarde(txtLosenord) && Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtTelefon) && Validering.textFaltHarVarde(txtAnsDat)) {
            // Hämtar värden från fälten.
            String soktID = txtID.getText();
            String nyttNamn = txtNamn.getText();
            String nyttLosen = txtLosenord.getText();
            String nyttTele = txtTelefon.getText();
            String nyttOmrade = cmbOmrade.getSelectedItem().toString();
            String nyttAnsDat = txtAnsDat.getText();
            String nyttAdmin = cmbAdmin.getSelectedItem().toString();

            // Kontrollerar att lösenordet uppfyller nedanstående krav. 
            if (nyttLosen.length() <= 6 && nyttLosen.length() >= 3) {

                try {
                    // Hämtar områdesID från databasen. 
                    String omrID = idb.fetchSingle("SELECT Omrades_ID FROM omrade WHERE Benamning = '" + nyttOmrade + "'");

                    // Uppdaterar agenttabellen med fältens angedda värden. 
                    idb.update("UPDATE Agent SET Namn = '" + nyttNamn + "' WHERE Agent_ID = '" + soktID + "'");
                    idb.update("UPDATE Agent SET Losenord = '" + nyttLosen + "' WHERE Agent_ID = '" + soktID + "'");
                    idb.update("UPDATE Agent SET Telefon = '" + nyttTele + "' WHERE Agent_ID = '" + soktID + "'");
                    idb.update("UPDATE Agent SET Anstallningsdatum = '" + nyttAnsDat + "' WHERE Agent_ID = '" + soktID + "'");
                    idb.update("UPDATE Agent SET Omrade = '" + omrID + "' WHERE Agent_ID = '" + soktID + "'");

                    // Uppdaterar agentabellen med adminstatus.
                    if (nyttAdmin.contains("Administratör")) {
                        String ja = "J";
                        idb.update("UPDATE Agent SET Administrator = '" + ja + "'WHERE Agent_ID = '" + soktID + "'");
                    } else if (nyttAdmin.contains("Agentstandard")) {
                        String nej = "N";
                        idb.update("UPDATE Agent SET Administrator = '" + nej + "' WHERE Agent_ID = '" + soktID + "'");
                    }

                    // Utskrift när en uppdatering är genomförd. 
                    JOptionPane.showMessageDialog(null, "Lyckad uppdatering!");
                    btnTillbakaActionPerformed(evt);
                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel!");
                    System.out.println("Internt felmeddelande" + e.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Lösenordet ska ha minst 3 tecken och som mest 6!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
        }
    }//GEN-LAST:event_btnSparaActionPerformed

    // Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAdmin i nytt fönster.
    private void menuStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuStartsidaMouseClicked
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);
    }//GEN-LAST:event_menuStartsidaMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen Inloggning i nytt fönster. Denna metod gör så att man blir utloggad.
    private void menuLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuLoggaUtMouseClicked

    // Metoden gör nuvarande fönster osynligt och öppnar klassen AdminHanteraAgenter i nytt fönster.
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed
        setVisible(false);
        AdminHanteraAgenter hanteraAgent = new AdminHanteraAgenter(idb, anvId, anvTyp);
        hanteraAgent.setVisible(true);
    }//GEN-LAST:event_btnTillbakaActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSok;
    private javax.swing.JButton btnSpara;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JComboBox<String> cmbAdmin;
    private javax.swing.JComboBox<String> cmbOmrade;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAnsvar;
    private javax.swing.JLabel lblBehorighet;
    private javax.swing.JLabel lblDatum;
    private javax.swing.JLabel lblErrorEmpty;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JLabel lblTele;
    private javax.swing.JMenu menuInget;
    private javax.swing.JMenu menuInlogg;
    private javax.swing.JMenu menuLoggaUt;
    private javax.swing.JMenu menuStartsida;
    private javax.swing.JTextField txtAnsDat;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtLosenord;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
