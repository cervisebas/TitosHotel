package titoshotel.Views.Model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import titoshotel.Models.Entities.Reserva;

public class ReservasTableModel extends GenericTableModel<Reserva> {

    public ReservasTableModel() {
        List<String> identifiers = Arrays.asList(new String[] {
                "Numero",
                "Fecha Desde",
                "Fecha Hasta",
                "Habitacion",
                "Pasajero",
                "Precio",
                "Anticipo"
        });
        this.setColumnIdentifiers(identifiers);
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Date.class;
            case 2:
                return Date.class;
            case 3:
                return Integer.class;
            case 4:
                return Integer.class;
            case 5:
                return Float.class;
            case 6:
                return Float.class;
            default:
                throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Reserva c = this.getDomainObject(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getNumero();
            case 1:
                return c.getFechaDesde();
            case 2:
                return c.getFechaHasta();
            case 3:
                return (c.getOHabitacion() != null) ? c.getOHabitacion().toString() : null;
            case 4:
                return (c.getOPasajero() != null) ? c.getOPasajero().toString() : null;
            case 5:
                return c.getPrecio();
            case 6:
                return c.getAnticipo();
            default:
                throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'setValueAt'");
    }
}
