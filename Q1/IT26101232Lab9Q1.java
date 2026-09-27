import java.util.Scanner;

public class IT26101232Lab9Q1{

   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
   
   double a,b,c,discriminant,root0,root1,root2;
   
   System.out.print("Enter value a: ");
   a = scanner.nextDouble();
   
   System.out.print("Enter value b: ");
   b = scanner.nextDouble();
   
   System.out.print("Enter value c: ");
   c = scanner.nextDouble();
   
   discriminant = Math.pow(b,2) - (4*a*c);
   System.out.println("\nRoots are real and different:");
   
   if(discriminant > 0){
	  root1 = (-b + Math.sqrt(discriminant))/(2*a);
      root2 = (-b - Math.sqrt(discriminant))/(2*a);
      System.out.printf("Root 1: %.2f\n" , root1);
      System.out.printf("Root 2: %.2f\n" , root2);	  
   }else if(discriminant == 0){
	   root0 = -b / (2*a);
	   System.out.printf("Root: %.2f\n" , root0);
   }else{
	   System.out.println("Roots are complex");
   }
   
         
   }


}