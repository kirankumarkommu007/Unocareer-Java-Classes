import java.util.Scanner;
public class nthsamllesrarrayUno {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the nth smallest element");
		int n =input.nextInt();
		System.out.println("enter the size of the Array");
		int k =input.nextInt();
		int []a =new int [k];
		int temp=0;
		System.out.println("Enter the elements in the Array");
		for(int i =0;i<k;i++) {
			a[i]=input.nextInt();
		}
		
		for(int i =0;i<a.length;i++) {
			for(int j =0;j<a.length;j++) {
				if(a[i]<a[j]) {
					temp =a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(" the Nth smallest element is :"+a[n-1]);

	}

}
