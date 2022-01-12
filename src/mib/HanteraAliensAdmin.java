/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mib;

import oru.inf.InfDB;

/**
 *
 * @author Josanna, Linda & Lisa
 */
public class HanteraAliensAdmin extends javax.swing.JFrame {

    private InfDB idb;
    private String anvId;
    private String anvTyp;

    public HanteraAliensAdmin(InfDB idb, String anvId, String anvTyp) {
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

        lblAgentBild = new javax.swing.JLabel();
        lblRubrik = new javax.swing.JLabel();
        btnTillbaka = new javax.swing.JToggleButton();
        btnRegistreraNyAlien = new javax.swing.JButton();
        btnUppdatera = new javax.swing.JToggleButton();
        btnTaBort = new javax.swing.JToggleButton();
        btnSok = new javax.swing.JToggleButton();
        btnListaPlats = new javax.swing.JButton();
        btnListaAlienRas = new javax.swing.JToggleButton();
        btnListaAlienDatum = new javax.swing.JToggleButton();
        menuBar = new javax.swing.JMenuBar();
        menuBarStartsida = new javax.swing.JMenu();
        menuBarInget = new javax.swing.JMenu();
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

        btnTaBort.setText("Ta bort alien");
        btnTaBort.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTaBortMouseClicked(evt);
            }
        });

        btnSok.setText("Sök alien");
        btnSok.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSokMouseClicked(evt);
            }
        });

        btnListaPlats.setText("Lista alien utifrån plats");
        btnListaPlats.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaPlatsMouseClicked(evt);
            }
        });

        btnListaAlienRas.setText("Lista alien utifrån ras");
        btnListaAlienRas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaAlienRasMouseClicked(evt);
            }
        });

        btnListaAlienDatum.setText("Lista alien utifrån registreringsdatum");
        btnListaAlienDatum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnListaAlienDatumMouseClicked(evt);
            }
        });

        menuBarStartsida.setText("Gå till Startsida");
        menuBarStartsida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuBarStartsidaMouseClicked(evt);
            }
        });
        menuBar.add(menuBarStartsida);

        menuBarInget.setText("                                                                                                                                                ");
        menuBar.add(menuBarInget);

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUppdatera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistreraNyAlien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSok, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaPlats, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaAlienRas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnListaAlienDatum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnTaBort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addComponent(lblAgentBild, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(lblRubrik))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnTillbaka)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblRubrik, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(lblAgentBild, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnRegistreraNyAlien)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnUppdatera)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSok)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListaPlats)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListaAlienRas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnListaAlienDatum)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnTaBort)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(btnTillbaka)
                .addGap(15, 15, 15))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Metoden gör nuvarande fönster osynligt och öppnar klassen RegistreraAlien i nytt fönster.
    private void btnRegistreraNyAlienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegistreraNyAlienMouseClicked
        setVisible(false);
        RegistreraAlien registreraAlien = new RegistreraAlien(idb, anvId, anvTyp);
        registreraAlien.setVisible(true);
    }//GEN-LAST:event_btnRegistreraNyAlienMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen UppdateraAlien i nytt fönster.
    private void btnUppdateraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUppdateraMouseClicked
        setVisible(false);
        UppdateraAlien uppdateraAlien = new UppdateraAlien(idb, anvId, anvTyp);
        uppdateraAlien.setVisible(true);
    }//GEN-LAST:event_btnUppdateraMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAdmin i nytt fönster.
    private void menuBarStartsidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuBarStartsidaMouseClicked
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);
    }//GEN-LAST:event_menuBarStartsidaMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen Inloggning i nytt fönster. Denna metod gör så att man blir utloggad.
    private void manuBarLoggaUtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuBarLoggaUtMouseClicked
        setVisible(false);
        Inloggning inlogg = new Inloggning(idb);
        inlogg.setVisible(true);
    }//GEN-LAST:event_manuBarLoggaUtMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen StartsidaAdmin i nytt fönster.
    private void btnTillbakaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTillbakaMouseClicked
        setVisible(false);
        StartsidaAdmin startsidaAdmin = new StartsidaAdmin(idb, anvId, anvTyp);
        startsidaAdmin.setVisible(true);
    }//GEN-LAST:event_btnTillbakaMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen TaBortAlien i nytt fönster.
    private void btnTaBortMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTaBortMouseClicked
        setVisible(false);
        TaBortAlien taBort = new TaBortAlien(idb, anvId, anvTyp);
        taBort.setVisible(true);
    }//GEN-LAST:event_btnTaBortMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen SokAlien i nytt fönster.
    private void btnSokMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSokMouseClicked
        setVisible(false);
        SokAlien sokAlien = new SokAlien(idb, anvId, anvTyp);
        sokAlien.setVisible(true);
    }//GEN-LAST:event_btnSokMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen ListaAliensPlats i nytt fönster.
    private void btnListaPlatsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaPlatsMouseClicked
        setVisible(false);
        ListaAliensPlats listaAlien = new ListaAliensPlats(idb, anvId, anvTyp);
        listaAlien.setVisible(true);
    }//GEN-LAST:event_btnListaPlatsMouseClicked

    //Metoden gör nuvarande fönster osynligt och öppnar klassen ListaAliensRas i nytt fönster.
    private void btnListaAlienRasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaAlienRasMouseClicked
        setVisible(false);
        ListaAliensRas ras = new ListaAliensRas(idb, anvId, anvTyp);
        ras.setVisible(true);
    }//GEN-LAST:event_btnListaAlienRasMouseClicked
    //Metoden gör nuvarande fönster osynligt och öppnar klassen ListaAliensDatum i nytt fönster.
    private void btnListaAlienDatumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnListaAlienDatumMouseClicked
        setVisible(false);
        ListaAliensDatum datum = new ListaAliensDatum(idb, anvId, anvTyp);
        datum.setVisible(true);
    }//GEN-LAST:event_btnListaAlienDatumMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnListaAlienDatum;
    private javax.swing.JToggleButton btnListaAlienRas;
    private javax.swing.JButton btnListaPlats;
    private javax.swing.JButton btnRegistreraNyAlien;
    private javax.swing.JToggleButton btnSok;
    private javax.swing.JToggleButton btnTaBort;
    private javax.swing.JToggleButton btnTillbaka;
    private javax.swing.JToggleButton btnUppdatera;
    private javax.swing.JLabel lblAgentBild;
    private javax.swing.JLabel lblRubrik;
    private javax.swing.JMenu manuBarLoggaUt;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuBarInget;
    private javax.swing.JMenu menuBarStartsida;
    // End of variables declaration//GEN-END:variables
}
