
package SiPrIn;

import BaseDeDatos.CursoPosgradoDAO;
import Excepciones.DataAccessException;
import java.util.ArrayList;
import java.util.Collection;

public class GestorCursoPosgrado {
        
    private ArrayList lista = new ArrayList();
    private CursoPosgradoDAO cursoposgradoDAO = new CursoPosgradoDAO();
    
    public GestorCursoPosgrado() throws DataAccessException {
        lista=(ArrayList)cursoposgradoDAO.findAll();
    }
    
    //AGREGAR
    public void agregar (CursoPosgrado curso, String id_usuario) throws DataAccessException{
        cursoposgradoDAO.agregar(curso, id_usuario);
        lista.add(curso);
    }
        
    //ACTUALIZAR
    public void actualizar (CursoPosgrado curso, int num_curso, String id_usuario) throws DataAccessException{
        cursoposgradoDAO.actualizar(curso,num_curso, id_usuario);
    }
    
    //ELIMINAR
    public void eliminar (int num_curso, String id_usuario) throws DataAccessException{
        cursoposgradoDAO.eliminar(num_curso, id_usuario);
    }
    
    //BUSCAR UN REGISTRO ESPECIFICO
    public CursoPosgrado buscar (int num_curso, String id_usuario) throws DataAccessException{
        CursoPosgrado buscada = cursoposgradoDAO.buscar(num_curso, id_usuario);
        return buscada;
    }
    
    //MOSTRAR TODOS LOS REGISTROS DE UN USUARIO
    public Collection mostrar(String id_usuario) throws DataAccessException {
        Collection niveles = cursoposgradoDAO.mostrar(id_usuario);
        return niveles;
    }
    
}
