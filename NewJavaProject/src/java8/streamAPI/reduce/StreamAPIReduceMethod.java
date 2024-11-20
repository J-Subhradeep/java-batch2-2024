package java8.streamAPI.reduce;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamAPIReduceMethod {
	
//	static String binaryOperator(String a, String b) {
//		return a+", "+b;
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[1,2,3,4,5] -> 
//		["Subhradeep", "Baivab", "Jayanta", "Soumyajit"]  -> "Subhradeep, Baivab, Jayanta, Soumyajit";
		ArrayList<String> names  =  new ArrayList<String>(List.of("Subhradeep", "Baivab", "Jayanta", "Soumyajit"));
		System.out.println(names);
		
//		Stream<String> stream = names.stream();
//		Optional<String> reducedStream = stream.reduce((a,b)->binaryOperator(a, b));
//		System.out.println(reducedStream.get());
		
		
//		String result = names.stream().reduce((a,b)->a+", "+b).get();
		
//		System.out.println(result);
		
		List<Integer> arr = List.of(1,2,3,4,5);
		
		int result = arr.stream().reduce(10, (a, b)->a+b).intValue();
		
		System.out.println(result);
		
		
	}

}
