package titoshotel.Controllers;

import java.util.List;
import titoshotel.Models.DAO.PasajeroDAO;
import titoshotel.Models.Entities.Pasajero;

/**
 * Controller para administrar los pasajeros
 */
public class PasajeroController {
    private PasajeroDAO dao;

    public PasajeroController() {
        dao = PasajeroDAO.getInstance();
    }

    /**
     * Metodo que retorna todos los pasajeros
     * 
     * @return Lista de pasajeros
     */
    public List<Pasajero> getAll() {
        return dao.getAll();
    }

    /**
     * Metodo que retorna un pasajero por id
     * 
     * @param id Id del pasajero
     * @return Retorna un pasajero
     */
    public Pasajero get(int id) {
        return dao.get(id);
    }

    /**
     * Metodo que guarda un pasajero
     * 
     * @param data Objeto de pasajero a guardar
     */
    public void save(Pasajero data) {
        dao.save(data);
    }

    /**
     * Metodo que actualiza un pasajero
     * 
     * @param p Objeto de pasajero a actualizar
     */
    public void update(Pasajero p) {
        dao.update(p);
    }

    /**
     * Metodo que elimina un pasajero
     * 
     * @param id Id del pasajero a eliminar
     */
    public void remove(int id) {
        dao.remove(id);
    }
}
