package oops;

public class Parent {
	private String family_surname;
	private String name;
	private int no_of_houses;
	public String getFamily_surname() {
		return family_surname;
	}
	public void setFamily_surname(String family_surname) {
		this.family_surname = family_surname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo_of_houses() {
		return no_of_houses;
	}
	public void setNo_of_houses(int no_of_houses) {
		this.no_of_houses = no_of_houses;
	}
	
	public void show() {
		System.out.println("Parent Method");
	}

	
}
