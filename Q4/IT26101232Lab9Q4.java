import java.util.Scanner;

public class IT26101232Lab9Q4{

   public static double calcFinalMark(double assignmentMark, double examMark){
	   return(assignmentMark * 0.3) + (examMark * 0.7);
   }
   public static char findGrades(double mark){
	   if(mark >= 75){
		   return 'A';
	   }else if(mark >= 60){
		   return 'B';
	   }else if(mark >= 50){
		   return 'C';
	   }else{
		   return 'F';
	   }
   }
   public static void printDetails(String name, double finalMark, char grade){
	   System.out.printf("%-10s\t%-12.2f\t%-5c\n" , name , finalMark , grade);
   }
   public static void main(String[] args){
	   
	   Scanner scanner = new Scanner(System.in);
	   
	   int i;
	   double assignmentMark,examMark;
	   
	   String names[] = new String[5];
	   double finalMarks[] = new double[5];
	   char grades[] = new char[5];
	   
	   for(i = 0; i < 5; i++){
		   System.out.print("Enter Name of Student " + (i + 1) + ": ");
		   names[i] = scanner.nextLine();
		   
		   System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
		   assignmentMark = scanner.nextDouble();
		   
		   System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
		   examMark = scanner.nextDouble();
		   scanner.nextLine();
		   
		   finalMarks[i] = calcFinalMark(assignmentMark,examMark);
		   grades[i] = findGrades(finalMarks[i]);
		   System.out.println();
		   
	   }
	   System.out.printf("%-10s\t%-12s\t%-5s\n" ,  "Name" , "Final Mark" ,  "Grade");
	   for(i = 0; i < 5; i++){
		   printDetails(names[i], finalMarks[i], grades[i]);
	   }
   }





}