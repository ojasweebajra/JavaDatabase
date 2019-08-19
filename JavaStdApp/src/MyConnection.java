import java.sql.*;

public class MyConnection {

    public static Connection getConnection(){
        String host = "jdbc:mysql://localhost:3306/stdmgdb";
        String uName = "root";
        String uPass = "abc@123";
        Connection con = null;

        try {
            con = DriverManager.getConnection(host, uName, uPass);
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }
}
