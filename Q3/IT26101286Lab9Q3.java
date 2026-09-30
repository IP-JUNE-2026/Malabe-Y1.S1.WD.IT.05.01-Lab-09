public class IT26101286Lab9Q3 {

    static int add(int a, int b) {
        return a + b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int square(int a) {
        return a * a;
    }

    public static void main(String[] args) {

        int a = multiply(3, 4);
        int b = multiply(5, 7);
        int result1 = square(add(a, b));

        int c = add(4, 7);
        int d = add(8, 3);
        int result2 = add(square(c), square(d));

        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + result1);
        System.out.println("Result of (4 + 7)² + (8 + 3)^2 : " + result2);
    }
}
