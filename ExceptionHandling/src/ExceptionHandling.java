
public class ExceptionHandling {
 
	 static int division(int i) {
		return 10/i;
	}
	static void dividedbyZero(int i) {
		int a= division(i);
	}
	static void subrotine() {
		int d =0;
		dividedbyZero(d);
	}
	
	public static void main(String[] args) {

	subrotine();	
	}

}


