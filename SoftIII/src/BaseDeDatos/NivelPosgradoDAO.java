package BaseDeDatos;

import Excepciones.DataAccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import SiPrIn.NivelPosgrado;

public class NivelPosgradoDAO {
    BaseDatos conecta = new BaseDatos();
    private ResultSet rs;

    public NivelPosgradoDAO() {
    }

    //METODO QUE DEVUELTE TODOS LOS REGISTROS DE LA DB
    public Collection findAll() throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT * FROM nivel_posgrado ORDER BY num_nivelposgrado");
            NivelPosgrado posgrado = null;
            ArrayList array = new ArrayList();
            while (result.next()) {
                posgrado = new NivelPosgrado();
                posgrado.setNivel_posgrado(result.getString("nivel_posgrado"));
                posgrado.setTitulo(result.getString("titulo"));
                posgrado.setUniversidad(result.getString("universidad"));
                posgrado.setFacultad(result.getString("facultad"));
                posgrado.setAprobacion_tesis(result.getInt("aprobacion_tesis"));
                posgrado.setPais(result.getString("pais"));
                posgrado.setProvincia(result.getString("provincia"));
                posgrado.setCiudad(result.getString("ciudad"));
                posgrado.setArea_conocimiento(result.getString("area_conocimiento"));
                posgrado.setConeau(result.getString("coneau"));
                posgrado.setObtencion(result.getInt("obtencion"));
                posgrado.setNum_nivelposgrado(result.getInt("num_nivelposgrado"));
                array.add(posgrado);
            }
            result.close();
            smt.close();
            return array;
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelPosgradoDAO.findAll() " + ex);
        }
    }

    //AGREGAR
    public void agregar(NivelPosgrado posgrado, String id_usuario) throws DataAccessException {

        try {
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("INSERT INTO nivel_posgrado (nivel_posgrado,titulo,universidad,facultad,aprobacion_tesis,pais,provincia,ciudad,area_conocimiento,coneau,obtencion,id_usuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, posgrado.getNivel_posgrado());
            ps.setString(2, posgrado.getTitulo());
            ps.setString(3, posgrado.getUniversidad());
            ps.setString(4, posgrado.getFacultad());
            ps.setInt(5, posgrado.getAprobacion_tesis());
            ps.setString(6, posgrado.getPais());
            ps.setString(7, posgrado.getProvincia());
            ps.setString(8, posgrado.getCiudad());
            ps.setString(9, posgrado.getArea_conocimiento());
            ps.setString(10, posgrado.getConeau());;
            ps.setInt(11, posgrado.getObtencion());
            ps.setString(12, id_usuario);
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelPosgradoDAO.agregar() " + ex);
        }
    }

    //METODO ACTUALIZAR
    public void actualizar(NivelPosgrado posgrado, int num_nivelposgrado, String id_usuario) throws DataAccessException {

        try {
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("UPDATE nivel_posgrado SET nivel_posgrado=?, titulo=?, universidad=?, facultad=?, aprobacion_tesis=?, pais=?, provincia=?, ciudad=?, area_conocimiento=?, coneau=?, obtencion=? WHERE num_nivelposgrado='" + num_nivelposgrado + "'and id_usuario='" + id_usuario + "'");
            ps.setString(1, posgrado.getNivel_posgrado());
            ps.setString(2, posgrado.getTitulo());
            ps.setString(3, posgrado.getUniversidad());
            ps.setString(4, posgrado.getFacultad());
            ps.setInt(5, posgrado.getAprobacion_tesis());
            ps.setString(6, posgrado.getPais());
            ps.setString(7, posgrado.getProvincia());
            ps.setString(8, posgrado.getCiudad());
            ps.setString(9, posgrado.getArea_conocimiento());
            ps.setString(10, posgrado.getConeau());
            ps.setInt(11, posgrado.getObtencion());
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelPosgradoDAO.actualizar() " + ex);
        }
    }

    //METODO ELIMINAR
    public void eliminar(int num_nivelposgrado, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            smt.executeUpdate("DELETE FROM nivel_posgrado WHERE num_nivelposgrado='" + num_nivelposgrado + "'and id_usuario='" + id_usuario + "'");
            smt.close();
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelPosradoDAO.eliminar() " + ex);
        }
    }

    //METODO QUE DEVUELTE EL REGISTRO BUSCADO
    public NivelPosgrado buscar(int num_nivelposgrado, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT nivel_posgrado, titulo, universidad, facultad, aprobacion_tesis, pais, provincia, ciudad, area_conocimiento, coneau, obtencion FROM nivel_posgrado WHERE num_nivelposgrado= '" + num_nivelposgrado + "' and id_usuario='" + id_usuario + "'");
            NivelPosgrado posgrado = null;
            while (result.next()) {
                posgrado = new NivelPosgrado();
                posgrado.setNivel_posgrado(result.getString("nivel_posgrado"));
                posgrado.setTitulo(result.getString("titulo"));
                posgrado.setUniversidad(result.getString("universidad"));
                posgrado.setFacultad(result.getString("facultad"));
                posgrado.setAprobacion_tesis(result.getInt("aprobacion_tesis"));
                posgrado.setPais(result.getString("pais"));
                posgrado.setProvincia(result.getString("provincia"));
                posgrado.setCiudad(result.getString("ciudad"));
                posgrado.setArea_conocimiento(result.getString("area_conocimiento"));
                posgrado.setConeau(result.getString("coneau"));
                posgrado.setObtencion(result.getInt("obtencion"));
            }
            result.close();
            smt.close();
            return posgrado;
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelPosgradoDAO.buscar() " + ex);
        }
    }

    //METODO QUE DEVUELTE TODOS LOS REGISTROS DE LA DB DE UN USUARIO EN PARTICULAR
    public Collection mostrar(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT num_nivelposgrado, nivel_posgrado, titulo, universidad, facultad, "
                    + "aprobacion_tesis, pais, provincia, ciudad, area_conocimiento, coneau, obtencion "
                    + "FROM nivel_posgrado "
                    + "WHERE id_usuario= '" + id_usuario + "' ORDER BY num_nivelposgrado");
            NivelPosgrado posgrado = null;
            ArrayList array = new ArrayList();
            while (result.next()) {
                posgrado = new NivelPosgrado();
                posgrado.setNum_nivelposgrado(result.getInt("num_nivelposgrado"));
                posgrado.setNivel_posgrado(result.getString("nivel_posgrado"));
                posgrado.setTitulo(result.getString("titulo"));
                posgrado.setUniversidad(result.getString("universidad"));
                posgrado.setFacultad(result.getString("facultad"));
                posgrado.setAprobacion_tesis(result.getInt("aprobacion_tesis"));
                posgrado.setPais(result.getString("pais"));
                posgrado.setProvincia(result.getString("provincia"));
                posgrado.setCiudad(result.getString("ciudad"));
                posgrado.setArea_conocimiento(result.getString("area_conocimiento"));
                posgrado.setConeau(result.getString("coneau"));
                posgrado.setObtencion(result.getInt("obtencion"));
                
                array.add(posgrado);
            }
            result.close();
            smt.close();
            return array;
        } catch (Exception ex) {
            throw new DataAccessException("Error en NivelPosgradoDAO.mostrar() " + ex);
        }
    }
    
    public ResultSet tablaPosgrado() {

        rs = this.conecta.Consulta("SELECT * FROM nivel_posgrado");
        return rs;
    }

}
