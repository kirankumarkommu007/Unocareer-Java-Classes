interface bank{
	int balance(int a,int b);

}
class App implements bank{
	
	public int balance(int a,int b) {
		return a+b;
	}
}

public class Abstract {

	public static void main(String[] args) {
         
		App k =new App();
		int res =k.balance(100, 500);
		System.out.println(res);
	}

}
