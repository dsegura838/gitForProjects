package tutorial;

public class Cat extends Dog {

	public Cat(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	
	}
	public Cat(String name) {
		super(name, 0);
	}
	public void speak() {
		System.out.println("Meow my name is "+this.name);
	}

}
