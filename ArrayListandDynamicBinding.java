import java.util.ArrayList;
class Forms {
	void draw() {
		System.out.println("Drawing a shape");
	}
}

class Rhombus extends Forms {
	void draw() {
		System.out.println("Drawing a triangle");
	}
}

class Trapezoid extends Forms {
	void draw() {
		System.out.println("Drawing a square");
	}
}
public class ArrayListandDynamicBinding {

	public static void main(String[] args) {
		ArrayList<Forms> shapes = new ArrayList<>();
		shapes.add(new Rhombus());
		shapes.add(new Trapezoid());
		for (Forms shape : shapes) {
			shape.draw(); //dynamic binding in action
		}

	}

}
