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
    
    static private Connection cn;

    public DB() {
        String url = "jdbc:";
        url += engine + "://";
        url += server + ":";
        url += port + "/";
        url += database + "?user=";
        url += user + "&password=";
        url += password;
        
        try {
            if (cn == null) {
                cn = DriverManager.getConnection(url);
            }
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

    private String makeWhere(List<ValueColumn> valueColumns) {
        String where = "";

        for (int i = 0; i < valueColumns.size(); i++) {
            where += "`" + valueColumns.get(i).getColum() + "` = ?";

            try {
                valueColumns.get(i + 1);
                where += ", ";
            } catch (IndexOutOfBoundsException e) {
                where += ";";
            }
        }

        return where;
    }

    public ResultSet select(String table, List<ValueColumn> where) {
        String sqlSelect = "SELECT * FROM ";
        sqlSelect += "`" + table + "` WHERE ";
        sqlSelect += makeWhere(where);

        try {
            PreparedStatement pst = cn.prepareStatement(sqlSelect);

            for (int i = 0; i < where.size(); i++) {
                pst.setObject(i, where.get(i).getValue());
            }

            pst.execute();

            return pst.getResultSet();
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ResultSet selec(String table) {
        String sqlSelect = "SELECT * FROM ";
        sqlSelect += "`" + table + "`;";

        try {
            Statement pst = cn.createStatement();
            
            return pst.executeQuery(sqlSelect);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void delete(String table, Integer id) {
        String sqlSelect = "DELETE FROM ";
        sqlSelect += "`" + table + "` WHERE `id` = ?";

        try {
            PreparedStatement pst = cn.prepareStatement(sqlSelect);
            pst.setInt(1, id);
            
            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(String table, Integer id, List<ValueColumn> valueColumns) {
        String sqlUpdate = "UPDATE `";
        sqlUpdate += table + "` SET ";

        for (int i = 0; i < valueColumns.size(); i++) {
            sqlUpdate += valueColumns.get(i).getColum();
            sqlUpdate += " = ?";
            
            try {
                valueColumns.get(i + 1);
                sqlUpdate += ",";
            } catch (IndexOutOfBoundsException e) {
                sqlUpdate += " WHERE `id` = ";
                sqlUpdate += id.toString();
                sqlUpdate += ";";
            }
        }

        try {
            PreparedStatement pst = cn.prepareStatement(sqlUpdate);

            for (int i = 0; i < valueColumns.size(); i++) {
                pst.setObject(
                    i + 1,
                    valueColumns.get(i).getValue()
                );
            }

            pst.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
