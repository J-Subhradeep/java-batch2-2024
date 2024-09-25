package oops;
//90% Object Oriented Programming Language

// Class & Object

//Template

// Human - eye, hand, leg

// Subhradeep, Soumyajit, Jayanta

public class Main {
	
	static void f(int a) {
		System.out.println(a);
	}
	static void f(int a, int b) {
		System.out.println(a+b);
	}	
	public static void main(String[] args) {

		// Subhradeep
//		Human subhradeep = new Human();
//		subhradeep.name = "Subhradeep";
//		subhradeep.eyeSize = 10;
//		subhradeep.handSize = 20;
//		subhradeep.legSize = 20;

		// Soumyajit
//		Human soumyajit = new Human();
//		soumyajit.name = "Soumyajit";
//		soumyajit.eyeSize = 10;
//		soumyajit.handSize = 15;
//		soumyajit.legSize = 30;

//		Human [] students = new Human[5];

//		students[0] = subhradeep;
//		students[1] = soumyajit;
//		students[2] = soumyajit;
//		students[3] = subhradeep;
//		students[4] = soumyajit;

//		
//		for(Human i: students) {
//			System.out.println("Name : "+i.name+", EyeSize : "+ i.eyeSize);
//		}
//		Human subhradeep = new Human("Subhradeep", 1);
//		Human soumyajit = new Human("Soumyajit", 2);
//		Human jayanta = new Human("Jayanta", 3);
//
//		Human[] students = new Human[3];
//		students[0] = subhradeep;
//		students[1] = soumyajit;
//		students[2] = jayanta;
//		for (Human i : students) {
//			System.out.println("Name : " + i.name + ", Roll : " + i.roll);
//		}
		
//		Integer a = 12;
//		
//		int b = 13;
//		subhradeep.name = "Subhradeep Pal";
		
//		subhradeep.setName("Subhradeep Pal");
//		String name = subhradeep.getName();
//		System.out.println(name);
//		soumyajit.setName("Soumyajit Banerjee");
		
		
		
		
		
		
		/// 25-09-2024
		
//		EncapsulatedHuman eh = new EncapsulatedHuman();
//		//eh.name = "Subhradeep"; error
//		eh.setName("Subhradeep");
//		eh.setRoll(12);
//		
//		System.out.println(eh.getName()+","+eh.getRoll());
		
		
		
//		Parent p = new Parent();
//		p.setName("Name");
//		p.setFamily_surname("Pal");
//		p.setNo_of_houses(1);
////		p.
//		
//		System.out.println(p.getFamily_surname());
//		
//		Child c = new Child();
//		c.setFamily_surname("Roy");
//		
//		System.out.println(c.getFamily_surname());
		
		
		
//		System.out.println("Subhradeep");
//		System.out.println(12);
		
//		method overloading
//		f(13);
//		f(3,4);
//		f("Subhradeep");
		
		
		Child c = new Child();
		c.show();
		
		Parent p = new Parent();
		p.show();;
	}
}
