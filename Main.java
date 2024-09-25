import java.util.List;
class Main{
	public static void main(String args[]){
		List<Integer> arr = List.of(1,2,3,4);

		arr = arr.stream().map(a->a*a).toList();

		System.out.println(arr);
	}
}