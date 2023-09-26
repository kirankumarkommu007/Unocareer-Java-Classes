
public class small {

	public static void main(String[] args) {
    int k[]= {10,20,54,32,12,48,1111,456,2};
    int small = k[0];
    for(int i =0; i<k.length;i++) {
    	if(small > k[i]) {
    		small = k[i];
    	}
    }
	System.out.println(" the smallest number is :"+ small);

	}

}
