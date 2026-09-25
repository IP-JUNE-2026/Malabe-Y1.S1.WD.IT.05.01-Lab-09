import java.util.Scanner;

public class IT26100743Lab9Q3 {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {
        // i. (3 * 4 + 5 * 7)^2
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int sum1 = add(term1, term2);
        int result1 = square(sum1);

        System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + result1);

        // ii. (4 + 7)^2 + (8 + 3)^2
        int sum2 = add(4, 7);
        int sum3 = add(8, 3);
        int square1 = square(sum2);
        int square2 = square(sum3);
        int result2 = add(square1, square2);

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2  : " + result2);
    }
}