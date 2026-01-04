package shapeareacalculator;
 import java.util.Scanner;

public class ShapeAreaCalculator {

    // Method to calculate the area
    public double calculateArea(double length, double breadth, boolean isCircle) {
        if (isCircle) {
            return Math.PI * length * length;  // Area of a circle
        } else {
            return length * breadth;  // Area of a rectangle or square
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeAreaCalculator calculator = new ShapeAreaCalculator();

        System.out.print("Enter the length: ");
        double length = sc.nextDouble();

        System.out.print("Is the shape a circle (true/false)? ");
        boolean isCircle = sc.nextBoolean();

        double area;

        if (isCircle) {
            // For circles, we only need one parameter (length) as the radius
            area = calculator.calculateArea(length, 0, true);
        } else {
            // To handle the breadth input correctly
            System.out.print("Enter the breadth (or press Enter to use length as breadth for a square): ");
            sc.nextLine(); // Consume the leftover newline
            String breadthInput = sc.nextLine();
            double breadth = breadthInput.isEmpty() ? length : Double.parseDouble(breadthInput);
            area = calculator.calculateArea(length, breadth, false);
        }

        System.out.println("The calculated area is: " + area);
        sc.close();
    }
}