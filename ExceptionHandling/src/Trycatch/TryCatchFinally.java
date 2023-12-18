package Trycatch;

public class TryCatchFinally {

	public static void main(String[] args) {
     try {
    	 int i =10;
    	 int j =0;
    	 int res =i/j;
    	 System.out.println(res);
     }catch(ArithmeticException e) {
    	 System.out.println(" exception is handled");
     }
     finally {
    	 System.out.println(" we handle exception");
     }
     
	}

}
