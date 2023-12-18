import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptions {

	public static void main(String[] args) {
    try {
		FileReader f =new FileReader("Story.txt");
	} catch (FileNotFoundException f) {
		System.out.println("File not Found");
	}
	}

}
