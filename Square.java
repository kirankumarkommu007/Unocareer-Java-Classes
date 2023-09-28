import java.util.Scanner;
public class Square {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
		System.out.println("Enter the Breadth");
	    int b = input.nextInt();
	    System.out.println("Enter the Length angle");
	    int l = input.nextInt();
	    
	    int Area = l*b;
	    System.out.println(" the area of Rectangle is"+ Area);
	    int perimiter = 2*(l+b);
	    System.out.println(" the perimeter of Rectangle is"+ perimiter);
	    
	    if(Area<perimiter) {
	    	System.out.println(" the perimiter is greater than area");
	    }else if(Area == perimiter) {
		    System.out.println(" the area is equal perimiter");

	    }	    else System.out.println(" the area is greater than perimiter");


	}

}
