
public class GetFactorialusingRecursionMethod {

   public static void main(String[] args) {
       int n = 7;
       int result = factorial(n);
       System.out.println("The factorial of 7 is " + result);
   }

   //Method to return factorial of any given number using Recursion processes 
   public static int factorial(int n) {
       if (n == 0) {
           return 1;
       } else {
           return n * factorial(n - 1);
       }
   }
}