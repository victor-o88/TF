package SiPrIn;

import BaseDeDatos.NivelGradoDAO;
import Excepciones.DataAccessException;
import java.util.ArrayList;
import java.util.Collection;

public class GestorNivelGrado {

    private ArrayList lista = new ArrayList();
    private NivelGradoDAO nivelgradoDAO = new NivelGradoDAO();

    public GestorNivelGrado() throws DataAccessException {
        lista = (ArrayList) nivelgradoDAO.findAll();
    }

    //AGREGAR
    public void agregar(NivelGrado nivel, String id_usuario) throws DataAccessException {
        nivelgradoDAO.agregar(nivel, id_usuario);
        lista.add(nivel);
    }

    //ACTUALIZAR
    public void actualizar(NivelGrado nivel, int num_nivelgrado, String id_usuario) throws DataAccessException {
        nivelgradoDAO.actualizar(nivel, num_nivelgrado, id_usuario);
    }

    //ELIMINAR
    public void eliminar(int num_nivelgrado, String id_usuario) throws DataAccessException {
        nivelgradoDAO.eliminar(num_nivelgrado, id_usuario);
    }

    //BUSCAR UN REGISTRO ESPECIFICO
    public NivelGrado buscar(int num_nivelgrado, String id_usuario) throws DataAccessException {
        NivelGrado buscada = nivelgradoDAO.buscar(num_nivelgrado, id_usuario);
        return buscada;
    }

    //MOSTRAR TODOS LOS REGISTROS DE UN USUARIO
    public ArrayList mostrar(String id_usuario) throws DataAccessException {
        ArrayList niveles = (ArrayList)nivelgradoDAO.mostrar(id_usuario);
        return niveles;
    }

    //METODO QUE DEVUELVE EL AÑO DE APROBACION DE TESIS
    public int aprobacion_tesis(String id_usuario) throws DataAccessException {
        int aprob = nivelgradoDAO.aprobacion_tesis(id_usuario);
        return aprob;
    }
}
