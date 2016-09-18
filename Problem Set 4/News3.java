
/**
 * Write a description of class News here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class News3
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        String north = "^";
        String east = ">";
        String south = "v";
        String west = "<";
        String direction;
        
        System.out.println("");
        System.out.print("Enter a direction: ");
        direction = input.next().trim();
        
        if (direction.equalsIgnoreCase("north"))
            System.out.print(north);
        else if (direction.equalsIgnoreCase("south"))
            System.out.print(south);
        else if (direction.equalsIgnoreCase("east"))
            System.out.print(east);
        else if (direction.equalsIgnoreCase("west"))
            System.out.print(west);
        else
            System.out.print("Invalid direction: " + direction);
        
    }
}
