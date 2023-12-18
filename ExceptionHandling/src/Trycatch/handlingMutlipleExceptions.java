package Trycatch;

import java.util.Arrays;



public class handlingMutlipleExceptions {

	public static void main(String[] args) {
		String k ="li";
		try {
		 int n = 10; 
    	 int div =5;
    	 int res = n/div;
    	 System.out.println(res);
    	 
    	 int []marks =new int[3];
    	 marks[1]=65;
    	 marks[2]=55;
    	 marks[3]=75;
         System.out.println(Arrays.toString(marks));
System.out.println(k.lastIndexOf(res));
         

     }
	 catch(ArrayIndexOutOfBoundsException a) {
		 System.out.println("arrays is out of bound");
	 }
		
     catch (ArithmeticException a) {
    	 System.out.println("we got the exception");
     }
//	 catch(NullPointerException ab) {
//		 k ="kiran";
//		 System.out.println(k);
//	 }
		
     System.out.println("End");
	}

}
