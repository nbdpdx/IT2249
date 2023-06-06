package u10a1_ooconsoleregisterforcourse;

import java.util.Scanner;

public class U10A1_OOConsoleRegisterForCourse {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println("Teacher's Copy");

        Scanner input = new Scanner(System.in);
        
        //Courses is an array of course objects
        //see the Course.java source code for members of Course
        Course[] courses = {
            new Course("IT1006", 6),
            new Course("IT4782", 3),
            new Course("IT4789", 3),
            new Course("IT4079", 6),
            new Course("IT2230", 3),
            new Course("IT3345", 3),
            new Course("IT2249", 6)
        };
        

        //choice is the number selected by the user
        int choice;
        int totalCredit = 0;
        String yesOrNo = "";

       
        do {

            choice = getChoice(courses, input);
   
            switch (ValidateChoice(choice, totalCredit, courses)) {
                case -1:
                    System.out.println("**Invalid** - Your selection of " + 
                            choice + " is not a recognized course.");
                    break;
                case -2:
                    System.out.println("**Invalid** - You have already registerd for this " +
                            courses[choice-1].getCode() + " course.");
                    break;
                case -3:
                    System.out.println("**Invalid** - You can not register for more than 9 credit hours.");
                    break;
                case 0:
                    System.out.println("Registration Confirmed for course " +
                            courses[choice-1].getCode() );
                    totalCredit += courses[choice-1].getCreditHour();
                    courses[choice-1].setIsRegisteredFor(true);
                    break;
            }
            
            WriteCurrentRegistration(courses, totalCredit);
 
            System.out.print("\nDo you want to try again? (Y|N)? : ");
            
            yesOrNo = input.next().toUpperCase();
            
        } while (yesOrNo.equals("Y"));

        System.out.println("Thank you for registering with us");
    }


    public static int getChoice(Course[] courses, Scanner input) {    
        System.out.println("Please type the number inside the [] to register for a course");
        System.out.println("The number inside the () is the credit hours for the course");
        
        Course[] list = new Course[7];
        
        // Define courses
        list[0] = new Course("IT1006", 6);
        list[1] = new Course("IT4782", 3);
        list[2] = new Course("IT4789", 3);
        list[3] = new Course("IT4079", 6);
        list[4] = new Course("IT2230", 3);
        list[5] = new Course("IT3345", 3);
        list[6] = new Course("IT2249", 6);
        
        // Initialize list to start with number 1
        int itemNumber = 1;
        
        // Create for loop to pull out info
        for(Course cr : list) {
            // Print out items line by line
            System.out.println("[" + itemNumber ++ + "]" + cr.getCode() + 
                   "(" + cr.getCreditHour() + ")");
        }

        System.out.print("Enter your choice : "); 

        return (input.nextInt());
    }
    
    //This method validates the user menu selection
    //against the given registration business rules
    //it returns the following code based on the validation result
    // -1 = invalid, unrecognized menu selection
    // -2 = invalid, alredy registered for the course
    // -3 = invalid, No more than 9 credit hours allowed
    // 0 = menu selection is valid

    public static int ValidateChoice(int choice, int totalCredit, Course[] courses) {
        if (choice < 1 || choice > 7)
            return -1;
        else if (IsRegisteredBefore(choice, courses) ) 
            return -2;
        else if ( (totalCredit + courses[choice-1].getCreditHour()) > 9)
            return -3;
        return 0;
    }
    
    //This method checks the courses array of course object to
    //see if the course has already been registered for or not
    public static boolean IsRegisteredBefore(int choice, Course[] courses) {
        for(int i = 0; i < courses.length; i++)
            if(courses[choice-1].getIsRegisteredFor() == true)
                return true;
        return false;
    }
    
    //This method prints the current list of registered courses thus far
    //from the courses array separated by , and enclosed inside { }
    //It also prints the total credit registered for thus far
    public static void WriteCurrentRegistration(Course[] courses, int totalCredit) {

        System.out.print("Current course registration:  { " ); 
        // Build String
        StringBuilder registeredCourses = new StringBuilder();
        
        //loop over the courses array and print
        for(Course C : courses) {
            if(C.getIsRegisteredFor()) {
                registeredCourses.append(C.getCode()).append(", ");
            }
        }
        // end string 
        registeredCourses.delete(registeredCourses.length() -2, registeredCourses.length());
        
        System.out.println(" }" );     

        System.out.println("Current registration total credit = " + totalCredit);
    }
    
}
