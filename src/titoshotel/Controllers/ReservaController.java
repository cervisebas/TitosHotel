package titoshotel.Controllers;

import java.util.List;
import titoshotel.Models.DAO.ReservaDAO;
import titoshotel.Models.Entities.Reserva;

/**
 * Controller para administrar las reservas
 */
public class ReservaController {
    private ReservaDAO dao;

    public ReservaController() {
        dao = ReservaDAO.getInstance();
    }

    /**
     * Metodo que retorna todas las reservas
     * 
     * @return Lista de reservas
     */
    public List<Reserva> getAll() {
        return dao.getAll();
    }

    /**
     * Metodo que retorna una reserva por ID
     * 
     * @param id ID de la reserva
     * @return Retorna una reserva
     */
    public Reserva get(int id) {
        return dao.get(id);
    }

    /**
     * Metodo que guarda una reserva
     * 
     * @param data Objeto de reserva a guardar
     */
    public void save(Reserva data) {
        dao.save(data);
    }

    /**
     * Metodo que actualiza una reserva
     * 
     * @param r Objeto de reserva a actualizar
     */
    public void update(Reserva r) {
        dao.update(r);
    }

    /**
     * Metodo que elimina una reserva
     * 
     * @param id ID de la reserva a eliminar
     */
    public void remove(int id) {
        dao.remove(id);
    }
}
