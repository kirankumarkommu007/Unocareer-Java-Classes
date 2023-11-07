 import java.util.Scanner;
public class SortArrayassignmentunocareer {

	public static void main(String[] args) {
	Scanner input  =new Scanner(System.in);
	System.out.println("Enter the size of Array");
	int k = input.nextInt();
	int a[]= new int[k];
	System.out.println("Enter the elements in the array ");
	for(int i =0;i<k;i++) {
		a[i] =input.nextInt();
	}
	
	int temp =0;
	for(int i =0;i<a.length;i++) {
		for(int j =0;j<a.length;j++) {
			if(a[i]<a[j]) {
				temp =a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("the Sorted  array is :");
    for(int i =0;i<a.length;i++) {
   	 System.out.print(a[i]+" ");
    }
	
	}

}
