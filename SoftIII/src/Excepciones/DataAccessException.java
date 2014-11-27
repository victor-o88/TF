
package Excepciones;

import javax.swing.JOptionPane;

public class DataAccessException extends Exception {

    public DataAccessException(String exceptionMsg) {
        JOptionPane.showMessageDialog(null, "Problemas con la conexión a la Base De Datos, consulte con su Técnico");
    }
}