
package Interfaces;
import BaseDeDatos.UsuarioDAO;
import Excepciones.DataAccessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class VentanaRestaurarUsuario extends JFrame {
        
        ActionListener manejadorEventos = new ManejadorEventos();
        JButton baceptar = new JButton("Aceptar");
        JButton bcancelar = new JButton("Cancelar");
        JTextField email = new JTextField ();
        JTextField usuario = new JTextField ();
        JLabel jl1 = new JLabel ("Ingrese Usuario y Correo Electrónico");
        JLabel jl2 = new JLabel ("Usuario");
        JLabel jl3 = new JLabel ("Correo Electrónico");
        JLabel jl4 = new JLabel ("Se le enviara un e-mail con los datos de Usuario y Contraseña a su correo electrónico");
        
        
        
        VentanaRestaurarUsuario(){
        
                this.setTitle("Restaurar Usuario");    
                this.setBounds(100, 100, 650, 300);
                this.setResizable(false);
                JPanel panel2 = new JPanel();
                panel2.setLayout(null);
                
                jl1.setFont(new Font( "Serif", Font.BOLD, 18 ));
                
                
                baceptar.setBounds (430,240,100,25);          // LE DOY X,Y, ANCHO Y LARGO
                bcancelar.setBounds (540,240,100,25);
                usuario.setBounds (200,100,200,30);
                email.setBounds (200,150,200,30);
                jl1.setBounds (20,50,400,25);
                jl2.setBounds (50,100,150,25);
                jl3.setBounds (50,150,150,25);
                jl4.setBounds (50,200,500,25);
                
                panel2.add(baceptar);
                panel2.add(bcancelar);
                panel2.add(usuario);                
                panel2.add(email);
                panel2.add(jl1);
                panel2.add(jl2);
                panel2.add(jl3);
                panel2.add(jl4);
                
                this.getContentPane().add(panel2);
                
                baceptar.addActionListener(manejadorEventos);
                bcancelar.addActionListener(manejadorEventos);
                
                this.repaint();
                this.setVisible(true);
        }
        
    class ManejadorEventos implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == baceptar) {
                try {
                    Restaurar();
                } catch (DataAccessException ex) {
                    Logger.getLogger(VentanaRestaurarUsuario.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (e.getSource() == bcancelar) {
               dispose();
            }
        }

        public void Restaurar() throws DataAccessException {
            if (usuario.getText().isEmpty() || email.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Error: Campo vacio");
            } else {
                UsuarioDAO usuarioDAO = new UsuarioDAO();
                String emails = usuarioDAO.buscaremail(usuario.getText());
                if (emails.equals(email.getText())) {
                    JOptionPane.showMessageDialog(null, "Los Datos se han enviado a su correo electronico");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario y/o Correo Electronico son invalidos");
                }
            }
        }
    }//clase interna
        
}
