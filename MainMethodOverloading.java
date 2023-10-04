// is main method will have overloaded 

public class MainMethodOverloading {

	public static void main(String[] args) {
		System.out.println("Hello1");
		main();
		int[] x= {};
		main(x);
		char[] y= {};
		main(y);
		main(10,20);
	}

	public static void main() {
		System.out.println("Hello2");
			
	}
	public static void main(int[] args) {
		
		System.out.println("Hello3");
	}
	public static void main(char[] args) {
		System.out.println("Hello4");
		
	}
	public static void main(int a,int b) {
		
		System.out.println("Hello5");
	}
}