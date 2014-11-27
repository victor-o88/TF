package Interfaces;

import Excepciones.DataAccessException;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import SiPrIn.GestorNivelGrado;
import SiPrIn.GestorNivelPosgrado;
import SiPrIn.NivelPosgrado;


public class VentanaNivelPosgrado extends JFrame {
    
            ActionListener manejadorEventos = new ManejadorEventos();
            public String id_usuario;
            JButton bcancelar = new JButton("Cancelar");
            JButton bguardar = new JButton("Guardar");
            JLabel jl1 = new JLabel ("Nivel de Posgrado");
            JLabel jl2 = new JLabel ("Nivel Universitario de Posgrado");
            JLabel jl3 = new JLabel ("Universidad");
            JLabel jl4 = new JLabel ("Facultad");
            JLabel jl5 = new JLabel ("Año Aprobación de la Tesis");
            JLabel jl6 = new JLabel ("aaaa");
            JLabel jl7 = new JLabel ("País");
            JLabel jl8 = new JLabel ("Provincia");
            JLabel jl9 = new JLabel ("Ciudad");
            JLabel jl10 = new JLabel ("Area de Conocimiento");
            JLabel jl11 = new JLabel ("Acreditado por la CONEAU");
            JLabel jl12 = new JLabel ("Año de Obtención");
            JLabel jl13 = new JLabel ("aaaa");
            JLabel jl14 = new JLabel ("Título");
            JTextField año = new JTextField ();
            JTextField ciudad = new JTextField ();
            JTextField añoObt = new JTextField ();
            JTextField provincia = new JTextField ();
            JTextField facultad = new JTextField ();
            JTextField titulo = new JTextField ();
            JRadioButton rbtn1,rbtn2;
            ButtonGroup grupo1;
            JComboBox combo1,combo2,combo3,combo4;
            
            
            public VentanaNivelPosgrado(){
            
                    setTitle("Formación Académica");    
                    setBounds(300, 00, 600, 600);
                    setResizable(false);
                    JPanel panel2 = new JPanel();
                    panel2.setLayout(null);
                    
                    grupo1 = new ButtonGroup();//CONEAU
                    rbtn1 = new JRadioButton( "Si");
                    rbtn1.setBounds (200,420,50,30);
                    add(rbtn1);
                    grupo1.add ( rbtn1 );
                    rbtn2 = new JRadioButton( "No");
                    rbtn2.setBounds (250,420,50,30);
                    add(rbtn2);
                    grupo1.add ( rbtn2 );
                    
                    combo1=new JComboBox();   //UNIVERSIDADES
                    combo1.setBounds(200,140,250,30);
                    add(combo1);
                    combo1.addItem("Universidad de Buenos Aires");
                    combo1.addItem("Universidad Nacional de Catamarca");
                    combo1.addItem("Universidad Nacional de Córdoba");
                    combo1.addItem("Universidad Nacional de Cuyo");
                    combo1.addItem("Universidad Nacional de Entre Ríos");
                    combo1.addItem("Universidad Nacional de Formosa");
                    combo1.addItem("Universidad Nacional de La Pampa");
                    combo1.addItem("Universidad Nacional de La Plata");
                    combo1.addItem("Universidad Nacional de La Rioja");
                    combo1.addItem("Universidad Nacional de Misiones");
                    combo1.addItem("Universidad Nacional de Río Negro");
                    combo1.addItem("Universidad Nacional de Rosario");
                    combo1.addItem("Universidad Nacional de Salta");
                    combo1.addItem("Universidad Nacional de San Juan");
                    combo1.addItem("Universidad Nacional de Tucumán");
                    
                    combo2=new JComboBox(); // PAISES
                    combo2.setBounds(200,260,140,30);
                    add(combo2);
                    combo2.addItem("Alemania");
                    combo2.addItem("Argentina");
                    combo2.addItem("Bolivia");
                    combo2.addItem("Brasil");
                    combo2.addItem("Canada");
                    combo2.addItem("Chile");
                    combo2.addItem("China");
                    combo2.addItem("Colombia");
                    combo2.addItem("Ecuador");
                    combo2.addItem("España");
                    combo2.addItem("Estados Unidos");
                    combo2.addItem("Francia");
                    combo2.addItem("Inglaterra");
                    combo2.addItem("Italia");
                    combo2.addItem("Mexico");
                    combo2.addItem("Paraguay");
                    combo2.addItem("Peru");
                    combo2.addItem("Uruguay");
                    combo2.addItem("Venezuela");
                    
                    combo3=new JComboBox(); // AREA DE CONOCIMIENTO
                    combo3.setBounds(200,380,250,30);
                    add(combo3);
                    combo3.addItem("Álgebra");
                    combo3.addItem("Análisis Matemático");
                    combo3.addItem("Auditoria de Sistemas");
                    combo3.addItem("Estadística e Investigación Operativa");
                    combo3.addItem("Física");
                    combo3.addItem("Gestión de Datos");
                    combo3.addItem("Ingeniería de Software");
                    combo3.addItem("Lenguajes Formales y Autómatas");
                    combo3.addItem("Modelos y Simulación");
                    combo3.addItem("Programación");
                    combo3.addItem("Química");
                    combo3.addItem("Sistemas de Gestión");
                    combo3.addItem("Sistemas Operativos");
                    combo3.addItem("Teoría de Control");
                    
                    combo4=new JComboBox();   //POSGRADO
                    combo4.setBounds(200,60,140,30);
                    add(combo4);
                    combo4.addItem("Doctorado");
                    combo4.addItem("Maestría");
                    combo4.addItem("Especialización");
                    
                    bcancelar.setBounds (490,530,100,30);          // LE DOY X,Y, ANCHO Y LARGO
                    bguardar.setBounds (380,530,100,30);
                    jl1.setBounds (20,20,200,30);
                    jl2.setBounds (10,60,200,30);
                    jl14.setBounds (135,100,100,30);
                    jl3.setBounds (110,140,140,30);
                    jl4.setBounds (120,180,140,30);
                    jl5.setBounds (20,220,170,30);
                    jl6.setBounds (350,220,140,30);
                    jl7.setBounds (140,260,200,30);
                    jl8.setBounds (120,300,140,30);
                    jl9.setBounds (130,340,140,30);
                    jl10.setBounds (45,380,140,30);
                    jl11.setBounds (25,420,170,30);
                    jl12.setBounds (80,460,140,30);
                    jl13.setBounds (350,460,100,30);
                    
                    año.setBounds (200,220,140,30);
                    ciudad.setBounds (200,340,140,30);
                    añoObt.setBounds (200,460,140,30);
                    provincia.setBounds (200,300,140,30);
                    facultad.setBounds (200,180,140,30);
                    titulo.setBounds (200,100,140,30);
                    
                    jl1.setForeground(Color.blue);
                    
                    panel2.add(bcancelar);
                    panel2.add(bguardar);
                    panel2.add(jl1);
                    panel2.add(jl2);
                    panel2.add(jl3);
                    panel2.add(jl4);
                    panel2.add(jl5);
                    panel2.add(jl6);
                    panel2.add(jl7);
                    panel2.add(jl8);
                    panel2.add(jl9);
                    panel2.add(jl10);
                    panel2.add(jl11);
                    panel2.add(jl12);
                    panel2.add(jl13);
                    panel2.add(jl14);
                    panel2.add(año);
                    panel2.add(ciudad);
                    panel2.add(añoObt);
                    panel2.add(provincia);
                    panel2.add(facultad);
                    panel2.add(titulo);
                    panel2.add(combo1);
                    panel2.add(combo2);
                    panel2.add(combo3);
                    panel2.add(combo4);
                    
                    getContentPane().add(panel2);
                    bcancelar.addActionListener(manejadorEventos);
                    bguardar.addActionListener(manejadorEventos);
                    repaint();
                    setVisible(true);
            
            }
            
    class ManejadorEventos implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == bcancelar) {
                dispose();
            } else if (e.getSource() == bguardar) {
                try {
                    agregar();
                } catch (DataAccessException ex) {
                    Logger.getLogger(VentanaNivelPosgrado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
         
        public void agregar() throws DataAccessException {
            if (titulo.getText().isEmpty() || facultad.getText().isEmpty() || provincia.getText().isEmpty() || ciudad.getText().isEmpty()
                    || año.getText().isEmpty() || grupo1.isSelected(null)) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                GestorNivelGrado gestorn = new GestorNivelGrado();
                int aprobacion_tesis = gestorn.aprobacion_tesis(id_usuario);
                if(aprobacion_tesis == 0){
                    JOptionPane.showMessageDialog(null, "  Error: Usted no puede agregar un Nivel de Posgrado si aún no agregó un Nivel de Grado  ");
                }else if (aprobacion_tesis > Integer.parseInt(año.getText())) {
                    JOptionPane.showMessageDialog(null, "  Error: El año de aprobación de tesis del Nivel de Posgrado no puede ser menor que el año de aprobación de tesis de Nivel de Grado  ");
                } else {

                    GestorNivelPosgrado gestor = new GestorNivelPosgrado();
                    NivelPosgrado posgrado = new NivelPosgrado();
                    String nivelposgrado = (String) combo4.getSelectedItem();//NIVEL POSGRADO
                    posgrado.setNivel_posgrado(nivelposgrado);
                    posgrado.setTitulo(titulo.getText());
                    String universidad = (String) combo1.getSelectedItem();//UNIVERSIDAD
                    posgrado.setUniversidad(universidad);
                    posgrado.setFacultad(facultad.getText());
                    posgrado.setAprobacion_tesis(Integer.parseInt(año.getText()));
                    String pais = (String) combo2.getSelectedItem();//PAIS
                    posgrado.setPais(pais);
                    posgrado.setProvincia(provincia.getText());
                    posgrado.setCiudad(ciudad.getText());
                    String area = (String) combo3.getSelectedItem();//AREA DE CONOCIMIENTO
                    posgrado.setArea_conocimiento(area);
                    //coneau
                    if (rbtn1.isSelected() == true) {
                        String tipo = "Si";
                        posgrado.setConeau(tipo);
                        posgrado.setObtencion(Integer.parseInt(añoObt.getText()));
                    } else if (rbtn2.isSelected() == true) {
                        String tipo = "No";
                        posgrado.setConeau(tipo);
                        posgrado.setObtencion(0);
                    }

                    gestor.agregar(posgrado, id_usuario);
                    JOptionPane.showMessageDialog(null, "  Datos Nivel Posgrado agregado con exito  ");
                    dispose();
                }
            }
        }
        
    }            
}