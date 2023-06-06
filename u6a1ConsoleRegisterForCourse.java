package u6a1_consoleregisterforcourse;
import java.util.Scanner;

/**
 *
 * @author omora
 */
public class U6A1_ConsoleRegisterForCourse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        System.out.println("Teacher's Copy");
        Scanner input = new Scanner(System.in);
        
        int choice;
        int firstChoice = 0, secondChoice = 0, thirdChoice = 0;
        int totalCredit = 0;
        String yesOrNo = "";
        
        do {
            choice = getChoice(input);
            
            switch (ValidateChoice(choice, firstChoice, secondChoice, thirdChoice, totalCredit)) {
                case -1:
                    System.out.println("**Invalid** - Your selection of " + choice + " is not a recognized course.");
                    break;
                case -2:
                    System.out.println("**Invalid** - You have already registerd for this " +  ChoiceToCourse(choice) + " course.");
                    break;
                case -3:
                    System.out.println("**Invalid** - You can not register for more than 9 credit hours.");
                    break;
                case 0:
                    System.out.println("Registration Confirmed for course " + ChoiceToCourse(choice) );
                    totalCredit += 3;
                    if (firstChoice == 0)
                        firstChoice = choice;
                    else if (secondChoice == 0)
                        secondChoice = choice;
                    else if (thirdChoice == 0)
                        thirdChoice = choice;
                    break;
            }

            WriteCurrentRegistration(firstChoice, secondChoice, thirdChoice);
            System.out.print("\nDo you want to try again? (Y|N)? : ");
            yesOrNo = input.next().toUpperCase();
            
        } while (yesOrNo.equals("Y"));
        System.out.println("Thank you for registering with us");
    }

    public static int getChoice(Scanner input) {
        System.out.println("Please type the number inside the [] to register for a course");
        System.out.println("[1]IT4782\n[2]IT4784\n[3]IT4786\n[4]IT4789\n[5]IT2230\n[6]IT3345\n[7]IT3349");
        System.out.print("Enter your choice : ");
        return (input.nextInt());
    }
    
    // -1 = invalid, unrecognized menu selection
    // -2 = invalid, alredy registered for the course
    // -3 = invalid, No more than 9 credit hours allowed
    // 0 = menu selection is valid
    public static int ValidateChoice(int choice, int firstChoice, int secondChoice, int thirdChoice, int totalCredit) {
        // declare integer variable to 0
        int result = 0;
        // 1 0f 7 pattern selection statment
        // Check for value range
        if(choice < 1 || choice > 7 ) {
            result = -1;
        }
        // No duplicates, set parameters to check choices 
        // No need to check third choice 
        else if(choice == firstChoice || choice == secondChoice) {
            result = -2;
        }
        // Define number of total credits possible for registration
        else if(totalCredit == 9) {
            result = -3;
        }        
        // return result of variable
        return result;
    }
    
    public static void WriteCurrentRegistration(int firstChoice, int secondChoice, int thirdChoice) {

        if (firstChoice == 0)
            System.out.println("Current course registration:  { none } " );     
        else if (secondChoice == 0)
            System.out.println("Current course registration: { " + ChoiceToCourse(firstChoice) + " }" );
        else if (thirdChoice == 0)
            System.out.println("Current course registration: { " + ChoiceToCourse(firstChoice) + 
                    ", " + ChoiceToCourse(secondChoice) + " }");
        else
            System.out.println("Current course registration: { " + ChoiceToCourse(firstChoice) + 
                    ", " + ChoiceToCourse(secondChoice) + ", " + ChoiceToCourse(thirdChoice) + " }");
    }

    public static String ChoiceToCourse(int choice) {
            String course = "";
            switch (choice)
            {
                case 1:
                    course = "IT4782";
                    break;
                case 2:
                    course = "IT4784";
                    break;
                case 3:
                    course = "IT4786";
                    break;
                case 4:
                    course = "IT4789";
                    break;
                case 5:
                    course = "IT2230";
                    break;
                case 6:
                    course = "IT3345";
                    break;
                case 7:
                    course = "IT3349";
                    break;
                default:
                    break;
            }
            return course;
    }
}
