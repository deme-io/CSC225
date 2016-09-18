
/**
 * Write a description of class InputValidation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class InputValidation1
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        char digit;
        
        System.out.println("");
        System.out.print("Enter a single digit: ");
        digit = input.next().charAt(0);
        
        if (Character.isDigit(digit) == true)
            System.out.print("Thank you.");
        else if (Character.isLetter(digit) == true)
            System.out.print("No, that's a letter");
        else
            System.out.print("Invalid data");
    }
}
