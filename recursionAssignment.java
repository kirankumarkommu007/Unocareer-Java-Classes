
public class recursionAssignment {
	    static int res =1;
		static long fact(int n){
			res++;
			if(res == n) return n;
			else  return res * fact(n);

		}
	
	public static void main(String[] args) {
	
	// recursion
		
		int k =5;// 
		System.out.println("res----->"+fact(k));
	}


}
