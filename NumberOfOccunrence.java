
public class NumberOfOccunrence {

	public static void main(String[] args) {
		//How to count the occurrence of the given character in a string?
				// e---3
				// o---6 
		String str = "Welcome to Java World Good morning Hyderabad";
		int ECount =0;
		int Ocount =0;
		for(int i =0;i<=str.length()-1;i++) {
			if(str.charAt(i)=='e') {
				ECount=ECount+1;
			}
			if(str.charAt(i)=='o') {
				Ocount = Ocount+1;;
			}
		}
		System.out.println(" The Occunrence of e is "+ ECount);
		System.out.println(" The Occunrence of o is "+ Ocount);

	}

}
