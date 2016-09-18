
/**
 * Write a description of class SubStrings5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class SubStrings5
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        String string1;
        String string2;
        
        System.out.println("");
        System.out.print("Enter first string: ");
        string1 = input.next().trim();
        
        System.out.print("Enter secong string: ");
        string2 = input.next().trim();
        
        if (string1.toLowerCase().contains(string2.toLowerCase()) == true)
            System.out.print(string2 + " is a substring of " + string1);
        else
            System.out.print(string2 + " is not a substring of " + string1);
        
        
    }
}
