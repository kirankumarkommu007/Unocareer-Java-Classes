
public class ArraysUnion {

	public static void main(String[] args) {
		int[] A={1,2,3,4,5,6};
		int[] B={1,5,6,8,9,10,11,12};
		// AuB
		int[] AuB= new int[A.length+B.length];
		int index=0;
		for(int i=0;i<B.length;i++,index++) {
			AuB[index] = B[i];
		}
		// copy A elements into AuB
		boolean isFound = false;
		for(int i=0;i<A.length;i++) {
			// isFound for 1-----true
			for(int j=0;j<index;j++) {
				if(A[i] == AuB[j]) {
					isFound = true;
					break;
				}
			}
			if(isFound == false) {
				AuB[index] = A[i];
				index++;
}
			else {
				isFound= false;
			}
		}
		System.out.println("AuB Elements.....");
		for(int i=0;i<index;i++) {
			System.out.print(AuB[i]+" ");
		}

	}

}
