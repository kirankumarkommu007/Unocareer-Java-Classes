
public class recursionArrayAdd {

	


	public static void main(String[] args) {
	
	// recursion
		int n []= {10, 20,-30,4,5,6};
		System.out.println("res----->"+Sum(n, n.length-1));
		
	}

	private static int Sum(int[] n, int i) {
		if(i==0) return n[0];
		
		else return n[i]+Sum(n,i-1);
		
		
	}


}
