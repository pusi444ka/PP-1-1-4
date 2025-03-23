package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private final static String url = "jdbc:mysql://localhost:3306/users";
    private final static String user = "root";
    private final static String password = "root";

    public static Connection getConnection() throws SQLException {
        try {
             return DriverManager.getConnection(url, user, password);
        }  catch (SQLException e) {
            throw new SQLException(e);
        }
    }
}
