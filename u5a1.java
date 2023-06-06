package u5a1;
import java.util.Scanner;
/**
 *
 * @author nathanieldouglass
 */
public class U5A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Find highest and lowest of five intergers
            // Define how many times to run loop
            final int EntryCount = 5;
        
            Scanner input = new Scanner(System.in);
            
            // Define highest to lowest possible value
            int highest = Integer.MIN_VALUE;
            // Define lowest to highest possible value
            int lowest = Integer.MAX_VALUE;     
            
            System.out.print("Enter five integers: ");
            
            // "for" loop used as the number of times it will run is defined
            for(int i=0; i<EntryCount; ++i){
                // nextInt to read next integer until space or end of line
                int number = input.nextInt();
             
                // Verify number is lower than lowest
                if(number < lowest) {
                lowest = number; 
                }
                // Verify number is higher than highest
                if(number > highest) {
                highest = number; 
                }
            }      

            
            System.out.println("Highest Interger is " + highest);
            System.out.println("Lowest Interger is " + lowest);
    }
    
}
