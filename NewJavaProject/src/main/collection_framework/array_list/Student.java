package main.collection_framework.array_list;

public class Student {
	private String name;
	private String roll;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public Student(String name, String roll) {
		super();
		this.name = name;
		this.roll = roll;
	}
	@Override
	public String toString() {
		return "Student (name=" + name + ", roll=" + roll + ")";
	}
	
	
}
