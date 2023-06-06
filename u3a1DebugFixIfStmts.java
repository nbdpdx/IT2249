package u3a1_debugfixifstmts;

import java.util.Scanner;

/**
 *
 * @author omora
 */
public class U3A1_DebugFixIFStmts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Find and fix 4 bugs
        
        System.out.println("Teacher's Copy");
                
        Scanner input = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int firstChoice = input.nextInt();
        int secondChoice = input.nextInt();
        int thirdChoice = input.nextInt();
    
        //Determine & print the state of choices made
        if(firstChoice == 0)
                 System.out.println("State of choices: \n" +
                    "no choices made yet"); 
        else if(secondChoice == 0) 
                 System.out.println("State of choices: \n" +
                    "user made first choice (" + firstChoice + ")\n" +
                    "number of choices = 1"); 
        else if(thirdChoice == 0) // added missing = sign 
                 System.out.println("State of choices: \n" +
                    "user made first choice (" + firstChoice + ")\n" +
                    "user made second choice (" + secondChoice + ")\n" +
                    "number of choices = 2"); 
        else{ //added missing else
                 System.out.println("State of choices: \n" +
                    "user made first choice (" + firstChoice + ")\n" +
                    "user made second choice (" + secondChoice + ")\n" +
                    "user made third choice (" + thirdChoice + ")\n" +
                    "number of choices = 3"); //added missing semicolon
    }
    } //added missing semicolon
}
