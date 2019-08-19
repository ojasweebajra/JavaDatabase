import java.util.Scanner;
import java.sql.*;

public class CRUD {
    public void addToDB(){
        Scanner input = new Scanner(System.in);

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

        if (password.equals(conPassword)){

            System.out.print("Your details have been added to the ");
        } else {
            System.out.println("Incorrect password, please try again.");
            addToDB();
        }
    }
}
