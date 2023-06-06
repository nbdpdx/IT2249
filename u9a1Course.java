package u9a1;

public class Course {
    // Two private attributes
    private String Code;
    private int creditHours;
    
    // Public methods
    public Course(String Code, int creditHours){
        this.Code = Code;
        this.creditHours = creditHours;
    }
    public String getCode() {
        return Code;
    }
    public int getCreditHours() {
        return creditHours;
    }
}
