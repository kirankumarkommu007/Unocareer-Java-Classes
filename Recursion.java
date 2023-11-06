public class Recursion {

		static long fact(int n){
			if(n == 1) return 1;
			else  return n * fact(n-1);
			
		
		}
	
	public static void main(String[] args) {
	
	// recursion
		
		int n =5;// 
		System.out.println("res----->"+fact(n));
		
	}

}