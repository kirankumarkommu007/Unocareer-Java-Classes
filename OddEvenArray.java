
public class OddEvenArray {

	public static void main(String[] args) {
    int a[] = {1,2,5,45,25,63,45,69};
    int even []=new int [a.length];
    int eveni =0;
    int odd[]=new int[a.length];
    int oddi =0;
    
    for(int i =0;i<a.length;i++) {
    	if(a[i]%2 ==0) {
    		even[eveni]=a[i];
    		eveni++;
    	}
    	else if(a[i]%2==1) {
    		odd[oddi]=a[i];
    		oddi++;
    	}
    	
    }
    for(int i =0;i<eveni;i++) {
    	System.out.print(even[i]+" ");
    }
    System.out.println("\n-------------");
    for(int i =0;i<oddi;i++) {
    	System.out.print(odd[i]+" ");
    }
	}

}
