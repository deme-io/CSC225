
/**
 * Write a description of class Sphere here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Sphere
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        
        double radius;
        double surfaceArea;
        double volume;
        double pi = 3.1415926;
        
        System.out.println("");
        System.out.print("Enter radius: ");
        radius = input.nextDouble();
        
        surfaceArea = 4 * pi * (radius * radius);
        volume = 1.33333333333333333333 * pi * (radius * radius * radius);
        
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Volume: " + volume);
    }
}
