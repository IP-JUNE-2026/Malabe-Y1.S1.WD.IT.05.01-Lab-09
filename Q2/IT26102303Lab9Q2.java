
import java.util.Scanner;

public class IT26102303Lab9Q2 {

    public static double circleArea(double radius) {

        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double radius;
        double area;

        System.out.print("Enter radius: ");
        radius = input.nextDouble();

        area = circleArea(radius);

        System.out.println("Area of the circle: " + area);
    }
}