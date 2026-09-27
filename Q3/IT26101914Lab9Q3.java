import java.util.Scanner;

public class IT26101914Lab9Q3 {

    // Method to add two integers
    static int add(int a, int b) {
        return a + b;
    }

    // Method to multiply two integers
    static int multiply(int a, int b) {
        return a * b;
    }

    // Method to find the square of an integer
    static int square(int n) {
        return n * n;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.println("Addition = " + add(num1, num2));
        System.out.println("Multiplication = " + multiply(num1, num2));
        System.out.println("Square of first number = " + square(num1));

        input.close();
    }
}