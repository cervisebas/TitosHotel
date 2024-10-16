package titoshotel.Models;

public class ValueColumn {
    private String column;
    private Object value;

    public void setValue(String c, Object v) {
        column = c;
        value = v;
    }

    public String getColum() {
        return column;
    }

    public Object getValue() {
        return value;
    }
}
