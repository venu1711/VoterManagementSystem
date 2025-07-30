package dao;

import java.sql.*;

// For JDBC connection
public class DBUtil {
    public static Connection conn = null;
    public static PreparedStatement pmst = null;

    public void connect() throws SQLException {
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/project5_db","root","venu1711");
            pmst = (PreparedStatement) conn.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
