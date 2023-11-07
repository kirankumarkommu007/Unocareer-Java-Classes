class Animals{
	public String name;
}
class cats extends Animals{
	public String CatName;
}
class persian extends cats{
	void behaviour() {
		System.out.println("Persian cats are the royal cats");
	}
	
}




public class multilevelInheritance {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   Animals Tiger = new Animals();
	   Tiger.name = "Bengal Tiger";
	   System.out.println(Tiger.name);
	   
	   cats mike = new cats();
	   mike.CatName =" Mike the cat";
	   mike.name = "Mikey y";
	   
	   System.out.println(mike.name);
	   System.out.println(mike.CatName);

	   
	   persian myPersian = new persian();
	   myPersian.CatName = "rex";
	   myPersian.name = " Persian cat";
	   System.out.println(myPersian.name);
	   System.out.println(myPersian.CatName);


	   myPersian.behaviour();
	   
		}

	}