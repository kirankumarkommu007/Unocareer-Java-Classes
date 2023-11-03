
public class AmstrongNumber {

	public static void main(String[] args) {
         int n =153;
         int t = n;
         int sum = 0;
         
         while(n!=0) {
        	 int ld;
        	 ld = n%10;
        	 n =n/10;
        	 sum = sum+(ld*ld*ld);
         }
         if(sum==t) {
        	 System.out.println("True");
         }
         else  System.out.println("False");
	}

}
