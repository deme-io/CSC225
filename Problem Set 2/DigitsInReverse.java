
/**
 * Write a description of class DigitsInReverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class DigitsInReverse
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class DigitsInReverse
     */
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        int number;
        
        System.out.print("Enter a number between 0-99999: ");
        number = input.nextInt();
        
        System.out.println(number % 10);
        number /= 10;
        
        System.out.println(number % 10);
        number /= 10;
        
        System.out.println(number % 10);
        number /= 10;
        
        System.out.println(number % 10);
        number /= 10;
        
        System.out.println(number % 10);
    }
}
