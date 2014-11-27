
package Interfaces;

import Excepciones.DataAccessException;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
import javax.swing.JTextField;
import SiPrIn.GestorNivelGrado;
import SiPrIn.NivelGrado;

public class VentanaNivelGradoEliminar extends JFrame{
    
            public String id_usuario;
            ActionListener manejadorEventos = new ManejadorEventos();
            
            JButton bcancelar = new JButton("Cancelar");
            JButton bguardar = new JButton("Eliminar");
            JButton bbuscar = new JButton("Buscar");
            JLabel jl1 = new JLabel ("Nivel de Grado");
            
            JLabel jltitulo = new JLabel ("Ingrese Numero de Registro que desea eliminar");
            JLabel jlregistro = new JLabel ("Numero de Registro");
            JTextField registro = new JTextField ();
            JLabel jltitulo2 = new JLabel ("Su Registro es:");
            
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
            
            
            public VentanaNivelGradoEliminar(){
            
                    setTitle("Formación Académica");    
                    setBounds(300, 00, 600, 700);
                    setResizable(false);
                    JPanel panel2 = new JPanel();
                    panel2.setLayout(null);
                    
                    grupo1 = new ButtonGroup();//CONEAU
                    rbtn1 = new JRadioButton( "Si");
                    rbtn1.setBounds (200,500,50,30);
                    add(rbtn1);
                    grupo1.add ( rbtn1 );
                    rbtn2 = new JRadioButton( "No");
                    rbtn2.setBounds (250,500,50,30);
                    add(rbtn2);
                    grupo1.add ( rbtn2 );
                    
                    combo1=new JComboBox();   //UNIVERSIDADES
                    combo1.setBounds(200,220,250,30);
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
                    combo2.setBounds(200,340,140,30);
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
                    combo3.setBounds(200,460,250,30);
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
               
                bcancelar.setBounds(490, 630, 100, 30);
                bguardar.setBounds(380, 630, 100, 30);
                bbuscar.setBounds(270, 630, 100, 30);
                jl1.setBounds(20, 20, 200, 30);

                jltitulo.setBounds(50, 60, 400, 30);
                jlregistro.setBounds(50, 100, 150, 30);
                registro.setBounds(210, 100, 100, 30);
                jltitulo2.setBounds(160, 140, 100, 30);
                    
                    jl2.setBounds (140,180,140,30);
                    jl3.setBounds (110,220,140,30);
                    jl4.setBounds (120,260,140,30);
                    jl5.setBounds (20,300,170,30);
                    jl6.setBounds (350,300,140,30);
                    jl7.setBounds (140,340,200,30);
                    jl8.setBounds (120,380,140,30);
                    jl9.setBounds (130,420,140,30);
                    jl10.setBounds (45,460,140,30);
                    jl11.setBounds (25,500,170,30);
                    jl12.setBounds (80,540,140,30);
                    jl13.setBounds (350,540,100,30);
                    
                    titulo.setBounds (200,180,180,30);
                    tesis.setBounds (200,300,140,30);
                    ciudad.setBounds (200,420,140,30);
                    año.setBounds (200,540,140,30);
                    provincia.setBounds (200,380,140,30);
                    facultad.setBounds (200,260,140,30);
                    
                    jl1.setForeground(Color.blue);
                    
                    panel2.add(bcancelar);
                    panel2.add(bguardar);
                    panel2.add(bbuscar);
                    
                    panel2.add(jltitulo);
                    panel2.add(jlregistro);
                    panel2.add(registro);
                    panel2.add(jltitulo2);
                    
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
                    bbuscar.addActionListener(manejadorEventos);
                    repaint();
                    setVisible(true);            
            }
 
           
    class ManejadorEventos implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == bcancelar) {
                dispose();
            } else if (e.getSource() == bbuscar){
                try {
                    buscar();
                } catch (DataAccessException ex) {
                    Logger.getLogger(VentanaNivelGradoModificar.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if (e.getSource() == bguardar) {
                try {
                    eliminar();
                } catch (DataAccessException ex) {
                    Logger.getLogger(VentanaNivelGrado.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    
        //BUSCAR EL REGISTRO DE ACUERDO AL NUM DE REGISTRO
        public void buscar() throws DataAccessException {           

            if (registro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, " Error: Campo vacio ");
            } else {
                GestorNivelGrado gestor = new GestorNivelGrado();
                NivelGrado nivelbuscado = new NivelGrado();
                int registrobuscar = Integer.parseInt(registro.getText());
                nivelbuscado = gestor.buscar(registrobuscar, id_usuario);
                if(nivelbuscado == null){
                JOptionPane.showMessageDialog(null, "Error: NUMERO DE REGISTRO DE NIVEL DE GRADO INVALIDO");
                }else{
                titulo.setText(nivelbuscado.getTitulo());
                combo1.setSelectedItem(nivelbuscado.getUniversidad());//UNIVERSIDAD
                facultad.setText(nivelbuscado.getFacultad());
                tesis.setText(Integer.toString(nivelbuscado.getAprobacion_tesis()));
                combo2.setSelectedItem(nivelbuscado.getPais());//PAIS
                provincia.setText(nivelbuscado.getProvincia());
                ciudad.setText(nivelbuscado.getCiudad());
                combo3.setSelectedItem(nivelbuscado.getArea_conocimiento());//AREA
                //CONEAU
                if (nivelbuscado.getConeau().equals("Si")) {
                    rbtn1.setSelected(true);
                } else if (nivelbuscado.getConeau().equals("No")) {
                    rbtn2.setSelected(true);
                }
                año.setText(Integer.toString(nivelbuscado.getObtencion()));
                }
            }
        }
        
        //ELIMINA
        public void eliminar() throws DataAccessException {
            if (registro.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                GestorNivelGrado gestor = new GestorNivelGrado();                
                gestor.eliminar(Integer.parseInt(registro.getText()), id_usuario);
                JOptionPane.showMessageDialog(null, " Registro Nivel de Grado eliminado con exito ");
                dispose();
            }
        }
    }//clase interna
}
