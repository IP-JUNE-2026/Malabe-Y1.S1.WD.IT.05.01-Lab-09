public class IT26101219Lab9Q3 {

    public static int add(int x, int y) {
        return x + y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static int square(int x) {
        return multiply(x, x);   // a method can call another method
    }

    public static void main(String[] args) {
        // i.  (3*4 + 5*7)^2
        int r1 = square(add(multiply(3, 4), multiply(5, 7)));

        // ii. (4+7)^2 + (8+3)^2
        int r2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Result of (3 * 4 + 5 * 7)\u00B2      : " + r1);
        System.out.println("Result of (4 + 7)\u00B2 + (8 + 3)\u00B2  : " + r2);
    }
}
