package calculatearea;
import java.util.Scanner;

class Shape {
    double length;
    double breadth;
    boolean isCircle;

    Shape(double length, double breadth, boolean isCircle) {
        this.length = length;
        this.breadth = breadth;
        this.isCircle = isCircle;
    }

    double calculateArea() {
        if (isCircle) {
            return Math.PI * length * length;
        } else {
            return length * breadth;
        }
    }
}

public class Calculatearea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter breadth (default to length if not provided): ");
        String breadthInput = scanner.next();
        double breadth = breadthInput.isEmpty() ? length : Double.parseDouble(breadthInput);

        System.out.print("Is it a circle? (yes/no): ");
        boolean isCircle = scanner.next().equalsIgnoreCase("yes");

        Shape shape = new Shape(length, breadth, isCircle);
        double area = shape.calculateArea();

        System.out.println("Calculated area: " + area);
    }
}