package titoshotel.Controllers;

import java.util.List;
import titoshotel.Models.DAO.HabitacionDAO;
import titoshotel.Models.Entities.Habitacion;

/**
 * Controller para administrar las habitaciones
 */
public class HabitacionController {
    private HabitacionDAO dao;

    public HabitacionController() {
        dao = HabitacionDAO.getInstance();
    }

    /**
     * Metodo que retorna todas las habitaciones
     * 
     * @return Lista de habitaciones
     */
    public List<Habitacion> getAll() {
        return dao.getAll();
    }

    /**
     * Metodo que retorna una habitacion por id
     * 
     * @param id Id de la habitacion
     * @return Retorna una habitacion
     */
    public Habitacion get(int id) {
        return dao.get(id);
    }

    /**
     * Metodo que guarda una habitacion
     * 
     * @param data Objeto de habitacion a guardar
     */
    public void save(Habitacion data) {
        dao.save(data);
    }

    /**
     * Metodo que actualiza una habitacion
     * 
     * @param h Objeto de habitacion a actualizar
     */
    public void update(Habitacion h) {
        dao.update(h);
    }

    /**
     * Metodo que elimina una habitacion
     * 
     * @param id Id de la habitacion a eliminar
     */
    public void remove(int id) {
        dao.remove(id);
    }
}
