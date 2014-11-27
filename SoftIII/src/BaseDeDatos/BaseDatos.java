
package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {

    protected static Connection instance = null;

    public static Connection getInstance() throws ClassNotFoundException, SQLException {
        if (instance == null) {
            String url = "jdbc:postgresql://127.0.0.1:5432/systemproy";
            String driver = "org.postgresql.Driver";
            String user = "postgres";
            String pass = "12345";
            Class.forName(driver);
            instance = DriverManager.getConnection(url, user, pass);
        }
        return instance;
    }
    
    
    public ResultSet Consulta(String sentencia) {
        ResultSet rs = null;
        try {
            if (isConnected()) {
                Statement s = instance.createStatement();
                rs = s.executeQuery(sentencia);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
        return rs;
    }

    private boolean isConnected() {
        boolean resp = false;
        try {
            Class.forName("org.postgresql.Driver").newInstance();
            this.instance = DriverManager.getConnection("jdbc:postgresql://localhost:5432/systemproy", "postgres", "1234567");
            //System.out.print("Se conecto a la bd");
            resp = true;
        } catch (Exception e) {
            //System.out.println("No se puede realizar la conexión");
            System.out.println(e);
        }
        return resp;
    }

}
