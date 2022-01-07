/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josanna, Linda & Lisa
 */
public class RegistreraNyUtrustning extends javax.swing.JFrame {

    // används till konstruktorn
    private InfDB idb;
    private String anvId;
    private String anvTyp;
    private String regID;

    // Kontruktor som tar in information som bland annat används till den översta MenuBar
    public RegistreraNyUtrustning(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        hamtaUtrustningsID(regID);
        doljText(txtEgenskap);
        doljLabel(lblEgenskap);
        menuBarInloggad.setText("Inloggad som " + anvTyp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitel = new javax.swing.JLabel();
        txtBenamning = new javax.swing.JTextField();
        lblBenamning = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        lblUtrustningsTyp = new javax.swing.JLabel();
        cmbUtrustningstyp = new javax.swing.JComboBox<>();
        lblConfirm = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblUtrustningID = new javax.swing.JLabel();
        lblUtrustning = new javax.swing.JLabel();
        txtEgenskap = new javax.swing.JTextField();
        lblEgenskap = new javax.swing.JLabel();
        tbValjTyp = new javax.swing.JToggleButton();
        btnGaTillbaka = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuTillStart = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        menuBarInloggad = new javax.swing.JMenu();
        menuLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTitel.setText("Registrera ny Utrustning");

        lblBenamning.setText("Benämning");

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        lblUtrustningsTyp.setText("Utrustningstyp");

        cmbUtrustningstyp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vapen", "Kommunikation", "Teknik", "Okänd" }));

        lblConfirm.setForeground(new java.awt.Color(0, 204, 0));

        jLabel7.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        jLabel7.setText("MiB REGISTRERINGSSERVICE");

        lblUtrustningID.setText("UtrustningsID");

        lblUtrustning.setText("ID");

        lblEgenskap.setText("Egenskap");

        tbValjTyp.setText("Välj typ");
        tbValjTyp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbValjTypMouseClicked(evt);
            }
        });

        btnGaTillbaka.setText("Gå tillbaka");
        btnGaTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGaTillbakaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/Vapen.png"))); // NOI18N

        menuTillStart.setText("Till startsida");
        menuTillStart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTillStartMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuTillStart);

        jMenu1.setText("                                                                                                                                   ");
        jMenuBar1.add(jMenu1);

        menuBarInloggad.setText("Inloggad som XXX");
        jMenuBar1.add(menuBarInloggad);

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(182, 182, 182)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(281, 281, 281)
                        .addComponent(lblTitel)))
                .addContainerGap(177, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBenamning)
                            .addComponent(lblUtrustningID)
                            .addComponent(lblUtrustningsTyp)
                            .addComponent(lblEgenskap))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(lblUtrustning, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbUtrustningstyp, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tbValjTyp)
                            .addComponent(txtEgenskap, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(86, 86, 86))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblConfirm)
                        .addGap(17, 697, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(btnGaTillbaka)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGaTillbaka))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTitel)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUtrustningID)
                                    .addComponent(lblUtrustning))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtBenamning, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblBenamning, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblUtrustningsTyp)
                                    .addComponent(cmbUtrustningstyp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(tbValjTyp)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtEgenskap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblEgenskap))
                                .addGap(18, 18, 18)
                                .addComponent(btnSpara))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addComponent(lblConfirm)))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Metoden anropas när man trycker på knappen spara.
    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        // Kontrollerar att vissa fält måste vara ifyllda för att kunna spara ny utrustning.
        if (Validering.textFaltHarVarde(txtBenamning) && Validering.comboHarVarde(cmbUtrustningstyp)) {

            String regUtrustningsID = lblUtrustning.getText();
            String regUtrustning = cmbUtrustningstyp.getSelectedItem().toString();
            String regEgenskap = txtEgenskap.getText();

            try {

                // Kontrollerar att man har fyllt i tillhörande information (egenskap) om valt vapen. 
                if (regUtrustning.equals("Vapen") && Validering.textFaltHarVarde(txtEgenskap)) {
                    laggTill();
                    idb.insert("INSERT INTO Vapen VALUES ('" + regUtrustningsID + "', '" + regEgenskap + "')");
                    btnGaTillbakaActionPerformed(evt);
                } else if (regUtrustning.equals("Kommunikation") && Validering.textFaltHarVarde(txtEgenskap)) {
                    laggTill();
                    idb.insert("INSERT INTO Kommunikation VALUES ('" + regUtrustningsID + "', '" + regEgenskap + "')");
                    btnGaTillbakaActionPerformed(evt);
                } else if (regUtrustning.equals("Teknik") && Validering.textFaltHarVarde(txtEgenskap)) {
                    laggTill();
                    idb.insert("INSERT INTO Teknik VALUES ('" + regUtrustningsID + "', '" + regEgenskap + "')");
                    btnGaTillbakaActionPerformed(evt);
                } else if (regUtrustning.equals("Okänd")) {
                    laggTill();
                    btnGaTillbakaActionPerformed(evt);
                } else {
                    JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
                }

            } catch (InfException e) {
                JOptionPane.showMessageDialog(null, "Något gick fel!");
                System.out.println("Internt felmeddelande" + e.getMessage());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
        }


    }//GEN-LAST:event_btnSparaActionPerformed

    // Metoden lägger till utrustning i databasen. Metoden finns för att undvika att man repeterar samma sak i andra metoder. 
    private void laggTill() {
        String regBenamning = txtBenamning.getText();
        String regUtrustningsID = lblUtrustning.getText();
        try {

            idb.insert("INSERT INTO Utrustning VALUES ('" + regUtrustningsID + "', '" + regBenamning + "')");
            JOptionPane.showMessageDialog(null, "Ny utrustning är nu registrerad!");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }

    /* Metoden döljer en ruta som lagrar information tillhörande specifik utrustning. metoden anropas direkt i konstruktorn 
    för att inledningsvis döljas. */
    private void doljText(JTextField textAttDolja) {
        textAttDolja.setVisible(false);
    }

    /* Metoden döljer en rubrik som lagrar information tillhörande specifik utrustning. metoden anropas direkt i konstruktorn 
    för att inledningsvis döljas. */
    private void doljLabel(JLabel labelAttDolja) {
        labelAttDolja.setVisible(false);
    }

    // Metoden anropas när man väljer vilken typ av utrustning som man vill registrera. 
    private void tbValjTypMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbValjTypMouseClicked
        String typ = cmbUtrustningstyp.getSelectedItem().toString();

        /* Beroende på vilken utrustning så ska olika saker ske. Viss utrustning har fler uppgifter som behöver hämtas in. 
        Dessa görs synliga beroende på vilken typ av utrustning man har valt. */
        if (typ.equals("Vapen")) {
            txtEgenskap.setVisible(true);
            lblEgenskap.setVisible(true);
            lblEgenskap.setText("Kaliber");
        } else if (typ.equals("Kommunikation")) {
            txtEgenskap.setVisible(true);
            lblEgenskap.setVisible(true);
            lblEgenskap.setText("Överföringsteknik");
        } else if (typ.equals("Teknik")) {
            txtEgenskap.setVisible(true);
            lblEgenskap.setVisible(true);
            lblEgenskap.setText("Kraftkälla");
        } else {
            doljText(txtEgenskap);
            doljLabel(lblEgenskap);
        }
    }//GEN-LAST:event_tbValjTypMouseClicked

    /**
     * Gå tillbaka till startsida, olika beroende på om anv är admin eller vanlig agent
     * @param evt 
     */
    private void menuTillStartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTillStartMouseClicked
         setVisible(false);
        SQL s = new SQL(idb);
        boolean arAdmin = s.arAdmin(anvId);
        
        if (arAdmin == true){
            StartsidaAdmin a = new StartsidaAdmin(idb, anvId, anvTyp);
            a.setVisible(true);
        }
        else{
            StartsidaAgent a = new StartsidaAgent(idb, anvId, anvTyp);
            a.setVisible(true);
    }                                          
    
    }//GEN-LAST:event_menuTillStartMouseClicked

    /**
     * Logga ut och gå tillbaka till inloggningsfönster
     * @param evt 
     */
    private void menuLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuLoggaUtMouseClicked
    
    // Metdoden kontrollerar om du är administratör eller agent och skickar dig sedan tillbaka till rätt sida.
    private void btnGaTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGaTillbakaActionPerformed
        setVisible(false);
        SQL s = new SQL(idb);
        boolean arAdmin = s.arAdmin(anvId);
        
        if (arAdmin == true){
            HanteraUtrustningAdmin a = new HanteraUtrustningAdmin(idb, anvId, anvTyp);
            a.setVisible(true);
        }
        else{
            StartsidaAgent a = new StartsidaAgent(idb, anvId, anvTyp);
            a.setVisible(true);
    }     
    }//GEN-LAST:event_btnGaTillbakaActionPerformed

    /* Denna metod genererar ett ID för varje ny registrerad utrustning. För att det ska bli ett nytt ID som inte går att ändras anropas den i konstruktorn. 
    För att generera nytt ID i sifferordning anropas getAutoIncrement(). */
    private void hamtaUtrustningsID(String regID) {

        try {
            regID = idb.getAutoIncrement("Utrustning", "Utrustnings_ID");
            lblUtrustning.setText(regID);

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnGaTillbaka;
    private javax.swing.JButton btnSpara;
    private javax.swing.JComboBox<String> cmbUtrustningstyp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblBenamning;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblEgenskap;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JLabel lblUtrustning;
    private javax.swing.JLabel lblUtrustningID;
    private javax.swing.JLabel lblUtrustningsTyp;
    private javax.swing.JMenu menuBarInloggad;
    private javax.swing.JMenu menuLoggaUt;
    private javax.swing.JMenu menuTillStart;
    private javax.swing.JToggleButton tbValjTyp;
    private javax.swing.JTextField txtBenamning;
    private javax.swing.JTextField txtEgenskap;
    // End of variables declaration//GEN-END:variables
}
