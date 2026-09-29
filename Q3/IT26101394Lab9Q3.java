public class IT26101394Lab9Q3 {

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
        int term1 = multiply(3, 4);
        int term2 = multiply(5, 7);
        int sum1 = add(term1, term2);
        int result1 = square(sum1);

        int addA = add(4, 7);
        int addB = add(8, 3);
        int sqA = square(addA);
        int sqB = square(addB);
        int result2 = add(sqA, sqB);

        System.out.println("Result of (3 * 4 + 5 * 7)^2 : " + result1);
        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2 : " + result2);
    }
}