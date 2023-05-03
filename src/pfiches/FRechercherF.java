/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pfiches;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import projetcinema.Film;

/**
 *
 * @author tjrha
 */
public class FRechercherF extends javax.swing.JDialog {
    
    private JLabel[] tabLab1;
    private JButton[] tabLab2;
    private int indPrem;
    private FFilm fichF;

    /**
     * Creates new form FRechercherF
     */
    public FRechercherF(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fichF = new FFilm(this,false);
    }
    
    public void init(){
        indPrem = 0;
        //créer le tableau de labels
        tabLab1 = new JLabel[3];
        tabLab2 = new JButton[3];
        //créer un gestionnaire de positionnement et l'associer au panel
        GridLayout gest1 = new GridLayout(0,3,50,0);
        pFilm.setLayout(gest1);
        GridLayout gest2 = new GridLayout(0,3,50,0);
        pTitre.setLayout(gest2);
        //créer les labels 
        for (int i=0;i<3;i++){
            //créer un label 
            JLabel lab1 = new JLabel();
            JButton but = new JButton();
            but.setBackground(Color.black);
            but.setForeground(Color.white);
            but.setFont(new Font("",Font.BOLD, 20));
            but.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    //FFilm fichF = new FFilm(this,false);
                    //this.setVisible(false);
                    fichF.setVisible(true);
                    String titre = but.getText();
                    System.out.println(titre);
                    fichF.init(titre);
                }
            });
            //Définir la taille du label 
            Dimension dim1 = new Dimension(250,275);
            lab1.setPreferredSize(dim1);
            Dimension dim2 = new Dimension(40,275);
            but.setPreferredSize(dim2);
            //ajouter le label dans le tableau
            tabLab1[i]=lab1;
            tabLab2[i]=but;
            //ajouter le label dans le panel
            pFilm.add(tabLab1[i]);
            pTitre.add(tabLab2[i]);
        }
        //mettre à jour l'affichage
        this.pack();
        ArrayList<Film> Films = ((FAccueil) this.getParent()).getPortail().getFilms();
        ((FAccueil) this.getParent()).getPortail().afficherFilm(Films,tabLab1,indPrem);
        ((FAccueil) this.getParent()).getPortail().afficherTitre(Films,tabLab2,indPrem);
//        lFilm1.setText(((FAccueil) this.getParent()).getPortail().getFilms().get(indPrem).gettitre());
//        lFilm2.setText(((FAccueil) this.getParent()).getPortail().getFilms().get(indPrem+1).gettitre());
//        lFilm3.setText(((FAccueil) this.getParent()).getPortail().getFilms().get(indPrem+2).gettitre());
        if(indPrem==0){
            bGauche.setEnabled(false);
        }
        if(indPrem>=((FAccueil) this.getParent()).getPortail().getTailleListeFilms()-3){
            bDroite.setEnabled(false);
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

        jPanel1 = new javax.swing.JPanel();
        bRetour = new javax.swing.JButton();
        pFilm = new javax.swing.JPanel();
        lRechNom = new javax.swing.JLabel();
        tfRechNom = new javax.swing.JTextField();
        bDroite = new javax.swing.JButton();
        bGauche = new javax.swing.JButton();
        bEntrer = new javax.swing.JButton();
        pTitre = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 400));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 450));

        bRetour.setBackground(new java.awt.Color(204, 0, 0));
        bRetour.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bRetour.setForeground(new java.awt.Color(255, 255, 255));
        bRetour.setText("Retour");
        bRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRetourActionPerformed(evt);
            }
        });

        pFilm.setBackground(new java.awt.Color(102, 102, 102));
        pFilm.setPreferredSize(new java.awt.Dimension(650, 250));

        javax.swing.GroupLayout pFilmLayout = new javax.swing.GroupLayout(pFilm);
        pFilm.setLayout(pFilmLayout);
        pFilmLayout.setHorizontalGroup(
            pFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        pFilmLayout.setVerticalGroup(
            pFilmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );

        lRechNom.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lRechNom.setForeground(new java.awt.Color(255, 255, 255));
        lRechNom.setText("Rechercher par Nom :");

        tfRechNom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfRechNomActionPerformed(evt);
            }
        });

        bDroite.setBackground(new java.awt.Color(0, 0, 0));
        bDroite.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bDroite.setForeground(new java.awt.Color(250, 112, 9));
        bDroite.setText(">");
        bDroite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDroiteActionPerformed(evt);
            }
        });

        bGauche.setBackground(new java.awt.Color(0, 0, 0));
        bGauche.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bGauche.setForeground(new java.awt.Color(250, 112, 9));
        bGauche.setText("<");
        bGauche.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGaucheActionPerformed(evt);
            }
        });

        bEntrer.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bEntrer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pimage/Loupe.png"))); // NOI18N
        bEntrer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEntrerActionPerformed(evt);
            }
        });

        pTitre.setBackground(new java.awt.Color(102, 102, 102));
        pTitre.setPreferredSize(new java.awt.Dimension(650, 40));

        javax.swing.GroupLayout pTitreLayout = new javax.swing.GroupLayout(pTitre);
        pTitre.setLayout(pTitreLayout);
        pTitreLayout.setHorizontalGroup(
            pTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        pTitreLayout.setVerticalGroup(
            pTitreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(250, 112, 9));
        jPanel2.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(lRechNom)
                        .addGap(18, 18, 18)
                        .addComponent(tfRechNom, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bEntrer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(bDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 850, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(bRetour)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lRechNom)
                        .addComponent(tfRechNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bEntrer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(bDroite, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(bGauche, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(pFilm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pTitre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bRetour)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bEntrerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEntrerActionPerformed
        // TODO add your handling code here:
        String nomFilm = tfRechNom.getText();
        ArrayList<Film> Films = ((FAccueil) this.getParent()).getPortail().rechercherFilm(nomFilm);
        ((FAccueil) this.getParent()).getPortail().afficherFilm(Films,tabLab1,indPrem);
        ((FAccueil) this.getParent()).getPortail().afficherTitre(Films,tabLab2,indPrem);
    }//GEN-LAST:event_bEntrerActionPerformed

    private void bGaucheActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGaucheActionPerformed
        // TODO add your handling code here:
        indPrem = indPrem-1;
        ArrayList<Film> Films = ((FAccueil) this.getParent()).getPortail().getFilms();
        ((FAccueil) this.getParent()).getPortail().afficherFilm(Films,tabLab1,indPrem);
        ((FAccueil) this.getParent()).getPortail().afficherTitre(Films,tabLab2,indPrem);
        if(indPrem==0){
            bGauche.setEnabled(false);
        }
    }//GEN-LAST:event_bGaucheActionPerformed

    private void bDroiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDroiteActionPerformed
        // TODO add your handling code here:
        indPrem = indPrem+1;
        ArrayList<Film> Films = ((FAccueil) this.getParent()).getPortail().getFilms();
        ((FAccueil) this.getParent()).getPortail().afficherFilm(Films,tabLab1,indPrem);
        ((FAccueil) this.getParent()).getPortail().afficherTitre(Films,tabLab2,indPrem);
        if(indPrem!=0){
            bGauche.setEnabled(true);
        }
        if(indPrem>=((FAccueil) this.getParent()).getPortail().getTailleListeFilms()-3){
            bDroite.setEnabled(false);
        }
    }//GEN-LAST:event_bDroiteActionPerformed

    private void tfRechNomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfRechNomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfRechNomActionPerformed

    private void bRetourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRetourActionPerformed
        // TODO add your handling code here:*
        this.setVisible(false); // rendre invisible la fiche bandit
        this.getParent().setVisible(true);
    }//GEN-LAST:event_bRetourActionPerformed

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
            java.util.logging.Logger.getLogger(FRechercherF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRechercherF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRechercherF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRechercherF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRechercherF dialog = new FRechercherF(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bDroite;
    private javax.swing.JButton bEntrer;
    private javax.swing.JButton bGauche;
    private javax.swing.JButton bRetour;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lRechNom;
    private javax.swing.JPanel pFilm;
    private javax.swing.JPanel pTitre;
    private javax.swing.JTextField tfRechNom;
    // End of variables declaration//GEN-END:variables
}