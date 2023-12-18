package ThrowKeyword;

public class Throw_use {
	
	static void ValidateAge(int age) {
		try {
		 if(age<18) {
			 throw new ArithmeticException("Not eligle to vote");
		 }else {
	     System.out.println(" eligible to vote");
		 }}
		
		 catch(ArithmeticException e) {
			 System.out.println(" not eligble to vote");
			 throw e;
		 }
		
		}
	
	public static void main(String[] args) {
		System.out.println(" Starts");
		int age =15;
        ValidateAge(age);
       
       System.out.println(" ends");
	}

	

}
