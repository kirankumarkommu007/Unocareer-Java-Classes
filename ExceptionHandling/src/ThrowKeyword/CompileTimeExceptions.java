package ThrowKeyword;

import java.io.FileNotFoundException;

public class CompileTimeExceptions {

	 static void demoProcess() {
	try {
    throw new FileNotFoundException("Demo exception");		
	}catch(FileNotFoundException e) {
		System.out.println(e.getMessage());
	}
	 }

	public static void main(String[] args) {
       
		demoProcess();
	}


}
