
/**
 * Write a description of class HourlyWage here.
 * 
 * @author Demetrius Henry 
 * @version (a version number or a date)
 */
import java.util.*;

public class HourlyWage
{
    // instance variables - replace the example below with your own
    

    /**
     * Constructor for objects of class HourlyWage
     */
    public static void main(String[]args)
    {
        // initialise instance variables
        double hourlyWage;
        double hoursWorked;
        double totalPay;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter employee's hourly wage: ");
        hourlyWage = input.nextDouble();
        
        System.out.print("Enter employee's number of hours worked: ");
        hoursWorked = input.nextDouble();
        
        totalPay = hourlyWage * hoursWorked;
        System.out.println("Employee's total pay: " + totalPay);
    }

}
