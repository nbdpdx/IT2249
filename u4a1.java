package unit.pkg4;
import java.util.Scanner;
/**
 *
 * @author nathanieldouglass
 */
public class Unit4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String code;
        boolean valid = true;
        String message = "";
        
        System.out.print("Enter a course code to validate (e.g. IT4782): ");
        code = input.nextLine();
        if(code.length() == 6)
        if(Character.toUpperCase (code.charAt(0)) != 'I'){
            valid = false; message += "Firsts character is not an I or an i.\n";}
        if(Character.toUpperCase (code.charAt(1)) != 'T'){
            valid = false; message += "Second character is not a T or t.\n";}
        if(!Character.isDigit(code.charAt(2))){
            valid = false; message += "Third character is not a digit.\n";}
        if(!Character.isDigit(code.charAt(3))){
            valid = false; message += "Fourth character is not a digit.\n";}
        if(!Character.isDigit(code.charAt(4))){
            valid = false; message += "Fifth character is not a digit.\n";}
        if(!Character.isDigit(code.charAt(5))){
            valid = false; message += "Sixth character is not a digit.\n";}
        if(valid){
            System.out.println(code + " is a valid course code.");}
        else{
            System.out.println(code + " is not a valid course code.");}
            System.out.println(message);
    }
}
