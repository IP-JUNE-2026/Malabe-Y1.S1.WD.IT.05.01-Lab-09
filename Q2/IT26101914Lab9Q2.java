import java.util.Scanner;

public class IT26101914Lab9Q2 {

    // Method to calculate and return the area
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read radius from user
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();

        // Call the method
        double area = circleArea(radius);

        // Display the result
        System.out.println("Area of the circle = " + area);

        sc.close();
    }
}
