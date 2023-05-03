/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pfiches;

import java.io.IOException;
import projetcinema.Portail;

/**
 *
 * @author tjrha
 */
public class FAccueil extends javax.swing.JFrame {

    /**
     * Creates new form FAccueils
     */
    private FRechercherC fichCinema;
    private FAdmin fichAdmin;
    private FRechercherF fichFilm;
    private Portail p;

 
    public FAccueil(){
        p = new Portail();
        initComponents();
        fichCinema = new FRechercherC(this,false);
        fichAdmin = new FAdmin(this,false);
        fichFilm = new FRechercherF(this,false);
        bAjCinema.setEnabled(false);
        bAjFilm.setEnabled(false);
        bAjSeance.setEnabled(false);
        try{
            p.chargerFilm();
            p.chargerCinema();
//            p.chargerSeance();
        }
        catch(IOException ex){
            System.out.println("Erreur dans le chargement");
        }   
    }
    
    public Portail getPortail(){
        return p;
    }
    
    public javax.swing.JButton getbAjCinema(){
        return bAjCinema;
    }
    
    public javax.swing.JButton getbAjFilm(){
        return bAjFilm;
    }
    
    public javax.swing.JButton getbAjSeance(){
        return bAjSeance;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bRechCinema = new javax.swing.JButton();
        bRechFilm = new javax.swing.JButton();
        bAdmin = new javax.swing.JButton();
        bAjCinema = new javax.swing.JButton();
        bAjFilm = new javax.swing.JButton();
        bAjSeance = new javax.swing.JButton();
        bQuitter = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        bRechCinema.setBackground(new java.awt.Color(130, 10, 121));
        bRechCinema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRechCinema.setForeground(new java.awt.Color(255, 255, 255));
        bRechCinema.setText("Rechercher Cinema");
        bRechCinema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRechCinemaActionPerformed(evt);
            }
        });

        bRechFilm.setBackground(new java.awt.Color(130, 10, 121));
        bRechFilm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRechFilm.setForeground(new java.awt.Color(255, 255, 255));
        bRechFilm.setText("Rechercher Film");
        bRechFilm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRechFilmActionPerformed(evt);
            }
        });

        bAdmin.setBackground(new java.awt.Color(0, 0, 153));
        bAdmin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAdmin.setForeground(new java.awt.Color(255, 255, 255));
        bAdmin.setText("Admin");
        bAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdminActionPerformed(evt);
            }
        });

        bAjCinema.setBackground(new java.awt.Color(250, 112, 9));
        bAjCinema.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAjCinema.setForeground(new java.awt.Color(255, 255, 255));
        bAjCinema.setText("Ajouter Cinema");

        bAjFilm.setBackground(new java.awt.Color(0, 51, 204));
        bAjFilm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAjFilm.setForeground(new java.awt.Color(255, 255, 255));
        bAjFilm.setText("Ajouter Film");
        bAjFilm.setToolTipText("");

        bAjSeance.setBackground(new java.awt.Color(0, 51, 204));
        bAjSeance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bAjSeance.setForeground(new java.awt.Color(255, 255, 255));
        bAjSeance.setText("Ajouter Seance");

        bQuitter.setBackground(new java.awt.Color(204, 0, 0));
        bQuitter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bQuitter.setForeground(new java.awt.Color(255, 255, 255));
        bQuitter.setText("Quitter");
        bQuitter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bQuitterActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(250, 112, 9));
        jPanel2.setPreferredSize(new java.awt.Dimension(2, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(539, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(bRechCinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bRechFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAjCinema, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAjFilm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bAjSeance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(bQuitter))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bRechCinema)
                .addGap(18, 18, 18)
                .addComponent(bRechFilm)
                .addGap(18, 18, 18)
                .addComponent(bAdmin)
                .addGap(18, 18, 18)
                .addComponent(bAjCinema)
                .addGap(18, 18, 18)
                .addComponent(bAjFilm)
                .addGap(18, 18, 18)
                .addComponent(bAjSeance)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addComponent(bQuitter)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bRechCinemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRechCinemaActionPerformed
        // TODO add your handling code here:
        FRechercherC fichCinema = new FRechercherC(this,false);
        this.setVisible(false); // rendre invisible la fiche d'acceuil
        fichCinema.setVisible(true);
        fichCinema.init();
    }//GEN-LAST:event_bRechCinemaActionPerformed

    private void bQuitterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bQuitterActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_bQuitterActionPerformed

    private void bAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdminActionPerformed
        // TODO add your handling code here:
        this.setVisible(false); // rendre invisible la fiche d'acceuil
        fichAdmin.setVisible(true);
    }//GEN-LAST:event_bAdminActionPerformed

    private void bRechFilmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRechFilmActionPerformed
        // TODO add your handling code here:
        FRechercherF fichFilm = new FRechercherF(this,false);
        this.setVisible(false); // rendre invisible la fiche d'acceuil
        fichFilm.setVisible(true);
        fichFilm.init();
    }//GEN-LAST:event_bRechFilmActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FAccueil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FAccueil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdmin;
    private javax.swing.JButton bAjCinema;
    private javax.swing.JButton bAjFilm;
    private javax.swing.JButton bAjSeance;
    private javax.swing.JButton bQuitter;
    private javax.swing.JButton bRechCinema;
    private javax.swing.JButton bRechFilm;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}