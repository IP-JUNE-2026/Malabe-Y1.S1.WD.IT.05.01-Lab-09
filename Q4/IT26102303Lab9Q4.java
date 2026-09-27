import java.util.Scanner;

public class IT26102303Lab9Q4 {

    public static double calcFinalMark(double assignment, double exam) {

        double finalMark;

        finalMark = (assignment * 0.30) + (exam * 0.70);

        return finalMark;
    }

    public static String findGrades(double mark) {

        if (mark >= 75) {
            return "A";
        } 
        else if (mark >= 60) {
            return "B";
        } 
        else if (mark >= 50) {
            return "C";
        } 
        else {
            return "F";
        }
    }

    public static void printDetails(String name, double mark, String grade) {

        System.out.println(name + "\t" + mark + "\t" + grade);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name;
        double assignment;
        double exam;
        double finalMark;
        String grade;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter Name of Student " + i + ": ");
            name = input.next();

            System.out.print("Enter Assignment Mark: ");
            assignment = input.nextDouble();

            System.out.print("Enter Exam Paper Mark: ");
            exam = input.nextDouble();

            finalMark = calcFinalMark(assignment, exam);

            grade = findGrades(finalMark);

            System.out.println();
            printDetails(name, finalMark, grade);
            System.out.println();
        }
    }
}