package titoshotel.Views.Model;

import java.util.Arrays;
import java.util.List;

import titoshotel.Models.Entities.Pasajero;

public class PasajerosTableModel extends GenericTableModel<Pasajero> {

    public PasajerosTableModel() {
        List<String> identifiers = Arrays.asList(new String[] {
                "Nombre",
                "Apellido",
                "Telefono",
                "DNI"
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
                return String.class;
            case 1:
                return String.class;
            case 2:
                return Long.class;
            case 3:
                return Integer.class;
            default:
                throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Pasajero c = this.getDomainObject(rowIndex);
        switch (columnIndex) {
            case 0:
                return c.getNombre();
            case 1:
                return c.getApellido();
            case 2:
                return c.getTelefono();
            case 3:
                return c.getDni();
            default:
                throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'setValueAt'");
    }
}
