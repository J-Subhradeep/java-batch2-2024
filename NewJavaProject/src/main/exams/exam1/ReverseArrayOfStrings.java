package main.exams.exam1;

public class ReverseArrayOfStrings {
	public static void main(String[] args) {
		String [] arr = {"java", "python", "c++"};
		
		String [] arr2 = new String[arr.length];
		
		for(int i=arr.length-1;i>=0;i--) {
			arr2[i] = arr[arr.length-i-1];
		}
		
		for(String i: arr2) System.out.println(i);
		
		
	}
}
