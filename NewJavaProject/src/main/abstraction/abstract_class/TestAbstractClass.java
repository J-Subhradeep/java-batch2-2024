package main.abstraction.abstract_class;

public abstract class TestAbstractClass {
	private String name="Subhradeep";
	private String email="subhradeep";
	
	void showBasicDetails() {
		System.out.println(name+","+email);
	}

	
	abstract void showAdditionalDetails();
}
