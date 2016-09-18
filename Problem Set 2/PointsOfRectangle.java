
/**
 * Write a description of class PointsOfRectangle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class PointsOfRectangle
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class PointsOfRectangle
     */
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        double x;
        double y;
        double width;
        double height;
        
        System.out.println("");
        System.out.print("Enter x of the Bottom Left Point: ");
        x = input.nextDouble();
        
        System.out.print("Enter y of the Bottom Left Point: ");
        y = input.nextDouble();
        
        System.out.print("Enter the width: ");
        width = input.nextDouble();
        
        System.out.print("Enter the height: ");
        height = input.nextDouble();
        
        System.out.println("");
        System.out.println("Bottom Left: (" + x + ", " + y + ")");
        System.out.println("Bottom Right: (" + (x + width) + ", " + y + ")");
        System.out.println("Top Left: (" + x + ", " + (y + height) + ")");
        System.out.println("Top Right: (" + (x + width)+ ", " + (y + height) + ")");
    }
}
