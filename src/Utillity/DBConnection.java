package Utillity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    static Connection conn=null;

    public static Connection getConnection() {
        try {
            Class.forName("org.h2.Driver");
            conn=DriverManager.getConnection("jdbc:h2:~/test", "sa", "123");
        } catch (ClassNotFoundException | SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return conn;
    }

}