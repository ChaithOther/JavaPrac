

	
	import java.util.Scanner;

	public class GetFactorialOfANumberUsingForLoop {

	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);
	       System.out.print("Enter the number whose factorial is to be found: ");
	       int n = scanner.nextInt();
	       int result = factorial(n);
	       System.out.println("The factorial of " + n + " is " + result);
	   }

	   public static int factorial(int n) {
	       int result = 1;
	       for (int i = 1; i <= n; i++) {
	           result = result * i;
	       }
	       return result;
	   }
}
	
//for loop can also be wirtten as below:
//	for (int i = n; i >= 1; i--) {
//	   result = result * i;
//   }
