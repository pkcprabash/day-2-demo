package dayTwoClass;

public class Animal {
	
	private int eyes;
	private int legs;
	private String type;
	
	
	public Animal() {
		super();
	}

	public Animal(int eyes, int legs, String type) {
		super();
		this.eyes = eyes;
		this.legs = legs;
		this.type = type;
	}
	
	public int getEyes() {
		return eyes;
	}
	public void setEyes(int eyes) {
		this.eyes = eyes;
	}
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public void eat() {
		System.out.println("Animal Eating!");
	}
	
	public void sleep() {
		System.out.println("Animal Sleeping!!");
	}
	
	public void talk() {
		System.out.println("Animal crying!!");
	}

}
