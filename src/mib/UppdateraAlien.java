/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author Josanna, Linda & Lisa
 */
public class UppdateraAlien extends javax.swing.JFrame {

    private InfDB idb;
    private String anvId;
    private String anvTyp;
    ArrayList<String> squidLista;
    ArrayList<String> bogloditeLista;
    ArrayList<String> wormLista;
    String idText = "";

    public UppdateraAlien(InfDB idb, String anvId, String anvTyp) {
        initComponents();
        this.idb = idb;
        this.anvId = anvId;
        this.anvTyp = anvTyp;

        // Här anropas en metod från klassen SQL där man fyller rullister med information.
        SQL s = new SQL(idb);
        s.agent(cmbAnsAgent);
        s.plats(cmbPlats);
        s.alien(cmbNamn);

        // Anropas för att dölja nedanstående rader tills dess att man har valt ras.
        doljText(txtRasInfo);
        doljLabel(lblRasInfo);

        // För att kunna nå ArrayListorna från flera metoder skapas de redan i konstruktorn.
        try {
            squidLista = idb.fetchColumn("SELECT Alien_ID FROM squid ORDER BY Alien_ID");
            bogloditeLista = idb.fetchColumn("SELECT Alien_ID FROM boglodite ORDER BY Alien_ID");
            wormLista = idb.fetchColumn("SELECT Alien_ID FROM worm ORDER BY Alien_ID");
        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

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
        lblID = new javax.swing.JLabel();
        txtTelefon = new javax.swing.JTextField();
        lblTelefon = new javax.swing.JLabel();
        lblRas = new javax.swing.JLabel();
        cmbRas = new javax.swing.JComboBox<>();
        lblPlats = new javax.swing.JLabel();
        lblConfirm = new javax.swing.JLabel();
        cmbAnsAgent = new javax.swing.JComboBox<>();
        lblAnsvarigAgent = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        pswLosen = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        cmbPlats = new javax.swing.JComboBox<>();
        lblPersInfo = new javax.swing.JLabel();
        lblAlienNamn = new javax.swing.JLabel();
        txtRasInfo = new javax.swing.JTextField();
        lblRasInfo = new javax.swing.JLabel();
        btnValjRas = new javax.swing.JToggleButton();
        btnSok = new javax.swing.JToggleButton();
        btnSpara = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JToggleButton();
        cmbNamn = new javax.swing.JComboBox<>();
        txtNyttNamn = new javax.swing.JTextField();
        lblNyttNamn = new javax.swing.JLabel();
        txtID = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuBarStartsida = new javax.swing.JMenu();
        menuBarInget = new javax.swing.JMenu();
        menuBarInlogg = new javax.swing.JMenu();
        menuBarLoggaUt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblTitel.setText("Uppdatera alien");

        lblID.setText("ID");

        lblTelefon.setText("Telefon");

        lblRas.setText("Ras");

        cmbRas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boglodite", "Squid", "Worm", "Ingen" }));

        lblPlats.setText("Plats");

        lblConfirm.setForeground(new java.awt.Color(0, 204, 0));

        lblAnsvarigAgent.setText("Ansvarig agent");

        lblLosen.setText("Lösenord");

        jLabel7.setFont(new java.awt.Font("Hiragino Maru Gothic ProN", 0, 24)); // NOI18N
        jLabel7.setText("MiB REGISTRERINGSSERVICE");

        lblAlienNamn.setText("Namn");

        lblRasInfo.setText("Rasinfo");

        btnValjRas.setText("Välj ny ras");
        btnValjRas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnValjRasMouseClicked(evt);
            }
        });

        btnSok.setText("Sök");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSokMouseClicked(evt);
            }
        });

        btnSpara.setText("Spara ändringar");
        btnSpara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSparaActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/UppdateraAlien.png"))); // NOI18N

        btnTillbaka.setText("Gå tillbaka");
        btnTillbaka.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTillbakaActionPerformed(evt);
            }
        });

        lblNyttNamn.setText("Nytt namn");

        txtID.setText("   ");

        menuBarStartsida.setText("Gå till startsida");
        menuBarStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarStartsidaMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuBarStartsida);

        menuBarInget.setText("                                                                                                                             ");
        jMenuBar1.add(menuBarInget);

        menuBarInlogg.setText("Inloggad som Agent");
        jMenuBar1.add(menuBarInlogg);

        menuBarLoggaUt.setText("Logga ut");
        menuBarLoggaUt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarLoggaUtMouseClicked(evt);
            }
        });
        jMenuBar1.add(menuBarLoggaUt);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblConfirm)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPersInfo)
                                    .addComponent(btnTillbaka))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 346, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAlienNamn)
                                    .addComponent(lblRas, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblRasInfo)
                                    .addComponent(lblPlats)
                                    .addComponent(lblAnsvarigAgent)
                                    .addComponent(lblLosen)
                                    .addComponent(lblNyttNamn))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(cmbAnsAgent, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(cmbPlats, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(cmbNamn, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(txtNyttNamn, javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(pswLosen, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                                    .addGap(12, 12, 12)
                                                    .addComponent(btnSok)))
                                            .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnSpara))
                                        .addGap(30, 30, 30)
                                        .addComponent(lblID)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnValjRas)
                                        .addGap(79, 79, 79)))))
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(124, 124, 124)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(237, 237, 237)
                                .addComponent(lblTitel)))
                        .addGap(0, 237, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTitel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btnSok)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtID))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblLosen)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtNyttNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblNyttNamn))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtTelefon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblTelefon))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblPlats)
                                            .addComponent(cmbPlats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAnsvarigAgent)
                                            .addComponent(cmbAnsAgent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRas)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(cmbRas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnValjRas)))
                                        .addGap(49, 49, 49)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblRasInfo)
                                            .addComponent(txtRasInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnSpara))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(pswLosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(lblPersInfo)
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAlienNamn)
                            .addComponent(cmbNamn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTillbaka)))
                .addComponent(lblConfirm)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Metoden döljer en ruta som lagrar information tillhörande specifik
     * utrustning. metoden anropas direkt i konstruktorn för att inledningsvis
     * döljas.
     */
    private void doljText(JTextField textAttDolja) {
        textAttDolja.setVisible(false);
    }

    /**
     * Metoden döljer en rubrik som lagrar information tillhörande specifik
     * utrustning. metoden anropas direkt i konstruktorn för att inledningsvis
     * döljas.
     */
    private void doljLabel(JLabel lablAttDolja) {
        lablAttDolja.setVisible(false);
    }

    /**
     * Varje ras har egen information som behöver lagras. Detta görs genom
     * knappen välj. Beroende på ras så ska olik information visas.
     *
     */
    private void btnValjRasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnValjRasMouseClicked

// Hämtar information från markerat alternativ i rullisten. 
        String ras = cmbRas.getSelectedItem().toString();

        // Via en villkorssats visas tillhörande information om rasen. 
        if (ras.equals("Boglodite")) {
            txtRasInfo.setVisible(true);
            lblRasInfo.setVisible(true);
            lblRasInfo.setText("Antal Boogies");
            txtRasInfo.setText("");

        } else if (ras.equals("Squid")) {
            txtRasInfo.setVisible(true);
            lblRasInfo.setVisible(true);
            lblRasInfo.setText("Antal Armar");
            txtRasInfo.setText("");
        } else {
            doljText(txtRasInfo);
            doljLabel(lblRasInfo);
        }
    }//GEN-LAST:event_btnValjRasMouseClicked

    /**
     * Metoden söker upp information om det alienID man har angett.
     *
     * @param evt
     */
    private void btnSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMouseClicked
        // Dölj fält inför ny sökning
        doljText(txtRasInfo);
        doljLabel(lblRasInfo);

        String namn = cmbNamn.getSelectedItem().toString();

        try {

            idText = idb.fetchSingle("SELECT alien_ID FROM alien WHERE namn ='" + namn + "'");
            // Koden nedan hämtar information baserat på det ID man har angett.
            txtID.setText(idText);
            
            txtNyttNamn.setText(namn);

            String losen = idb.fetchSingle("SELECT Losenord FROM alien WHERE Alien_ID ='" + idText + "'");
            pswLosen.setText(losen);

            String telefon = idb.fetchSingle("SELECT Telefon FROM alien WHERE Alien_ID ='" + idText + "'");
            txtTelefon.setText(telefon);

            String platsID = idb.fetchSingle("SELECT Plats FROM alien WHERE Alien_ID ='" + idText + "'");
            String platsNamn = idb.fetchSingle("SELECT Benamning FROM plats WHERE Plats_ID ='" + platsID + "'");
            cmbPlats.setSelectedItem(platsNamn);

            String agent = idb.fetchSingle("SELECT Ansvarig_Agent FROM alien WHERE Alien_ID ='" + idText + "'");
            String agentNamn = idb.fetchSingle("SELECT Namn FROM agent WHERE Agent_ID ='" + agent + "'");
            cmbAnsAgent.setSelectedItem(agentNamn);

            // Nedan använder man ArrayList för att hämta information kopplat till den ras som alienID är kopplat till.
            if (squidLista.contains(idText)) {
                cmbRas.setSelectedItem("Squid");

                String antalArmar = idb.fetchSingle("SELECT Antal_Armar FROM squid WHERE Alien_ID = '" + idText + "'");
                txtRasInfo.setText(antalArmar);
                txtRasInfo.setVisible(true);

                lblRasInfo.setVisible(true);
                lblRasInfo.setText("Antal Armar");
            } else if (bogloditeLista.contains(idText)) {
                cmbRas.setSelectedItem("Boglodite");

                String antalBoogies = idb.fetchSingle("SELECT Antal_Boogies FROM boglodite WHERE Alien_ID = '" + idText + "'");
                txtRasInfo.setText(antalBoogies);
                txtRasInfo.setVisible(true);

                lblRasInfo.setVisible(true);
                lblRasInfo.setText("Antal Boogies");
            } else if (wormLista.contains(idText)) {
                cmbRas.setSelectedItem("Worm");
            } else {
                cmbRas.setSelectedItem("Ingen");
            }

        } // Om något går fel visas ett felmeddelande. 
        catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }//GEN-LAST:event_btnSokMouseClicked

    /**
     * Metoden lägger till den information man har uppdaterat om valt alienID.
     *
     * @param evt
     */
    private void btnSparaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSparaActionPerformed

        // Kontrollerar att viktiga fält är ifyllda innan man kan lagra ny information.
        if (Validering.passwordHarVarde(pswLosen) && Validering.textFaltHarVarde(txtNyttNamn)) {

            String regRas = cmbRas.getSelectedItem().toString();
            String rasInfo = txtRasInfo.getText();
            String regLosenord = pswLosen.getText();

            // Kontrollerar att lösenordet är korrekt ifyllt.
            if (regLosenord.length() <= 6 && regLosenord.length() >= 3) {

                try {

                    // Kontrollerar att beroende på vilken ras man har angett måste även tillhörande fält vara ifyllt. Uppdaterar rastabellen med vald information.
                    if (regRas.equals("Boglodite") && Validering.textFaltHarVarde(txtRasInfo)) {
                        uppdatera();

                        // Om ID finns i tabellen ska man uppdatera annars lägger man till ny information.
                        if (bogloditeLista.contains(idText)) {
                            idb.update("UPDATE Boglodite SET Antal_Boogies = '" + rasInfo + "' WHERE Alien_ID = '" + idText + "'");
                            btnTillbakaActionPerformed(evt);
                        } else {
                            idb.insert("INSERT INTO Boglodite VALUES ('" + idText + "', '" + rasInfo + "')");
                            btnTillbakaActionPerformed(evt);

                            // Nedan if-statement kontrollerar om information finns i övriga tabeller och tar bort den informationen.
                            if (squidLista.contains(idText)) {
                                idb.delete("DELETE FROM Squid WHERE Alien_ID = '" + idText + "'");
                            }
                            if (wormLista.contains(idText)) {
                                idb.delete("DELETE FROM Worm WHERE Alien_ID = '" + idText + "'");
                            }
                        }

                        // Kontrollerar att beroende på vilken ras man har angett måste även tillhörande fält vara ifyllt. Uppdaterar rastabellen med vald information.
                    } else if (regRas.equals("Squid") && Validering.textFaltHarVarde(txtRasInfo)) {
                        uppdatera();

                        // Om ID finns i tabellen ska man uppdatera annars lägger man till ny information.
                        if (squidLista.contains(idText)) {
                            idb.update("UPDATE Squid SET Antal_Armar = '" + rasInfo + "' WHERE Alien_ID = '" + idText + "'");
                            btnTillbakaActionPerformed(evt);
                        } else {
                            idb.insert("INSERT INTO Squid VALUES ('" + idText + "', '" + rasInfo + "')");
                            btnTillbakaActionPerformed(evt);

                            // Nedan if-statement kontrollerar om information finns i övriga tabeller och tar bort den informationen.
                            if (bogloditeLista.contains(idText)) {
                                idb.delete("DELETE FROM Boglodite WHERE Alien_ID = '" + idText + "'");
                            }
                            if (wormLista.contains(idText)) {
                                idb.delete("DELETE FROM Worm WHERE Alien_ID = '" + idText + "'");
                            }
                        }

                        // Uppdaterar rastabellen med vald information.
                    } else if (regRas.equals("Worm")) {
                        uppdatera();

                        // Om ID finns i tabellen ska man uppdatera annars lägger man till ny information.
                        if (wormLista.contains(idText)) {
                            idb.update("UPDATE Worm SET Antal_Armar = '" + rasInfo + "' WHERE Alien_ID = '" + idText + "'");
                            btnTillbakaActionPerformed(evt);
                        } else {
                            idb.insert("INSERT INTO Worm VALUES ('" + idText + "')");
                            btnTillbakaActionPerformed(evt);

                            // Nedan if-statement kontrollerar om information finns i övriga tabeller och tar bort den informationen.
                            if (bogloditeLista.contains(idText)) {
                                idb.delete("DELETE FROM Boglodite WHERE Alien_ID = '" + idText + "'");
                            }
                            if (squidLista.contains(idText)) {
                                idb.delete("DELETE FROM Squid WHERE Alien_ID = '" + idText + "'");
                            }
                        }

                        // Uppdaterar rastabellen med vald information.
                    } else if (regRas.equals("Ingen")) {
                        uppdatera();
                        btnTillbakaActionPerformed(evt);
                        // Nedan if-statement kontrollerar om information finns i övriga tabeller och tar bort den informationen.
                        if (bogloditeLista.contains(idText)) {
                            idb.delete("DELETE FROM Boglodite WHERE Alien_ID = '" + idText + "'");
                        }

                        if (squidLista.contains(idText)) {
                            idb.delete("DELETE FROM Squid WHERE Alien_ID = '" + idText + "'");
                        }
                        if (wormLista.contains(idText)) {
                            idb.delete("DELETE FROM Worm WHERE Alien_ID = '" + idText + "'");
                        }

                    } // Om fälten ej är korrekt ifyllda visas felmeddelande.
                    else {
                        JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
                    }

                } // Om något går fel så visas ett felmeddelande.
                catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel!");
                    System.out.println("Internt felmeddelande" + e.getMessage());
                }
            } // Om lösenordet inte är korrekt ifyllt visas ett felmeddelande. 
            else {
                JOptionPane.showMessageDialog(null, "Lösenordet ska ha minst 3 tecken och som mest 6!");
            }

        } // Om fälten ej är korrekt ifyllda visas felmeddelande.
        else {
            JOptionPane.showMessageDialog(null, "Alla fält måste vara ifyllda!");
        }


    }//GEN-LAST:event_btnSparaActionPerformed

    // Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAgent i nytt fönster.
    private void btnTillbakaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTillbakaActionPerformed

        //Baserat på om inloggad agent är admin eller inte visas olika sidor. Detta gör man genom en separat metod i SQL.
        SQL s = new SQL(idb);
        boolean admin = s.arAdmin(anvId);
        setVisible(false);

        if (admin) {
            HanteraAliensAdmin h = new HanteraAliensAdmin(idb, anvId, anvTyp);
            h.setVisible(true);
        } else {
            HanteraAliens h = new HanteraAliens(idb, anvId, anvTyp);
            h.setVisible(true);
        }
    }//GEN-LAST:event_btnTillbakaActionPerformed

    // Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAgent i nytt fönster.
    private void menuBarStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarStartsidaMouseClicked
        setVisible(false);
        SQL s = new SQL(idb);
        s.tillStartsida(anvId, anvTyp);
    }//GEN-LAST:event_menuBarStartsidaMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen Inloggning i nytt fönster. Denna metod gör så att man blir utloggad.
    private void menuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_menuBarLoggaUtMouseClicked

    /**
     * Metoden uppdaterar tabellen alien med den information som finns i fälten.
     */
    private void uppdatera() {

        String regLosenord = pswLosen.getText();
        String regTelefon = txtTelefon.getText();
        String regPlats = cmbPlats.getSelectedItem().toString();
        String regAnsAgent = cmbAnsAgent.getSelectedItem().toString();        
        String nyttNamn = txtNyttNamn.getText();
        
        try {

            String platsID = idb.fetchSingle("SELECT Plats_ID FROM plats WHERE Benamning = '" + regPlats + "'");
            String regAgentID = idb.fetchSingle("SELECT Agent_ID FROM agent WHERE namn = '" + regAnsAgent + "'");

            idb.update("UPDATE Alien SET Losenord = '" + regLosenord + "' WHERE Alien_ID = '" + idText + "'");
            idb.update("UPDATE Alien SET Namn = '" + nyttNamn + "' WHERE Alien_ID = '" + idText + "'");
            idb.update("UPDATE Alien SET Telefon = '" + regTelefon + "' WHERE Alien_ID = '" + idText + "'");
            idb.update("UPDATE Alien SET Losenord = '" + regLosenord + "' WHERE Alien_ID = '" + idText + "'");
            idb.update("UPDATE Alien SET Plats = '" + platsID + "' WHERE Alien_ID = '" + idText + "'");
            idb.update("UPDATE Alien SET Ansvarig_Agent = '" + regAgentID + "'WHERE Alien_ID = '" + idText + "'");

            JOptionPane.showMessageDialog(null, "Uppdateringen lyckades!");

        } catch (InfException e) {
            JOptionPane.showMessageDialog(null, "Något gick fel!");
            System.out.println("Internt felmeddelande" + e.getMessage());
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnSok;
    private javax.swing.JToggleButton btnSpara;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JToggleButton btnValjRas;
    private javax.swing.JComboBox<String> cmbAnsAgent;
    private javax.swing.JComboBox<String> cmbNamn;
    private javax.swing.JComboBox<String> cmbPlats;
    private javax.swing.JComboBox<String> cmbRas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblAlienNamn;
    private javax.swing.JLabel lblAnsvarigAgent;
    private javax.swing.JLabel lblConfirm;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JLabel lblNyttNamn;
    private javax.swing.JLabel lblPersInfo;
    private javax.swing.JLabel lblPlats;
    private javax.swing.JLabel lblRas;
    private javax.swing.JLabel lblRasInfo;
    private javax.swing.JLabel lblTelefon;
    private javax.swing.JLabel lblTitel;
    private javax.swing.JMenu menuBarInget;
    private javax.swing.JMenu menuBarInlogg;
    private javax.swing.JMenu menuBarLoggaUt;
    private javax.swing.JMenu menuBarStartsida;
    private javax.swing.JPasswordField pswLosen;
    private javax.swing.JLabel txtID;
    private javax.swing.JTextField txtNyttNamn;
    private javax.swing.JTextField txtRasInfo;
    private javax.swing.JTextField txtTelefon;
    // End of variables declaration//GEN-END:variables
}
