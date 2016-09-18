
/**
 * Write a description of class ChangePassword4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class ChangePassword4
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        String password;
        
        System.out.println("");
        System.out.print("Enter your password: ");
        password = input.next().trim();
        
        boolean length = password.length() == 5;
        boolean lower = !password.equals(password.toUpperCase());
        boolean upper = !password.equals(password.toLowerCase());
        boolean digit = password.matches(".*\\d+.*");
        
        if (length == false)
            System.out.println("Your password must be 5 characters long");
        
        if (lower == false)
            System.out.println("Your password must have at least one lowercase letter");
            
        if (upper == false)
            System.out.println("Your password must have at least one uppercase letter");
            
        if (digit == false)
            System.out.println("Your password must have at least one digit");
            
        if (length == true && lower == true && upper == true && digit == true)
            System.out.println("Password Changed!");
    }
}
