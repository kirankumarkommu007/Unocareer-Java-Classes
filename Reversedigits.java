/*import java.util.Scanner;
public class Reversedigits {

	public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
    
    System.out.println(" Enter The Number ");
    int i = input.nextInt();
     int temp = i/10;
     int temp1 = temp/10;
     int temp2 = temp1/10;
     int temp3 = temp2/10;
     int temp4 = temp3/10;

     
     int a = i%10;
     int b = temp%10;
     int c = temp1%10;
     int d = temp2%10;
     int e = temp3%10;
     
     System.out.println(a+""+b+""+c+""+d+""+e);
     
	}

}
import java.util.Scanner;

public class Reversedigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = input.nextInt();
        
        int temp = 0;
        while (num != 0) {
           int digit = num % 10;
           temp = temp * 10 + digit;
           num /= 10;
        }

        System.out.println("Reversed number: " + temp);
    }
}*/
import java.util.Scanner;

public class Reversedigits {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number: ");
        
       int num = input.nextInt();
        int temp = 0;
         
         for(;num !=0;num/=10 ) {
        	
        
        	int temp1 = num%10;
             temp = temp*10 + temp1;
             if (num == temp) {
                 System.out.println("The Number is palindrome");
             }  
         }
        System.out.println(" reversed number :"+temp);
 
    }
}

