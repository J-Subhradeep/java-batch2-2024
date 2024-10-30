package main.collection_framework.array_list;

import java.util.ArrayList;
import java.util.Vector;

public class Main {
	public static void main(String[] args) {
//		Student s = new Student("Subhradeep", "100");
//		System.out.println(s);
		
		Vector<Integer> list = new Vector<Integer>();
		list.add(12);
		list.add(1);
		list.add(13);
		list.add(2);
		
		System.out.println(list);
		
		ArrayList<Student> listOfStudents = new ArrayList<Student>(); // this list holds data of many students
		
		listOfStudents.add(new Student("Subhradeep", "100"));
		listOfStudents.add(new Student("Jayanta", "200"));
		listOfStudents.add(new Student("Baivab", "300"));
		listOfStudents.add(new Student("Soumyajit", "400"));
		
//		System.out.println(listOfStudents);
//		for(Student i: listOfStudents) {
//			System.out.println(i);
//		}
		
//		listOfStudents.forEach((i)->System.out.println(i));
		
//		System.out.println(listOfStudents.get(3));
		
//		Object[] array = listOfStudents.toArray();
//		for(Object i: array) System.out.println(i);
		
		
//		listOfStudents.remove(2);
//		listOfStudents.forEach((i)->System.out.println(i));
		
//		int size = listOfStudents.size();
//		System.out.println(size);
		
		
		
//		System.out.println(listOfStudents);
		
//		Student [] array = new Student[5];
//		array[0] = new Student("Subhradeep", "100") 
		
	}
}
