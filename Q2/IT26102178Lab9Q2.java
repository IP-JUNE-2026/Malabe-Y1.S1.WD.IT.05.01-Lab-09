import java.util.Scanner;

public class IT26102178Lab9Q2 {
    public static double circleArea(double radius) {
        double area = Math.PI * radius * radius;
        return area;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = circleArea(radius);

        System.out.print("The area of the circle with radius " +radius + " is : " + area);

        sc.close();
    }
}
