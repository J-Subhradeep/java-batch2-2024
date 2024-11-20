package java8.streamAPI.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIFilterMethod {
	
//	predicate -> function which returns only boolean value
//	static boolean f(int element) {
//		if(element%2==0) return false;
//		return true;
//	}
	
	public static void main(String[] args) {
		System.out.println("Filter method");
//		1. filter element from array
//		2.  based on condition
		
//		[1,2,3,4,5]
		ArrayList<Integer> arr = new ArrayList<Integer>(List.of(1,2,3,4,5));
//		Stream<Integer> stream = arr.stream();
//		Stream<Integer> filteredStream = stream.filter((element)->f(element));
//		List<Integer> result = filteredStream.toList();
//		System.out.println(result);
		
		List<Integer> result = arr.stream().filter((element)->element%2!=0).toList();
		System.out.println(result);
	}
}
