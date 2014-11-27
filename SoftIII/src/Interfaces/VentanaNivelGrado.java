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
import SiPrIn.NivelGrado;


public class VentanaNivelGrado extends JFrame {
            
            public String id_usuario;
            ActionListener manejadorEventos = new ManejadorEventos();
            
            JButton bcancelar = new JButton("Cancelar");
            JButton bguardar = new JButton("Guardar");
            JLabel jl1 = new JLabel ("Nivel de Grado");
            JLabel jl2 = new JLabel ("Titulo");
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
            JTextField titulo = new JTextField ();
            JTextField tesis = new JTextField ();
            JTextField ciudad = new JTextField ();
            JTextField año = new JTextField ();
            JTextField provincia = new JTextField ();
            JTextField facultad = new JTextField ();
            JRadioButton rbtn1,rbtn2;
            ButtonGroup grupo1;
            JComboBox combo1,combo2,combo3;
            
            
            public VentanaNivelGrado(){
            
                    setTitle("Formación Académica");    
                    setBounds(300, 00, 600, 600);
                    setResizable(false);
                    JPanel panel2 = new JPanel();
                    panel2.setLayout(null);
                    
                    grupo1 = new ButtonGroup();//CONEAU
                    rbtn1 = new JRadioButton( "Si");
                    rbtn1.setBounds (200,380,50,30);
                    add(rbtn1);
                    grupo1.add ( rbtn1 );
                    rbtn2 = new JRadioButton( "No");
                    rbtn2.setBounds (250,380,50,30);
                    add(rbtn2);
                    grupo1.add ( rbtn2 );
                    
                    combo1=new JComboBox();   //UNIVERSIDADES
                    combo1.setBounds(200,100,250,30);
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
                    
                    combo2=new JComboBox(); //PAISES
                    combo2.setBounds(200,220,140,30);
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
                    combo3.setBounds(200,340,250,30);
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
               
                    bcancelar.setBounds (490,530,100,30);
                    bguardar.setBounds (380,530,100,30);
                    jl1.setBounds (20,20,200,30);
                    jl2.setBounds (140,60,140,30);
                    jl3.setBounds (110,100,140,30);
                    jl4.setBounds (120,140,140,30);
                    jl5.setBounds (20,180,170,30);
                    jl6.setBounds (350,180,140,30);
                    jl7.setBounds (140,220,200,30);
                    jl8.setBounds (120,260,140,30);
                    jl9.setBounds (130,300,140,30);
                    jl10.setBounds (45,340,140,30);
                    jl11.setBounds (25,380,170,30);
                    jl12.setBounds (80,420,140,30);
                    jl13.setBounds (350,420,100,30);
                    titulo.setBounds (200,60,180,30);
                    tesis.setBounds (200,180,140,30);
                    ciudad.setBounds (200,300,140,30);
                    año.setBounds (200,420,140,30);
                    provincia.setBounds (200,260,140,30);
                    facultad.setBounds (200,140,140,30);
                    
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
                    panel2.add(titulo);
                    panel2.add(tesis);
                    panel2.add(ciudad);
                    panel2.add(año);
                    panel2.add(provincia);
                    panel2.add(facultad);
                    panel2.add(combo1);
                    panel2.add(combo2);
                    panel2.add(combo3);
                    
                    this.getContentPane().add(panel2);
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
                    Logger.getLogger(VentanaNivelGrado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
        public void agregar() throws DataAccessException {
            if (titulo.getText().isEmpty() || facultad.getText().isEmpty() || tesis.getText().isEmpty() || provincia.getText().isEmpty() || ciudad.getText().isEmpty()
                    || grupo1.isSelected(null)) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                GestorNivelGrado gestor = new GestorNivelGrado();
                NivelGrado nivel = new NivelGrado();
                nivel.setTitulo(titulo.getText());
                String universidad=(String)combo1.getSelectedItem();//UNIVERSIDAD
                nivel.setUniversidad(universidad);
                nivel.setFacultad(facultad.getText());
                nivel.setAprobacion_tesis(Integer.parseInt(tesis.getText()));
                String pais=(String)combo2.getSelectedItem();//PAIS
                nivel.setPais(pais);
                nivel.setProvincia(provincia.getText());
                nivel.setCiudad(ciudad.getText());
                String area=(String)combo3.getSelectedItem();//AREA DE CONOCIMIENTO
                nivel.setArea_conocimiento(area);                
                //coneau
                if (rbtn1.isSelected() == true) {
                    String tipo = "Si";
                    nivel.setConeau(tipo);
                    nivel.setObtencion(Integer.parseInt(año.getText()));
                } else if (rbtn2.isSelected() == true) {
                    String tipo = "No";
                    nivel.setConeau(tipo);
                    nivel.setObtencion(0);
                }
                  
                gestor.agregar(nivel, id_usuario);
                JOptionPane.showMessageDialog(null, " Datos Nivel de Grado agregado con exito ");
                dispose();
            }
        }
    }//clase interna
}