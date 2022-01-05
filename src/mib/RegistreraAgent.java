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
 * @author luna
 */
public class RegistreraAgent extends javax.swing.JFrame {

    private InfDB idb;
    private String anvId;
    private String anvTyp;

    /**
     * Creates new form RegistreraAgent
     */
    public RegistreraAgent(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cmbAdminSvar = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        cmbOmradeSvar = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtNamnSvar = new javax.swing.JTextField();
        txtTelefonSvar = new javax.swing.JTextField();
        txtAnsDatumSvar = new javax.swing.JTextField();
        txtLosen1 = new javax.swing.JTextField();
        btnReg = new javax.swing.JButton();
        txtLosen2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("AGENTREGISTRERING");

        jLabel2.setText("Agent-ID:");

        lblID.setText("Autogenererad");

        jLabel4.setText("Namn/Benämning:");

        jLabel6.setText("Telefon:");

        jLabel8.setText("Administratör?:");

        cmbAdminSvar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ja", "Nej" }));

        jLabel9.setText("Områdesansvar:");

        cmbOmradeSvar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Svealand", "Götaland", "Norrland" }));
        cmbOmradeSvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOmradeSvarActionPerformed(evt);
            }
        });

        jLabel10.setText("Anställningsdatum:");

        jLabel12.setText("Lösenord:");

        txtNamnSvar.setText("jTextField1");

        txtTelefonSvar.setText("jTextField1");

        txtAnsDatumSvar.setText("jTextField1");

        txtLosen1.setText("jTextField1");

        btnReg.setText("Registrera");
        btnReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegActionPerformed(evt);
            }
        });

        txtLosen2.setText("jTextField1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(351, 351, 351)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(269, 269, 269)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNamnSvar)
                                    .addComponent(txtTelefonSvar)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLosen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbAdminSvar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cmbOmradeSvar, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtAnsDatumSvar)
                                        .addComponent(txtLosen1))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addComponent(btnReg)))
                .addContainerGap(355, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblID))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNamnSvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefonSvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cmbAdminSvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cmbOmradeSvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtAnsDatumSvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtLosen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLosen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnReg)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbOmradeSvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOmradeSvarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOmradeSvarActionPerformed

    private void btnRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegActionPerformed

        if (Validering.textFaltHarVarde(txtNamnSvar) && Validering.textFaltHarVarde(txtAnsDatumSvar)
                && Validering.comboHarVarde(cmbAdminSvar) && Validering.comboHarVarde(cmbOmradeSvar)
                && Validering.textFaltHarVarde(txtLosen1) && Validering.textFaltHarVarde(txtLosen2))
        {

         lblID.getText();

        
        String regNamn = txtNamnSvar.getText();
        String regTel = txtTelefonSvar.getText();
        String regAdmin = cmbAdminSvar.getSelectedItem().toString();
        String regOmrade = cmbOmradeSvar.getSelectedItem().toString();
        String regDatum = txtAnsDatumSvar.getText();
        String regLosen1 = txtLosen1.getText();
        String regLosen2 = txtLosen2.getText();

            if (regLosen1.equals(regLosen2)) {

                try {
                    
                String regID = idb.getAutoIncrement("Agent", "Agent_ID");
                lblID.setText(regID);
      
                idb.insert("INSERT INTO Agent(Namn, Telefon, Losenord) VALUES ( '" + regNamn + "', '" + regTel + "','" + regLosen1 + ")");
                
                if (regOmrade.contains("Svealand")) {
                idb.insert("INSERT INTO Agent (Omrade) VALUES (1)");
                }
                
                else if (regOmrade.contains("Götaland")) {
                idb.insert("INSERT INTO Agent (Omrade) VALUES (2)");
                }
                
                else if (regOmrade.contains("Norrland")) {
                idb.insert("INSERT INTO Agent (Omrade) VALUES (1)");
                
                if (regAdmin.contains("Administratör")) {
                idb.insert("INSERT INTO Agent (Administrator) VALUES (J)");
                }
                
                else if (regAdmin.contains("Agentstandard")) {
                idb.insert("INSERT INTO Agent (Administrator) VALUES (N)");
                }
                }
                

                }

                catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());

                }
            }
        }

        else {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
        }

    }//GEN-LAST:event_btnRegActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReg;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cmbAdminSvar;
    private javax.swing.JComboBox<String> cmbOmradeSvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lblID;
    private javax.swing.JTextField txtAnsDatumSvar;
    private javax.swing.JTextField txtLosen1;
    private javax.swing.JTextField txtLosen2;
    private javax.swing.JTextField txtNamnSvar;
    private javax.swing.JTextField txtTelefonSvar;
    // End of variables declaration//GEN-END:variables
}
