package java8.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class StreamAPIMain {
	public static void main(String[] args) {
//		[1,2,3,4,5] -> [1,4,9,16,25]
//		List<Integer> arr = List.of(1,2,3,4,5);
//		System.out.println(arr);
		
//		List<Integer> result = new ArrayList<Integer>();
//		
//		for(Integer i: arr) {
//			if(i%2==0) {	
//				result.add(i*i);
//			}
//		}
//		
//		System.out.println(result);
		
		
//		List<Integer> result = arr.stream().map((a)->a%2==0?a*a:a).toList();
		
//		System.out.println(result);
		
		
		List<Integer> arr = List.of(1,2,3,4,5,55,60,45,32);
		
//		List<Integer> result = new ArrayList<Integer>();
//		
//		for(Integer i: arr) {
//			if(i%5==0) {
//				result.add(i);
//			}
//		}
		
//		List<Integer> result = arr.stream().filter(a->a%5==0).map(a->a*a).toList();
		
//		System.out.println(result);
		
//		int sum = 0;
//		for(Integer i: arr) {
//			sum+=i;
//		}
		
//		int mul = 1;
//		for(Integer i: arr) {
//			mul*=i;
//			
//		}
		
//		System.out.println(mul);
		
//		int sum = arr.stream().reduce(0, (a,b)->a+b);
//		int mul = arr.stream().reduce(1, (a,b)->a*b);
		
//		System.out.println(sum);
//		System.out.println(mul);
		
//		map, filter, reduce
		
//		["subhradeep", "baivab"] -> ["asubhradeep", "abaivab"]
		
//		1. add character 'a' as first character of all string elements inside a array using stream api
//		2. Show the result of multiplication of each elements inside a array.
//		3. find the prime numbers from an array and show them seperately
	}
}
