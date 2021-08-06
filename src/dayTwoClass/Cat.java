package dayTwoClass;

public class Cat extends Animal {

	
	public Cat() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cat(int eyes, int legs, String type) {
		super(eyes, legs, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.println("Cat - meow meow!!");
	}
}
