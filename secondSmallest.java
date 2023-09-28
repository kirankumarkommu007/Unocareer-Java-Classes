
public class secondSmallest {

		public static void main(String[] args) {
			int[] num = {10,20,30,55,45,32,36,96,1,2};
		System.out.println("Before Sorting......");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		int t;
		System.out.println("Sorting Process Begins");
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] > num[j] ) {
					t = num[i];
					num[i]=num[j];
					num[j]=t;
				}
			}
			System.out.println("Sorting Process ..."+(i+1));
			
			for(int k=0;k<num.length;k++) {
				System.out.print(num[k]+" ");
			}
			System.out.println();
			
		}
		System.out.println("Sorting Process Ends");
		
		//
		System.out.println("\nAfter Sorting......");
		for(int i=0;i<num.length;i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println("\n Second Smallest No--->"+num[1]);
		System.out.println("\n largest No--->"+num[num.length-1]);

	}
	

}
