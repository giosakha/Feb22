
import java.util.ArrayList;
import java.util.Collections;
//COMPARABLE : compares based on one attribute
class Author implements Comparable<Author>{
	
	String firstName;
	String lastName;
	String bookName;
	public Author(String firstName, String lastName, String bookName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.bookName = bookName;
	}
	@Override
	public int compareTo(Author o) {
		// TODO Auto-generated method stub
	return this.lastName.compareTo(o.lastName);
	}
	
}
public class ComparableDemo {
public static void main(String[] args) {
	ArrayList<Author> authorList = new ArrayList<>();
	authorList.add(new Author("Elon" , "Musk" , "Space"));
	authorList.add(new Author("Bill" , "Gates" , "MS"));
	authorList.add(new Author("Tim" , "Cook" , "APPle"));
	authorList.add(new Author("Sa" , "Mir" , "Investing"));
	Collections.sort(authorList);
	System.out.println("The authors sorted by Last Name");
	//enhanced for loop
	for(Author a : authorList) {
		System.out.println("first name: " + a.firstName + " / last name:  " + a.lastName + " / book name:  " + a.bookName);
	}
	
}
}
