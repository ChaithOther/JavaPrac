import java.util.Scanner;


public class isPalindromeStringUsingCharAtMethod {

	public static void main(String[] args) {

//		String pal_ori = "Level";
		System.out.println("Enter the String to check whether palindrome or not: ");
		String pal_ori = new Scanner(System.in).nextLine();
		String pal = pal_ori.toLowerCase();
		int startPos = 0;
		int endPos = pal.length() -1;
		
		boolean isPal = true;
		
		while(startPos < endPos){
			
			char startLetter = pal.charAt(startPos);
			char endLetter = pal.charAt(endPos);
			
			if(startLetter != (endLetter)){
				isPal = false;
				break;
			}
			
			startPos++;
			endPos--;
		}
		
		if(isPal == true){
			System.out.println(pal_ori + " is a Palindrome!");
		}else{
			System.out.println(pal_ori + " is NOT a Palindrome!");
		}
		
	}

}
