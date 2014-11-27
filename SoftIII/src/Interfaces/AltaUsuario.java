/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Excepciones.DataAccessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import SiPrIn.GestorUsuario;
import SiPrIn.Usuario;

/**
 *
 * @author Alejandrux
 */
public class AltaUsuario extends javax.swing.JFrame {

    ButtonGroup grupo1, grupo2;
    /**
     * Creates new form AltaUsuario
     */
    public AltaUsuario() throws DataAccessException {
        initComponents();

        nomUser.setText(idUsuarioGenerador());
        nomUser.disable();

        grupo1 = new ButtonGroup();
        grupo1.add(docente);
        grupo1.add(alumno);
        
        grupo2 = new ButtonGroup();
        grupo2.add(masc);
        grupo2.add(fem);
        
        setVisible(true);
    }
    
    
    public String idUsuarioGenerador() throws DataAccessException {
        GestorUsuario gestor = new GestorUsuario();
        int max = gestor.id_usuario() + 1;
        String maximo = Integer.toString(max);
        String id_usu = "siprinuser" + maximo + "";
        return id_usu;
    }

    public void VerificarDni() {
            if (dni.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio, ingrese DNI");
            } else {
                if (docente.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "Es docente activo");
                } else if (alumno.isSelected() == true) {
                    JOptionPane.showMessageDialog(null, "Es alumno activo");
                }
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

        jLabel2 = new javax.swing.JLabel();
        docente = new javax.swing.JRadioButton();
        alumno = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        dni = new javax.swing.JTextField();
        verificar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nomUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        repass = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        masc = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        fecNac = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        aceptar = new javax.swing.JLabel();
        cancelar = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Tipo de Usuario");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        docente.setText("Docente");
        getContentPane().add(docente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, -1, -1));

        alumno.setText("Alumno");
        getContentPane().add(alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Ingrese DNI");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));
        getContentPane().add(dni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 120, -1));

        verificar.setText("Verificar");
        verificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verificarActionPerformed(evt);
            }
        });
        getContentPane().add(verificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Registro de Usuario");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, -1, -1));

        jLabel5.setText("Nombre de Usuario");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));
        getContentPane().add(nomUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 150, -1));

        jLabel6.setText("Contraseña (*)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));
        getContentPane().add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, -1));

        jLabel7.setText("Confirmar Contraseña (*)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 280, -1, -1));
        getContentPane().add(repass, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 150, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Datos Personales");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 120, -1));

        jLabel9.setText("Nombre (*)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 150, -1));

        jLabel10.setText("Apellido (*)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, -1, -1));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 150, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Sexo (*)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        masc.setText("Masculino");
        getContentPane().add(masc, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        fem.setText("Femenino");
        getContentPane().add(fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, -1, -1));

        jLabel12.setText("Fecha de Nacimiento (*)");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));
        getContentPane().add(fecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 150, -1));

        jLabel13.setText("Año-Mes-Día  (ej: 1987-07-28)");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 320, -1, -1));

        jLabel14.setText("E-mail (*)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 370, 150, -1));

        jLabel15.setText("Datos Obligatorios (*)");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, -1, -1));

        aceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Aceptar.jpg"))); // NOI18N
        aceptar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aceptarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aceptarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aceptarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                aceptarMousePressed(evt);
            }
        });
        getContentPane().add(aceptar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 440, -1, 20));

        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cancelar.jpg"))); // NOI18N
        cancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cancelarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cancelarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cancelarMousePressed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 440, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verificarActionPerformed
        VerificarDni();
    }//GEN-LAST:event_verificarActionPerformed

    private void aceptarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Recursos/Aceptar2.jpg"));
        aceptar.setIcon(II);
    }//GEN-LAST:event_aceptarMouseEntered

    private void aceptarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Recursos/Aceptar.jpg"));
        aceptar.setIcon(II);
    }//GEN-LAST:event_aceptarMouseExited

    private void aceptarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Recursos/Aceptar2.jpg"));
        aceptar.setIcon(II);
    }//GEN-LAST:event_aceptarMousePressed

    private void aceptarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aceptarMouseClicked
        try {
            agregarUsuario();
        } catch (DataAccessException ex) {
            DataAccessException dataAccessException = new DataAccessException("Error en AgregarUsuario() " + ex);
        }
        //dispose();
    }//GEN-LAST:event_aceptarMouseClicked

    private void cancelarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Recursos/Cancelar.jpg"));
        cancelar.setIcon(II);
    }//GEN-LAST:event_cancelarMouseEntered

    private void cancelarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Recursos/Cancelar.jpg"));
        cancelar.setIcon(II);
    }//GEN-LAST:event_cancelarMouseExited

    private void cancelarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Recursos/Cancelar2.jpg"));
        cancelar.setIcon(II);
    }//GEN-LAST:event_cancelarMousePressed

    private void cancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelarMouseClicked
        dispose();
    }//GEN-LAST:event_cancelarMouseClicked

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
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AltaUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AltaUsuario().setVisible(true);
                } catch (DataAccessException ex) {
                    Logger.getLogger(AltaUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aceptar;
    private javax.swing.JRadioButton alumno;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel cancelar;
    private javax.swing.JTextField dni;
    private javax.swing.JRadioButton docente;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fecNac;
    private javax.swing.JRadioButton fem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton masc;
    private javax.swing.JTextField nomUser;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField pass;
    private javax.swing.JTextField repass;
    private javax.swing.JToggleButton verificar;
    // End of variables declaration//GEN-END:variables
    
    
    
    
    public void agregarUsuario() throws DataAccessException{
            if (dni.getText().isEmpty() || nombre.getText().isEmpty() || apellido.getText().isEmpty() || fecNac.getText().isEmpty() || pass.getText().isEmpty()
                    || repass.getText().isEmpty() || email.getText().isEmpty() || grupo1.isSelected(null) || grupo2.isSelected(null)) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                GestorUsuario gestor = new GestorUsuario();
                Usuario usuario = new Usuario();
                if (pass.getText().equals(repass.getText())) {
                    usuario.setId_usuario(nomUser.getText());
                    usuario.setCont(pass.getText());
                    usuario.setConfirmar_cont(repass.getText());
                    usuario.setNombre(nombre.getText());
                    usuario.setApellido(apellido.getText());
                    java.sql.Date sqlDate = gestor.fechaString(fecNac.getText());
                    usuario.setFec_nac(sqlDate);
                    usuario.setEmail(email.getText());
                    usuario.setDni(Integer.parseInt(dni.getText()));
                    if (docente.isSelected() == true) {
                        String tipo = "Docente";
                        usuario.setTipo(tipo);
                    } else if (alumno.isSelected() == true) {
                        String tipo = "Alumno";
                        usuario.setTipo(tipo);
                    }
                    if (masc.isSelected() == true) {
                        String sexo = "Masculino";
                        usuario.setSexo(sexo);
                    } else if (fem.isSelected() == true) {
                        String sexo = "Femenino";
                        usuario.setSexo(sexo);
                    }
                    gestor.agregarUsuario(usuario);
                    JOptionPane.showMessageDialog(null, "Usuario agregado con exito");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Contraseña y Confirmar Contraseñas erroneas");
                }
        
    }
    }
}