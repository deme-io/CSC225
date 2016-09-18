
/**
 * Write a description of class LowerUPPER here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class LowerUPPER2
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        char char1;
        char char2;
        char char3;
        String string;
        
        System.out.println("");
        System.out.print("Enter 3 letters: ");
        string = input.next().trim();
        char1 = string.charAt(0);
        char2 = string.charAt(1);
        char3 = string.charAt(2);
        
        if (Character.isLowerCase(char1) == true)
            char1 = Character.toUpperCase(char1);
        else
            char1 = Character.toLowerCase(char1);
            
        if (Character.isLowerCase(char2) == true)
            char2 = Character.toUpperCase(char2);
        else
            char2 = Character.toLowerCase(char2);
            
        if (Character.isLowerCase(char3) == true)
            char3 = Character.toUpperCase(char3);
        else
            char3 = Character.toLowerCase(char3);
        
        System.out.print("The string is: " + char1 + char2 + char3);
    }
}
