import java.util.Scanner;
public class AssignmnetTrainagle {

	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
	System.out.println("Enter the First angle");
    int Angle1 = sc.nextInt();
    System.out.println("Enter the Second angle");
    int Angle2 = sc.nextInt();
    System.out.println("Enter the Third angle");
    int Angle3 = sc.nextInt();
    
    int Sume = Angle1+Angle2+Angle3;
    if(Sume ==180) {
    	System.out.println("The triangle Valid");
    	
    }else System.out.println("The triangle INValid");
    
	}

}
