
package SiPrIn;

import BaseDeDatos.NivelPosgradoDAO;
import Excepciones.DataAccessException;
import java.util.ArrayList;
import java.util.Collection;


public class GestorNivelPosgrado {
    
    private ArrayList lista = new ArrayList();
    private NivelPosgradoDAO nivelposgradoDAO = new NivelPosgradoDAO();
    
    public GestorNivelPosgrado() throws DataAccessException {
        lista=(ArrayList)nivelposgradoDAO.findAll();
    }
    
    //AGREGAR
    public void agregar (NivelPosgrado posgrado, String id_usuario) throws DataAccessException{
        nivelposgradoDAO.agregar(posgrado, id_usuario);
        lista.add(posgrado);
    }
        
    //ACTUALIZAR
    public void actualizar (NivelPosgrado posgrado, int num_nivelposgrado, String id_usuario) throws DataAccessException{//VER
        nivelposgradoDAO.actualizar(posgrado,num_nivelposgrado, id_usuario);
    }
    
    //ELIMINAR
    public void eliminar (int num_nivelposgrado, String id_usuario) throws DataAccessException{
        nivelposgradoDAO.eliminar(num_nivelposgrado, id_usuario);
    }
    
    //BUSCAR UN REGISTRO ESPECIFICO
    public NivelPosgrado buscar (int num_nivelgrado, String id_usuario) throws DataAccessException{
        NivelPosgrado buscada = nivelposgradoDAO.buscar(num_nivelgrado, id_usuario);
        return buscada;
    }
    
    //MOSTRAR TODOS LOS REGISTROS DE UN USUARIO
    public Collection mostrar(String id_usuario) throws DataAccessException {
        Collection niveles = nivelposgradoDAO.mostrar(id_usuario);
        return niveles;
    }
    
    
}
