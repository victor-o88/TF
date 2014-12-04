/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Excepciones.DataAccessException;
import SiPrIn.GestorUsuario;
import SiPrIn.Usuario;
import java.awt.event.ItemListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author Alejandrux
 */
public class CurriculumDatosPers extends javax.swing.JFrame {
    ButtonGroup grupo;
    private String id_usuario;
    /**
     * Creates new form Curriculum
     */
    public CurriculumDatosPers(){
        
    }
    public CurriculumDatosPers(String id) {
        id_usuario = id;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        setTitle("Curriculum Vitae");
        grupo = new ButtonGroup();
        grupo.add(masc);
        grupo.add(fem);
        
    }

    
    public void importar() throws DataAccessException {
            Long numT, numC;
            GestorUsuario gestor = new GestorUsuario();
            Usuario usuario = gestor.mostrar(id_usuario);
            nombre.setText(usuario.getNombre());
            apellido.setText(usuario.getApellido());
            fecNac.setText(gestor.fechaDate(usuario.getFec_nac()));
            email.setText(usuario.getEmail());
            
            
            cuil.setText(usuario.getCuil());
            paises.setSelectedItem(usuario.getPais());  
            provincia.setText(usuario.getProvincia());
            depart.setText(usuario.getDepartamento());
            calle.setText(usuario.getCalle());
            numCasa.setText(Integer.toString(usuario.getNum()));
            pisoDto.setText(usuario.getPiso());
            cp.setText(Integer.toString(usuario.getCodigo_postal()));
            numT=usuario.getTelefono();
            String t = numT.toString();
            String primeroTel = t.substring(0, 3);
            String segundoTel = t.substring(3, 9);
            areaTel.setText(primeroTel);
            numTel.setText(segundoTel);
            numC=usuario.getCelular();
            String c = numC.toString();
            String primeroCel = c.substring(0, 3);
            String segundoCel = c.substring(3, 9);
            areaCel.setText(primeroCel);
            numCel.setText(segundoCel);
            categoria.setSelectedItem(usuario.getId_categoria());  
            
            
            
            
            if (usuario.getSexo().equals("Masculino")) {
                masc.setSelected(true);
            } else if (usuario.getSexo().equals("Femenino")) {
                fem.setSelected(true);
            }
        }

    
            public void agregar() throws DataAccessException {

            if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || cuil.getText().isEmpty() || fecNac.getText().isEmpty() || grupo.isSelected(null) || provincia.getText().isEmpty()
                    || depart.getText().isEmpty() || calle.getText().isEmpty() || numCasa.getText().isEmpty() || cp.getText().isEmpty() || areaTel.getText().isEmpty() || numTel.getText().isEmpty() || email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                Usuario usuario = new Usuario();
                GestorUsuario gestor = new GestorUsuario();
                usuario.setNombre(nombre.getText());
                usuario.setApellido(apellido.getText());
                usuario.setCuil(cuil.getText());
                if (masc.isSelected() == true) {
                    String sexo = "Masculino";
                    usuario.setSexo(sexo);
                } else if (fem.isSelected() == true) {
                    String sexo = "Femenino";
                    usuario.setSexo(sexo);
                }
                java.sql.Date sqlDate = gestor.fechaString(fecNac.getText());
                usuario.setFec_nac(sqlDate);
                String pais = (String) paises.getSelectedItem();//PAIS
                usuario.setPais(pais);
                usuario.setProvincia(provincia.getText());
                usuario.setDepartamento(depart.getText());
                usuario.setCalle(calle.getText());
                usuario.setNum(Integer.parseInt(numCasa.getText()));
                usuario.setPiso(pisoDto.getText());
                usuario.setCodigo_postal(Integer.parseInt(cp.getText()));
                String telefono = areaTel.getText().concat(numTel.getText());
                usuario.setTelefono(Long.parseLong(telefono));
                String celular = areaCel.getText().concat(numCel.getText());
                usuario.setCelular(Long.parseLong(celular));
                usuario.setEmail(email.getText());
                String cat = (String) categoria.getSelectedItem();//CATEGORIA
                usuario.setId_categoria(cat);
                gestor.agregarUsuarioDatosPersonales(usuario, id_usuario);
                JOptionPane.showMessageDialog(null, "  Datos registrados con exito  ");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        apellido = new javax.swing.JTextField();
        cuil = new javax.swing.JTextField();
        fecNac = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        provincia = new javax.swing.JTextField();
        paises = new javax.swing.JComboBox();
        masc = new javax.swing.JRadioButton();
        fem = new javax.swing.JRadioButton();
        depart = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        calle = new javax.swing.JTextField();
        importarDatos = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        numCasa = new javax.swing.JTextField();
        pisoDto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cp = new javax.swing.JTextField();
        areaTel = new javax.swing.JTextField();
        numTel = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        areaCel = new javax.swing.JTextField();
        numCel = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        categoria = new javax.swing.JComboBox();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nombre (*)");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        jLabel3.setText("Apellido (*)");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel4.setText("CUIL (*)");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel5.setText("Fecha de Nacimiento (*)");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        jLabel6.setText("Pais(*)");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, -1, -1));

        jLabel7.setText("Provincia (*)");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, -1, -1));
        getContentPane().add(nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 150, -1));
        getContentPane().add(apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 150, -1));
        getContentPane().add(cuil, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 150, -1));
        getContentPane().add(fecNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 150, -1));

        jLabel8.setText("Sexo (*)");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));
        getContentPane().add(provincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 150, -1));

        paises.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Alemania", "Argentina", "Bolivia", "Brasil", "Colombia", "Chile", "EEUU", "Italia", "Israel", "México", "Paraguay", "Perú", "Uruguay", " " }));
        paises.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                paisesItemStateChanged(evt);
            }
        });
        paises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paisesActionPerformed(evt);
            }
        });
        getContentPane().add(paises, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 150, -1));

        masc.setText("Masculino");
        getContentPane().add(masc, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, -1, -1));

        fem.setText("Femenino");
        getContentPane().add(fem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));
        getContentPane().add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 150, -1));

        jLabel9.setText("Departamento (*)");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 250, -1, -1));

        jLabel10.setText("Calle (*)");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 300, -1, -1));
        getContentPane().add(calle, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, 150, -1));

        importarDatos.setText("Importar Datos");
        importarDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                importarDatosActionPerformed(evt);
            }
        });
        getContentPane().add(importarDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 430, -1, -1));

        jLabel11.setText("Numero (*)");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 350, -1, -1));

        jLabel12.setText("Piso/Dpto");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 350, -1, -1));
        getContentPane().add(numCasa, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 370, 40, -1));
        getContentPane().add(pisoDto, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 370, 40, -1));

        jLabel13.setText("CP");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 350, -1, -1));

        jLabel14.setText("Teléfono (*)");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 150, -1, -1));
        getContentPane().add(cp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 370, 50, -1));
        getContentPane().add(areaTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 40, -1));
        getContentPane().add(numTel, new org.netbeans.lib.awtextra.AbsoluteConstraints(566, 170, 120, -1));

        jLabel15.setText("Cod Area");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 190, -1, -1));

        jLabel16.setText("Número");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, -1, -1));

        jLabel17.setText("Celular");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));
        getContentPane().add(areaCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 230, 40, -1));
        getContentPane().add(numCel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 230, 120, -1));

        jLabel18.setText("Cod Area");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 250, -1, -1));

        jLabel19.setText("Número");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 250, -1, -1));

        jLabel20.setText("Email (*)");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 280, -1, -1));
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 300, 170, -1));

        jLabel21.setText("Categoría en el Programa de Incentivos (*)");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, -1, 10));

        categoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoría I", "Categoría II", "Categoría III", "Categoría IV", "Categoría V" }));
        getContentPane().add(categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 170, -1));

        guardar.setText("Guardar");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, -1));

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 430, -1, -1));

        jLabel22.setText("Datos Obligatorios (*)");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Datos Personales");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 490));

        jMenu1.setText("Curriculum");

        jMenuItem1.setText("Datos Personales");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Formación Académica");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void importarDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_importarDatosActionPerformed
        try {
            importar();
        } catch (DataAccessException ex) {
            Logger.getLogger(CurriculumDatosPers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_importarDatosActionPerformed

    private void paisesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_paisesItemStateChanged
        //paises.addItem("Alemania");
        //paises.addItemListener((ItemListener) this);
    }//GEN-LAST:event_paisesItemStateChanged

    private void paisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paisesActionPerformed
        
        
    }//GEN-LAST:event_paisesActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        dispose();
        
//        MenuDocente md = new MenuDocente();
//        md.setVisible(true);
    }//GEN-LAST:event_cancelarActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        
        try {
            agregar();
        } catch (DataAccessException ex) {
            Logger.getLogger(CurriculumDatosPers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        CurriculumFormAcad fa = new CurriculumFormAcad(id_usuario);
        fa.setVisible(true);
        dispose();

    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(CurriculumDatosPers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurriculumDatosPers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurriculumDatosPers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurriculumDatosPers.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurriculumDatosPers().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido;
    private javax.swing.JTextField areaCel;
    private javax.swing.JTextField areaTel;
    private javax.swing.JTextField calle;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox categoria;
    private javax.swing.JTextField cp;
    private javax.swing.JTextField cuil;
    private javax.swing.JTextField depart;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fecNac;
    private javax.swing.JRadioButton fem;
    private javax.swing.JButton guardar;
    private javax.swing.JButton importarDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButton masc;
    private javax.swing.JTextField nombre;
    private javax.swing.JTextField numCasa;
    private javax.swing.JTextField numCel;
    private javax.swing.JTextField numTel;
    private javax.swing.JComboBox paises;
    private javax.swing.JTextField pisoDto;
    private javax.swing.JTextField provincia;
    // End of variables declaration//GEN-END:variables
}
