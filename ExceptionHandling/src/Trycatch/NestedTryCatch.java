package Trycatch;

import java.util.Arrays;

public class NestedTryCatch {

	public static void main(String[] args) {
       System.out.println("Starts ");
		try {
			 int n   = 10; 
	    	 int div =0;
	    	 int res = n/div;
	    	 System.out.println(res);
			  try {
				 int f =20/0;
		    	 System.out.println(f);
	    	     
			  }catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("array index out of bound is handled");		
			    }
	    	 
		}catch(ArithmeticException e) {
			System.out.println(" Exception maths is handled");
		}
	}

}
