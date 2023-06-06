package u4d1.it2249;
import java.util.Scanner;
/**
 *
 * @author douglassfamily
 */
public class U4d1IT2249 {

   
    public static void main(String[] args) {
        // Create Program that reads and prints single character
        Scanner input = new Scanner(System.in);
        
        //Create display
        System.out.println("Enter One Character:");
        //Declare character type variables
        char cX = input.next().charAt(0);
        
        //Create conditions
        if (Character.isLetter(cX))
            System.out.println("You have entered a letter");
        else if (Character.isDigit(cX))
            System.out.println("You have entered a number");
        else 
            System.out.println("You have not entered a number or a letter");
    }
    
}
