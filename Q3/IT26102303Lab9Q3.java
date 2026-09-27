public class IT26102303Lab9Q3 {

    public static int add(int a, int b) {

        return a + b;
    }

    public static int multiply(int a, int b) {

        return a * b;
    }

    public static int square(int number) {

        return number * number;
    }

    public static void main(String[] args) {

        int answer1;
        int answer2;

        answer1 = square(add(multiply(3, 4), multiply(5, 7)));

        answer2 = add(square(add(4, 7)), square(add(8, 3)));

        System.out.println("Answer 1: " + answer1);
        System.out.println("Answer 2: " + answer2);
    }
}