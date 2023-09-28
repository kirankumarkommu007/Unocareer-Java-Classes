import java.util.Scanner;
public class Celcius {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("enter the Farenhiet");
    double f = sc.nextDouble();
    
    double c = (f-32)*5/9;
    
    double p = c-(int)c;
    int Cel =(int)c;
    
    if(p>=0.5)
    	Cel +=1;
    
    System.out.println("the celcius is "+Cel );
	}

}
