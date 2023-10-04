
public class StringSwapping {

	public static void main(String[] args) {
    String str1 = "Kumar";
    String str2  = "Kiran";
    System.out.println("Before Swapping");
    System.out.print(str1);
    System.out.print(str2);
    
    str1 =str1+str2;
    str2 =str1.substring(0,str1.length()-str2.length());
    str1 = str1.substring(str2.length(),str1.length());
    System.out.println("\nAfter Swapping");
    System.out.print(str1);
    System.out.print(str2);    
    
    
	}

}
