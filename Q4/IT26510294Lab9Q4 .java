import java.util.Scanner;

public class IT26510294Lab9Q4 {

    static double calcFinalMark(double assignment, double exam) {
        return assignment * 0.3 + exam * 0.7;
    }

    static char findGrade(double mark) {
        if (mark >= 75)
            return 'A';
        else if (mark >= 60)
            return 'B';
        else if (mark >= 50)
            return 'C';
        else
            return 'F';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter name: ");
            String name = sc.next();

            System.out.print("Enter assignment mark: ");
            double assignment = sc.nextDouble();

            System.out.print("Enter exam mark: ");
            double exam = sc.nextDouble();

            double mark = calcFinalMark(assignment, exam);
            char grade = findGrade(mark);

            System.out.println(name + "\t" + mark + "\t" + grade);
        }
    }
}

