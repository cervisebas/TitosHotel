package Views.Model;

import java.util.Arrays;
import java.util.List;
import model.entities.Habitaciones;

public class HabitacionesTableModel extends GenericTableModel<Habitaciones>{
    
    public HabitacionesTableModel() {
        List<String> identifiers = Arrays.asList(new String[]{
            "Id",
            "Numero",
            "Camas simples",
            "Camas dobles",
            "Precio"
        });
        this.setColumnIdentifiers(identifiers);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0: return Long.class;
            case 1: return Long.class;
            case 2: return String.class;
            case 3: return String.class;
            case 4: return Float.class;
            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Habitaciones c = this.getDomainObject(rowIndex);
        switch (columnIndex) {
            case 0: return c.getId();
            case 1: return c.getNumero();
            case 2: return c.getCamasSimples();
            case 3: return c.getCamasDobles();
            case 4: return c.getPrecio();
            default: throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Unimplemented method 'setValueAt'");
    }
}
