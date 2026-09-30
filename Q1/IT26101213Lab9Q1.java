import java.util.Scanner;
   public class IT26101213Lab9Q1{
   public static void main(String[] args){
   
   Scanner input = new Scanner(System.in);
   
   System.out.println("Enter value a :");
   int a = input.nextInt();
   
   System.out.println("Enter value b :");
   int b = input.nextInt();
   
   System.out.println("Enter value c :");
   int c = input.nextInt();
   
   System.out.println("Roots are real and different:");
   
   double discriminant = Math.pow(b,2) - (4 * a* c);
   
   if (discriminant>0){
   double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
   double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
   
   
   System.out.println("Root1 : " + root1 );
   System.out.println("Root2 : " + root2);
   
   }
   
   else if ( discriminant==0){
   double root = -b/ (2 * a);
   
   System.out.println("Root : " + root);
   }
   
   else {
     System.out.println("Roots are complex and imaginary.");
    }
	
    }
}
   
   
   