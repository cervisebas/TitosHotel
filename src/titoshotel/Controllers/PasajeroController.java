package titoshotel.Controllers;

import java.util.List;
import titoshotel.Models.DAO.PasajeroDAO;
import titoshotel.Models.Entities.Pasajero;

public class PasajeroController {
    private PasajeroDAO dao;

    public PasajeroController() {
        dao = PasajeroDAO.getInstance();
    }

    public List<Pasajero> getAll() {
        return dao.getAll();
    }

    public Pasajero get(int id) {
        return dao.get(id);
    }

    public void save(Pasajero data) {
        dao.save(data);
    }

    public void update(Pasajero c) {
        dao.update(c);
    }

    public void remove(int id) {
        dao.remove(id);
    }
}
