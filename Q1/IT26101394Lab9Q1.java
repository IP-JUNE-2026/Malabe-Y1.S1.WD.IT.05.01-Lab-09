import java.util.Scanner;

public class IT26101394Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter value a: ");
        double a = input.nextDouble();

        System.out.print("Enter value b: ");
        double b = input.nextDouble();

        System.out.print("Enter value c: ");
        double c = input.nextDouble();

        double det = Math.pow(b, 2) - (4 * a * c);

        if (det > 0) {
            double root1 = (-b + Math.sqrt(det)) / (2 * a);
            double root2 = (-b - Math.sqrt(det)) / (2 * a);

            System.out.println("Roots are real and different:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } 
        else if (det == 0) {
            double root = -b / (2 * a);

            System.out.println("Roots are real and equal:");
            System.out.println("Root 1 = Root 2: " + root);
        } 
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-det) / (2 * a);

            System.out.println("Roots are complex and imaginary:");
            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
        }
    }
}