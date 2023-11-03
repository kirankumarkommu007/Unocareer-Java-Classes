public class FirstNonRepeating {

		
	public static void main(String[] args) {
		
		 String str = "Swiss";
		 // 10339093414
		 // 
		 // last repeated number 
		 str = str.toUpperCase();
		 char[] strArr = str.toCharArray();
		 char eachChar;
		 boolean isFound = false;
		 char firstNonRepChar=' ';
		 for(int i=0;i<strArr.length;i++) {
			 eachChar = strArr[i];
			 isFound = false;
			for(int j=i+1;j<strArr.length;j++) {
				if(eachChar == strArr[j]) {
					isFound = true;
					break;
				}// if
			}// for j
			if(isFound == false) {
				firstNonRepChar=eachChar;
				break;
			}// if
		 }// for i
	
		 System.out.println("First Non Repeated Char--->"+firstNonRepChar);
	
	}

}