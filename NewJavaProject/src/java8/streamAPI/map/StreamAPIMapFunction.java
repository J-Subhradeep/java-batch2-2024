package java8.streamAPI.map;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamAPIMapFunction {

	
	public static void main(String[] args) {
		System.out.println("Stream API Map method");
//		[1,2,3,4,5] -> [1,4,9,16,25]
//				["Subhradeep", "Baivab","Soumyajit"] -> ["SUBHRADEEP", "BAIVAB", SOUMYAJIT]
//		1. Array Length same
//		2. some relation between them
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.addAll(List.of(1,2,3,4,5));
		
//		System.out.println(arr);
//		
//		List<Integer> result;
//		
//		Stream<Integer> stream = arr.stream();
//		Stream<Integer> streamResult = stream.map((element)->f(element));
//		
//		result  =   streamResult.toList();
//		
//		System.out.println(result);
		
		List<Integer> result =  arr.stream().map((element)->element*element).toList();
		
		System.out.println(result);
		
	}
}
