package u7a1;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author nathanieldouglass
 */
public class U7A1 {

     public static void main(String[] args) {
        // Create array to count occurences of number
        // Creat Scanner
        Scanner input = new java.util.Scanner(System.in);
        // Number of allowed input items
        final int INPUT_COUNT = 7;
        // Create array to hold input
        int[] userInput = new int[INPUT_COUNT];
        
        // Set up user prompt
        System.out.print("Enter " + INPUT_COUNT + " numbers: ");
        
        // First loop to read and store input, for loop as # of loops is defined
        for (int i = 0; i < INPUT_COUNT; i++) {
            // code to define each value individually
            userInput[i] = input.nextInt();
    }
        // Pass in array with user input, get back array with counts
        int[] counts = Count(userInput);
        
        // Loop prints out results
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] > 0) {
                System.out.println( i + " occurs " + counts[i] + " times.");
            }
        }  
    }
     public static int[] Count(int[] inputArray) {
        // find highest user input
        // Sort values of inputArray
        Arrays.sort(inputArray);
        //Define the last element in the array, the max
        int max = inputArray[inputArray.length - 1];
        //Declare count array
        int[] countArray = new int[max + 1];
        
        // Loop to count value of occurences
        for(int i = 0; i < inputArray.length; i++) {
            //begin the counting, increment count array w/ nested brackets
            countArray[inputArray[i]]++;
        }
        // Return Array
        return countArray;
     }           
}
