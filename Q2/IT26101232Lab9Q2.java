import java.util.Scanner;

public class IT26101232Lab9Q2{
	
	public static double circleArea(double radius){
		return Math.PI * radius * radius;
	}

   public static void main(String[] args){
   
   Scanner scanner = new Scanner(System.in);
   
   double area,radius;
   
   System.out.print("Enter the radius of the circle: ");
   radius = scanner.nextDouble();
   area = circleArea(radius);
   
   System.out.println("The area of the circle with radius " + radius + " is: " + area);
   
         
   }


}