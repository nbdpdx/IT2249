package u9a1;

public class U9A1 {

    public static void main(String[] args) {
        // Setup array to define Course
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
                   "(" + cr.getCreditHours() + ")");
        }
        
    }
    
}
