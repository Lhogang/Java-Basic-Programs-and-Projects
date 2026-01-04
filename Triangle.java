
package triangle;
import java.util.Scanner;


public class Triangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        
        System.out.println("Enter the base");
        double base = input.nextDouble();
        
        System.out.println("Enter the height");
        double height = input.nextDouble();
        
        double Area = 0.5 *(base *height);
        
        System.out.println("the given is the area of triangle:" +Area  );
        
        
    }
    
}
