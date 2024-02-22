import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
//COMPARATOR : compares based on many attributes, and creates new memory (does not affect real memory);
class Author1 {
	String firstName;
	String bookName;
	int authorAge;
	public Author1(String firstName, String bookName, int authorAge) {
		
		this.firstName = firstName;
		this.bookName = bookName;
		this.authorAge = authorAge;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getAuthorAge() {
		return authorAge;
	}
	public void setAuthorAge(int authorAge) {
		this.authorAge = authorAge;
	}
	@Override
	public String toString() {
		return "Author1 [firstName=" + firstName + ", bookName=" + bookName + ", authorAge=" + authorAge + "]";
	}
	
}
class AuthorAgeComparator implements Comparator<Author1> {

	@Override
	public int compare(Author1 o1, Author1 o2) {
		if(o1.authorAge==o2.authorAge) return 0;
		else if (o1.authorAge>o2.authorAge) return 1;
		else return -1;
	}
	
}
class BookNameComparator implements Comparator<Author1> {

	@Override
	public int compare(Author1 o1, Author1 o2) {
		return o1.bookName.compareTo(o2.bookName);
	}
	
}
public class comparatorDemo {

	public static void main(String[] args) {
	
		ArrayList<Author1> authorList = new ArrayList<>();
		
		
		
		authorList.add(new Author1("Elon" , "JAVA" , 23));
		authorList.add(new Author1("Bill" , "PYTHON" , 36));
		authorList.add(new Author1("Tim" , "c" , 19));
		authorList.add(new Author1("Sa" , "C++" , 27));
		Collections.sort(authorList , new AuthorAgeComparator());
		System.out.println("Author is sorted based upon the age");
		for (Author1 a :authorList) {
			System.out.println(a.getAuthorAge() + " " + a.bookName + " " + a.firstName);
		}
		Collections.sort(authorList , new BookNameComparator());
		System.out.println("Author is sorted based upon the book name");
		for (Author1 a :authorList) {
			System.out.println(a.getAuthorAge() + " " + a.bookName + " " + a.firstName);
	}
	}
}
