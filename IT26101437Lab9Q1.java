import java.util.Scanner; 
public class IT26101437Lab9Q1 {
    public static void main(String[]args){
		Scanner input = new Scanner(System.in);
	    System.out.print("Enter value a:");
		double num= input.nextInt();
		System.out.print("Enter value b:");
		double num1= input.nextInt();
		System.out.print("Enter value c:");
		double num2= input.nextInt();
		
		double number =(-num1 + Math.sqrt(Math.pow(num1, 2)- 4 * num * num2 )) / ( 2 * num);
		double number1 =(-num1 - Math.sqrt(Math.pow(num1, 2)- 4 * num * num2 )) / ( 2 * num);
	 
		  
		 System.out.println();  
		System.out.println("Roots are real and different:");
		 System.out.print("Root 1: "+number+ "\n");
		 System.out.print("Root 1: "+number1+"\n");
	}
}