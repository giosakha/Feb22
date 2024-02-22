import java.util.ArrayList;
import java.util.Collections;
//COMPARABLE : compares based on one attribute and affects real memory
class Laptop implements Comparable<Laptop> {
	String name;
	int ram;
	int price;

	public Laptop(String name, int ram, int price) {

		this.name = name;
		this.ram = ram;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", ram=" + ram + ", price=" + price + "]";
	}
@Override
	public int compareTo(Laptop o) { // method for intgers
		// compare and sort based on the RAM size
		if (this.ram == o.getRam())
			return 0;
		else if (this.ram > o.getRam())
			return 1;
		else
			return -1;
	}
}

public class ComparableDemo2 {

	public static void main(String[] args) {
		ArrayList<Laptop> listLaptop = new ArrayList<>();
		listLaptop.add(new Laptop("Mac", 16, 1300));
		listLaptop.add(new Laptop("Windows", 8, 630));
		listLaptop.add(new Laptop("Linux", 64, 999));
		listLaptop.add(new Laptop("MainFrame", 32, 56789));
		Collections.sort(listLaptop);
		for (Laptop l : listLaptop) {
			System.out.println(l.getRam());
		}
	}

}
