import java.util.Scanner;

public class IT26101914Lab9Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input values
        System.out.print("Enter value of a: ");
        double a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        double b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        double c = sc.nextDouble();

        // Calculate discriminant
        double d = Math.pow(b, 2) - (4 * a * c);

        if (d > 0) {
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (d == 0) {
            double x = (-b) / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("No real roots.");
        }

        sc.close();
    }
}