
public class ForLoop {

	public static void main(String[] args) {
		// 1 2 3 4 5
				int evenSum =0,oddSum=0;
				boolean value = true;
				for(int x=1;x<=10;) {
					if(value == true) {
						oddSum = oddSum + x;// 0+1+3
						value = false;
					}
					else {
						evenSum = evenSum + x;// 0+2
						value = true;
					}
					x = x+1;//3
					
				}
				System.out.println("loop ends");
				System.out.println("evenSum sum---->"+evenSum);
				System.out.println("oddSum sum---->"+oddSum);
	}

}
