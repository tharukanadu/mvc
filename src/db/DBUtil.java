package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static DBUtil dbUtil=null;
    private Connection connection;
    private DBUtil() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/Student",
                "root",
                "1234"
        );
    }
    public static DBUtil getInstance() throws SQLException, ClassNotFoundException {
        if (dbUtil==null){
            dbUtil=new DBUtil();
        }
        return dbUtil;
    }
    public Connection getConnection(){
        return this.connection;
    }
}
