import javax.xml.transform.Result;
import java.sql.*;

public class Jdbcsample {

    //DB Connection variables
    private static final String host = "jdbc:mysql://localhost:3306/stdmgdb";
    private static final String uName = "root";
    private static final String uPass = "abc@123";

    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            conn = DriverManager.getConnection(host, uName, uPass);
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs = stmt.executeQuery("SELECT * FROM student");


        } catch (SQLException err) {
            System.out.print(err);
        }


    }
}
