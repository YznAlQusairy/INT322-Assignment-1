package campus;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnections {
//copy paste the url for your database
    private static final String URL = "jdbc:mysql://localhost:3306/campus_facility_db?zeroDateTimeBehavior=CONVERT_TO_NULL&useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    private static final String USER = "root";
private static final String PASSWORD = "yazan2006";
    public static Connection getConnection()
            throws SQLException {

        return DriverManager.getConnection(
            URL, USER, PASSWORD
        );
    }
}
