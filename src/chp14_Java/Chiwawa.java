package chp14_Java;

public class Chiwawa extends Dog{

	public Chiwawa() {
		System.out.println("I'm a Chiwawa");
	}
	
	public void foo() {
		System.out.println("Chiwawa foo()");
	}
	
	public static void main(String[] args) {
		Dog dog = new Chiwawa();
		dog.foo();
		System.out.println();
		Animal animal = new Chiwawa();
		animal.foo();
	}
}
