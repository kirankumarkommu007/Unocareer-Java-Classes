class Animal{
	void walk() {
		System.out.println("All animals will walk");
	}
	void eat() {
		System.out.println("All animals will eat");
	}
}
class dog extends Animal{
	void bark() {
		System.out.println("dogs will bark");
	}
}

public class inheritnce {

	public static void main(String[] args) {

		Animal cat =new Animal();
		cat.eat();
		
		dog labrador = new dog();
		labrador.bark();
        labrador.eat();
	}

}
