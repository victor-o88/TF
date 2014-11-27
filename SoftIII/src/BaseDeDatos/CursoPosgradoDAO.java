package BaseDeDatos;

import Excepciones.DataAccessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import SiPrIn.CursoPosgrado;

public class CursoPosgradoDAO {

    BaseDatos conecta = new BaseDatos();
    private ResultSet rs;

    public CursoPosgradoDAO() {
    }

    //METODO QUE DEVUELTE TODOS LOS REGISTROS DE LA DB
    public Collection findAll() throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT * FROM curso_posgrado ORDER BY id_usuario");
            CursoPosgrado curso = null;
            ArrayList array = new ArrayList();
            while (result.next()) {
                curso = new CursoPosgrado();
                curso.setCurso(result.getString("curso"));
                curso.setUniversidad(result.getString("universidad"));
                curso.setFacultad(result.getString("facultad"));
                curso.setAnio(result.getInt("anio"));
                curso.setCarga_horaria(result.getInt("carga_horaria"));
                curso.setPais(result.getString("pais"));
                curso.setProvincia(result.getString("provincia"));
                curso.setCiudad(result.getString("ciudad"));
                curso.setArea_conocimiento(result.getString("area_conocimiento"));
                curso.setConeau(result.getString("coneau"));
                curso.setObtencion(result.getInt("obtencion"));
                curso.setNum_curso(result.getInt("num_curso"));
                array.add(curso);
            }
            result.close();
            smt.close();
            return array;
        } catch (Exception ex) {
            throw new DataAccessException("Error en CursoPosgradoDAO.findAll() " + ex);
        }
    }

    //METODO AGREGAR
    public void agregar(CursoPosgrado curso, String id_usuario) throws DataAccessException {

        try {
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("INSERT INTO curso_posgrado (curso,universidad,facultad,anio,carga_horaria,pais,provincia,ciudad,area_conocimiento,coneau,obtencion,id_usuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, curso.getCurso());
            ps.setString(2, curso.getUniversidad());
            ps.setString(3, curso.getFacultad());
            ps.setInt(4, curso.getAnio());
            ps.setInt(5, curso.getCarga_horaria());
            ps.setString(6, curso.getPais());
            ps.setString(7, curso.getProvincia());
            ps.setString(8, curso.getCiudad());
            ps.setString(9, curso.getArea_conocimiento());
            ps.setString(10, curso.getConeau());;
            ps.setInt(11, curso.getObtencion());
            ps.setString(12, id_usuario);
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en CursoPosgradoDAO.agregar() " + ex);
        }
    }

    //METODO ACTUALIZAR
    public void actualizar(CursoPosgrado curso, int num_curso, String id_usuario) throws DataAccessException {

        try {
            Connection con = BaseDatos.getInstance();
            PreparedStatement ps = con.prepareStatement("UPDATE curso_posgrado SET curso=?, universidad=?, facultad=?, anio=?,carga_horaria=?, pais=?, provincia=?, ciudad=?, area_conocimiento=?, coneau=?, obtencion=?   WHERE num_curso='" + num_curso + "' and id_usuario='" + id_usuario + "'");
            ps.setString(1, curso.getCurso());
            ps.setString(2, curso.getUniversidad());
            ps.setString(3, curso.getFacultad());
            ps.setInt(4, curso.getAnio());
            ps.setInt(5, curso.getCarga_horaria());
            ps.setString(6, curso.getPais());
            ps.setString(7, curso.getProvincia());
            ps.setString(8, curso.getCiudad());
            ps.setString(9, curso.getArea_conocimiento());
            ps.setString(10, curso.getConeau());;
            ps.setInt(11, curso.getObtencion());
            ps.execute();
        } catch (Exception ex) {
            throw new DataAccessException("Error en CursoPosgradoDAO.actualizar() " + ex);
        }
    }

    //METODO ELIMINAR
    public void eliminar(int num_curso, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            smt.executeUpdate("DELETE FROM curso_posgrado WHERE num_curso='" + num_curso + "' and id_usuario='" + id_usuario + "'");
            smt.close();
        } catch (Exception ex) {
            throw new DataAccessException("Error en CursoPosgradoDAO.eliminar() " + ex);
        }
    }

    //METODO QUE DEVUELTE EL REGISTRO BUSCADO
    public CursoPosgrado buscar(int num_curso, String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT curso, universidad, facultad, anio, carga_horaria, pais, provincia, ciudad, area_conocimiento, coneau, obtencion FROM curso_posgrado WHERE num_curso= '" + num_curso + "' and id_usuario='" + id_usuario + "'");
            CursoPosgrado curso = null;
            while (result.next()) {
                curso = new CursoPosgrado();
                curso.setCurso(result.getString("curso"));
                curso.setUniversidad(result.getString("universidad"));
                curso.setFacultad(result.getString("facultad"));
                curso.setAnio(result.getInt("anio"));
                curso.setCarga_horaria(result.getInt("carga_horaria"));
                curso.setPais(result.getString("pais"));
                curso.setProvincia(result.getString("provincia"));
                curso.setCiudad(result.getString("ciudad"));
                curso.setArea_conocimiento(result.getString("area_conocimiento"));
                curso.setConeau(result.getString("coneau"));
                curso.setObtencion(result.getInt("obtencion"));
            }
            result.close();
            smt.close();
            return curso;
        } catch (Exception ex) {
            throw new DataAccessException("Error en CursoPosgradoDAO.buscar() " + ex);
        }
    }

    //METODO QUE DEVUELTE TODOS LOS REGISTROS DE LA DB DE UN USUARIO EN PARTICULAR
    public Collection mostrar(String id_usuario) throws DataAccessException {
        try {
            Connection con = BaseDatos.getInstance();
            Statement smt = con.createStatement();
            ResultSet result = smt.executeQuery("SELECT num_curso, curso, universidad, facultad, anio, carga_horaria, "
                    + "pais, provincia, ciudad, area_conocimiento, coneau, obtencion  "
                    + "FROM curso_posgrado "
                    + "WHERE id_usuario= '" + id_usuario + "' ORDER BY num_curso");
            CursoPosgrado curso = null;
            ArrayList array = new ArrayList();
            while (result.next()) {
                
                curso = new CursoPosgrado();
                curso.setNum_curso(result.getInt("num_curso"));
                curso.setCurso(result.getString("curso"));
                curso.setUniversidad(result.getString("universidad"));
                curso.setFacultad(result.getString("facultad"));
                curso.setAnio(result.getInt("anio"));
                curso.setCarga_horaria(result.getInt("carga_horaria"));
                curso.setPais(result.getString("pais"));
                curso.setProvincia(result.getString("provincia"));
                curso.setCiudad(result.getString("ciudad"));
                curso.setArea_conocimiento(result.getString("area_conocimiento"));
                curso.setConeau(result.getString("coneau"));
                curso.setObtencion(result.getInt("obtencion"));
                
                array.add(curso);
            }
            result.close();
            smt.close();
            return array;
        } catch (Exception ex) {
            throw new DataAccessException("Error en CursoPosgradoDAO.mostrar() " + ex);
        }
    }
    
        public ResultSet tablaCP() {

        rs = this.conecta.Consulta("SELECT * FROM curso_posgrado");
        return rs;
    }

}
