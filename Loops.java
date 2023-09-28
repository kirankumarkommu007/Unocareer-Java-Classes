
public class Loops {

	public static void main(String[] args) {
		// 2+ 4+ 6+.........+10;
				int sum =0;
				for(int x=2;x<=10;) {
					sum = sum + x;
					x = x+2;
				}
				System.out.println("loop ends");
				System.out.println("total sum---->"+sum);
				
	}

}
