package titoshotel.Views.Model;

import java.util.Arrays;
import java.util.List;

import titoshotel.Models.Entities.Habitaciones;

public class HabitacionesTableModel extends GenericTableModel<Habitaciones>{
    
    public HabitacionesTableModel() {
        List<String> identifiers = Arrays.asList(new String[]{
            "Numero",
            "Camas simples",
            "Camas dobles",
            "Precio"
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
            case 0: return Long.class;
            case 1: return String.class;
            case 2: return String.class;
            case 3: return Float.class;
            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Habitaciones c = this.getDomainObject(rowIndex);
        switch (columnIndex) {
            case 0: return c.getNumero();
            case 1: return c.getCamasSimples();
            case 2: return c.getCamasDobles();
            case 3: return c.getPrecio();
            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'setValueAt'");
    }
}
