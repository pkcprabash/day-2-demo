package dayTwoClass;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a1 = new Animal();
		a1.eat();
		
		Animal dog = new Dog();
		dog.eat();

		Animal dog1 = new Dog(2,4,"mammal");
		dog1.talk();
	}

}
