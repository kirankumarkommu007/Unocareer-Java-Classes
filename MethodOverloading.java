// over loaded


class Dummy{
	
	void add(int a, int b) {
		System.out.println(a+b);
	}
	void add(int a, int b,int c) {
		System.out.println(a+b+c);
	}
	
	void add(String fname,String lname) {
		System.out.println(fname+" "+lname);
	}
	
	void  add(String fname,String Mname,String lname) {
		System.out.println(fname+" "+Mname+" "+lname);
	}
	
}



public class MethodOverloading {

	public static void main(String[] args) {
		
		Dummy dummy = new Dummy();
		
		dummy.add(100, 200);
		dummy.add(100,300);
		dummy.add(100,300,400);
		
		dummy.add("Abdul", "Rahman");
		dummy.add("Mohammed","Abdul","Rahman");
		
	}

}