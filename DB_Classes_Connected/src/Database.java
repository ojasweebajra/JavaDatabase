import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Database {
    Connection conn = null;

    public static void main(String[] args) {
        //Establish a connection:
        String host = "jdbc:mysql://localhost:3306/users";
        String uName = "root";
        String uPass = "abc@123";
        Scanner input = new Scanner(System.in);

        try {
            Connection conn = DriverManager.getConnection(host, uName, uPass);
            System.out.print("Enter your first name: ");
            String name = input.next();
            System.out.print("Enter your last name: ");
            String surname = input.next();
            System.out.print("Enter your date of birth: ");
            String dob = input.next();
            System.out.print("Enter your email: ");
            String email = input.next();
            System.out.print("Password: ");
            String password = input.next();
            System.out.print("Re enter password: ");
            String conPassword = input.next();

            if (password.equals(conPassword)) {

                try {
                    Statement stmt = conn.createStatement();
                    String SQLInsert = "insert into users.end_users " + "(First_Name, Last_Name, DOB, Email, Password)" + " values (?,?,?,?,?)";

                    PreparedStatement pstmt = conn.prepareStatement(SQLInsert);
                    pstmt.setString(1, name);
                    pstmt.setString(2, surname);
                    pstmt.setString(3, dob);
                    pstmt.setString(4, email);
                    pstmt.setString(5, password);

                    pstmt.execute();

                    conn.close();
                    System.out.print("Your details have been added to the ");
                } catch (SQLException err) {
                    err.printStackTrace();
                }

            } else {
                System.out.println("Incorrect password, please try again.");
            }
//            addToDB();
        } catch (SQLException err) {
            System.out.println(err.getMessage());
        }
    }

//    private void addToDB() {
//        System.out.print("Enter your first name: ");
//        String name = input.next();
//        System.out.print("Enter your last name: ");
//        String surname = input.next();
//        System.out.print("Enter your date of birth: ");
//        String dob = input.next();
//        System.out.print("Enter your email: ");
//        String email = input.next();
//        System.out.print("Password: ");
//        String password = input.next();
//        System.out.print("Re enter password: ");
//        String conPassword = input.next();
//
//        if (password.equals(conPassword)) {
//
//            try {
//                Statement stmt = conn.createStatement();
//                String SQLInsert = "insert into users.end_users " + "(First_Name, Last_Name, DOB, Email, Password)" + " values (?,?,?,?,?)";
//
//                PreparedStatement pstmt = conn.prepareStatement(SQLInsert);
//                pstmt.setString(1, name);
//                pstmt.setString(2, surname);
//                pstmt.setString(3, dob);
//                pstmt.setString(4, email);
//                pstmt.setString(5, password);
//
//                pstmt.execute();
//
//                conn.close();
//                System.out.print("Your details have been added to the ");
//            } catch (SQLException err) {
//                err.printStackTrace();
//            }
//
//        } else {
//            System.out.println("Incorrect password, please try again.");
//            addToDB();
//        }
//    }
}

