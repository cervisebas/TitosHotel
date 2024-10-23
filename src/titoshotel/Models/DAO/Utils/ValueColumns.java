package titoshotel.Models.DAO.Utils;

import java.util.ArrayList;
import java.util.List;

public class ValueColumns {
    private List<ValueColumn> list;

    public ValueColumns() {
        list = new ArrayList<ValueColumn>();
    }

    public void setValue(String c, Object v) {
        ValueColumn valueColumn = new ValueColumn();
        valueColumn.setValue(c, v);

        list.add(valueColumn);
    }

    public List<ValueColumn> getList() {
        return list;
    }
}
