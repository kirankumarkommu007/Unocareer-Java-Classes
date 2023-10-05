
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	String first ="14321";
		String temp ="";
		for(int i =first.length()-1; i>=0;i--) {
			temp= temp+first.charAt(i);
		}
		if(first.equalsIgnoreCase(temp)) {
			System.out.println("the Given String is Palidrome");
			
		}
		else 
			System.out.println("the Given String is not Palidrome");
			
			
			
			
		//Java String program to check whether a string is a Palindrome every charecter Check
				String str = "12354321";
				
				
				for(int l=0,r=str.length()-1;l<=str.length()-1;l++,r--) {
					if(str.charAt(l) != str.charAt(r)) {
						System.out.println(" the number is not palindrome");
						break;
					}//if
				}// for*/
		
		//Java String program to check whether a string is a Palindrome
				String str = "123454321";
				boolean isPoly = true;
				for(int l=0,r=str.length()-1;l<str.length()/2;l++,r--) {
					if(str.charAt(l) != str.charAt(r)) {
						isPoly = false;
						break;
					}//if
				}// for
				if(isPoly == true) System.out.println("It is Polyndrome");
				else System.out.println("Not Polyndrome");
	}

}
