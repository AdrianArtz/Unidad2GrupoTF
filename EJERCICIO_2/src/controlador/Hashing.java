package controlador;

import java.util.Scanner;
import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 *
 * @author K.G
 */
public class Hashing {

    // Creating a private instance
    // of Scanner class
    private static Scanner sc;

    // BCrypt is a password Hashing
    // Function based on Blowfish
    // Algorithm.
    public static String Password_Hash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }

    // Verifying password with the
    // hashed password.
    public static boolean Verify_Password(String password,String hashed_password) {
        return BCrypt.checkpw(password, hashed_password);
    }

    public static void main(String args[]) throws Exception {
        // Scanner class instance connected
        // to the Input Stream(System.in)
        sc = new Scanner(System.in);

        System.out.println("Enter the password: ");

        // Scanner class instance
        // reading the user input
        String p = sc.nextLine();

        // Generate hashed password
        String passwordHash = Password_Hash(p);

        // Print Hashed Password
        System.out.println("Hashed-password: "+ passwordHash);

        // Printing the result of verification
        // of hashed password
        // with original password
        System.out.println("Verification: "+ Verify_Password(p, passwordHash));
    }
}
