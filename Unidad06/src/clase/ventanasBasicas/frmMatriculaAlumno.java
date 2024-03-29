/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package clase.ventanasBasicas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class frmMatriculaAlumno extends javax.swing.JFrame {
    /**
     * Creates new form frmMatriculaAlumno
     */
    private JCheckBox[] lista1;
    private JCheckBox[] lista2;
    public frmMatriculaAlumno() {
        initComponents();
        lista2 = new JCheckBox[]{
            chkDAW, chkDES, chkDEC, chkIAEE,
            chkHLC, chkDIW
        };
        lista1 = new JCheckBox[]{
            chkProgramacion, chkSI, chkLM,
            chkBD, chkED, chkFOL
        };
        
        activarCasillas(lista1, false);
        activarCasillas(lista2, false);
    }
    
    
    private void activarCasillas(JCheckBox[] casillas, boolean activar){
        for(JCheckBox i : casillas){
            i.setEnabled(activar);
        }
    }
    private void marcarCasillas(JCheckBox[] casillas, boolean activar){
        for(JCheckBox i : casillas){
            i.setSelected(activar);
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

        grpSeleccionarCurso = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        chkProgramacion = new javax.swing.JCheckBox();
        chkSI = new javax.swing.JCheckBox();
        chkLM = new javax.swing.JCheckBox();
        chkFOL = new javax.swing.JCheckBox();
        chkED = new javax.swing.JCheckBox();
        chkBD = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        chkDES = new javax.swing.JCheckBox();
        chkDEC = new javax.swing.JCheckBox();
        chkDIW = new javax.swing.JCheckBox();
        chkHLC = new javax.swing.JCheckBox();
        chkDAW = new javax.swing.JCheckBox();
        chkIAEE = new javax.swing.JCheckBox();
        optPrimero = new javax.swing.JRadioButton();
        optSegundo = new javax.swing.JRadioButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chkProgramacion.setText("Programación");

        chkSI.setText("Sistemas Informáticos");

        chkLM.setText("Lenguaje de Marcas");
        chkLM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkLMActionPerformed(evt);
            }
        });

        chkFOL.setText("FOL");
        chkFOL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkFOLActionPerformed(evt);
            }
        });

        chkED.setText("Entornos de Desarrollo");
        chkED.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkEDActionPerformed(evt);
            }
        });

        chkBD.setText("Base de Datos");
        chkBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkProgramacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkLM, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(chkFOL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(chkSI, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(chkED, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                    .addComponent(chkBD, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkProgramacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkSI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkLM)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkFOL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkED)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkBD)
                .addContainerGap(218, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        chkDES.setText("Desarrollo en entorno servidor");

        chkDEC.setText("Desarrollo en entorno cliente");

        chkDIW.setText("Diseño de interfaces web");

        chkHLC.setText("Hora de libre configuracion");

        chkDAW.setText("Despliegue de aplicaciones web");

        chkIAEE.setText("Empresas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chkDIW, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkDES, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkDEC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkHLC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chkDAW, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                    .addComponent(chkIAEE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chkDES)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDEC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDIW)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkHLC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkIAEE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chkDAW)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        grpSeleccionarCurso.add(optPrimero);
        optPrimero.setText("1º DAW");
        optPrimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optPrimeroActionPerformed(evt);
            }
        });

        grpSeleccionarCurso.add(optSegundo);
        optSegundo.setText("2º DAW");
        optSegundo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optSegundoActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optPrimero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(optSegundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(optSegundo)
                    .addComponent(optPrimero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAceptar))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chkLMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkLMActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkLMActionPerformed

    private void chkFOLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkFOLActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkFOLActionPerformed

    private void chkEDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkEDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkEDActionPerformed

    private void chkBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkBDActionPerformed

    private void optPrimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optPrimeroActionPerformed
        activarCasillas(lista1, true);
        activarCasillas(lista2, false);
        marcarCasillas(lista1, true);
        marcarCasillas(lista2, false);
    }//GEN-LAST:event_optPrimeroActionPerformed

    private void optSegundoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optSegundoActionPerformed
        activarCasillas(lista1, false);
        activarCasillas(lista2, true);
        marcarCasillas(lista2, true);
        marcarCasillas(lista1, false);
    }//GEN-LAST:event_optSegundoActionPerformed
    private void generarMatricula(JCheckBox[] casillas){
        try {
            PrintWriter p = new PrintWriter("/home/usuario/Documentos/matricula.txt");
            p.println("ASIGNATURAS DE TU MATRÍCULA");
            
            for(JCheckBox i : casillas){
                if(i.isSelected()){
                    p.println(i.getText());
                }
            }
            
            p.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Se ha producido este error: "+e.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        
        if(optPrimero.isSelected()){
            generarMatricula(lista1);
        }else if(optSegundo.isSelected()){
            generarMatricula(lista2);
        }

    }//GEN-LAST:event_btnAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(frmMatriculaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMatriculaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMatriculaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMatriculaAlumno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMatriculaAlumno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JCheckBox chkBD;
    private javax.swing.JCheckBox chkDAW;
    private javax.swing.JCheckBox chkDEC;
    private javax.swing.JCheckBox chkDES;
    private javax.swing.JCheckBox chkDIW;
    private javax.swing.JCheckBox chkED;
    private javax.swing.JCheckBox chkFOL;
    private javax.swing.JCheckBox chkHLC;
    private javax.swing.JCheckBox chkIAEE;
    private javax.swing.JCheckBox chkLM;
    private javax.swing.JCheckBox chkProgramacion;
    private javax.swing.JCheckBox chkSI;
    private javax.swing.ButtonGroup grpSeleccionarCurso;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton optPrimero;
    private javax.swing.JRadioButton optSegundo;
    // End of variables declaration//GEN-END:variables
}
