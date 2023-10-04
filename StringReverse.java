
public class StringReverse {

	public static void main(String[] args) {
    String str1 = "Welcome to Mlg";
    String Str2 = "";
    for(int i =str1.length()-1;i>=0;i--) {
    	Str2 = Str2+str1.charAt(i);
    }
	System.out.print(Str2);

    
	}

}
