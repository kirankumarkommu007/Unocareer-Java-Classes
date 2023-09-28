import java.util.Scanner;
public class Marks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the marks in A");
		int A = input.nextInt();
		
		System.out.println("enter the marks in B");
		int B = input.nextInt();
		
		if(A >=55 && B >=45) {
			System.out.println(" the Student has been Passed");
		}if(A <=45 && B>=55 ) {
			System.out.println(" the Student has been Failed");
		}if( A <=45 && B>=65) {
			System.out.println(" the Student has been Failed , but he can reappear for exam");
		}if( A<45 &&B <45) {
			System.out.println(" the Student has been Failed");
		}
		

	}

}
