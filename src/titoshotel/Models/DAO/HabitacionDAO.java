package titoshotel.Models.DAO;

import java.util.List;

import titoshotel.Interfaces.DAO;
import titoshotel.Models.DAO.Utils.ValueColumns;
import titoshotel.Models.Entities.Habitacion;
import titoshotel.Services.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HabitacionDAO implements DAO<Habitacion> {
    private String tableName = "habitaciones";
    
    private List<Habitacion> list;
    static private HabitacionDAO instance;
    
    HabitacionDAO() {
        list = new ArrayList<>();
    }
    
    static public HabitacionDAO getInstance() {
        if (instance == null) {
            instance = new HabitacionDAO();
        }
        return instance;
    }
    
    private int findIndexById(Integer id) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void save(Habitacion c) {
        DB db = new DB();
        ValueColumns values = new ValueColumns();
        values.setValue("numero", c.getNumero());
        values.setValue("camas_simples", c.getCamasSimples());
        values.setValue("camas_dobles", c.getCamasDobles());
        values.setValue("precio", c.getPrecio());

        Integer newId = db.insert(tableName, values.getList());
        c.setId(newId);
        list.add(c);
    }

    @Override
    public void update(Habitacion c) {
        DB db = new DB();
        ValueColumns values = new ValueColumns();
        values.setValue("numero", c.getNumero());
        values.setValue("camas_simples", c.getCamasSimples());
        values.setValue("camas_dobles", c.getCamasDobles());
        values.setValue("precio", c.getPrecio());
 
        db.update(tableName, c.getId(), values.getList());
        
        list.set(
            findIndexById(c.getId()),
            c
        );
    }

    @Override
    public void remove(Habitacion c) {
        remove(c.getId());
    }

    @Override
    public void remove(int id) {
        DB db = new DB();

        db.delete(tableName, id);
        list.remove(findIndexById(id));
    }

    @Override
    public Habitacion get(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Habitacion> getAll() {
        if (!list.isEmpty()) {
            return list;
        }
        
        
        List<Habitacion> habitaciones = new ArrayList<>();
        try {
            DB db = new DB();
            ResultSet select = db.selec(tableName);

            while (select.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setId(select.getInt("id"));
                habitacion.setNumero(select.getInt("numero"));
                habitacion.setPrecio(select.getDouble("precio"));
                habitacion.setCamasSimples(select.getInt("camas_simples"));
                habitacion.setCamasDobles(select.getInt("camas_dobles"));

                habitaciones.add(habitacion);
            }

            list = habitaciones;
            return habitaciones;
        } catch (SQLException e) {
            e.printStackTrace();
            return habitaciones;
        }
    }
    
}
