package titoshotel.Services;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import titoshotel.Models.ValueColumn;

public class DB {
    private String engine = "mysql";
    private String server = "localhost";
    private String port = "3306";
    private String database = "ejemplo";
    private String user = "root";
    private String password = "Calle58744";
    
    private Connection cn;

    public DB() {
        String url = "jdbc:";
        url += engine + "://";
        url += server + ":";
        url += port + "/";
        url += database + "?user=";
        url += user + "&password=";
        url += password;
        
        try {
            cn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public Integer insert(String table, List<ValueColumn> valueColumns) {
        String columns = "(";
        String values = "(";

        for (int i = 0; i < valueColumns.size(); i++) {
            columns += valueColumns.get(i).getColum();
            values += "?";
            
            try {
                valueColumns.get(i + 1);
                columns += ",";
                values += ",";
            } catch (IndexOutOfBoundsException e) {
                columns += ")";
                values += ")";
            }
        }

        String sqlInsert = "INSERT INTO ";
        sqlInsert += table;
        sqlInsert += columns;
        sqlInsert += " VALUES ";
        sqlInsert += values + ";";

        try {
            PreparedStatement pst = cn.prepareStatement(
                sqlInsert,
                Statement.RETURN_GENERATED_KEYS
            );

            for (int i = 0; i < valueColumns.size(); i++) {
                pst.setObject(
                    i + 1,
                    valueColumns.get(i).getValue()
                );
            }

            pst.execute();

            ResultSet rs = pst.getGeneratedKeys();
            
            if (rs.next())
                return rs.getInt(1);

            return -1;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
