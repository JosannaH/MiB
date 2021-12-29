/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

// TODO Lägg till fler val vid registrering beroende på ras. Tex antal armar för Squid
// TODO sätt alienID automatiskt -> räkna uppåt från senaste inlagda (Rosa har nummer 4)

package mib;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author luna
 */
public class RegistreraAlien extends javax.swing.JFrame {

    // används till konstruktorn
    private InfDB idb;
    private String anvId;
    private String anvTyp;

    /**
     * Creates new form RegistreraAlien
     */
    public RegistreraAlien() {
        initComponents();
    }

    // kontruktor som tar in information som bland annat används till den översta MenuBar
    public RegistreraAlien(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        nyttDatum();
        SQL s = new SQL(idb, cmbPlats, cmbAnsAgent);
        s.plats();
        s.agent();
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
        txtNamn = new javax.swing.JTextField();
        lblNamn = new javax.swing.JLabel();
        btnSpara = new javax.swing.JButton();
        txtTelefon = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbRas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        cmbAnsAgent = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        psw1 = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cmbPlats = new javax.swing.JComboBox<>();
        lblPersInfo = new javax.swing.JLabel();
        lblAktResInfo = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        psw2 = new javax.swing.JPasswordField();
        lblAlienID = new javax.swing.JLabel();
        txtAlienID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtDatum = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTitel.setText("Registrera ny alien");

        lblNamn.setText("Namn");

        btnSpara.setText("Spara");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        lblTelefon.setText("Telefon");

        jLabel2.setText("Ras");

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm" }));

        jLabel3.setText("Plats");

        lblConfirm.setForeground(new java.awt.Color(0, 204, 0));

        jLabel5.setText("Ansvarig agent");

        jLabel6.setText("Lösenord");

        psw1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psw1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        jLabel7.setText("MiB REGISTRERINGSSERVICE");

        lblPersInfo.setText("Personlig information");

        lblAktResInfo.setText("Aktuell reseinfo");

        jLabel11.setText("Upprepa lösenord");

        psw2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psw2ActionPerformed(evt);
            }
        });

        lblAlienID.setText("AlienID");

        jLabel1.setText("Dagens datum");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConfirm)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPersInfo)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtDatum))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAlienID))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAlienID)
                                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNamn)
                                    .addComponent(txtTelefon))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(lblTitel))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblAktResInfo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel5))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbAnsAgent, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cmbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel11)
                                    .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(psw2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                        .addComponent(psw1, javax.swing.GroupLayout.Alignment.LEADING)))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblPersInfo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblNamn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblTelefon)
                                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAktResInfo)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(cmbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(cmbAnsAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(psw1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(8, 8, 8)
                        .addComponent(psw2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlienID)
                    .addComponent(txtAlienID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDatum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConfirm)
                    .addComponent(btnSpara, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed
        // Utgår ifrån att det är klicket på sparaknappen som gör att all info sparas i DG
        if (Validering.textFaltHarVarde(txtNamn) && Validering.textFaltHarVarde(txtAlienID) && Validering.textFaltHarVarde(txtDatum)
                && Validering.comboHarVarde(cmbAnsAgent) && Validering.comboHarVarde(cmbRas) && Validering.comboHarVarde(cmbPlats) && Validering.passwordHarVarde(psw1) && Validering.passwordHarVarde(psw2)) {

            String regNamn = txtNamn.getText();

            String regTelefon = txtTelefon.getText();

            String regPassword = psw1.getText();

            String regPasswordCheck = psw2.getText();

            String regPlats = cmbPlats.getSelectedItem().toString();

            String regRas = cmbRas.getSelectedItem().toString();
            //System.out.println(regRas);

            String regAnsAgent = cmbAnsAgent.getSelectedItem().toString();
            //Här behöver vi hämta Agent_ID baserat på namnet

            String regAlienID = txtAlienID.getText();
            int regAlienIDint = Integer.parseInt(regAlienID);

            String dagensDatum = txtDatum.getText();

            if (regPassword.equals(regPasswordCheck)) {

                try {

                    String platsID = idb.fetchSingle("SELECT Plats_ID FROM plats WHERE Benamning = '" + regPlats + "'");
                    String regAgentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE namn = '" + regAnsAgent + "'");

                    // lägger till alien i databasen
                    idb.insert("INSERT INTO Alien VALUES (" + regAlienID + ", '" + dagensDatum + "', '" + regPassword + "', '" + regNamn + "', '" + regTelefon + "','" + platsID + "'," + regAgentID + ")");
                    
                    // TODO lägg till alien i tabellen för rätt ras, uppdatera den tabellen med hur många aliens det finns av den rasen
                    
                    
                    JOptionPane.showMessageDialog(null, "En ny alien är registrerad!");

                } catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel!");
                    System.out.println("Internt felmeddelande" + e.getMessage());
                }
            }
            } else {
                JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
            }
        

        //"INSERT INTO Alien VALUES (regAlienID, dagensDatum, regLosenord, regNamn, regTelefon, regPlats, regAnsvarigAgent)";
    }//GEN-LAST:event_btnSparaActionPerformed

    private void psw1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psw1ActionPerformed

    }//GEN-LAST:event_psw1ActionPerformed

    private void psw2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psw2ActionPerformed

    }//GEN-LAST:event_psw2ActionPerformed

    private void nyttDatum() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDateTime time = LocalDateTime.now();
        String date = dtf.format(time);
        txtDatum.setText(date);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSpara;
    private javax.swing.JComboBox<String> cmbAnsAgent;
    private javax.swing.JComboBox<String> cmbPlats;
    private javax.swing.JComboBox<String> cmbRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblAktResInfo;
    private javax.swing.JLabel lblAlienID;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblNamn;
    private javax.swing.JLabel lblPersInfo;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JPasswordField psw1;
    private javax.swing.JPasswordField psw2;
    private javax.swing.JTextField txtAlienID;
    private javax.swing.JTextField txtDatum;
    private javax.swing.JTextField txtNamn;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
