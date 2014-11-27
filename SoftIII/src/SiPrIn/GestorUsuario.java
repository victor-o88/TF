package SiPrIn;

import BaseDeDatos.UsuarioDAO;
import Excepciones.DataAccessException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class GestorUsuario {

    private ArrayList usuarios = new ArrayList();
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public GestorUsuario() throws DataAccessException {
        usuarios = (ArrayList) usuarioDAO.findAll();
    }

    //AGREGAR (interface usuario nuevo para registrarse en el sistema)
    public void agregarUsuario(Usuario usuario) throws DataAccessException {
        usuarioDAO.agregarUsuarioNuevo(usuario);
        usuarios.add(usuario);
    }

    //AGREGAR (interface datospersonales)
    public void agregarUsuarioDatosPersonales(Usuario usuario, String id_usuario) throws DataAccessException {
        usuarioDAO.agregarUsuarioDatosPersonales(usuario, id_usuario);
        usuarios.add(usuario);
    }

    //MUESTRA LOS DATOS REGISTRADOS
    public Usuario mostrar(String id_usuario) throws DataAccessException {
        Usuario usuario = usuarioDAO.mostrar(id_usuario);
        return usuario;
    }

    //METODO DE LA FECHA - TRANSFORMA STRING A DATE SQL
    public Date fechaString(String fec) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("yyyy-MM-dd");
        String strFecha = fec;
        java.util.Date fecha = null;
        try {
            fecha = (java.util.Date) formatoDelTexto.parse(strFecha);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
        java.sql.Date sqlDate = new java.sql.Date(fecha.getTime());
        return sqlDate;
    }

    //METODO QUE TRANSFORMA DATESQL A STRING
    public String fechaDate(Date fecha) {
        java.util.Date Utilfecha = new java.util.Date(fecha.getTime());
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
        String fechaString = sdf.format(Utilfecha);
        return fechaString;
    }

    //METODO QUE SACA EL NUMERO DEL ULTIMO USUARIO
    public int id_usuario() throws DataAccessException {
        int id_usuario = usuarioDAO.id_usuario();
        return id_usuario;
    }
}
