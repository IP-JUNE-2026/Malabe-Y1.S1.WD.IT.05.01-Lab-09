import java.util.Scanner;

public class IT26101219Lab9Q2 {

    // Method: takes radius as a parameter, returns the area
    public static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        double area = circleArea(radius);   // method call
        System.out.println("The area of the circle with radius " + radius + " is : " + area);
        input.close();
    }
}
