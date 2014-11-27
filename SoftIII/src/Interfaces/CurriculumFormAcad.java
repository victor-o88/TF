/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import BaseDeDatos.BaseDatos;
import BaseDeDatos.CursoPosgradoDAO;
import BaseDeDatos.NivelGradoDAO;
import BaseDeDatos.NivelPosgradoDAO;
import Excepciones.DataAccessException;
import Excepciones.Warning1;
import SiPrIn.CursoPosgrado;
import SiPrIn.GestorCursoPosgrado;
import SiPrIn.GestorNivelGrado;
import SiPrIn.GestorNivelPosgrado;
import SiPrIn.GestorUsuario;
import SiPrIn.NivelGrado;
import SiPrIn.NivelPosgrado;
import SiPrIn.Usuario;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alejandrux
 */
public class CurriculumFormAcad extends javax.swing.JFrame {
    private String id_usuario;

    /**
     * Creates new form CurriculumFormAcad
     */
    public CurriculumFormAcad() {
     
    }

    DefaultTableModel modelo1 = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    DefaultTableModel modelo3 = new DefaultTableModel();
    public CurriculumFormAcad(String id){
        id_usuario = id;
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        setTitle("Curriculum Vitae");
    }
    public void mostrarDatos() throws DataAccessException{
            //TABLA NIVEL GRADO
            GestorNivelGrado gestor = new GestorNivelGrado();
            
            String [] columnas ={"Numero", "Titulo", "Universidad", "Facultad", "Año Aprob Tesis", "Pais", "Provincia", "Ciudad", "Area Conocimiento", "Acreditacion CONEAU", "Año Obten"};
            modelo1.setColumnIdentifiers(columnas);
            
            Collection coleccion = gestor.mostrar(id_usuario);
            
            ArrayList registrobuscados = (ArrayList) coleccion;
            Iterator<NivelGrado> it = registrobuscados.iterator();
            while (it.hasNext()) {
                NivelGrado nivel = it.next();

                String num_nivelgrado = Integer.toString(nivel.getNum_nivelgrado());
                String titulo = nivel.getTitulo();
                String universidad = nivel.getUniversidad();
                String facultad = nivel.getFacultad();
                String aprobacion_tesis = Integer.toString(nivel.getAprobacion_tesis());
                String pais = nivel.getPais();
                String provincia = nivel.getProvincia();
                String ciudad = nivel.getCiudad();
                String area_conocimiento = nivel.getArea_conocimiento();
                String coneau = nivel.getConeau();
                String obtencion = Integer.toString(nivel.getObtencion());
                //AQUI MANDO LA PELICULA AL JTABLE
                Object[] nuevoNivel = {num_nivelgrado, titulo, universidad, facultad, aprobacion_tesis, pais, provincia, ciudad, area_conocimiento, coneau, obtencion};
                modelo1.addRow(nuevoNivel);
                this.jTable1.setModel(modelo1);
            }
            //TABLA NIVEL POSGRADO
            GestorNivelPosgrado gestor2 = new GestorNivelPosgrado();
            
            String [] columnas2 ={"Numero", "Nivel de Posgrado", "Titulo", "Universidad", "Facultad", "Año Aprob Tesis", "Pais", "Provincia", "Ciudad", "Area Conocimiento", "Acreditacion CONEAU", "Año Obten"};
            modelo2.setColumnIdentifiers(columnas2);
            
            Collection coleccion2 = gestor2.mostrar(id_usuario);
            
            ArrayList registrobuscados2 = (ArrayList) coleccion2;
            Iterator<NivelPosgrado> it2 = registrobuscados2.iterator();
            while (it2.hasNext()) {
                NivelPosgrado posgrado = it2.next();
                
                String num_nivelposgrado = Integer.toString(posgrado.getNum_nivelposgrado());
                String nivel_posgrado = posgrado.getNivel_posgrado();
                String titulo = posgrado.getTitulo();
                String universidad = posgrado.getUniversidad();
                String facultad = posgrado.getFacultad();
                String aprobacion_tesis = Integer.toString(posgrado.getAprobacion_tesis());
                String pais = posgrado.getPais();
                String provincia = posgrado.getProvincia();
                String ciudad = posgrado.getCiudad();
                String area_conocimiento = posgrado.getArea_conocimiento();
                String coneau = posgrado.getConeau();
                String obtencion = Integer.toString(posgrado.getObtencion());
                //AQUI MANDO LA PELICULA AL JTABLE
                Object[] nuevoNivelPosgrado = {num_nivelposgrado, nivel_posgrado, titulo, universidad, facultad, aprobacion_tesis, pais, provincia, ciudad, area_conocimiento, coneau, obtencion};
                modelo2.addRow(nuevoNivelPosgrado);
                this.jTable2.setModel(modelo2);
            }
            //TABLA CURSO POSGRADO
            GestorCursoPosgrado gestor3 = new GestorCursoPosgrado();
            
            String [] columnas3 ={"Numero", "Curso", "Universidad", "Facultad", "Año", "Carga Horaria", "Pais", "Provincia", "Ciudad", "Area Conocimiento", "Acreditacion CONEAU", "Año"};
            modelo3.setColumnIdentifiers(columnas3);
            
            Collection coleccion3 = gestor3.mostrar(id_usuario);
            ArrayList registrobuscados3 = (ArrayList) coleccion3;
            Iterator<CursoPosgrado> it3 = registrobuscados3.iterator();
            while (it3.hasNext()) {
                CursoPosgrado cursop = it3.next();

                String num_curso = Integer.toString(cursop.getNum_curso());
                String curso = cursop.getCurso();
                String universidad = cursop.getUniversidad();
                String facultad = cursop.getFacultad();
                String anio = Integer.toString(cursop.getAnio());
                String carga_horaria = Integer.toString(cursop.getCarga_horaria());
                String pais = cursop.getPais();
                String provincia = cursop.getProvincia();
                String ciudad = cursop.getCiudad();
                String area_conocimiento = cursop.getArea_conocimiento();
                String coneau = cursop.getConeau();
                String obtencion = Integer.toString(cursop.getObtencion());

                Object[] nuevoCursoPosgrado = {num_curso, curso, universidad, facultad, anio, carga_horaria, pais, provincia, ciudad, area_conocimiento, coneau, obtencion};
                modelo3.addRow(nuevoCursoPosgrado);
                this.jTable3.setModel(modelo3);
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        agregar1 = new javax.swing.JButton();
        modificar1 = new javax.swing.JButton();
        borrar1 = new javax.swing.JButton();
        agregar2 = new javax.swing.JButton();
        modificar2 = new javax.swing.JButton();
        borrar2 = new javax.swing.JButton();
        agregar3 = new javax.swing.JButton();
        modificar3 = new javax.swing.JButton();
        borrar3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número de Registro", "Nivel de Posgrado", "Título", "Universidad", "Facultad", "Año Aprobación Tesis", "País", "Provincia", "Ciudad", "Área de Conocimiento", "Acreditación en CONEAU", "Año de obtención en CONEAU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 560, 70));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Numero de Registro", "Titulo", "Universidad", "Facultad", "Anio Aprobacion Tesis", "Pais", "Provincia", "Ciudad", "Area de Conocimiento", "Acreditacion en CONEAU", "Anio de obtencion den CONEAU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 560, 70));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Número de Registro", "Curso", "Universidad", "Facultad", "Año", "Carga Horaria", "País", "Provincia", "Ciudad", "Área de Conocimiento", "Acreditación en CONEAU", "Año de obtención en CONEAU"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 560, 70));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Formación Académica");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, -1, -1));

        jLabel2.setText("Nivel Universitario de Grado");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, -1, -1));

        jLabel3.setText("Nivel Universitario de Posgrado");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        jLabel4.setText("Cursos Aprobados de Posgrado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        agregar1.setText("Agregar");
        agregar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar1ActionPerformed(evt);
            }
        });
        getContentPane().add(agregar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, 80, -1));

        modificar1.setText("Modificar");
        modificar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar1ActionPerformed(evt);
            }
        });
        getContentPane().add(modificar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 190, 80, -1));

        borrar1.setText("Borrar");
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(borrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 80, -1));

        agregar2.setText("Agregar");
        agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar2ActionPerformed(evt);
            }
        });
        getContentPane().add(agregar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 270, 80, -1));

        modificar2.setText("Modificar");
        modificar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar2ActionPerformed(evt);
            }
        });
        getContentPane().add(modificar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 80, -1));

        borrar2.setText("Borrar");
        borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar2ActionPerformed(evt);
            }
        });
        getContentPane().add(borrar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 80, -1));

        agregar3.setText("Agregar");
        agregar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar3ActionPerformed(evt);
            }
        });
        getContentPane().add(agregar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 80, -1));

        modificar3.setText("Modificar");
        modificar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar3ActionPerformed(evt);
            }
        });
        getContentPane().add(modificar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 410, 80, -1));

        borrar3.setText("Borrar");
        borrar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar3ActionPerformed(evt);
            }
        });
        getContentPane().add(borrar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 440, 80, -1));

        jButton1.setText("Mostrar Datos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 110, 20));

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 70, 20));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Fondo_1.jpg"))); // NOI18N
        fondo.setMaximumSize(new java.awt.Dimension(800, 600));
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Curriculum");

        jMenuItem1.setText("Datos Personales");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Formación Académica");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar1ActionPerformed
            NivelGradoAgregar v = new NivelGradoAgregar();
            v.id_usuario = id_usuario;
               

    }//GEN-LAST:event_agregar1ActionPerformed

    private void modificar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar1ActionPerformed
                NivelGradoModificar v = new NivelGradoModificar();
                v.id_usuario = id_usuario;
        
//                VentanaNivelGradoModificar v = new VentanaNivelGradoModificar();
//                v.id_usuario = id_usuario;
//                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO Y LUEGO MODIFIQUE DATOS");
    }//GEN-LAST:event_modificar1ActionPerformed

    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
                NivelGradoEliminar v = new NivelGradoEliminar();
                v.id_usuario = id_usuario;
        
//                VentanaNivelGradoEliminar v = new VentanaNivelGradoEliminar();
//                v.id_usuario = id_usuario;
//                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO QUE DESEA ELIMINAR, VERIFIQUE SI ES TAL Y LUEGO ELIMINE");
    }//GEN-LAST:event_borrar1ActionPerformed

    private void agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar2ActionPerformed
                NivelPosGradoAgregar v = new NivelPosGradoAgregar();
                v.id_usuario = id_usuario;        
              
//                VentanaNivelPosgrado v = new VentanaNivelPosgrado();
//                v.id_usuario = id_usuario;
    }//GEN-LAST:event_agregar2ActionPerformed

    private void modificar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar2ActionPerformed
                NivelPosGradoModificar v = new NivelPosGradoModificar();
                v.id_usuario = id_usuario;
        
//                VentanaNivelPosgradoModificar v = new VentanaNivelPosgradoModificar();
//                v.id_usuario = id_usuario;
//                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO Y LUEGO MODIFIQUE DATOS");
    }//GEN-LAST:event_modificar2ActionPerformed

    private void borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar2ActionPerformed
                NivelPosGradoEliminar v = new NivelPosGradoEliminar();
                v.id_usuario = id_usuario;
        
//                VentanaNivelPosgradoEliminar v = new VentanaNivelPosgradoEliminar();
//                v.id_usuario = id_usuario;
//                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO QUE DESEA ELIMINAR, VERIFIQUE SI ES TAL Y LUEGO ELIMINE");
    }//GEN-LAST:event_borrar2ActionPerformed

    private void agregar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar3ActionPerformed
                NivelCursoPosGradoAgregar v = new NivelCursoPosGradoAgregar();
                v.id_usuario = id_usuario;
        
//                VentanaNivelCursosPosgrado v = new VentanaNivelCursosPosgrado();
//                v.id_usuario = id_usuario;
    }//GEN-LAST:event_agregar3ActionPerformed

    private void modificar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar3ActionPerformed
                NivelCursoPosGradoModificar v = new NivelCursoPosGradoModificar();
                v.id_usuario = id_usuario;
        
//                VentanaNivelCursosPosgradoModificar v = new VentanaNivelCursosPosgradoModificar();
//                v.id_usuario = id_usuario;
//                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO Y LUEGO MODIFIQUE DATOS");
    }//GEN-LAST:event_modificar3ActionPerformed

    private void borrar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar3ActionPerformed
                NivelCursoPosGradoEliminar v = new NivelCursoPosGradoEliminar();
                v.id_usuario = id_usuario;
        
//                VentanaNivelCursosPosgradoEliminar v = new VentanaNivelCursosPosgradoEliminar();
//                v.id_usuario = id_usuario;
//                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO QUE DESEA ELIMINAR, VERIFIQUE SI ES TAL Y LUEGO ELIMINE");
    }//GEN-LAST:event_borrar3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {

            mostrarDatos();

        } catch (DataAccessException ex) {
            Logger.getLogger(CurriculumFormAcad.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        CurriculumDatosPers dp = new CurriculumDatosPers();
        dp.id_usuario = id_usuario;
        dp.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(CurriculumFormAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CurriculumFormAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CurriculumFormAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CurriculumFormAcad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CurriculumFormAcad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar1;
    private javax.swing.JButton agregar2;
    private javax.swing.JButton agregar3;
    private javax.swing.JButton borrar1;
    private javax.swing.JButton borrar2;
    private javax.swing.JButton borrar3;
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JButton modificar1;
    private javax.swing.JButton modificar2;
    private javax.swing.JButton modificar3;
    // End of variables declaration//GEN-END:variables
}
