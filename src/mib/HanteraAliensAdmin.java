/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;

/**
 *
 * @author luna
 */
public class HanteraAliensAdmin extends javax.swing.JFrame {

    /**
     * Creates new form StartsidaAgent
     */
    private InfDB idb;
    private String anvId;
    private String anvTyp;


    public HanteraAliensAdmin(InfDB idb) {
        initComponents();
        this.idb = idb;
    }
    public HanteraAliensAdmin(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;
        menuBarTomt.setText("Inloggad som " + anvTyp);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAgentBild = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JToggleButton();
        btnRegistreraNyAlien = new javax.swing.JButton();
        btnUppdatera = new javax.swing.JToggleButton();
        btnTaBort = new javax.swing.JToggleButton();
        menuBar = new javax.swing.JMenuBar();
        menuBarStartsida = new javax.swing.JMenu();
        menuBarInget = new javax.swing.JMenu();
        menuBarTomt = new javax.swing.JMenu();
        manuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblAgentBild.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/alien.png"))); // NOI18N

        lblRubrik.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblRubrik.setText("Hantera aliens");

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTillbakaMouseClicked(evt);
            }
        });

        btnRegistreraNyAlien.setText("Registrera ny alien");
        btnRegistreraNyAlien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegistreraNyAlienMouseClicked(evt);
            }
        });

        btnUppdatera.setText("Uppdatera alien");
        btnUppdatera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUppdateraMouseClicked(evt);
            }
        });
        btnUppdatera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUppdateraActionPerformed(evt);
            }
        });

        btnTaBort.setText("Ta bort alien");
        btnTaBort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaBortMouseClicked(evt);
            }
        });
        btnTaBort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaBortActionPerformed(evt);
            }
        });

        menuBarStartsida.setText("Gå till Startsida");
        menuBarStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarStartsidaMouseClicked(evt);
            }
        });
        menuBar.add(menuBarStartsida);

        menuBarInget.setText("                                                                                             ");
        menuBar.add(menuBarInget);

        menuBarTomt.setText("Inloggad som Administratör");
        menuBar.add(menuBarTomt);

        manuBarLoggaUt.setText("Logga ut");
        manuBarLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manuBarLoggaUtMouseClicked(evt);
            }
        });
        menuBar.add(manuBarLoggaUt);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(lblRubrik)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnUppdatera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnRegistreraNyAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnTaBort, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(lblAgentBild, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnTillbaka)
                        .addGap(17, 17, 17))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(lblAgentBild, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btnRegistreraNyAlien)
                        .addGap(33, 33, 33)
                        .addComponent(btnUppdatera)
                        .addGap(33, 33, 33)
                        .addComponent(btnTaBort)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistreraNyAlienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistreraNyAlienMouseClicked
        setVisible(false);
        RegistreraAlien registreraAlien = new RegistreraAlien(idb, anvId, anvTyp);
        registreraAlien.setVisible(true);
    }//GEN-LAST:event_btnRegistreraNyAlienMouseClicked

    private void btnUppdateraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUppdateraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUppdateraActionPerformed

    private void btnUppdateraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUppdateraMouseClicked
        setVisible(false);
        UppdateraAlien uppdateraAlien = new UppdateraAlien(idb, anvId, anvTyp);
        uppdateraAlien.setVisible(true);
    }//GEN-LAST:event_btnUppdateraMouseClicked

    private void menuBarStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarStartsidaMouseClicked
        setVisible(false);
        StartsidaAgent startsidaAgent = new StartsidaAgent(idb, anvId, anvTyp);
        startsidaAgent.setVisible(true);
    }//GEN-LAST:event_menuBarStartsidaMouseClicked

    private void manuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_manuBarLoggaUtMouseClicked

    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    private void btnTaBortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaBortActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTaBortActionPerformed

    private void btnTaBortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaBortMouseClicked
        setVisible(false);
        TaBortAlien taBort = new TaBortAlien(idb, anvId, anvTyp);
        taBort.setVisible(true);
    }//GEN-LAST:event_btnTaBortMouseClicked

    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistreraNyAlien;
    private javax.swing.JToggleButton btnTaBort;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JToggleButton btnUppdatera;
    private javax.swing.JLabel lblAgentBild;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JMenu manuBarLoggaUt;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarInget;
    private javax.swing.JMenu menuBarStartsida;
    private javax.swing.JMenu menuBarTomt;
    // End of variables declaration//GEN-END:variables
}
