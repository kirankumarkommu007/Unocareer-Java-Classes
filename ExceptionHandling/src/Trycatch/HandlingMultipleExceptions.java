package Trycatch;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingMultipleExceptions {

	public static void main(String[] args) {
        try {
		String Trainername = "Kaustub";
        
        System.out.println("last charecter: "+Trainername.charAt(Trainername.length()-1));
        
        int n =Integer.parseInt("one");
        System.out.println("number : "+n);
        
        Scanner Sc = new Scanner(System.in);
        int n2 = Sc.nextInt();
        System.out.println("n2 is: "+n2);
        Sc.close();
        }catch(StringIndexOutOfBoundsException | NumberFormatException | InputMismatchException e) {
        	System.out.println("oops");
        }
        
	}

}
