/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Excepciones.DataAccessException;
import SiPrIn.GestorNivelGrado;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandrux
 */
public class NivelGradoAgregar extends javax.swing.JFrame {
    public String id_usuario;
    ButtonGroup grupo1;
    
    /**
     * Creates new form NivelGrado
     */
    public NivelGradoAgregar() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        grupo1 = new ButtonGroup();
        grupo1.add(si);
        grupo1.add(no);
        this.setVisible(true);
    }

    
    public void agregar() throws DataAccessException {
            if (titulo.getText().isEmpty() || facultad.getText().isEmpty() || aprobacionTesis.getText().isEmpty() || provincia.getText().isEmpty() || ciudad.getText().isEmpty()
                    || grupo1.isSelected(null)) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                GestorNivelGrado gestor = new GestorNivelGrado();
                SiPrIn.NivelGrado nivel = new SiPrIn.NivelGrado();
                nivel.setTitulo(titulo.getText());
                String universidad=(String)univ.getSelectedItem();//UNIVERSIDAD
                nivel.setUniversidad(universidad);
                nivel.setFacultad(facultad.getText());
                nivel.setAprobacion_tesis(Integer.parseInt(aprobacionTesis.getText()));
                String pais=(String)paises.getSelectedItem();//PAIS
                nivel.setPais(pais);
                nivel.setProvincia(provincia.getText());
                nivel.setCiudad(ciudad.getText());
                String area=(String)conocimiento.getSelectedItem();//AREA DE CONOCIMIENTO
                nivel.setArea_conocimiento(area);                
                //coneau
                if (si.isSelected() == true) {
                    String tipo = "Si";
                    nivel.setConeau(tipo);
                    nivel.setObtencion(Integer.parseInt(anioObt.getText()));
                } else if (no.isSelected() == true) {
                    String tipo = "No";
                    nivel.setConeau(tipo);
                    nivel.setObtencion(0);
                }
                  
                gestor.agregar(nivel, id_usuario);
                JOptionPane.showMessageDialog(null, " Datos Nivel de Grado agregado con exito ");
                dispose();
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
        jLabel1 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        univ = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        facultad = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        aprobacionTesis = new javax.swing.JTextField();
        pais = new javax.swing.JLabel();
        paises = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        conocimiento = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        anioObt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Agregar Grado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel1.setText("Título");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, -1, -1));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 200, -1));

        jLabel3.setText("Universidad");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        univ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Universidad de Buenos Aires", "Universidad Nacional de Catamarca", "Universidad Nacional de Cordoba", "Universidad Nacional de Cuyo", "Universidad Nacional de Entre Rios", "Universidad Nacional de Formosa", "Universidad Nacional de La Pampa", "Universidad Nacional de La Plata", "Universidad Nacional de La Rioja", "Universidad Nacional de Misiones", "Universidad Nacional de Rio Negro", "Universidad Nacional de Rosario", "Universidad Nacional de Salta", "Universidad Nacional de San Juan", "Universidad Nacional de Tucuman" }));
        getContentPane().add(univ, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 200, -1));

        jLabel4.setText("Facultad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, -1, -1));
        getContentPane().add(facultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 200, -1));

        jLabel5.setText("Año de Aprobación de la Tesis");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));
        getContentPane().add(aprobacionTesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 80, -1));

        pais.setText("País");
        getContentPane().add(pais, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        paises.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alemania", "Argentina", "Bolivia", "Brasil", "Canada", "Chile", "China", "Colombia", "Ecuador", "España", "EEUU", "Francia", "Inglaterra", "Italia ", "Mexico", "Paraguay", "Peru", "Uruguay", "Venezuela" }));
        getContentPane().add(paises, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 330, 90, -1));

        jLabel7.setText("Provincia");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, -1, -1));
        getContentPane().add(provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 380, 200, -1));

        jLabel6.setText("Ciudad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 410, -1, -1));
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, 200, -1));

        jLabel8.setText("Área de Conocimiento");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, -1, -1));

        conocimiento.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alegebra", "Analisis Matematico", "Auditoria de Sistemas", "Estadisticas e Investigacion Operativa", "Fisica", "Gestion de Datos", "Ingenieria en Software", "Lenguajes Formales y Automatas", "Modelos y Simulacion", "Programacion", "Quimica", "Sistemas de Gestion", "Sistemas Operativos", "Teoria de Control" }));
        getContentPane().add(conocimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, 190, -1));

        jLabel9.setText("Acreditado por la CONEAU");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 210, -1, -1));

        si.setText("Si");
        getContentPane().add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 230, -1, -1));

        no.setText("No");
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));

        jLabel10.setText("Año de Obtencion");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, -1, -1));
        getContentPane().add(anioObt, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 80, -1));

        jLabel11.setText("aaaa");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 430, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        try {
            agregar();
        } catch (DataAccessException ex) {
            Logger.getLogger(NivelGradoAgregar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_guardarActionPerformed

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
            java.util.logging.Logger.getLogger(NivelGradoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NivelGradoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NivelGradoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NivelGradoAgregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NivelGradoAgregar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioObt;
    private javax.swing.JTextField aprobacionTesis;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JComboBox conocimiento;
    private javax.swing.JTextField facultad;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton no;
    private javax.swing.JLabel pais;
    private javax.swing.JComboBox paises;
    private javax.swing.JTextField provincia;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField titulo;
    private javax.swing.JComboBox univ;
    // End of variables declaration//GEN-END:variables
}
