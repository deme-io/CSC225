
/**
 * Write a description of class StringSort here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class StringSort7
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        String first;
        String second;
        String third;
        String outcome;
        
        System.out.println("");
        System.out.print("Enter the first character's name: ");
        first = input.next().trim();
        
        System.out.print("Enter the second character's name: ");
        second = input.next().trim();
        
        System.out.print("Enter the third character's name: ");
        third = input.next().trim();
        
        int firstSecond = first.compareTo(second);
        int firstThird = first.compareTo(third);
        int secondThird = second.compareTo(third);
        
        if (firstSecond < 0 && firstThird < 0)
            if (secondThird < 0)
                outcome = first + ", " + second + ", " + third;
            else
                outcome = first + ", " + third + ", " + second;
        else if (secondThird < 0 && firstSecond > 0)
            if (firstThird < 0)
                outcome = second + ", " + first + ", " + second;
            else
                outcome = second + ", " + third + ", " + first;
        else
            if (firstSecond < 0)
                outcome = third + ", " + first + ", " + second;
            else
                outcome = third + ", " + second + ", " + first;
                
        System.out.print(outcome);
    }    
}
