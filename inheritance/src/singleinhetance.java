class Person{
	public String name;
}
class Employee extends Person{
	public String Companyname;
}
public class singleinhetance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee kiran = new Employee();
     kiran.Companyname = "unocareer";
     kiran.name = "kommu Kirankumar";
     System.out.println(kiran.Companyname);
     
     
     Person shiva = new Person();
     shiva.name = "pabbu shiva";
     System.out.println(shiva.name);
	}

}
