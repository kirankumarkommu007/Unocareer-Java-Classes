
public class LowerToUpper {

	public static void main(String[] args) {
		String str = "Welcome to Hyderabad";		
		char ch=str.charAt(0);
		String k = "";
		
		
       for(int i =0; i<=str.length()-1;i++) {
    	   
   		if(str.charAt(i) >=65 && str.charAt(i) <=90) {// A-Z
        ch =(char)((str.charAt(i)+32));
             k =k+ ch;
       }
   		else if (str.charAt(i) >=97 && str.charAt(i) <=122) {// A-Z
            ch =(char)((str.charAt(i)-32));
            k =k+ ch;
      }
   		else  {
   			ch =(char)(str.charAt(i));
            k =k+ ch;
      }
   		
	}
		System.out.println(k);
}
}
