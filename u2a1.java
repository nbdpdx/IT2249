package u2a1;
import java.util.Scanner;
/**
 *
 * @author nathanieldouglass
 */
public class U2A1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        // Create Scanner
     Scanner input = new Scanner (System.in)    ;
    
       // Create Forumla
     System.out.print("Input first number: ");
     int num1 = in.nextInt();
      
     System.out.print("Input second number: ");
     int num2 = in.nextInt();
      
     System.out.print("input third number: ");
     int num3 = in.nextInt();
      
       // Display Results 
     System.out.println(num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));
      
     System.out.println(num1 + " x " + num2 + " x " + num3 + " = " + (num1 * num2 * num3));  
    }
}
