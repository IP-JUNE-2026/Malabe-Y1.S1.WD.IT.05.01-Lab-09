import java.util.Scanner;

public class IT26101213Lab9Q4 {

    
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.30) + (examMark * 0.70);
    }

   
    public static char findGrades(double mark) {
        if (mark >= 75) {
            return 'A';
        } 
        else if (mark >= 60) {
            return 'B';
        } 
        else if (mark >= 50) {
            return 'C';
        } 
        else {
            return 'F';
        }
    }

    
    public static void printDetails(String name, double finalMark, char grade) {
        System.out.println(name + " | " + finalMark + " | " + grade);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStudents = 5;
        String[] names = new String[totalStudents];
        double[] assignmentMarks = new double[totalStudents];
        double[] examMarks = new double[totalStudents];

        
        for (int i = 0; i < totalStudents; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            assignmentMarks[i] = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            examMarks[i] = scanner.nextDouble();
        }

       
        System.out.println("\n%-10s | %-10s | %-5s".formatted("Name", "Final Mark", "Grade"));

        
        for (int i = 0; i < totalStudents; i++) {
            double finalMark = calcFinalMark(assignmentMarks[i], examMarks[i]);
            char grade = findGrades(finalMark);
            printDetails(names[i], finalMark, grade);
        }

        scanner.close();
    }
}
  
