package Trycatch;

import java.util.Arrays;

public class subsuperclass {

	public static void main(String[] args) {
  	  try {
    	 
    	 
    	 int marks[] =new int[3];
    	  marks[1]=10;
    	  marks[2]=10;
    	  marks[3]=10;
    	  
    	  System.out.println(Arrays.toString(marks));
		}
		
//		catch(ArithmeticException e) {
//         System.out.println(" mathematical exception");			
//		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(" new");
		}
		
	}

}
