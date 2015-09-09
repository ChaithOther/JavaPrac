import java.util.Scanner;


public class IsPalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number to check for Palindrome pattern: ");
		
		int palindrome = new Scanner(System.in).nextInt();
		
		if(isPalindrome(palindrome)){
			System.out.println("The number entered is a Palindrome: "+ palindrome);
		}else{
			System.out.println("The number entered is NOT a Palindrome: "+ palindrome);
		}
		
	}
	
	/*
     * Java method to check if number is palindrome or not
     */

	public static boolean isPalindrome(int number){
		int palindrome = number;
		System.out.println("Palindrome initially: " + palindrome);
		int reverse = 0;
		System.out.println("Reverse initially: " + reverse);
		
		while(palindrome != 0){
			int remainder = palindrome % 10;
			System.out.println("The value of reminder is: " + remainder);
			reverse = reverse * 10 + remainder;
			System.out.println("Reverse finally: " + reverse);
			palindrome = palindrome / 10;
			System.out.println("Palindrome finally: " + palindrome);
		}
		
		// if original and reverse of number is equal means
        // number is palindrome in Java
		
        if (number == reverse) {
            return true;
        }
        return false;
    }

}
