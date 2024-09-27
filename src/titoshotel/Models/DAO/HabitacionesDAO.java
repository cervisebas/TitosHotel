package titoshotel.Models.DAO;

import java.util.List;

import titoshotel.Interfaces.DAO;
import titoshotel.Models.ValueColumns;
import titoshotel.Models.Entities.Habitaciones;
import titoshotel.Services.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HabitacionesDAO implements DAO<Habitaciones> {
    @Override
    public void save(Habitaciones c) {
        DB db = new DB();
        ValueColumns list = new ValueColumns();
        list.setValue("numero", c.getNumero());
        list.setValue("camasSimples", c.getCamasSimples());
        list.setValue("camasDobles", c.getCamasDobles());
        list.setValue("precio", c.getPrecio());

        db.insert("habitaciones", list.getList());
    }

    @Override
    public void update(Habitaciones c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void remove(Habitaciones c) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void remove(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public Habitaciones get(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Habitaciones> getAll() {
        List<Habitaciones> habitaciones = new ArrayList<Habitaciones>();
        try {
            DB db = new DB();
            ResultSet select = db.selec("habitaciones");

            while (select.next()) {
                Habitaciones habitacion = new Habitaciones();
                habitacion.setId(select.getInt("id"));
                habitacion.setNumero(select.getInt("numero"));
                habitacion.setPrecio(select.getDouble("precio"));
                habitacion.setCamasSimples(select.getInt("camasSimples"));
                habitacion.setCamasDobles(select.getInt("camasDobles"));

                habitaciones.add(habitacion);
            }

            return habitaciones;
        } catch (SQLException e) {
            e.printStackTrace();
            return habitaciones;
        }
    }
    
}
