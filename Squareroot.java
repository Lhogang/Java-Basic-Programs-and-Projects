
package squareroot;
import java.util.Scanner;

public class Squareroot {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number");
        double number = input.nextDouble();
        
        double root = Math.sqrt(number);
        System.out.println("The square root of the number is :" +root);
    }
    
}
