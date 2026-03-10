package titoshotel.Views.Model;

import titoshotel.Models.Entities.Disponibilidad;
import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.Date;

public class DisponibilidadesTableModel extends AbstractTableModel {
    private List<Disponibilidad> listTable = new ArrayList<>();
    private final String[] columnNames = {
            "Nro Habitación",
            "Camas Simples",
            "Camas Dobles",
            "Precio",
            "Fecha Desde",
            "Fecha Hasta"
    };

    public DisponibilidadesTableModel() {
    }

    @Override
    public int getRowCount() {
        return listTable.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return Integer.class;
            case 1:
                return Integer.class;
            case 2:
                return Integer.class;
            case 3:
                return Double.class;
            case 4:
                return Date.class;
            case 5:
                return Date.class;
            default:
                throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Disponibilidad d = this.getDomainObject(rowIndex);
        switch (columnIndex) {
            case 0:
                return d.getOHabitacion() != null ? d.getOHabitacion().getNumero() : null;
            case 1:
                return d.getOHabitacion() != null ? d.getOHabitacion().getCamasSimples() : null;
            case 2:
                return d.getOHabitacion() != null ? d.getOHabitacion().getCamasDobles() : null;
            case 3:
                return d.getOHabitacion() != null ? d.getOHabitacion().getPrecio() : null;
            case 4:
                return d.getFechaDesde();
            case 5:
                return d.getFechaHasta();
            default:
                throw new ArrayIndexOutOfBoundsException(columnIndex);
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
    }

    public Disponibilidad getDomainObject(int row) {
        return listTable.get(row);
    }

    public void addRow(Disponibilidad record) {
        listTable.add(record);
        fireTableDataChanged();
    }

    public void clearTableModelData() {
        listTable.clear();
        fireTableDataChanged();
    }
}
