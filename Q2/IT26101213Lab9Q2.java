import java.util.Scanner;
  public class IT26101213Lab9Q2 {
  public static void main(String[] args) {
	  
	  Scanner input = new Scanner(System.in);
  
  System.out.println("Enter the radius of the circule:");
  double radius = input.nextDouble();
  
  double pi=22/7;
  
  double areaofCircle = pi * Math.pow(radius,2);
  
  System.out.println("The area of the circle with radius" +  radius   + " is " + areaofCircle );
  
  }
  
  }