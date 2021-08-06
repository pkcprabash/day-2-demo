package dayTwoClass;

public class Dog extends Animal {
	
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dog(int eyes, int legs, String type) {
		super(eyes, legs, type);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void talk() {
		System.out.print("Dog - woof 1woof woof!!!");
	}

}
