package fibonacci;
import java.util.Scanner;

class Fibonacciseries {
    
    // Method to generate and print the Fibonacci series
    void generateFibonacci(int n) {
        int first = 1, second = 1, next;
        
        // Printing the first two numbers of the series
        System.out.print(first + " " + second);
        
        // Loop to generate the next numbers in the series
        for (int i = 3; i <= n; i++) {
            next = first + second; // Sum of the previous two numbers
            System.out.print(" " + next); // Print the next number
            first = second; // Update first number
            second = next; // Update second number
        }
        System.out.println(); // Move to the next line after the series
    }
}

public class Fibonacci{
    public static void main(String[] args) {
        // Create an object of the Fibonacci class
        Fibonacciseries fib = new Fibonacciseries();
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of terms to generate in Fibonacci series: ");
        int n = input.nextInt(); // Input for number of terms
        
        // Check if the number of terms is valid
        if (n < 1) {
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            // Call the method to generate the Fibonacci series using the object
            fib.generateFibonacci(n);
        }
    }
}
