package BaseDeDatos;

import Excepciones.DataAccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import SiPrIn.NivelGrado;

public class NivelGradoDAO {
    BaseDatos conecta = new BaseDatos();
    private ResultSet rs;

    public NivelGradoDAO() {
    }

    //METODO QUE DEVUELTE TODOS LOS REGISTROS DE LA DB
    public Collection findAll() throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT * FROM nivel_grado ORDER BY num_nivelgrado");
            NivelGrado nivel = null;
            ArrayList array = new ArrayList();
            while (result.next()) {
                nivel = new NivelGrado();
                nivel.setTitulo(result.getString("titulo"));
                nivel.setUniversidad(result.getString("universidad"));
                nivel.setFacultad(result.getString("facultad"));
                nivel.setAprobacion_tesis(result.getInt("aprobacion_tesis"));
                nivel.setPais(result.getString("pais"));
                nivel.setProvincia(result.getString("provincia"));
                nivel.setCiudad(result.getString("ciudad"));
                nivel.setArea_conocimiento(result.getString("area_conocimiento"));
                nivel.setConeau(result.getString("coneau"));
                nivel.setObtencion(result.getInt("obtencion"));
                nivel.setNum_nivelgrado(result.getInt("num_nivelgrado"));
                array.add(nivel);
            }
            result.close();
            smt.close();
            return array;
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelGradoDAO.findAll() " + ex);
        }
    }

    //METODO AGREGAR
    public void agregar(NivelGrado grado, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("INSERT INTO nivel_grado (titulo,universidad,facultad,aprobacion_tesis,pais,provincia,ciudad,area_conocimiento,coneau,obtencion,id_usuario) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, grado.getTitulo());
            ps.setString(2, grado.getUniversidad());
            ps.setString(3, grado.getFacultad());
            ps.setInt(4, grado.getAprobacion_tesis());
            ps.setString(5, grado.getPais());
            ps.setString(6, grado.getProvincia());
            ps.setString(7, grado.getCiudad());
            ps.setString(8, grado.getArea_conocimiento());
            ps.setString(9, grado.getConeau());
            ps.setInt(10, grado.getObtencion());
            ps.setString(11, id_usuario);
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelGradoDAO.agregar() " + ex);
        }
    }

    //METODO ACTUALIZAR
    public void actualizar(NivelGrado grado, int num_nivelgrado, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("UPDATE nivel_grado SET titulo=?, universidad=?, facultad=?, aprobacion_tesis=?, pais=?, provincia=?, ciudad=?, area_conocimiento=?, coneau=?, obtencion=?  WHERE num_nivelgrado='" + num_nivelgrado + "' and id_usuario='" + id_usuario + "'");
            ps.setString(1, grado.getTitulo());
            ps.setString(2, grado.getUniversidad());
            ps.setString(3, grado.getFacultad());
            ps.setInt(4, grado.getAprobacion_tesis());
            ps.setString(5, grado.getPais());
            ps.setString(6, grado.getProvincia());
            ps.setString(7, grado.getCiudad());
            ps.setString(8, grado.getArea_conocimiento());
            ps.setString(9, grado.getConeau());
            ps.setInt(10, grado.getObtencion());
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelGradoDAO.actualizar() " + ex);
        }
    }

    //METODO ELIMINAR
    public void eliminar(int num_nivelgrado, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            smt.executeUpdate("DELETE FROM nivel_grado WHERE num_nivelgrado='" + num_nivelgrado + "'and id_usuario='" + id_usuario + "'");
            smt.close();
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelGradoDAO.eliminar() " + ex);
        }
    }

    //METODO QUE DEVUELTE EL REGISTRO BUSCADO
    public NivelGrado buscar(int num_nivelgrado, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT titulo, universidad, facultad, aprobacion_tesis, pais, provincia, ciudad, area_conocimiento, coneau, obtencion FROM nivel_grado WHERE num_nivelgrado= '" + num_nivelgrado + "' and id_usuario='" + id_usuario + "'");
            NivelGrado nivel = null;
            while (result.next()) {
                nivel = new NivelGrado();
                nivel.setTitulo(result.getString("titulo"));
                nivel.setUniversidad(result.getString("universidad"));
                nivel.setFacultad(result.getString("facultad"));
                nivel.setAprobacion_tesis(result.getInt("aprobacion_tesis"));
                nivel.setPais(result.getString("pais"));
                nivel.setProvincia(result.getString("provincia"));
                nivel.setCiudad(result.getString("ciudad"));
                nivel.setArea_conocimiento(result.getString("area_conocimiento"));
                nivel.setConeau(result.getString("coneau"));
                nivel.setObtencion(result.getInt("obtencion"));
            }
            result.close();
            smt.close();
            return nivel;
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelGradoDAO.buscar() " + ex);
        }
    }

    //METODO QUE DEVUELTE TODOS LOS REGISTROS DE LA DB DE UN USUARIO EN PARTICULAR PARA LA INTERFACE CURRICULUM VITAE
    public Collection mostrar(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            
            ResultSet result = smt.executeQuery("Select num_nivelgrado, titulo, universidad, facultad, "
                    + "aprobacion_tesis, pais, provincia, ciudad, area_conocimiento, coneau, obtencion "
                    + "from nivel_grado "
                    + "where id_usuario='"+id_usuario+"'");
            
            NivelGrado nivel = null;
            ArrayList array = new ArrayList();
            
            while (result.next()) {
                nivel = new NivelGrado();
                
                nivel.setNum_nivelgrado(result.getInt("num_nivelgrado"));
                nivel.setTitulo(result.getString("titulo"));
                nivel.setUniversidad(result.getString("universidad"));
                nivel.setFacultad(result.getString("facultad"));
                nivel.setAprobacion_tesis(result.getInt("aprobacion_tesis"));
                nivel.setPais(result.getString("pais"));
                nivel.setProvincia(result.getString("provincia"));
                nivel.setCiudad(result.getString("ciudad"));
                nivel.setArea_conocimiento(result.getString("area_conocimiento"));
                nivel.setConeau(result.getString("coneau"));
                nivel.setObtencion(result.getInt("obtencion"));
                array.add(nivel);
            }
            result.close();
            smt.close();
            return array;
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelGradoDAO.mostrar " + ex);
        }
    }

    //METODO QUE DEVUELVE EL AÑO DE APROBACION DE TESIS
    public int aprobacion_tesis(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT MIN(aprobacion_tesis) as MIN FROM nivel_grado WHERE id_usuario= '" + id_usuario + "' ");
            int aprob = 0;
            while (result.next()) {
                aprob = result.getInt("MIN");
            }
            result.close();
            smt.close();
            return aprob;
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelGradoDAO.aprobacion_tesis() " + ex);
        }
    }
    
    public ResultSet tablaGrado(String id_usuario) {

        rs = this.conecta.Consulta("SELECT * FROM nivel_grado");
//        rs = this.conecta.Consulta("SELECT num_nivelgrado, titulo, universidad, facultad, aprobacion_tesis, pais, "
//                    + "provincia, ciudad, area_conocimiento, coneau, obtencion "
//                    + "FROM nivel_grado WHERE id_usuario= '" + id_usuario + "' ORDER BY num_nivelgrado");
        return rs;
    }

}
