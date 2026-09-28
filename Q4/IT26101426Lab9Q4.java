import java.util.Scanner;

public class IT26101426Lab9Q4 {

    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.20) + (examMark * 0.80);
    }
   
    public static char findGrade(double finalMark) {
        if (finalMark >= 75) {
            return 'A';
        } else if (finalMark >= 60) {
            return 'B';
        } else if (finalMark >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }
    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.printf("%-10s %-10.2f %c\n", name, finalMark, grade);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = new String[5];
        double[] assignmentMarks = new double[5];
        double[] examMarks = new double[5];
        double[] finalMarks = new double[5];
        char[] grades = new char[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.print("\nEnter Name of Student " + (i+1) + ": ");
            names[i] = input.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = input.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = input.nextDouble();
            
            finalMarks[i] = calcFinalMark(assignmentMarks[i], examMarks[i]);
            grades[i] = findGrade(finalMarks[i]);
        }
       
        System.out.println("\n");
        System.out.printf("%-10s %-10s %s\n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        input.close();
    }
}