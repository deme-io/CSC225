
/**
 * Write a description of class Wrapped6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;

public class Wrapped6
{
    public static void main(String[]args)
    {
        // initialise instance variables
        Scanner input = new Scanner(System.in);
        String wrap;
        String word;
        String wrap1;
        String wrap2;
        
        System.out.println("");
        System.out.print("Enter wrap: ");
        wrap = input.next().trim();
        
        System.out.print("Enter word: ");
        word = input.next().trim();
        
        wrap1 = wrap.substring(0, (wrap.length()/2));
        wrap2 = wrap.substring((wrap.length()/2), wrap.length());
        
        System.out.print(wrap1 + word + wrap2);
    }
}
