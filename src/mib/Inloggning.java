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
 * @author Josanna, Linda & Lisa.
 */
public class Inloggning extends javax.swing.JFrame {

    private InfDB idb;
    // Varabler att spara ID och användartyp i för att skicka med till andra klasser.
    private String anvTyp;
    private String anvId;

    public Inloggning(InfDB idb) {
        initComponents();
        this.idb = idb;
    }

    public Inloggning() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rubrikAgentInlogg = new javax.swing.JLabel();
        lblInlogg = new javax.swing.JLabel();
        lblAnvandare = new javax.swing.JLabel();
        lblLosen = new javax.swing.JLabel();
        cmbList = new javax.swing.JComboBox<>();
        txtAnvandare = new javax.swing.JTextField();
        btnLoggain = new javax.swing.JToggleButton();
        pswlosen = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("Inlogg"); // NOI18N

        rubrikAgentInlogg.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rubrikAgentInlogg.setText("Välkommen till MiB Service System");

        lblInlogg.setText("Inloggningstyp");

        lblAnvandare.setText("AnvändarID");

        lblLosen.setText("Lösenord");

        cmbList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Agent", "Alien" }));

        btnLoggain.setText("Logga in");
        btnLoggain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoggainActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/mibVit.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(rubrikAgentInlogg))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblLosen, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblInlogg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAnvandare, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pswlosen)
                            .addComponent(btnLoggain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAnvandare)
                            .addComponent(cmbList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(138, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(rubrikAgentInlogg)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInlogg)
                            .addComponent(cmbList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAnvandare)
                            .addComponent(txtAnvandare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pswlosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLosen))
                        .addGap(18, 18, 18)
                        .addComponent(btnLoggain))
                    .addComponent(jLabel1))
                .addContainerGap(142, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inloggningsmetod som ska skicka användaren till ett nytt fönster baserat på om denne är alien, agent eller admin.
    private void btnLoggainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoggainActionPerformed

        //Hämtar de värden som användaren matat in i användarnamns-rutan.
        anvId = txtAnvandare.getText();
        String losenord = pswlosen.getText();
        //Variabler för att spara våra SQL-frågor i.
        String inloggTyp = "";
        String losenTyp = "";
        //Hämta värde från comboBox:en/rullisten och gör det värdet till en String.
        anvTyp = cmbList.getSelectedItem().toString();

        //If-sats för att kontrollera om användarnamn och lösenord fyllts i. 
        if (Validering.textFaltHarVarde(txtAnvandare) && Validering.textFaltHarVarde(pswlosen)) {
            if (Validering.txtFaltHarSiffror(txtAnvandare)) {
                //Kontrollerat om användaren valt Agent eller Alien i comboBox:en och sparar SQL-frågor utifrån det valet.
                if (anvTyp.equals("Agent")) {
                    inloggTyp = "SELECT Agent_ID FROM agent WHERE Agent_ID=";
                    losenTyp = "SELECT Losenord FROM agent WHERE Agent_ID=";
                } else {
                    inloggTyp = "SELECT Alien_ID FROM alien WHERE Alien_ID=";
                    losenTyp = "SELECT Losenord FROM alien WHERE Alien_ID=";
                }
                //Här skapar vi variabler som avser att användas för att jämföra inmatningen med det som finns registrerat i databasen.
                try {
                    String anvFranDatabas = idb.fetchSingle(inloggTyp + anvId);
                    String losenFranDatabas = idb.fetchSingle(losenTyp + anvId);
                    String adminStatus = idb.fetchSingle("SELECT Administrator FROM Agent WHERE Agent_ID=" + anvId);

                    //Kontrollerar att användare/lösenord stämmer överens.
                    if (anvId.equals(anvFranDatabas) && losenord.equals(losenFranDatabas)) {

                        //Här kontrolleras om man är alien/agent/admin och startsidan som öppnas är baserat på detta.
                        //Det finns alltså tre olika startsidor för vanliga agenter, administratörer och aliens.
                        if (anvTyp.equals("Agent") && adminStatus.equals("J")) {
                            setVisible(false);
                            StartsidaAdmin startAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
                            startAdmin.setVisible(true);
                        } else if (anvTyp.equals("Agent")) {
                            setVisible(false);
                            StartsidaAgent startAgent = new StartsidaAgent(idb, anvId, anvTyp);
                            startAgent.setVisible(true);
                        } else {
                            setVisible(false);
                            StartsidaAlien startAlien = new StartsidaAlien(idb, anvId, anvTyp);
                            startAlien.setVisible(true);
                        }
                    } //Stämmer inte lösenordet överens med användat-ID:t (AlienID/AgentID) i databasen möts användaren av denna dialogruta.
                    else {
                        JOptionPane.showMessageDialog(null, "Lösenordet är fel!");
                    }
                } //Om något går fel i if-satsen (undantag) som kontrollerar inloggningstypen (Alien/Agent) kommer denna dialogruta upp.
                catch (InfException e) {
                    JOptionPane.showMessageDialog(null, "Något gick fel!");
                    System.out.println("Internt felmeddelande" + e.getMessage());
                }
            }
        } //Om fälten inte är ifyllda och saknas värden visas denna dialog.
        else {
            JOptionPane.showMessageDialog(null, "Fyll i användarnamn och lösenord");
        }
    }//GEN-LAST:event_btnLoggainActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnLoggain;
    private javax.swing.JComboBox<String> cmbList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAnvandare;
    private javax.swing.JLabel lblInlogg;
    private javax.swing.JLabel lblLosen;
    private javax.swing.JPasswordField pswlosen;
    private javax.swing.JLabel rubrikAgentInlogg;
    private javax.swing.JTextField txtAnvandare;
    // End of variables declaration//GEN-END:variables

}
