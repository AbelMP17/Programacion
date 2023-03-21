/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectojpaventana;

import javax.persistence.*;

/**
 *
 * @author usuario
 */
public class frmAltaCorredor extends javax.swing.JFrame {

    private EntityManager em;
    
    /**
     * Creates new form frmAltaCorredor
     */
    public frmAltaCorredor() {
        initComponents();
        setLocationRelativeTo(null);
        habilitarAmateur();
        habilitarProfesional();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtNombreCorredor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtFechaNac = new javax.swing.JTextField();
        optCorredor = new javax.swing.JRadioButton();
        optCorredorAmateur = new javax.swing.JRadioButton();
        optCorredorProfesional = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        pnlAmateur = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        txtVelocidadMedia = new javax.swing.JTextField();
        txtAñosExperiencia = new javax.swing.JTextField();
        pnlProfesional = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        txtNumeroTrofeos = new javax.swing.JTextField();
        txtClub = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del corredor:");

        jLabel2.setText("fecha de nacimiento:");

        optCorredor.setText("Corredor");
        optCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCorredorActionPerformed(evt);
            }
        });

        optCorredorAmateur.setText("Corredor Amateur");
        optCorredorAmateur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCorredorAmateurActionPerformed(evt);
            }
        });

        optCorredorProfesional.setText("Corredor Profesional");
        optCorredorProfesional.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optCorredorProfesionalActionPerformed(evt);
            }
        });

        pnlAmateur.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Datos Amateur:");
        jLabel3.setOpaque(true);

        jLabel4.setText("Velocidad Media:");
        jLabel4.setOpaque(true);

        jLabel5.setText("Años Experiencia:");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout pnlAmateurLayout = new javax.swing.GroupLayout(pnlAmateur);
        pnlAmateur.setLayout(pnlAmateurLayout);
        pnlAmateurLayout.setHorizontalGroup(
            pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmateurLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAmateurLayout.createSequentialGroup()
                        .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVelocidadMedia)
                            .addComponent(txtAñosExperiencia, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                    .addComponent(jSeparator3))
                .addContainerGap())
        );
        pnlAmateurLayout.setVerticalGroup(
            pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAmateurLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtVelocidadMedia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAmateurLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAñosExperiencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlProfesional.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("Datos Profesional:");
        jLabel6.setOpaque(true);

        jLabel7.setText("Numero de trofeos:");
        jLabel7.setOpaque(true);

        jLabel8.setText("Club:");
        jLabel8.setOpaque(true);

        txtNumeroTrofeos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroTrofeosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlProfesionalLayout = new javax.swing.GroupLayout(pnlProfesional);
        pnlProfesional.setLayout(pnlProfesionalLayout);
        pnlProfesionalLayout.setHorizontalGroup(
            pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addGroup(pnlProfesionalLayout.createSequentialGroup()
                        .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumeroTrofeos)
                            .addComponent(txtClub, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlProfesionalLayout.setVerticalGroup(
            pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProfesionalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNumeroTrofeos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlProfesionalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtClub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAlta.setText("Dar de alta");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreCorredor)
                            .addComponent(txtFechaNac)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(optCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optCorredorAmateur, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(optCorredorProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAlta))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlAmateur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlProfesional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNombreCorredor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optCorredor)
                    .addComponent(optCorredorAmateur)
                    .addComponent(optCorredorProfesional)
                    .addComponent(btnAlta))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlAmateur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlProfesional, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroTrofeosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroTrofeosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroTrofeosActionPerformed

    private void optCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCorredorActionPerformed
        if(optCorredorAmateur.isSelected() || optCorredorProfesional.isSelected()){
            optCorredorAmateur.setSelected(false);
            optCorredorProfesional.setSelected(false);
        }
        if(pnlAmateur.isEnabled() && !pnlProfesional.isEnabled()){
            habilitarAmateur();
        }else if(!pnlAmateur.isEnabled() && pnlProfesional.isEnabled()){
            habilitarProfesional();
        }
    }//GEN-LAST:event_optCorredorActionPerformed

    private void optCorredorAmateurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCorredorAmateurActionPerformed
        if(optCorredor.isSelected() || optCorredorProfesional.isSelected()){
            optCorredor.setSelected(false);
            optCorredorProfesional.setSelected(false);
        }
        if(!pnlAmateur.isEnabled()){
            habilitarAmateur();
        }
        
        if(pnlProfesional.isEnabled()){
            habilitarAmateur();
        }
    }//GEN-LAST:event_optCorredorAmateurActionPerformed

    private void optCorredorProfesionalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optCorredorProfesionalActionPerformed
        if(optCorredorAmateur.isSelected() || optCorredor.isSelected()){
            optCorredorAmateur.setSelected(false);
            optCorredor.setSelected(false);
        }
        if(pnlAmateur.isEnabled()){
            habilitarAmateur();
        }
        
        if(!pnlProfesional.isEnabled()){
            habilitarProfesional();
        }
    }//GEN-LAST:event_optCorredorProfesionalActionPerformed
    
    private void habilitarAmateur(){
        if(pnlAmateur.isEnabled() && txtAñosExperiencia.isEnabled() && txtVelocidadMedia.isEnabled()){
            pnlAmateur.setEnabled(false);
            txtVelocidadMedia.setEnabled(false);
            txtAñosExperiencia.setEnabled(false);
        }else{
            pnlAmateur.setEnabled(true);
            txtVelocidadMedia.setEnabled(true);
            txtAñosExperiencia.setEnabled(true);
        }
    }
    
    private void habilitarProfesional(){
        if(pnlProfesional.isEnabled() && txtNumeroTrofeos.isEnabled() && txtClub.isEnabled()){
            pnlProfesional.setEnabled(false);
            txtNumeroTrofeos.setEnabled(false);
            txtClub.setEnabled(false);
        }else{
            pnlProfesional.setEnabled(true);
            txtNumeroTrofeos.setEnabled(true);
            txtClub.setEnabled(true);
        }
    }
    
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
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmAltaCorredor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmAltaCorredor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JRadioButton optCorredor;
    private javax.swing.JRadioButton optCorredorAmateur;
    private javax.swing.JRadioButton optCorredorProfesional;
    private javax.swing.JPanel pnlAmateur;
    private javax.swing.JPanel pnlProfesional;
    private javax.swing.JTextField txtAñosExperiencia;
    private javax.swing.JTextField txtClub;
    private javax.swing.JTextField txtFechaNac;
    private javax.swing.JTextField txtNombreCorredor;
    private javax.swing.JTextField txtNumeroTrofeos;
    private javax.swing.JTextField txtVelocidadMedia;
    // End of variables declaration//GEN-END:variables
}
