interface Numbers{
	
	
	int add(int a,int b);
}
 
 
public class WithoutClassInterface {
	
	
	
	public static void main(String[] args) {
	
		Numbers nums =  (a,b)->{
			 return a+b;
		 };
		 
		 int res = nums.add(100,200);
		 System.out.println(res);
	
	}

// functional interface
	
	
	

}