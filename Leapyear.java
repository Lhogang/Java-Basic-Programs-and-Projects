
package leapyear;
import java.util.Scanner;


public class Leapyear {

   
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the year");
      int year = input.nextInt();
      
      if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
      {
            System.out.println("The given year is a leap year.");
        }
      else
      {
            System.out.println("The given year is not a leap year.");
        }
        
    }
    
}
