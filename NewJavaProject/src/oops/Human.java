package oops;

public class Human{
	String name;
//	int eyeSize;
//	int handSize;
//	int legSize;
	int roll;
//	
//	Human(String name, int roll ){
//		this.name = name;
//		this.roll = roll;
////		System.out.println("Setting values...");
//	}
//	Human(){
////		System.out.println("Hello world");
//	}
	public String getName() {
		return name;
	}
	public Human() {
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public Human(String name, int roll) {
		this.name = name;
		this.roll = roll;
	}
	
//	intellij idea
	
	// getter, setter
	// method
//	
//	String getName() {
//		return this.name;
//	}
//	
//	void setName(String name) {
//		this.name = name;
//	}
	
	
	
	
}
