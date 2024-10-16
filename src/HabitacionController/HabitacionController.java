package HabitacionController;

import java.util.List;
import titoshotel.Models.DAO.HabitacionDAO;
import titoshotel.Models.Entities.Habitacion;

public class HabitacionController {
    private HabitacionDAO dao;
    
    public HabitacionController() {
        dao = HabitacionDAO.getInstance();
    }
    
    public List<Habitacion> getAll() {
        return dao.getAll();
    }
    
    public void save(Habitacion data) {
        dao.save(data);
    }
    
    public void update(Habitacion c) {
        dao.update(c);
    }
    
    public void remove(int id) {
        dao.remove(id);
    }
}
