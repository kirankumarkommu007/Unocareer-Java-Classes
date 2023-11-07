

public class ArraysUnion1 {

	public static void main(String[] args) {
    int a[] = {1,2,4,5};
    int b [] = {1,2};
    int res[]=new int[b.length];
    int resindex =0;
    for(int i =0;i<a.length;i++) {
    	for(int j=0;j<b.length;j++) {
    		if(a[i]==b[j]) {
    			res[resindex]=a[i];
    			resindex++;
    		}
    	}
    }
    for(int i =0;i<resindex;i++) {
    	System.out.print(res[i]+" ");
    }
	}

}
