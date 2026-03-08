package titoshotel.Models.DAO;

import java.util.List;

import titoshotel.Interfaces.DAO;
import titoshotel.Models.DAO.Utils.ValueColumns;
import titoshotel.Models.Entities.Pasajero;
import titoshotel.Services.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PasajeroDAO implements DAO<Pasajero> {
    private String tableName = "pasajeros";

    private List<Pasajero> list;
    static private PasajeroDAO instance;

    PasajeroDAO() {
        list = new ArrayList<>();
    }

    static public PasajeroDAO getInstance() {
        if (instance == null) {
            instance = new PasajeroDAO();
        }
        return instance;
    }

    private int findIndexById(Integer id) {
        int index = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public void save(Pasajero c) {
        DB db = new DB();
        ValueColumns values = new ValueColumns();
        values.setValue("nombre", c.getNombre());
        values.setValue("apellido", c.getApellido());
        values.setValue("telefono", c.getTelefono());
        values.setValue("dni", c.getDni());

        Integer newId = db.insert(tableName, values.getList());
        c.setId(newId);
        list.add(c);
    }

    @Override
    public void update(Pasajero c) {
        DB db = new DB();
        ValueColumns values = new ValueColumns();
        values.setValue("nombre", c.getNombre());
        values.setValue("apellido", c.getApellido());
        values.setValue("telefono", c.getTelefono());
        values.setValue("dni", c.getDni());

        db.update(tableName, c.getId(), values.getList());

        int index = findIndexById(c.getId());
        if (index != -1) {
            list.set(index, c);
        }
    }

    @Override
    public void remove(Pasajero c) {
        remove(c.getId());
    }

    @Override
    public void remove(int id) {
        DB db = new DB();

        db.delete(tableName, id);
        int index = findIndexById(id);
        if (index != -1) {
            list.remove(index);
        }
    }

    @Override
    public Pasajero get(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Pasajero> getAll() {
        if (!list.isEmpty()) {
            return list;
        }

        List<Pasajero> pasajeros = new ArrayList<>();
        try {
            DB db = new DB();
            ResultSet select = db.selec(tableName);

            while (select.next()) {
                Pasajero pasajero = new Pasajero();
                pasajero.setId(select.getInt("id"));
                pasajero.setNombre(select.getString("nombre"));
                pasajero.setApellido(select.getString("apellido"));
                pasajero.setTelefono(select.getLong("telefono"));
                pasajero.setDni(select.getInt("dni"));

                pasajeros.add(pasajero);
            }

            list = pasajeros;
            return pasajeros;
        } catch (SQLException e) {
            e.printStackTrace();
            return pasajeros;
        }
    }

}
