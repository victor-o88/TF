package Interfaces;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class VentanaMenuDocente extends JFrame {

    ActionListener manejadorEventos = new ManejadorEventos();
    JButton baceptar = new JButton("Aceptar");
    JButton bcancelar = new JButton("Cancelar");
    JLabel jl1 = new JLabel("Ingrese una de las siguientes opciones");
    JRadioButton rbtn2, rbtn3;
    ButtonGroup grupo1;
    public String id_usuario;
    
    VentanaMenuDocente() {

        setTitle("Menu Docente");
        setBounds(500, 100, 400, 300);
        setResizable(false);
        JPanel panel2 = new JPanel();
        panel2.setLayout(null);

        grupo1 = new ButtonGroup();
        rbtn2 = new JRadioButton("Cargar Curriculum");
        rbtn2.setBounds(60, 100, 200, 30);
        add(rbtn2);
        grupo1.add(rbtn2);
        rbtn3 = new JRadioButton("Cargar Producción");
        rbtn3.setBounds(60, 150, 200, 30);
        add(rbtn3);
        grupo1.add(rbtn3);

        jl1.setFont(new Font("Serif", Font.BOLD, 18));
        jl1.setBounds(20, 50, 300, 30);
        baceptar.setBounds(180, 230, 100, 30);
        bcancelar.setBounds(290, 230, 100, 30);

        jl1.setForeground(Color.blue);

        panel2.add(baceptar);
        panel2.add(bcancelar);

        panel2.add(jl1);
        this.getContentPane().add(panel2);

        baceptar.addActionListener(manejadorEventos);
        bcancelar.addActionListener(manejadorEventos);
        
        this.repaint();
        setVisible(true);
    }

    class ManejadorEventos implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == baceptar) {
                aceptar();
            } else if (e.getSource() == bcancelar) {
                dispose();
            }
        }
    
        public void aceptar() {
            if (rbtn2.isSelected() == true) {
                VentanaCurriculum v = new VentanaCurriculum();
                v.id_usuario = id_usuario;
                dispose();
            }
            else if (rbtn3.isSelected() == true) {
                JOptionPane.showMessageDialog(null, "NO VALIDO");
            } else {
                JOptionPane.showMessageDialog(null, "SELECCIONE ALGUNA OPCION");
            }
        }
    
    }//clase interna
    
}
