package oops;

public class EncapsulatedHuman {
//	binding properties with methods
	private String name;
	private int roll;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll+1;
	}
	
	
}
