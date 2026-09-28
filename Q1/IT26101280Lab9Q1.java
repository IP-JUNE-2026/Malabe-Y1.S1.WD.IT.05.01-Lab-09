import java.util.Scanner;

public class IT26101280Lab9Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        
        System.out.print("Enter value a: ");
        a = input.nextDouble();
        System.out.print("Enter value b: ");
        b = input.nextDouble();
        System.out.print("Enter value c: ");
        c = input.nextDouble();
        
        
        double bSquare = Math.pow(b, 2);
        double discriminant = bSquare - (4 * a * c);
        double sqrtDiscriminant = Math.sqrt(discriminant);
        
        System.out.println();
        
        if (discriminant > 0) {
            double root1 = (-b + sqrtDiscriminant) / (2 * a);
            double root2 = (-b - sqrtDiscriminant) / (2 * a);
            System.out.println("Roots are real and different : ");
            System.out.printf("Root 1: %.2f\n", root1);
            System.out.printf("Root 2: %.2f\n", root2);
        } 
        else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal : ");
            System.out.printf("Root 1 = Root 2 = %.2f\n", root);
        } 
        else {
            System.out.println("Roots are imaginary / complex");
        }
        
        input.close();
    }
}