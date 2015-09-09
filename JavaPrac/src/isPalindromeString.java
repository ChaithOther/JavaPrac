
public class isPalindromeString {

	public static void main(String[] args) {

		String pal_ori = "Level";;
		String pal = pal_ori.toLowerCase();
		int startPos = 0;
		int endPos = pal.length() -1;
		
		boolean isPal = true;
		
		while(startPos < endPos){
			
			String startLetter = pal.substring(startPos, startPos+1);
			String endLetter = pal.substring(endPos, endPos+1);
			
			if(startLetter.equals(endLetter)== false){
				isPal = false;
				break;
			}
			
			startPos++;
			endPos--;
		}
		
		if(isPal == true){
			System.out.println(pal_ori + "is a Palindrome!");
		}else{
			System.out.println(pal_ori + "is NOT a Palindrome!");
		}
		
	}

}
