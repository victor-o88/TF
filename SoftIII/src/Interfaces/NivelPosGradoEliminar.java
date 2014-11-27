/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Excepciones.DataAccessException;
import SiPrIn.GestorNivelGrado;
import SiPrIn.GestorNivelPosgrado;
import SiPrIn.NivelGrado;
import SiPrIn.NivelPosgrado;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandrux
 */
public class NivelPosGradoEliminar extends javax.swing.JFrame {

    public String id_usuario;
    ButtonGroup grupo1;
    /**
     * Creates new form NivelGradoEliminar
     */
    public NivelPosGradoEliminar() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        grupo1 = new ButtonGroup();
        grupo1.add(si);
        grupo1.add(no);
        this.setVisible(true);
    }
    
    
        public void buscar() throws DataAccessException {

            if (num_reg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, " Error: Campo vacio ");
            } else {
                GestorNivelPosgrado gestor = new GestorNivelPosgrado();
                NivelPosgrado nivelbuscado = new NivelPosgrado();
                int registrobuscar = Integer.parseInt(num_reg.getText());
                nivelbuscado = gestor.buscar(registrobuscar, id_usuario);
                if(nivelbuscado == null){
                JOptionPane.showMessageDialog(null, "Error: NUMERO DE REGISTRO DE NIVEL DE POSGRADO INVALIDO");
                }else{
                nivelPg.setSelectedItem(nivelbuscado.getNivel_posgrado());
                titulo.setText(nivelbuscado.getTitulo());
                univ.setSelectedItem(nivelbuscado.getUniversidad());//UNIVERSIDAD
                facultad.setText(nivelbuscado.getFacultad());
                tesis.setText(Integer.toString(nivelbuscado.getAprobacion_tesis()));
                paises.setSelectedItem(nivelbuscado.getPais());//PAIS
                provincia.setText(nivelbuscado.getProvincia());
                ciudad.setText(nivelbuscado.getCiudad());
                conoc.setSelectedItem(nivelbuscado.getArea_conocimiento());//AREA
                //CONEAU
                if (nivelbuscado.getConeau().equals("Si")) {
                    si.setSelected(true);
                } else if (nivelbuscado.getConeau().equals("No")) {
                    no.setSelected(true);
                }
                obtencion.setText(Integer.toString(nivelbuscado.getObtencion()));
                }
            }
        }

        //ELIMINAR
        public void eliminar() throws DataAccessException {
            if (num_reg.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                GestorNivelPosgrado gestor = new GestorNivelPosgrado();
                gestor.eliminar(Integer.parseInt(num_reg.getText()), id_usuario);
                JOptionPane.showMessageDialog(null, "  Registro de Nivel Posgrado eliminado con exito  ");
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
        num_reg = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        buscar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        titulo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        univ = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        facultad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tesis = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        paises = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ciudad = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        conoc = new javax.swing.JComboBox();
        jLabel13 = new javax.swing.JLabel();
        si = new javax.swing.JRadioButton();
        no = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        obtencion = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        nivelPg = new javax.swing.JComboBox();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Eliminar PosGrado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        jLabel1.setText("Ingrese el Número de Registro que desea Eliminar:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, -1, -1));
        getContentPane().add(num_reg, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 50, -1));

        jLabel3.setText("Nivel Universitario de Posgrado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        buscar.setText("Buscar");
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        getContentPane().add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, -1, -1));

        jLabel4.setText("Título");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));
        getContentPane().add(titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 250, 200, -1));

        jLabel5.setText("Universidad");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        univ.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Universidad de Buenos Aires", "Universidad Nacional de Catamarca", "Universidad Nacional de Cordoba", "Universidad Nacional de Cuyo", "Universidad Nacional de Entre Rios", "Universidad Nacional de Formosa", "Universidad Nacional de La Pampa", "Universidad Nacional de La Plata", "Universidad Nacional de La Rioja", "Universidad Nacional de Misiones", "Universidad Nacional de Rio Negro", "Universidad Nacional de Rosario", "Universidad Nacional de Salta", "Universidad Nacional de San Juan", "Universidad Nacional de Tucuman" }));
        getContentPane().add(univ, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, -1));

        jLabel6.setText("Facultad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));
        getContentPane().add(facultad, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 200, -1));

        jLabel7.setText("Año Aprobación de Tesis");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));
        getContentPane().add(tesis, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 70, -1));

        jLabel8.setText("aaaa");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jLabel9.setText("País");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 220, -1, -1));

        paises.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alemania", "Argentina", "Bolivia", "Brasil", "Canada", "Chile", "China", "Colombia", "Ecuador", "España", "EEUU", "Francia", "Inglaterra", "Italia ", "Mexico", "Paraguay", "Peru", "Uruguay", "Venezuela" }));
        getContentPane().add(paises, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 240, 170, -1));

        jLabel10.setText("Provincia");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, -1, -1));
        getContentPane().add(provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, 170, -1));

        jLabel11.setText("Ciudad");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 320, -1, -1));
        getContentPane().add(ciudad, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 170, -1));

        jLabel12.setText("Área de Conocimiento");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, -1, -1));

        conoc.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alegebra", "Analisis Matematico", "Auditoria de Sistemas", "Estadisticas e Investigacion Operativa", "Fisica", "Gestion de Datos", "Ingenieria en Software", "Lenguajes Formales y Automatas", "Modelos y Simulacion", "Programacion", "Quimica", "Sistemas de Gestion", "Sistemas Operativos", "Teoria de Control" }));
        getContentPane().add(conoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 390, 170, -1));

        jLabel13.setText("Acreditado por la CONEAU");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, -1, -1));

        si.setText("Si");
        getContentPane().add(si, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, -1, -1));

        no.setText("No");
        getContentPane().add(no, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, -1, -1));

        jLabel14.setText("Año de Obtención");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, -1, -1));
        getContentPane().add(obtencion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 450, 70, -1));

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, -1, -1));

        jLabel15.setText("aaaa");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, -1, -1));

        nivelPg.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Doctorado", "Maestria", "Especializacion" }));
        getContentPane().add(nivelPg, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 120, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_1.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        try {
            buscar();
        } catch (DataAccessException ex) {
            Logger.getLogger(NivelPosGradoEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_buscarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            eliminar();
        } catch (DataAccessException ex) {
            Logger.getLogger(NivelPosGradoEliminar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(NivelPosGradoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NivelPosGradoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NivelPosGradoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NivelPosGradoEliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NivelPosGradoEliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JTextField ciudad;
    private javax.swing.JComboBox conoc;
    private javax.swing.JTextField facultad;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JComboBox nivelPg;
    private javax.swing.JRadioButton no;
    private javax.swing.JTextField num_reg;
    private javax.swing.JTextField obtencion;
    private javax.swing.JComboBox paises;
    private javax.swing.JTextField provincia;
    private javax.swing.JRadioButton si;
    private javax.swing.JTextField tesis;
    private javax.swing.JTextField titulo;
    private javax.swing.JComboBox univ;
    // End of variables declaration//GEN-END:variables
}