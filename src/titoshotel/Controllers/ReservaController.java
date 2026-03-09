package titoshotel.Controllers;

import java.util.List;
import titoshotel.Models.DAO.ReservaDAO;
import titoshotel.Models.Entities.Reserva;

public class ReservaController {
    private ReservaDAO dao;

    public ReservaController() {
        dao = ReservaDAO.getInstance();
    }

    public List<Reserva> getAll() {
        return dao.getAll();
    }

    public void save(Reserva data) {
        dao.save(data);
    }

    public void update(Reserva c) {
        dao.update(c);
    }

    public void remove(int id) {
        dao.remove(id);
    }
}
