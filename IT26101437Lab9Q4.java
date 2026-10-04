 import java.util.Scanner;
public class IT26101437Lab9Q4 {
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
		System.out.println();
		
		String nameArray[] = new String[5];
		double markArray[] = new double[5];
	    char gradeArray[] = new char[5];
		 
		for(int i=0;i<5;i++){
			 
		System.out.print("Enter name of student"+(i+1)+":" );
		nameArray[i] = input.next();
		
		System.out.print("Enter Assignment Mark (out of 100) for "+nameArray[i]+":");
		double assignment = input.nextDouble();
		
		System.out.print("Enter Exam Paper Mark (out of 100) for "+nameArray[i]+":" );
		double exam = input.nextDouble();
		
		  
		 markArray[i] = calcFinalMark(assignment, exam);
         gradeArray[i] = findGrades(markArray[i]);
		
		System.out.println();
	 
		}
		System.out.printf( "name"+"    "+ "mark"+"     " +"grade"+"\n");
		for(int j=0;j<5;j++){
		printDetails(nameArray[j], markArray[j], gradeArray[j]);}
		
		 
	} 
	public static double calcFinalMark(double assignment, double exam) {
    return (assignment * 0.30) + (exam * 0.70);
    }
	
	public static char findGrades(double mark) {
    if (mark >= 75) {
        return 'A';
    } else if (mark >= 60) {
        return 'B';
    } else if (mark >= 50) {
        return 'C';
    } else {
        return 'F';
    }
    }
	
	
	public static void printDetails(String name, double mark, char grade) {
		 
        System.out.printf("%s\t%.2f\t\t%c%n", name, mark, grade);
    
}
	
}