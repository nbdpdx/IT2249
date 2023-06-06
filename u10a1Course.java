package u10a1_ooconsoleregisterforcourse;

public class Course {

    private String code = "";
    private int creditHour = 0;
    private boolean isRegisterdFor = false;
    
    public Course(String code, int creditHour){
        this.code = code;
        this.creditHour = creditHour;
    }
    
    public void setCode(String code){
        this.code = code;
    }
    
    public String getCode() {
        return this.code;
    }
    
    public void setCreditHour(int creditHour) {
        this.creditHour = creditHour;
    }
    
    public int getCreditHour() {
        return this.creditHour;
    }    
    
    public void setIsRegisteredFor(boolean trueOrFalse){
        this.isRegisterdFor = trueOrFalse;
    }
    
    public boolean getIsRegisteredFor() {
        return this.isRegisterdFor;
    }
        
}
