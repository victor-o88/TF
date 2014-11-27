package Interfaces;

import Excepciones.DataAccessException;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import SiPrIn.CursoPosgrado;
import SiPrIn.GestorCursoPosgrado;
import SiPrIn.GestorNivelGrado;
import SiPrIn.GestorNivelPosgrado;
import SiPrIn.GestorUsuario;
import SiPrIn.NivelGrado;
import SiPrIn.NivelPosgrado;
import SiPrIn.Usuario;

public class VentanaCurriculum extends JFrame {

    ActionListener manejadorEventos = new ManejadorEventos();
    JTable tabla1;
    DefaultTableModel modelo1;
    JTable tabla2;
    DefaultTableModel modelo2;
    JTable tabla3;
    DefaultTableModel modelo3;
    public String id_usuario;
    JLabel jLabel1;
    
    //PANEL 1
    JLabel jl1 = new JLabel("Datos Personales");
    JLabel jl2 = new JLabel("Nombre (*)");
    JLabel jl3 = new JLabel("Apellido (*)");
    JLabel jl4 = new JLabel("CUIL (*)");
    JLabel jl5 = new JLabel("Sexo(*)");
    JLabel jl6 = new JLabel("Fecha de Nacimiento (*)");
    JLabel jl7 = new JLabel("País (*)");
    JLabel jl8 = new JLabel("Provincia (*)");
    JLabel jl9 = new JLabel("Departamento (*)");
    JLabel jl10 = new JLabel("Calle (*)");
    JLabel jl11 = new JLabel("Nº (*)");
    JLabel jl12 = new JLabel("Piso/Dpto");
    JLabel jl13 = new JLabel("CP (*)");
    JLabel jl14 = new JLabel("Teléfono (*)         ");
    JLabel jl15 = new JLabel("Celular               ");
    JLabel jl16 = new JLabel("E-mail (*)");
    JLabel jl17 = new JLabel("Categoría en el Programa de Incentivos (*)");
    JLabel jl21 = new JLabel("Datos obligatorios (*)");
    JLabel jl22 = new JLabel("AÑO-MES-DIA  Ej: 1990-10-17");
    JLabel jl24 = new JLabel("15");
    JLabel jl18 = new JLabel("COD AREA");
    JTextField codareacel = new JTextField();
    JLabel jl19 = new JLabel("NUM");
    JTextField numcel = new JTextField();
    JLabel jl20 = new JLabel("COD AREA");
    JTextField codareatel = new JTextField();
    JLabel jl23 = new JLabel("NUM");
    JTextField numtel = new JTextField();
    JTextField nombre = new JTextField();
    JTextField apellido = new JTextField();
    JTextField cuil = new JTextField();
    JTextField calle = new JTextField();
    JTextField num = new JTextField();
    JTextField piso = new JTextField();
    JTextField cp = new JTextField();
    JTextField email = new JTextField();
    JTextField fec_nac = new JTextField();
    JTextField provincia = new JTextField();
    JTextField departamento = new JTextField();
    JButton bimportar = new JButton("Importar Datos");//DATOS REGISTRADOS AL MOMENTO DE REGISTRARSE AL SISTEMA    
    JButton bcancelar = new JButton("Cancelar");
    JButton baceptar = new JButton("Guardar");    
    JRadioButton rbtn1, rbtn2;
    ButtonGroup grupo1;
    JComboBox combo1, combo4;
    //PANEL 2
    JLabel jlb1 = new JLabel("Nivel Universitario de Grado");
    JLabel jlb2 = new JLabel("Nivel Universitario de Posgrado");
    JLabel jlb3 = new JLabel("Cursos Aprobados de Posgrado");
    JButton bagregar1 = new JButton("Agregar");
    JButton bmodificar1 = new JButton("Modificar");
    JButton beliminar1 = new JButton("Borrar");
    JButton bagregar2 = new JButton("Agregar");
    JButton bmodificar2 = new JButton("Modificar");
    JButton beliminar2 = new JButton("Borrar");
    JButton bagregar3 = new JButton("Agregar");
    JButton bmodificar3 = new JButton("Modificar");
    JButton beliminar3 = new JButton("Borrar");
    
    JButton mostrar = new JButton("Mostrar");
    JButton bcancelar2 = new JButton("Salir");

    public VentanaCurriculum() {

        setTitle("Curriculum Vitae");
        setBounds(100, 00, 640, 720);
        setResizable(false);

        JTabbedPane panelDePestanas = new JTabbedPane(JTabbedPane.TOP);  // se crea el panel de pestañas
//        panelDePestanas.setBounds(10, 10, 620, 670);   // se posiciona en el panel
        this.getContentPane().add(panelDePestanas);
//
//        JPanel panel1 = new JPanel();  // se posiciona en el panel
//        panelDePestanas.addTab("Datos Personales", null, panel1, null);   // que se añade como pestaña al 'tabbedPane'
//        panel1.setLayout(null);          // al panel le pongo distribución nula para posicionar los elementos en las coordenadas que quiera 

        JPanel panel2 = new JPanel();
        panelDePestanas.addTab("Formación Academica", null, panel2, null);
        panel2.setLayout(null);

//        // PANEL 1
//        grupo1 = new ButtonGroup();//SEXO
//        rbtn1 = new JRadioButton("Masculino");
//        rbtn1.setBounds(460, 85, 100, 30);
//        add(rbtn1);
//        grupo1.add(rbtn1);
//        rbtn2 = new JRadioButton("Femenino");
//        rbtn2.setBounds(460, 120, 100, 30);
//        add(rbtn2);
//        grupo1.add(rbtn2);
//
//        combo1 = new JComboBox();         // PAISES
//        combo1.setBounds(150, 220, 140, 30);
//        add(combo1);
//        combo1.addItem("Alemania");
//        combo1.addItem("Argentina");
//        combo1.addItem("Bolivia");
//        combo1.addItem("Brasil");
//        combo1.addItem("Canada");
//        combo1.addItem("Chile");
//        combo1.addItem("China");
//        combo1.addItem("Colombia");
//        combo1.addItem("Ecuador");
//        combo1.addItem("España");
//        combo1.addItem("Estados Unidos");
//        combo1.addItem("Francia");
//        combo1.addItem("Inglaterra");
//        combo1.addItem("Italia");
//        combo1.addItem("Mexico");
//        combo1.addItem("Paraguay");
//        combo1.addItem("Peru");
//        combo1.addItem("Uruguay");
//        combo1.addItem("Venezuela");
//
//        combo4 = new JComboBox();   // CATEGORIA
//        combo4.setBounds(280, 550, 140, 30);
//        add(combo4);
//        combo4.addItem("Categoría I");
//        combo4.addItem("Categoría II");
//        combo4.addItem("Categoría III");
//        combo4.addItem("Categoría IV");
//        combo4.addItem("Categoría V");
//
//        jl1.setBounds(20, 20, 150, 30);
//        jl2.setBounds(20, 60, 130, 30);
//        jl3.setBounds(20, 100, 130, 30);
//        jl4.setBounds(20, 140, 130, 30);
//        jl5.setBounds(380, 100, 140, 30);//sexo
//        jl6.setBounds(20, 180, 140, 30);
//        jl7.setBounds(20, 220, 140, 30);
//        jl8.setBounds(20, 260, 140, 30);
//        jl9.setBounds(20, 300, 140, 30);
//        jl10.setBounds(20, 340, 140, 30);
//        jl11.setBounds(20, 380, 50, 30);
//        jl12.setBounds(155, 380, 70, 30);
//        jl13.setBounds(305, 380, 70, 30);
//        jl14.setBounds(20, 420, 100, 30);
//        jl15.setBounds(20, 460, 120, 30);
//        jl16.setBounds(20, 510, 100, 30);
//        jl17.setBounds(20, 550, 300, 30);
//        //CELULAR
//        jl18.setBounds(120, 446, 70, 10);//AREA
//        jl18.setFont(new Font("Serif", Font.BOLD, 10));
//        jl19.setBounds(195, 446, 70, 10);//NUM
//        jl19.setFont(new Font("Serif", Font.BOLD, 10));
//        jl24.setBounds(165, 460, 20, 20);//15
//        //TELEFONO
//        jl20.setBounds(120, 486, 70, 10);//AREA
//        jl20.setFont(new Font("Serif", Font.BOLD, 10));
//        jl23.setBounds(195, 486, 70, 10);//NUM
//        jl23.setFont(new Font("Serif", Font.BOLD, 10));
//
//
//        jl21.setBounds(480, 580, 150, 30);
//        jl22.setBounds(360, 180, 250, 30);
//        nombre.setBounds(150, 60, 140, 25);
//        apellido.setBounds(150, 100, 140, 25);
//        cuil.setBounds(150, 140, 140, 25);
//        fec_nac.setBounds(200, 180, 140, 25);
//        provincia.setBounds(150, 260, 140, 25);
//        departamento.setBounds(150, 300, 140, 25);
//        calle.setBounds(150, 340, 140, 25);
//        num.setBounds(80, 380, 50, 25);
//        piso.setBounds(230, 380, 50, 25);
//        cp.setBounds(360, 380, 50, 25);
//
//
//        codareatel.setBounds(130, 420, 35, 25);
//        numtel.setBounds(185, 420, 60, 25);
//
//        codareacel.setBounds(130, 460, 35, 25);
//        numcel.setBounds(185, 460, 60, 25);
//
//        email.setBounds(130, 510, 200, 25);
//        bimportar.setBounds(240, 610, 150, 25);
//        baceptar.setBounds(400, 610, 100, 25);
//        bcancelar.setBounds(510, 610, 100, 25);
//
//
//        jl1.setForeground(Color.blue);

//        panel1.add(jl1);
//        panel1.add(jl2);
//        panel1.add(jl3);
//        panel1.add(jl4);
//        panel1.add(jl5);
//        panel1.add(jl6);
//        panel1.add(jl7);
//        panel1.add(jl8);
//        panel1.add(jl9);
//        panel1.add(jl10);
//        panel1.add(jl11);
//        panel1.add(jl11);
//        panel1.add(jl12);
//        panel1.add(jl13);
//        panel1.add(jl14);
//        panel1.add(jl15);
//        panel1.add(jl16);
//        panel1.add(jl17);
//        panel1.add(jl18);
//        panel1.add(jl19);
//        panel1.add(jl20);
//        panel1.add(jl21);
//        panel1.add(jl22);
//        panel1.add(jl23);
//        panel1.add(jl24);
//        panel1.add(nombre);
//        panel1.add(apellido);
//        panel1.add(cuil);
//        panel1.add(calle);
//        panel1.add(num);
//        panel1.add(piso);
//        panel1.add(cp);
//
//        panel1.add(codareacel);
//        panel1.add(numcel);
//        panel1.add(codareatel);
//        panel1.add(numtel);
//
//        panel1.add(email);
//        panel1.add(fec_nac);
//        panel1.add(provincia);
//        panel1.add(departamento);
//        panel1.add(bimportar);
//        panel1.add(bcancelar);
//        panel1.add(baceptar);
//        panel1.add(combo1);
//        panel1.add(combo4);
//        panel1.add(rbtn1);
//        panel1.add(rbtn2);

//        baceptar.addActionListener(manejadorEventos);
//        bcancelar.addActionListener(manejadorEventos);
//        bimportar.addActionListener(manejadorEventos);


        //PANEL 2

        //TABLA 1 (nivel_grado)
        String[] columnas = {"NUMERO DE REGISTRO", "TITULO", "UNIVERSIDAD", "FACULTAD", "AÑO APROBACION TESIS", "PAIS", "PROVINCIA", "CIUDAD", "AREA DE CONOCIMIENTO", "ACREDITACIÓN EN CONEAU", "AÑO DE OBTENCIÓN EN CONEAU"};
        Object[][] datos = {};
        modelo1 = new DefaultTableModel(datos, columnas);
        tabla1 = new JTable(modelo1);
        JScrollPane scrollPane1 = new JScrollPane(tabla1);
        scrollPane1.setBounds(new Rectangle(450, 130));
        scrollPane1.setLocation(20, 50);
        tabla1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);//scroll horizontal
        //TABLA 2 (nivel_posgrado)
        String[] columnas2 = {"NUMERO DE REGISTRO", "NIVEL DE POSGRADO", "TITULO", "UNIVERSIDAD", "FACULTAD", "AÑO APROBACIÓN DE TESIS", "PAIS", "PROVINCIA", "CIUDAD", "AREA DE CONOCIMIENTO", "ACREDITACIÓN EN CONEAU", "AÑO DE OBTENCIÓN EN CONEAU"};
        Object[][] datos2 = {};
        modelo2 = new DefaultTableModel(datos2, columnas2);
        tabla2 = new JTable(modelo2);
        JScrollPane scrollPane2 = new JScrollPane(tabla2);
        scrollPane2.setBounds(new Rectangle(450, 130));
        scrollPane2.setLocation(20, 230);
        tabla2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        //TABLA 3 (curso_posgrado)
        String[] columnas3 = {"NUMERO DE REGISTRO", "CURSO", "UNIVERSIDAD", "FACULTAD", "AÑO", "CARGA HORARIA", "PAIS", "PROVINCIA", "CIUDAD", "AREA DE CONOCIMIENTO", "ACREDITACIÓN EN CONEAU", "AÑO DE OBTENCIÓN EN CONEAU"};
        Object[][] datos3 = {};
        modelo3 = new DefaultTableModel(datos3, columnas3);
        tabla3 = new JTable(modelo3);
        JScrollPane scrollPane3 = new JScrollPane(tabla3);
        scrollPane3.setBounds(new Rectangle(450, 130));//TAMAÑO
        scrollPane3.setLocation(20, 410);//UBICACION  
        tabla3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        
        
        jlb1.setBounds(20, 20, 200, 30);
        jlb2.setBounds(20, 200, 200, 30);
        jlb3.setBounds(20, 380, 200, 30);
        bagregar1.setBounds(500, 50, 100, 30);          // LE DOY X,Y, ANCHO Y LARGO
        bmodificar1.setBounds(500, 100, 100, 30);
        beliminar1.setBounds(500, 150, 100, 30);
        bagregar2.setBounds(500, 230, 100, 30);
        bmodificar2.setBounds(500, 280, 100, 30);          // LE DOY X,Y, ANCHO Y LARGO
        beliminar2.setBounds(500, 330, 100, 30);
        bagregar3.setBounds(500, 410, 100, 30);
        bmodificar3.setBounds(500, 460, 100, 30);
        beliminar3.setBounds(500, 510, 100, 30);          // LE DOY X,Y, ANCHO Y LARGO
        
        bcancelar2.setBounds(490, 600, 100, 30);
        mostrar.setBounds(380, 600, 100, 30);

        panel2.add(jlb1);
        panel2.add(jlb2);
        panel2.add(jlb3);
        panel2.add(bagregar1);
        panel2.add(bmodificar1);
        panel2.add(beliminar1);
        panel2.add(bagregar2);
        panel2.add(bmodificar2);
        panel2.add(beliminar2);
        panel2.add(bagregar3);
        panel2.add(bmodificar3);
        panel2.add(beliminar3);
        panel2.add(bcancelar2);
        panel2.add(mostrar);
        panel2.add(scrollPane1);
        panel2.add(scrollPane2);
        panel2.add(scrollPane3);

        bagregar1.addActionListener(manejadorEventos);
        bmodificar1.addActionListener(manejadorEventos);
        beliminar1.addActionListener(manejadorEventos);
        bagregar2.addActionListener(manejadorEventos);
        bmodificar2.addActionListener(manejadorEventos);
        beliminar2.addActionListener(manejadorEventos);
        bagregar3.addActionListener(manejadorEventos);
        bmodificar3.addActionListener(manejadorEventos);
        beliminar3.addActionListener(manejadorEventos);
        bcancelar2.addActionListener(manejadorEventos);
        mostrar.addActionListener(manejadorEventos);

        repaint();
        setVisible(true);
    }

    class ManejadorEventos implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == bimportar) {
                try {
                    importar();
                } catch (DataAccessException ex) {
                    Logger.getLogger(VentanaCurriculum.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (e.getSource() == bcancelar) {
                dispose();
            } else if (e.getSource() == baceptar) {
                try {
                    agregar();
                } catch (DataAccessException ex) {
                    Logger.getLogger(VentanaCurriculum.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (e.getSource() == bagregar1) {
                NivelGradoAgregar v = new NivelGradoAgregar();//
                v.id_usuario = id_usuario;
            } else if (e.getSource() == bmodificar1) {
                //VentanaNivelGradoModificar v = new VentanaNivelGradoModificar();
                NivelGradoModificar v = new NivelGradoModificar();
                v.id_usuario = id_usuario;
                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO Y LUEGO MODIFIQUE DATOS");
            } else if (e.getSource() == beliminar1) {
                //VentanaNivelGradoEliminar v = new VentanaNivelGradoEliminar();//
                NivelGradoEliminar v = new NivelGradoEliminar();
                v.id_usuario = id_usuario;
                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO QUE DESEA ELIMINAR, VERIFIQUE SI ES TAL Y LUEGO ELIMINE");
            } else if (e.getSource() == bagregar2) {
                //VentanaNivelPosgrado v = new VentanaNivelPosgrado();
                NivelPosGradoAgregar v = new NivelPosGradoAgregar();
                v.id_usuario = id_usuario;
            } else if (e.getSource() == bmodificar2) {
                //VentanaNivelPosgradoModificar v = new VentanaNivelPosgradoModificar();
                NivelPosGradoModificar v = new NivelPosGradoModificar();
                v.id_usuario = id_usuario;
                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO Y LUEGO MODIFIQUE DATOS");
            } else if (e.getSource() == beliminar2) {
                //VentanaNivelPosgradoEliminar v = new VentanaNivelPosgradoEliminar();
                NivelPosGradoEliminar v = new NivelPosGradoEliminar();
                v.id_usuario = id_usuario;
                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO QUE DESEA ELIMINAR, VERIFIQUE SI ES TAL Y LUEGO ELIMINE");
            } else if (e.getSource() == bagregar3) {
                //VentanaNivelCursosPosgrado v = new VentanaNivelCursosPosgrado();
                NivelCursoPosGradoAgregar v = new NivelCursoPosGradoAgregar();
                v.id_usuario = id_usuario;
            } else if (e.getSource() == bmodificar3) {
                //VentanaNivelCursosPosgradoModificar v = new VentanaNivelCursosPosgradoModificar();
                NivelCursoPosGradoModificar v = new NivelCursoPosGradoModificar();
                v.id_usuario = id_usuario;
                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO Y LUEGO MODIFIQUE DATOS");
            } else if (e.getSource() == beliminar3) {
                //VentanaNivelCursosPosgradoEliminar v = new VentanaNivelCursosPosgradoEliminar();
                NivelCursoPosGradoEliminar v = new NivelCursoPosGradoEliminar();
                v.id_usuario = id_usuario;
                JOptionPane.showMessageDialog(null, "IMPORTANTE: PRIMERO BUSQUE EL REGISTRO QUE DESEA ELIMINAR, VERIFIQUE SI ES TAL Y LUEGO ELIMINE");
            } else if (e.getSource() == bcancelar2) {
                dispose();
            } else if (e.getSource() == mostrar) {
                try {
                    mostrar();
                } catch (DataAccessException ex) {
                    Logger.getLogger(VentanaCurriculum.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        //METODO QUE VA A MOSTRAR LOS DATOS YA REGISTRADOS AL MOMENTO DE HACERSE USUARIO NUEVO DEL SISTEMA
        public void importar() throws DataAccessException {
            GestorUsuario gestor = new GestorUsuario();
            Usuario usuario = gestor.mostrar(id_usuario);
            nombre.setText(usuario.getNombre());
            apellido.setText(usuario.getApellido());
            fec_nac.setText(gestor.fechaDate(usuario.getFec_nac()));
            email.setText(usuario.getEmail());
            if (usuario.getSexo().equals("Masculino")) {
                rbtn1.setSelected(true);
            } else if (usuario.getSexo().equals("Femenino")) {
                rbtn2.setSelected(true);
            }
        }

        //MUESTRA EN LOS JTABLE
        public void mostrar() throws DataAccessException {
            //TABLA NIVEL GRADO
            GestorNivelGrado gestor = new GestorNivelGrado();
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
            }
            //TABLA NIVEL POSGRADO
            GestorNivelPosgrado gestor2 = new GestorNivelPosgrado();
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
            }
            //TABLA CURSO POSGRADO
            GestorCursoPosgrado gestor3 = new GestorCursoPosgrado();
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
            }
        }

        //METODO QUE AGREGA TODOS LOS VALORES
        public void agregar() throws DataAccessException {

            if (nombre.getText().isEmpty() || apellido.getText().isEmpty() || cuil.getText().isEmpty() || fec_nac.getText().isEmpty() || grupo1.isSelected(null) || provincia.getText().isEmpty()
                    || departamento.getText().isEmpty() || calle.getText().isEmpty() || num.getText().isEmpty() || cp.getText().isEmpty() || codareatel.getText().isEmpty() || numtel.getText().isEmpty() || email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                Usuario usuario = new Usuario();
                GestorUsuario gestor = new GestorUsuario();
                usuario.setNombre(nombre.getText());
                usuario.setApellido(apellido.getText());
                usuario.setCuil(cuil.getText());
                if (rbtn1.isSelected() == true) {
                    String sexo = "Masculino";
                    usuario.setSexo(sexo);
                } else if (rbtn2.isSelected() == true) {
                    String sexo = "Femenino";
                    usuario.setSexo(sexo);
                }
                java.sql.Date sqlDate = gestor.fechaString(fec_nac.getText());
                usuario.setFec_nac(sqlDate);
                String pais = (String) combo1.getSelectedItem();//PAIS
                usuario.setPais(pais);
                usuario.setProvincia(provincia.getText());
                usuario.setDepartamento(departamento.getText());
                usuario.setCalle(calle.getText());
                usuario.setNum(Integer.parseInt(num.getText()));
                usuario.setPiso(piso.getText());
                usuario.setCodigo_postal(Integer.parseInt(cp.getText()));
                String telefono = codareatel.getText().concat(numtel.getText());
                usuario.setTelefono(Long.parseLong(telefono));
                String celular = codareacel.getText().concat(numcel.getText());
                usuario.setCelular(Long.parseLong(celular));
                usuario.setEmail(email.getText());
                String categoria = (String) combo4.getSelectedItem();//CATEGORIA
                usuario.setId_categoria(categoria);
                gestor.agregarUsuarioDatosPersonales(usuario, id_usuario);
                JOptionPane.showMessageDialog(null, "  Datos registrados con exito  ");
            }
        }
    }//clase interna
}         