import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> strings = new ArrayList<>();

		strings.add(0, "Orange");
		strings.add(1, "Strawberry");
		strings.add(2, "Kiwi");
		strings.add(3, "Apple");

		System.out.println(strings.size());
		Collections.sort(strings);
		for (int i = 0; i < strings.size(); i++) {
			System.out.println(strings.get(i) + " ");

		}
		for (String language : strings) {
			System.out.println(language + " ");
		}
	}

}
