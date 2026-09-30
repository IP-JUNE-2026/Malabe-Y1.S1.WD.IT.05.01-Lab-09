public class IT26101213Lab9Q3 {
	
	 

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
        int ans1 = square(sum1);

        
        int sum2_1 = add(4, 7);
        int sum2_2 = add(8, 3);
        int sq1 = square(sum2_1);
        int sq2 = square(sum2_2);
        int ans2 = add(sq1, sq2);

        
        System.out.println("Result of (3*4+5*7)^2 : " + ans1);
        System.out.println("Result of (4+7)^2+(8+3)^2 : " + ans2);
    }
}