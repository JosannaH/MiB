/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.util.HashMap;

/**
 *
 * @author luna
 */
public class VisaOmradesChef extends javax.swing.JFrame {

    /**
     * Creates new form StartsidaAgent
     */
    private InfDB idb;
    private String anvId;
    private String anvTyp;
     
   
    public VisaOmradesChef(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        
        SQL s = new SQL(idb, cmbOmrade);
        s.omraden();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRubrikOmrade = new javax.swing.JLabel();
        btnLoggaUtOmrade = new javax.swing.JToggleButton();
        cmbOmrade = new javax.swing.JComboBox<>();
        lblOmrade = new javax.swing.JLabel();
        btnSokOmrade = new javax.swing.JToggleButton();
        lblNorden = new javax.swing.JLabel();
        lblChef = new javax.swing.JLabel();
        menuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblRubrikOmrade.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrikOmrade.setText("Visa Områdeschef");

        btnLoggaUtOmrade.setText("Logga ut");
        btnLoggaUtOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggaUtOmradeActionPerformed(evt);
            }
        });

        cmbOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOmradeActionPerformed(evt);
            }
        });

        lblOmrade.setText("Område");

        btnSokOmrade.setText("Sök");
        btnSokOmrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSokOmradeActionPerformed(evt);
            }
        });

        lblNorden.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/norden_karta.png"))); // NOI18N

        lblChef.setText("Chef för område XXX är XXX");

        jMenu1.setText("Mitt konto");
        menuBar1.add(jMenu1);

        jMenu2.setText("Funktioner");
        menuBar1.add(jMenu2);

        jMenu5.setText("                                                                                                    ");
        menuBar1.add(jMenu5);

        jMenu3.setText("Inloggad som Agent");
        menuBar1.add(jMenu3);

        setJMenuBar(menuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggaUtOmrade)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(192, 192, 192)
                        .addComponent(lblRubrikOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblOmrade)
                                .addGap(18, 18, 18)
                                .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(btnSokOmrade))
                            .addComponent(lblChef))
                        .addGap(38, 38, 38)
                        .addComponent(lblNorden)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblRubrikOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblNorden)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btnLoggaUtOmrade)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbOmrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOmrade))
                .addGap(18, 18, 18)
                .addComponent(btnSokOmrade)
                .addGap(45, 45, 45)
                .addComponent(lblChef)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Skapar en metod som man sen använder för att fylla rullisten med information. 
    
    
    private void btnLoggaUtOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggaUtOmradeActionPerformed
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLoggaUtOmradeActionPerformed

    private void cmbOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOmradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOmradeActionPerformed

    private void btnSokOmradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSokOmradeActionPerformed
        String omraden = cmbOmrade.getSelectedItem().toString();
        //try{
             //String id = "" + omraden + "))";
        //}
        //catch(InfException e){
             //JOptionPane.showMessageDialog(null, "Något gick fel!");
            //System.out.println("Internt felmeddelande:" + e.getMessage());
        //}
        
    }//GEN-LAST:event_btnSokOmradeActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLoggaUtOmrade;
    private javax.swing.JToggleButton btnSokOmrade;
    private javax.swing.JComboBox<String> cmbOmrade;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JLabel lblChef;
    private javax.swing.JLabel lblNorden;
    private javax.swing.JLabel lblOmrade;
    private javax.swing.JLabel lblRubrikOmrade;
    private javax.swing.JMenuBar menuBar1;
    // End of variables declaration//GEN-END:variables
}
