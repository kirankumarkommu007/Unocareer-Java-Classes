
public class LastRepeating {

	public static void main(String[] args) {
		
		 String str = "10339093541545";
		 // 1033909354154
		 // 
		 // last repeated number 
		 char[] strArr = str.toCharArray();
		 char eachChar;
		 boolean isFound = false;
		 char lastNonRepChar=' ';
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
				lastNonRepChar=eachChar;
				
			}// if
		 }// for i
	
		 System.out.println("Last Non Repeated Char--->"+lastNonRepChar);
	
	}


	}

