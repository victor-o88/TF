package BaseDeDatos;

import Excepciones.DataAccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;
import java.sql.SQLException;
import SiPrIn.GestorUsuario;
import SiPrIn.Usuario;

public class UsuarioDAO {

    public UsuarioDAO() {
    }

    //
    public Usuario findByPK(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("Select * from usuarios where id_usuario='" + id_usuario + "'");
            Usuario usuario = null;
            while (result.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(result.getString("id_usuario"));
                usuario.setNombre(result.getString("nombre"));
                usuario.setApellido(result.getString("apellido"));
                usuario.setFec_nac(result.getDate("fec_nac"));
                usuario.setSexo(result.getString("sexo"));
                usuario.setEmail(result.getString("email"));
                usuario.setCont(result.getString("cont"));
                usuario.setConfirmar_cont(result.getString("confirmar_cont"));
                usuario.setTipo(result.getString("tipo"));
                usuario.setDni(result.getInt("dni"));
            }
            result.close();
            smt.close();
            return usuario;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.findByPK() " + ex);
        }
    }

    //
    public Collection findAll() throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("Select * from usuarios order by id_usuario");
            Usuario usuario = null;
            ArrayList array = new ArrayList();
            while (result.next()) {
                usuario = new Usuario();
                usuario.setId_usuario(result.getString("id_usuario"));
                usuario.setNombre(result.getString("nombre"));
                usuario.setApellido(result.getString("apellido"));
                usuario.setFec_nac(result.getDate("fec_nac"));
                usuario.setSexo(result.getString("sexo"));
                usuario.setEmail(result.getString("email"));
                usuario.setCuil(result.getString("cuil"));
                usuario.setCodigo_postal(result.getInt("codigo_postal"));
                usuario.setTelefono(result.getLong("telefono"));
                usuario.setCelular(result.getLong("celular"));
                usuario.setCont(result.getString("cont"));
                usuario.setConfirmar_cont(result.getString("confirmar_cont"));
                usuario.setTipo(result.getString("tipo"));
                usuario.setProvincia(result.getString("provincia"));
                usuario.setDepartamento(result.getString("departamento"));
                usuario.setPais(result.getString("pais"));
                usuario.setId_categoria(result.getString("id_categoria"));
                usuario.setCalle(result.getString("calle"));
                usuario.setNum(result.getInt("num"));
                usuario.setPiso(result.getString("piso"));
                usuario.setDni(result.getInt("dni"));
                array.add(usuario);
            }
            result.close();
            smt.close();
            return array;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.findAll() " + ex);
        }
    }

    //AGREGA LOS DATOS DEL USUARIO DE LA INTERFAZ USUARIO NUEVO, CUANDO SE REGISTRA AL SISTEMA
    public void agregarUsuarioNuevo(Usuario usuario) throws DataAccessException {
        try {
            Usuario existe = findByPK(usuario.getId_usuario());
            if (existe != null) {
                throw new DataAccessException("Usuario existente en UsuarioDAO.agregarUsuarioNuevo()");
            }
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("INSERT INTO usuarios (id_usuario,nombre,apellido,fec_nac,sexo,email,cont,confirmar_cont,tipo,dni) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, usuario.getId_usuario());
            ps.setString(2, usuario.getNombre());
            ps.setString(3, usuario.getApellido());
            ps.setDate(4, usuario.getFec_nac());
            ps.setString(5, usuario.getSexo());
            ps.setString(6, usuario.getEmail());
            ps.setString(7, usuario.getCont());
            ps.setString(8, usuario.getConfirmar_cont());
            ps.setString(9, usuario.getTipo());
            ps.setInt(10, usuario.getDni());
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.agregarUsuarioNuevo() " + ex);
        }
    }

    //METODO QUE AGREGA LOS DATOS DE UN USUARIO DE LA INTERFACE DATOS PERSONALES
    public void agregarUsuarioDatosPersonales(Usuario usuario, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("UPDATE usuarios SET nombre=?, apellido=?, fec_nac=?, sexo=?, email=?, cuil=?, codigo_postal=?, telefono=?, celular=?, provincia=?, departamento=?, pais=?, id_categoria=?, calle=?, num=?, piso=? WHERE id_usuario = '" + id_usuario + "'");
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setDate(3, usuario.getFec_nac());
            ps.setString(4, usuario.getSexo());
            ps.setString(5, usuario.getEmail());
            ps.setString(6, usuario.getCuil());
            ps.setInt(7, usuario.getCodigo_postal());
            ps.setLong(8, usuario.getTelefono());
            ps.setLong(9, usuario.getCelular());
            ps.setString(10, usuario.getProvincia());
            ps.setString(11, usuario.getDepartamento());
            ps.setString(12, usuario.getPais());
            ps.setString(13, usuario.getId_categoria());
            ps.setString(14, usuario.getCalle());
            ps.setInt(15, usuario.getNum());
            ps.setString(16, usuario.getPiso());
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.agregarUsuarioDatosPersonales() " + ex);
        }
    }

    //METODO PARA MOSTRAR LOS DATOS REGISTRADOS EN LA INTERFAZ DATOS PERSONALES
    public Usuario mostrar(String id_usuario) throws DataAccessException {
        try {
            GestorUsuario gestor = new GestorUsuario();
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT nombre, apellido, sexo, fec_nac, email, "
                    + "cuil, pais, provincia, calle, num, piso, codigo_postal, telefono, celular, "
                    + "id_categoria FROM usuarios WHERE id_usuario = '" + id_usuario + "'");
            Usuario usuario = new Usuario();
            while (result.next()) {
                usuario.setNombre(result.getString("nombre"));
                usuario.setApellido(result.getString("apellido"));
                usuario.setSexo(result.getString("sexo"));
                usuario.setFec_nac(gestor.fechaString(result.getString("fec_nac")));
                usuario.setEmail(result.getString("email"));
                
                
                usuario.setCuil(result.getString("cuil"));
                usuario.setPais(result.getString("pais"));
                usuario.setProvincia(result.getString("provincia"));
                usuario.setCalle(result.getString("calle"));
                usuario.setNum(result.getInt("num"));
                usuario.setPiso(result.getString("piso"));
                usuario.setCodigo_postal(result.getInt("codigo_postal"));
                usuario.setTelefono(result.getLong("telefono"));
                usuario.setCelular(result.getLong("celular"));
                usuario.setId_categoria(result.getString("id_categoria"));
            }
            result.close();
            smt.close();
            return usuario;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.mostrar() " + ex);
        }
    }

    //METODO PARA INGRESAR CONTRASEÑA, para poder entrar al sistema, VERIFICA QUE SEA MIEMBRO DEL SISTEMA
    public String buscarcontraseña(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT cont FROM usuarios WHERE id_usuario='" + id_usuario + "'");
            String contraseña = null;
            while (rs.next()) {
                contraseña = rs.getString("cont");
            }
            rs.close();
            st.close();
            return contraseña;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.buscarcontraseña() " + ex);
        }
    }

    //METODO PARA VERIFICAR EMAIL EN RESTAURAR USUARIO
    public String buscaremail(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT email FROM usuarios WHERE id_usuario='" + id_usuario + "'");
            String email = null;
            while (rs.next()) {
                email = rs.getString("email");
            }
            rs.close();
            st.close();
            return email;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.buscaremail() " + ex);
        }
    }

    //METODO QUE SACA EL NUMERO DEL ULTIMO USUARIO PARA GENERAR EL ID_USUARIO
    public int id_usuario() throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(num_usuario) as  MAX FROM usuarios");
            int id_usuario = 0;
            while (rs.next()) {
                id_usuario = rs.getInt("MAX");
            }
            rs.close();
            st.close();
            return id_usuario;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.id_usuario() " + ex);
        }
    }

    //METODO PARA DETERMINAR EL TIPO, DOCENTE O ALUMNO
    public String buscartipo(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT tipo FROM usuarios WHERE id_usuario='" + id_usuario + "'");
            String tipo = null;
            while (rs.next()) {
                tipo = rs.getString("tipo");
            }
            rs.close();
            st.close();
            return tipo;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.buscartipo() " + ex);
        }
    }
    
    //METODO PARA DETERMINAR EL NOMBRE(PARA LA INTERFACE MENU)
    public String buscarnombre(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT apellido FROM usuarios WHERE id_usuario='" + id_usuario + "'");
            String apellido = null;
            while (rs.next()) {
                apellido = rs.getString("apellido");
            }
            rs.close();
            st.close();
            return apellido;
        } catch (Exception ex) {
            throw new DataAccessException("Error en UsuarioDAO.buscartipo() " + ex);
        }
    }
}
