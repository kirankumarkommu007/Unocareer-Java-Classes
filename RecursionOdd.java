
public class RecursionOdd {

	

		static long fact(int n){
			if(n == 1) return 1;
			else {
				if(n%2 ==0)return fact(n-1);
				else return n+fact(n-1);
			}
			
		
		}
	
	public static void main(String[] args) {
	
	// recursion
		
		int n =10;// 
		System.out.println("res----->"+fact(n));
		
	}


}
