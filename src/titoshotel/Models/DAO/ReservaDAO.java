package titoshotel.Models.DAO;

import java.util.List;

import titoshotel.Interfaces.DAO;
import titoshotel.Models.DAO.Utils.ValueColumns;
import titoshotel.Models.Entities.Reserva;
import titoshotel.Services.DB;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import titoshotel.Controllers.HabitacionController;
import titoshotel.Controllers.PasajeroController;

public class ReservaDAO implements DAO<Reserva> {
    private String tableName = "reservas";

    private List<Reserva> list;
    static private ReservaDAO instance;

    ReservaDAO() {
        list = new ArrayList<>();
    }

    static public ReservaDAO getInstance() {
        if (instance == null) {
            instance = new ReservaDAO();
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
    public void save(Reserva c) {
        DB db = new DB();
        ValueColumns values = new ValueColumns();
        values.setValue("numero", c.getNumero());
        values.setValue("fecha_desde", c.getFechaDesde());
        values.setValue("fecha_hasta", c.getFechaHasta());
        values.setValue("habitacion_id", c.getOHabitacion().getId());
        values.setValue("pasajero_id", c.getOPasajero().getId());
        values.setValue("precio", c.getPrecio());
        values.setValue("anticipo", c.getAnticipo());

        Integer newId = db.insert(tableName, values.getList());
        c.setId(newId);
        list.add(c);
    }

    @Override
    public void update(Reserva c) {
        DB db = new DB();
        ValueColumns values = new ValueColumns();
        values.setValue("numero", c.getNumero());
        values.setValue("fecha_desde", c.getFechaDesde());
        values.setValue("fecha_hasta", c.getFechaHasta());
        values.setValue("habitacion_id", c.getOHabitacion().getId());
        values.setValue("pasajero_id", c.getOPasajero().getId());
        values.setValue("precio", c.getPrecio());
        values.setValue("anticipo", c.getAnticipo());

        db.update(tableName, c.getId(), values.getList());

        int index = findIndexById(c.getId());
        if (index != -1) {
            list.set(index, c);
        }
    }

    @Override
    public void remove(Reserva c) {
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
    public Reserva get(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'get'");
    }

    @Override
    public List<Reserva> getAll() {
        if (!list.isEmpty()) {
            return list;
        }

        List<Reserva> reservas = new ArrayList<>();
        try {
            DB db = new DB();
            ResultSet select = db.selec(tableName);

            HabitacionController hc = new titoshotel.Controllers.HabitacionController();
            PasajeroController pc = new titoshotel.Controllers.PasajeroController();

            while (select.next()) {
                Reserva reserva = new Reserva();
                reserva.setId(select.getInt("id"));
                reserva.setNumero(select.getInt("numero"));
                reserva.setFechaDesde(select.getDate("fecha_desde"));
                reserva.setFechaHasta(select.getDate("fecha_hasta"));
                reserva.setPrecio(select.getFloat("precio"));
                reserva.setAnticipo(select.getFloat("anticipo"));

                int habitacionId = select.getInt("habitacion_id");
                if (!select.wasNull()) {
                    reserva.setOHabitacion(hc.get(habitacionId));
                }

                int pasajeroId = select.getInt("pasajero_id");
                if (!select.wasNull()) {
                    reserva.setOPasajero(pc.get(pasajeroId));
                }

                reservas.add(reserva);
            }

            list = reservas;
            return reservas;
        } catch (SQLException e) {
            e.printStackTrace();
            return reservas;
        }
    }

}
