import java.util.Scanner;

public class RectangleAreaCalculator {
    public static void main(String[] args) {
        // Calculate the area of a rectangle
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = scanner.nextDouble();

        System.out.print("Enter height: ");
        height = scanner.nextDouble();

        area = width * height;
        System.out.print("The area of the rectangle is: " + area + "cm^2");

        scanner.close();
    }
}
