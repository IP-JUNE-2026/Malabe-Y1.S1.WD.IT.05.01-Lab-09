public class IT26101232Lab9Q3{

   public static int add(int num1,int num2){
      return num1 + num2;
   }
   public static int multiply(int num1,int num2){
	   return num1 * num2;
   }
   public static int square(int num){
	   return num * num;
   }
   
   public static void main(String[] args){
	   
	  int part1,part2,sum1,result1,sum2,sum3,sqr1,sqr2,result2;

	  part1 = multiply(3,4);
	  part2 = multiply(5,7);
	  sum1 = add(part1,part2);
	  result1 = square(sum1);
	   
	  System.out.println("Result of (3 * 4 + 5 * 7)^2      : " + result1);
	  
	  sum2 = add(4,7);
	  sum3 = add(8,3);
	  sqr1 = square(sum2);
	  sqr2 = square(sum3);
	  result2 = add(sqr1,sqr2);

	  System.out.println("Result of (4 + 7)^2 + (8 + 3)^2  : " + result2);
   }




}