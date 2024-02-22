import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 11, 343, 54345, 535, 345 };
		System.out.println("The sorted array");
		System.out.println(Arrays.toString(arr));
		String names[] = { "asi", "kelice", "montreal", "Canada" };
		Arrays.sort(names); // to sort array
		System.out.println(Arrays.toString(names));
		ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("APple");
		fruits.add("Apple");
		fruits.add("aPple");
		Collections.sort(fruits); // to sort ArrayList
		System.out.println(fruits);
	}

}
