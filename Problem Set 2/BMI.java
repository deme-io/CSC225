
/**
 * Write a description of class BMI here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class BMI
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class BMI
     */
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        
        double weight;
        double height;
        double BMI;
        
        System.out.println("");
        System.out.print("Enter your weight in pounds: ");
        weight = input.nextDouble();
        
        System.out.print("Enter your height in inches: ");
        height = input.nextDouble();
        
        BMI = (weight * 0.45359237) / ((height * 0.0254) * (height * 0.0254));
        
        System.out.print("Your BMI is: " + BMI);
    }
}
